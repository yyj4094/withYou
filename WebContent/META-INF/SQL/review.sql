drop table review_table;

create table review_table(
r_num number,
r_title varchar2(30) not null,
r_name varchar2(10) not null,
r_date date,
primary key(r_num)
);

commit;


drop sequence seq_review_r_num;
create sequence seq_review_r_num increment by 1 start with 1;
commit;