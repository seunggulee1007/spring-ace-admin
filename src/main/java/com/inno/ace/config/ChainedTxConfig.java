package com.inno.ace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @apiNote 다중 데이터베이스 소스를 사용할 경우 
 * @apiNote 연관된 트랜젝션을 서로 간섭할 수 없기 때문에 해당 설정으로 현재 트랜젝션에 묶인 디비 트랜젝션을 간섭할 수 있게 함.
 * @author leesg
 *
 */
@Configuration
public class ChainedTxConfig {
 
    @Bean
    @Primary
    public PlatformTransactionManager transactionManager(PlatformTransactionManager rwsTransction) {
        return new ChainedTransactionManager(rwsTransction);
    }
    
}