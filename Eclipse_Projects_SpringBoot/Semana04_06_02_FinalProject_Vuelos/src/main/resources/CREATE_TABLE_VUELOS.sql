CREATE TABLE `final_project_hotels_vuelos_reservas`.`vuelos` (
  `id_vuelo` INT NOT NULL AUTO_INCREMENT,
  `compania` VARCHAR(255) NULL,
  `fecha_vuelo` DATETIME NULL,
  `precio` DECIMAL(10,2) NULL,
  `plaza` INT NULL,
  PRIMARY KEY (`id_vuelo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;
