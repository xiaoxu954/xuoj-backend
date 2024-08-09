package com.xiaoxu.xuoj.model.dto.questionsubmit;

import lombok.Data;

/**
 * 题目判题信息
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private Long message;

    /**
     * 消耗内存（KB）
     */
    private String memory;

    /**
     * 消耗时间（KB）
     */
    private String time;
}
