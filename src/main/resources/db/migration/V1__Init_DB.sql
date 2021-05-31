create sequence hibernate_sequence start 1 increment 1;

create table history_entity (id int8 not null, admittedquote float8, admittedvalue float8, boardid varchar(255),
                             close float8, high float8, legalcloseprice float8, low float8, marketprice2 float8,
                              marketprice3 float8, marketprice3tradesvalue float8, mp2valtrd float8, numtrades float8,
                               open float8, shortname varchar(255),tradedate date, value float8, volume float8,
                                waprice float8, waval float8, secid varchar(255), primary key (id)
);

create table securities_entity (id int8 not null, emitent_id int4 not null, emitent_inn varchar(255),
                                emitent_okpo varchar(255), emitent_title varchar(255), gosreg varchar(255),
                                 group_ varchar(255), is_traded int4 not null, isin varchar(255),
                                  marketprice_boardid varchar(255), name varchar(255), primary_boardid varchar(255),
                                  regnumber varchar(255), secid varchar(255), shortname varchar(255), type varchar(255),
                                   primary key (id)
);

alter table if exists securities_entity
add constraint UK_i5rsbayh65vjr5p2q8d0x6uep unique (secid);

alter table if exists history_entity
    add constraint FKl22vr0wcdrmqwb2ow2ot0mvnh foreign key (secid) references securities_entity (secid);