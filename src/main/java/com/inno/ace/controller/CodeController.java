package com.inno.ace.controller;

import com.inno.ace.model.service.code.CodeService;
import com.inno.ace.model.service.codeMaster.CodeMasterService;
import com.inno.ace.model.vo.CodeMasterVO;
import com.inno.ace.model.vo.CodeVO;
import com.inno.ace.model.vo.PagingVO;
import com.inno.ace.model.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/code")
public class CodeController {

    private final CodeMasterService codeMasterService;
    private final CodeService codeService;

    @ApiOperation(value="코드 그룹 중복 확인", notes="넘겨진 코드 명이 중복되었는지 확인 하는 메소드")
    @GetMapping("/confirmDuple/{codeMasterNm}")
    public ResultVO selectDupleCodeNm(@PathVariable String codeMasterNm) {return codeMasterService.selectDupleCodeNm(codeMasterNm);}
    
    @ApiOperation(value="코드 마스터 조회", notes = "코드 마스터 리스트 조회")
    @GetMapping("/codeMasterList")
    public ResultVO selectCodeMasterList(PagingVO pagingVO) {
        return codeMasterService.selectCodeMasterList(pagingVO);
    }

    @ApiOperation(value="코드 마스터 저장", notes="코드 마스터 정보 저장")
    @PostMapping("/codeMaster")
    public ResultVO insertCodeMaster(CodeMasterVO codeMasterVO) {
        return codeMasterService.insertCodeMaster(codeMasterVO);
    }

    @ApiOperation(value="코드 마스터 수정", notes="코드 마스터 정보 수정")
    @PutMapping("/codeMaster")
    public ResultVO updateCodeMaster(CodeMasterVO codeMasterVO) {
        return codeMasterService.updateCodeMaster(codeMasterVO);
    }

    @ApiOperation(value="코드 마스터 삭제", notes="넘겨진 아이디로 코드 마스터 삭제")
    @DeleteMapping("/codeMaster/{codeMasterId}")
    public ResultVO deleteCodeMaster(@PathVariable int codeMasterId) {
        return codeMasterService.deleteCodeMaster(codeMasterId);
    }

    @ApiOperation(value="코드 리스트 조회", notes="코드 마스터 정보로 코드 리스트 조회")
    @GetMapping("/codeList")
    public ResultVO selectCodeList(PagingVO pagingVO) {
        return codeService.selectCodeList(pagingVO);
    }

    @ApiOperation(value="코드 저장", notes="코드 정보 저장")
    @PostMapping
    public ResultVO insertCode(CodeVO codeVO) {
        return codeService.insertCode(codeVO);
    }

    @ApiOperation(value="코드 수정", notes="코드 정보 수정")
    @PutMapping
    public ResultVO updateCode(CodeVO codeVo) {
        return codeService.updateCode(codeVo);
    }

    @ApiOperation(value="코드 삭제", notes="코드 정보 삭제")
    @DeleteMapping("/{codeId}")
    public ResultVO deleteCode(@PathVariable int codeId) {
        return codeService.deleteCode(codeId);
    }

    @PutMapping("/moveCode/{gu}/{ord}/{codeMasterId}")
    public ResultVO moveMenu(@PathVariable int gu, @PathVariable int ord, @PathVariable int codeMasterId) {
        return codeService.updateOrd(gu, ord, codeMasterId);
    }

}
