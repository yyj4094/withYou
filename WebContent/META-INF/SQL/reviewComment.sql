drop table reviewComment_table;

create table reviewComment_table(
rc_num number,
cm_num number(20) not null,
rc_name varchar2(10) not null,
rc_contents varchar2(200) not null,
primary key(rc_num)
);

commit;


drop sequence seq_reviewComment_table_rc_num;
create sequence seq_reviewComment_table_rc_num increment by 1 start with 1;
commit;



select * from reviewComment_table inner join review_table 
on reviewComment_table.rc_num = review_table.r_num where reviewComment_table =? 