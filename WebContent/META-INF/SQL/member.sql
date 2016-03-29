drop table member_table;

create table member_table(
m_id varchar2(20),
m_pw varchar2(20) not null,
m_name varchar2(10) not null,
m_phone number(15) not null,
m_email varchar2(20) not null,
m_address varchar2(50) not null,
primary key(m_id)
);

commit;

