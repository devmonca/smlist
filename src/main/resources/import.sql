INSERT INTO tb_playlist (title) VALUES ('Corrida');
INSERT INTO tb_playlist (title) VALUES ('Animar');

INSERT INTO tb_music (title, music_year, artist , img_url, genre) VALUES ('da lua', 2023, 'Djonga', 'imgmusic/djonga', 'Rap/Trap');
INSERT INTO tb_music (title, music_year, artist , img_url, genre) VALUES ('Rap Bom', 2024, 'Djonga e FBC', 'imgmusic/djonga', 'Rap');
INSERT INTO tb_music (title, music_year, artist , img_url, genre) VALUES ('Eu Ainda Tenho Coração', 2023, 'Leall', 'imgmusic/leall', 'Rap/Trap');
INSERT INTO tb_music (title, music_year, artist , img_url, genre) VALUES ('Jóias do bairro', 2024, 'Leall e Borges', 'imgmusic/leall', 'Trap');
INSERT INTO tb_music (title, music_year, artist , img_url, genre) VALUES ('BOM DE ENCONTRAR', 2023, 'Bk e João Gomes', 'imgmusic/bk', 'Hip-Hop/Rap');
INSERT INTO tb_music (title, music_year, artist , img_url, genre) VALUES ('Olha pra Cá', 2023, 'Major RD', 'imgmusic/majorrd', 'Rap/Trap');
INSERT INTO tb_music (title, music_year, artist , img_url, genre) VALUES ('Guap', 2023, 'Jé Santiago', 'imgmusic/jé', 'Rap/Trap');
INSERT INTO tb_music (title, music_year, artist , img_url, genre) VALUES ('5 da manhã', 2023, 'Djonga', 'imgmusic/djonga', 'Rap/Trap');
INSERT INTO tb_belonging (playlist_id, music_id, position) VALUES (1, 1, 0);
INSERT INTO tb_belonging (playlist_id, music_id, position) VALUES (1, 2, 1);
INSERT INTO tb_belonging (playlist_id, music_id, position) VALUES (1, 3, 2);
INSERT INTO tb_belonging (playlist_id, music_id, position) VALUES (1, 4, 3);
INSERT INTO tb_belonging (playlist_id, music_id, position) VALUES (2, 5, 0);
INSERT INTO tb_belonging (playlist_id, music_id, position) VALUES (2, 6, 1);
INSERT INTO tb_belonging (playlist_id, music_id, position) VALUES (2, 7, 2);
INSERT INTO tb_belonging (playlist_id, music_id, position) VALUES (2, 8, 3);
