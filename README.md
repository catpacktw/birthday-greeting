## Before executing. create a database and initialize data below:

    create table uss.user_info
    (
    id bigserial,
    first_name char(100) default '' not null,
    last_name char(100) default '' not null,
    gender int default 0 not null,
    birthday timestamp default current_timestamp not null,
    email char(500) default '' not null
    );
    
    create unique index user_info_id_uindex
    on uss.user_info (id);
    
    alter table uss.user_info
    add constraint user_info_pk
    primary key (id);
    
    insert into user_info (first_name, last_name, gender, birthday, email)
    values ('Robert', 'Yen', 1, '1985-08-08', 'robert.yen@linecorp.com'),
    ('Cid', 'Change', 1, '1990-10-10', 'cid.change@linecorp.com'),
    ('Miki', 'Lai', 2, '1993-4-5', 'miki.lai@linecorp.com'),
    ('Sherry', 'Chen', 2, '1993-8-8', 'sherry.lai@linecorp.com'),
    ('Peter', 'Wang', 1, '1950-12-22', 'peter.wang@linecorp.com');