--liquibase formatted sql
--changeset kris:1
CREATE TABLE PRODUCT_CATEGORY
(
    id   BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name VARCHAR(255),
    description    VARCHAR(255),
    image_url      VARCHAR(255)
);
