--liquibase formatted sql
--changeset kris:1
CREATE TABLE PRODUCT
(
    id             BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    sku            VARCHAR(255),
    name           VARCHAR(255),
    description    VARCHAR(255),
    unit_price     DECIMAL(13, 2),
    image_url      VARCHAR(255),
    active         TINYINT(0),
    units_in_stock INT(11),
    create_time    DATETIME,
    update_time    DATETIME
);