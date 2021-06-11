create table users
(
    id         uuid not null
        constraint users_pkey
            primary key,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    street varchar(255),
    city varchar(255),
    state varchar(255),
);
