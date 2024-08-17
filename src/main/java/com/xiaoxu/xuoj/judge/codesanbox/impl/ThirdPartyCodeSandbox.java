package com.xiaoxu.xuoj.judge.codesanbox.impl;

import com.xiaoxu.xuoj.judge.codesanbox.CodeSandbox;
import com.xiaoxu.xuoj.judge.codesanbox.model.ExecuteCodeRequest;
import com.xiaoxu.xuoj.judge.codesanbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
