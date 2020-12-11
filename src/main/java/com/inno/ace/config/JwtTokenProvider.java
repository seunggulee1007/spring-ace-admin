package com.inno.ace.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Component
public class JwtTokenProvider {
    
    @Value("spring.jwt.secret")
    private String secretKey;
    final static public String ACCESS_TOKEN_NAME = "accessToken";
    final static public String REFRESH_TOKEN_NAME = "refreshToken";
    private long TOKEN_VALIDATION_SECOND  = 1000L * 60 * 20;    // 20분 동안만 토큰 유효
    private final UserDetailsService userDetailsService;

    public long getTOKEN_VALIDATION_SECOND() {
        return TOKEN_VALIDATION_SECOND;
    }
    @PostConstruct
    protected void init() {
        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
    }

    public String createToken(String userId, List<String> roles ) {
        return createToken(userId, roles, TOKEN_VALIDATION_SECOND );
    }

    public String createToken(String userId, List<String> roles, long expiredTime) {
        Claims claims = Jwts.claims().setSubject(userId);
        claims.put("roles", roles);
        Date now = new Date();
        return Jwts.builder()
                    .setClaims(claims)  // 데이터
                    .setIssuedAt(now)   // 토큰 발행 일자
                    .setExpiration(new Date(now.getTime() + expiredTime ))  // 만료 시간 추가
                    .signWith(SignatureAlgorithm.HS256, secretKey)      // 암호화 알고리즘, secret값 세팅
                    .compact();
    }

    // Jwt 토큰으로 인증 정보를 조회
    public Authentication getAuthentication(String token) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(this.getUserId(token));
        List<GrantedAuthority> authorities = new ArrayList<>();
        GrantedAuthority role = new SimpleGrantedAuthority("ROLE_USER");
        authorities.add(role);
        return new UsernamePasswordAuthenticationToken(userDetails,  "", authorities);
    }
    
    // Jwt 토큰에서 회원 구별 정보 추출
    public String getUserId(String token) {
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
    }
    
    // Request의 Header에서 token 파싱 : "X-AUTH-TOKEN : jwt토큰"
    public String resolveToken(HttpServletRequest req) {
        return req.getHeader("X-AUTH-TOKEN");
    }

    // Jwt 토큰의 유효성 + 만료일자 확인
    public boolean validateToken(String jwtToken) {
        try {
            Jws<Claims> claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(jwtToken);
            return !claims.getBody().getExpiration().before(new Date());
        } catch (Exception e) {
            return false;
        }
    }
    
}
