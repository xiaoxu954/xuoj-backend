package com.xiaoxu.xuoj.judge.strategy;

import com.xiaoxu.xuoj.judge.codesanbox.model.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题接口
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
