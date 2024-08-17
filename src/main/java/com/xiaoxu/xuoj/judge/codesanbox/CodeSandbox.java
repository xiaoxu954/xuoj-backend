package com.xiaoxu.xuoj.judge.codesanbox;

import com.xiaoxu.xuoj.judge.codesanbox.model.ExecuteCodeRequest;
import com.xiaoxu.xuoj.judge.codesanbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
