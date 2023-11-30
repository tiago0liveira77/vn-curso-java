CREATE TABLE `final_project_hotels_vuelos_reservas`.`hotels` (
  `id_hotel` INT NOT NULL AUTO_INCREMENT,
  `hotel` VARCHAR(255) NULL,
  `categoria` VARCHAR(255) NULL,
  `precio` DECIMAL(10,2) NULL,
  `disponible` TINYINT(1) NULL,
  PRIMARY KEY (`id_hotel`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;