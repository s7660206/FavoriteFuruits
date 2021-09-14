DELETE FROM favorite_fruits where fruit_name = 'メロン';
DELETE FROM favorite_fruits where fruit_name = 'りんご';
DELETE FROM favorite_fruits where fruit_name = 'マスカット';

INSERT INTO favorite_fruits(id,fruit_name,memo) VALUES (1,'メロン','高い');
INSERT INTO favorite_fruits(id,fruit_name,memo) VALUES (2,'りんご','赤い');
INSERT INTO favorite_fruits(id,fruit_name,memo) VALUES (3,'マスカット','丸いよ');