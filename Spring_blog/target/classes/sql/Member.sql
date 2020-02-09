-- 테이블 생성
create table tbl_member(
key varchar(80), 
nickname varchar(50) PRIMARY KEY,	
pw varchar(100),
name varchar(80) not null,
email varchar(200) not null,
phoneNumber int,
birthday int,
gender varchar(3),
auth int not null,
interlock_type varchar not null,
regdate varchar(50) not null,
updatedate varchar(50),
authdate varchar(50)
);

insert into tbl_member
(key,pw,name,email,nickname,auth,interlock_type,regdate)
values
('admin','1234','전승우','aa@naver.com','woo','1','main',now())




--시퀀스 생성
CREATE SEQUENCE seq_member START 1;