-- 테이블 생성
create table tbl_board(
bno int PRIMARY KEY,
title varchar(100) not null,
content varchar(500) not null,
userid varchar(50) not null,
regdate varchar(30) not null,
updatedate varchar(30) not null
);
--시퀀스 생성
CREATE SEQUENCE seq_board START 1;
