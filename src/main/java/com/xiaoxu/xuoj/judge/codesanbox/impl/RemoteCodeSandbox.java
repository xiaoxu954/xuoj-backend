package com.xiaoxu.xuoj.judge.codesanbox.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.xiaoxu.xuoj.exception.BusinessException;
import com.xiaoxu.xuoj.judge.codesanbox.CodeSandbox;
import com.xiaoxu.xuoj.judge.codesanbox.model.ExecuteCodeRequest;
import com.xiaoxu.xuoj.judge.codesanbox.model.ExecuteCodeResponse;

import static com.xiaoxu.xuoj.common.ErrorCode.API_REQUEST_ERROR;

/**
 * 远程代码沙箱
 */
public class RemoteCodeSandbox implements CodeSandbox {
    // 定义鉴权请求头和密钥
    private static final String AUTH_REQUEST_HEADER = "auth";

    private static final String AUTH_REQUEST_SECRET = "secretKey";

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        String url = "http://localhost:8090/executeCode";
        String json = JSONUtil.toJsonStr(executeCodeRequest);
        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER, AUTH_REQUEST_SECRET)
                .body(json)
                .execute()
                .body();

        if (StrUtil.isBlank(responseStr)) {
            throw new BusinessException(API_REQUEST_ERROR, "executeCode remoteSandbox error,message = " + responseStr);
        }
        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }
}
