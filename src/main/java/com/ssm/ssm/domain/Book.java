package com.ssm.ssm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName book
 */
@TableName(value ="book")
@Data
public class Book implements Serializable {
    /**
     * 图书编号
     */
    @TableId
    private Integer bookId;

    /**
     * 图书名称
     */
    private String bookName;

    /**
     * 图书标准ISBN
     */
    private String bookIsbn;

    /**
     * 图书出版社
     */
    private String bookPress;

    /**
     * 作者
     */
    private String bookAuthor;

    /**
     * 页数
     */
    private Integer bookPagination;

    /**
     * 价格
     */
    private Double bookPrice;

    /**
     * 上架时间
     */
    private String bookUploadtime;

    /**
     * 状态 0：可借阅 1：借阅中 2：归还中 3：已下架
     */
    private String bookStatus;

    /**
     * 借阅人
     */
    private String bookBorrower;

    /**
     * 借阅时间
     */
    private String bookBorrowtime;

    /**
     * 预计归还时间
     */
    private String bookReturntime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}