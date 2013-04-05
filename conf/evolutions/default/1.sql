# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table promotion (
  id                        bigint not null,
  business_info_id          bigint,
  start_date                timestamp,
  end_date                  timestamp,
  description               varchar(255),
  value                     double,
  constraint pk_promotion primary key (id))
;

create sequence promotion_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists promotion;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists promotion_seq;

