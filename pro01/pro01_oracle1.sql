select * from notice;

insert into notice values (nseq.nextval, '더미제목1', '더미내용1', sysdate, 0);
insert into notice values (nseq.nextval, '더미제목2', '더미내용2', sysdate, default);
