create table book
(
    book_id         int           not null comment '图书编号'
        primary key,
    book_name       varchar(32)   null comment '图书名称',
    book_isbn       varchar(32)   null comment '图书标准ISBN',
    book_press      varchar(32)   null comment '图书出版社',
    book_author     varchar(32)   null comment '作者',
    book_pagination int           null comment '页数',
    book_price      double(32, 0) null comment '价格',
    book_uploadtime varchar(32)   null comment '上架时间',
    book_status     varchar(1)    null comment '状态 0：可借阅 1：借阅中 2：归还中 3：已下架',
    book_borrower   varchar(32)   null comment '借阅人',
    book_borrowtime varchar(32)   null comment '借阅时间',
    book_returntime varchar(32)   null comment '预计归还时间'
);

create table record
(
    record_id         varchar(32) not null comment '借阅记录id'
        primary key,
    record_bookname   varchar(32) null comment '借阅图书名称',
    record_bookisbn   varchar(32) null comment '借阅图书ISBN',
    record_borrower   varchar(32) null comment '借阅人',
    record_borrowtime varchar(32) null comment '借阅时间',
    record_remandtime varchar(32) null comment '归还时间'
);

create table user
(
    user_id       int         not null comment '用户id'
        primary key,
    user_name     varchar(32) null comment '用户名',
    user_password varchar(32) null comment '密码',
    user_email    varchar(32) null comment '邮箱',
    user_role     varchar(32) null comment '角色 ADMIN：管理员 USER：普通用户',
    user_status   varchar(1)  null comment '状态 0：正常 1：禁用'
);