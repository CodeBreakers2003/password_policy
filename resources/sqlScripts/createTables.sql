
CREATE DATABASE azdb;

create table users (
    user_id         int             not null
,   username        varchar(128)    not null
,   fist_name       varchar(128)
,   last_name       varchar(128)
,   primary key (user_id)
);


create table passwords (
    password_id     int             not null
,   user_id         int             not null
,   password_hash   varchar(256)    not null
,   primary key (password_id)
,   foreign key (user_id)
);

create table salts (
    salt_id         int             not null
,   user_id         int             not null
,   salt            varchar(256)    not null
,   primary key (salt_id)
,   foreign key (user_id)
)