create table tasks (
    id bigserial primary key,
    title varchar(255),
    description varchar(255),
    status varchar(255),
    author_id bigint
)