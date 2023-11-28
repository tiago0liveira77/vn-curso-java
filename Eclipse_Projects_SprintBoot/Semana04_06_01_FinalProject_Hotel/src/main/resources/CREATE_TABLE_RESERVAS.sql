CREATE TABLE `final_project_hotels_vuelos_reservas`.`reservas` (
  `id_reservas` INT NOT NULL AUTO_INCREMENT,
  `cliente` VARCHAR(255) NULL,
  `dni` VARCHAR(40) NULL,
  `id_hotel` INT NULL,
  `id_vuelo` INT NULL,
  PRIMARY KEY (`id_reservas`),
  INDEX `id_hotel_idx` (`id_hotel` ASC) VISIBLE,
  INDEX `id_vuelo_idx` (`id_vuelo` ASC) VISIBLE,
  CONSTRAINT `id_hotel`
    FOREIGN KEY (`id_hotel`)
    REFERENCES `final_project_hotels_vuelos_reservas`.`hotels` (`id_hotel`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_vuelo`
    FOREIGN KEY (`id_vuelo`)
    REFERENCES `final_project_hotels_vuelos_reservas`.`vuelos` (`id_vuelo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;
