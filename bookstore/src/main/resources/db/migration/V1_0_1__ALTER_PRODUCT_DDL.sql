ALTER TABLE products ADD COLUMN photo VARCHAR(255);

INSERT INTO products (name,description,price,photo,created_at) VALUES
	 ('Samsung Galaxy S22 Ultra','Smartphone Samsung Galaxy S22 Ultra 5G (256GB), 12GB, Processador Octa-Core, Câmera Quádrupla Traseira de 108MP OIS (Wide) + 10MP',799980,'https://bookstore-front-images.s3.amazonaws.com/smartphone.png','2022-10-27 14:35:27.701268'),
	 ('Xiaomi Mi Smart Band 6',' Chegou a nova Mi Band, agora com nome e cara nova, apresentamos a Mi Smart Band 6 ',20000,'https://bookstore-front-images.s3.amazonaws.com/smartwatch.jpg','2022-10-27 14:39:46.676148'),
	 ('Iphone 13 Pro MARX','iPhone 13 Pro Max. O maior upgrade do sistema de câmera Pro até hoje. Tela Super Retina XDR com ProMotion para uma experiência mais rápida e responsiva. Chip A15 Bionic com velocidade impressionante. 5G ultrarrápido*. Design resistente. E a maior duração de bateria em um iPhone**.',899900,'https://bookstore-front-images.s3.amazonaws.com/iphone13.jpg','2022-10-28 09:36:51.935716');
