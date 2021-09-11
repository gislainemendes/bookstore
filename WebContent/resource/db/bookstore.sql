CREATE database bookstore;

CREATE TABLE `autores` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `email` varchar(255),
  `birthDate` date,
  `curriculo` varchar(255)
);
