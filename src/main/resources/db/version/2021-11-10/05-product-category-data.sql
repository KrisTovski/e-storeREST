--liquibase formatted sql
--changeset kris:1
INSERT INTO PRODUCT_CATEGORY(id, name, description, image_url)
VALUES (1, 'Electric Guitars', 'All kinds of electric guitars', 'https://www.fmicassets.com/Damroot/GuitarVertDesktopJpg/10001/0147323330_fen_ins_frt_1_rr.jpg'),
       (2, 'Acoustic Guitars', 'Classic, flamenco etc', 'https://pl.yamaha.com/pl/files/fx370_nt_a_0001_f_642d842f63f4e204fca0a4ce04412d84.jpg'),
       (3, 'Bass Guitars', 'Four and five strings bass guitars', 'https://pl.yamaha.com/pl/files/fx370_nt_a_0001_f_642d842f63f4e204fca0a4ce04412d84.jpg'),
       (4, 'Keys', 'Acoustic and electric pianos', 'https://image.ceneostatic.pl/data/products/109015562/f-casio-px-s3000-bk-set-caly-zestaw.jpg');