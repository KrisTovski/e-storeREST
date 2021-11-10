--liquibase formatted sql
--changeset kris:1
CREATE TABLE PRODUCT_CATEGORY
(
    id            BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    category_name VARCHAR(255)
)
