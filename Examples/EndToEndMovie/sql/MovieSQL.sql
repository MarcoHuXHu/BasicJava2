create schema demo;
use demo;
CREATE TABLE `demo`.`movies` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `heroname` VARCHAR(45) NULL,
  `avgrating` DECIMAL(10,2) NULL,
  PRIMARY KEY (`id`));
INSERT INTO `demo`.`movies` (`id`, `name`, `heroname`, `avgrating`) VALUES ('1', 'Ratatouille', 'Remy', '8');
INSERT INTO `demo`.`movies` (`id`, `name`, `heroname`, `avgrating`) VALUES ('2', 'Finding nemo', 'Nemo ', '7.6');
INSERT INTO `demo`.`movies` (`id`, `name`, `heroname`, `avgrating`) VALUES ('3', 'Wall E', 'WALL-E', '8.9');
INSERT INTO `demo`.`movies` (`id`, `name`, `heroname`, `avgrating`) VALUES ('4', 'Frozen', 'Anna', '6.9');
INSERT INTO `demo`.`movies` (`id`, `name`, `heroname`, `avgrating`) VALUES ('5', 'Ice Age', 'Manny', '9.0');
