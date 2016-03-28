drop table reviewComment_table;

create table reviewComment_table(
rc_num number,
rc_name varchar2(10) not null,
rc_contents varchar2(200) not null,
primary key(rc_num)
);

commit;


drop sequence seq_reviewComment_rc_num;
create sequence seq_reviewComment_rc_num increment by 1 start with 1;
commit;