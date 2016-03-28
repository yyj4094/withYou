drop table guestbook_table;

create table guestbook_table(
g_num number,
g_name varchar2(20) not null,
g_pw varchar2(20) not null,
g_contents varchat2(200) not null,
primary key(g_num)
);

commit;


drop sequence seq_guestbook_table_g_num;
create sequence seq_guestbook_table_g_num increment by 1 start with 1;
commit;