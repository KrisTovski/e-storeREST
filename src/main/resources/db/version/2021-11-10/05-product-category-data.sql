--liquibase formatted sql
--changeset kris:1
INSERT INTO PRODUCT_CATEGORY(id, category_name) VALUES
                                            (1, 'Electric Guitar'),
                                            (2, 'Acoustic Guitar'),
                                            (3, 'Bass Guitar'),
                                            (4, 'Piano');