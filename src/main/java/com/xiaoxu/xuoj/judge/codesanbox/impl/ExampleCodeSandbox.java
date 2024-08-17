package com.xiaoxu.xuoj.judge.codesanbox.impl;

import com.xiaoxu.xuoj.judge.codesanbox.CodeSandbox;
import com.xiaoxu.xuoj.judge.codesanbox.model.ExecuteCodeRequest;
import com.xiaoxu.xuoj.judge.codesanbox.model.ExecuteCodeResponse;
import com.xiaoxu.xuoj.judge.codesanbox.model.JudgeInfo;
import com.xiaoxu.xuoj.model.enums.JudgeInfoMessageEnum;
import com.xiaoxu.xuoj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 示例代码沙箱
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getText());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100);
        judgeInfo.setTime(100);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
