--liquibase formatted sql
--changeset kris:1
CREATE TABLE PRODUCT_Category
(
    id            BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    category_name VARCHAR(255)
)
