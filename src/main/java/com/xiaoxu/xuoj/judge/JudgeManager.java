package com.xiaoxu.xuoj.judge;

import com.xiaoxu.xuoj.judge.strategy.DefaultJudgeStrategy;
import com.xiaoxu.xuoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.xiaoxu.xuoj.judge.strategy.JudgeContext;
import com.xiaoxu.xuoj.judge.strategy.JudgeStrategy;
import com.xiaoxu.xuoj.judge.codesanbox.model.JudgeInfo;
import com.xiaoxu.xuoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {
    /**
     * 执行判题接口
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();

        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
