package com.ssm.ssm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName record
 */
@TableName(value ="record")
@Data
public class Record implements Serializable {
    /**
     * 借阅记录id
     */
    @TableId
    private String recordId;

    /**
     * 借阅图书名称
     */
    private String recordBookname;

    /**
     * 借阅图书ISBN
     */
    private String recordBookisbn;

    /**
     * 借阅人
     */
    private String recordBorrower;

    /**
     * 借阅时间
     */
    private String recordBorrowtime;

    /**
     * 归还时间
     */
    private String recordRemandtime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}