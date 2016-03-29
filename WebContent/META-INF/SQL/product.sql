drop table product_table;

create table product_table(
p_num number,
p_name varchar2(20) not null,
p_contents varchar2(1000) not null,
p_price number(10) not null,
p_quantity number(10) not null,
p_color varchar2(10) not null,
primary key(p_num)
);

commit;

drop sequence seq_product_p_num;
create sequence seq_product_p_num increment by 1 start with 1;
commit;

