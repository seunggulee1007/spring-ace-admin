package com.inno.ace.model.service.client;

import com.inno.ace.advice.exception.DuplicationException;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.ClientDao;
import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.PagingVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientDao clientDao;

    /**
     * 거래처 리스트 조회
     * @param pagingVO
     * @return
     */
    public ResultVO selectClientList(PagingVO pagingVO) {
        pagingVO.calcPage(clientDao.selectClientCnt(pagingVO));
        return ResultVO.builder().data(clientDao.selectClientList(pagingVO)).build();
    }

    /**
     * 거래처 명 중복 확인
     * @param clientNm
     * @return
     */
    public ResultVO confirmDuple(String clientNm) {
        int dupleCnt = clientDao.confirmDuple(clientNm);
        if(dupleCnt > 0) {
            throw new DuplicationException();
        }
        return ResultVO.builder().resultMsg(CommonMsg.AVALIABLE_CLIENT.getMsg()).build();
    }

    /**
     * 거래처 등록
     * @param clientVO
     * @return
     */
    public ResultVO insertClient(ClientVO clientVO){
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_WRITE.getMsg();
        if(clientDao.insertClient(clientVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 거래처 등록
     * @param clientVO
     * @return
     */
    public ResultVO updateClient(ClientVO clientVO){
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_MODIFY.getMsg();
        if(clientDao.updateClient(clientVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_MODIFY.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

}
