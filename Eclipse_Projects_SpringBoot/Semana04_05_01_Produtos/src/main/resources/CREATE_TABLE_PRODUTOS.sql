CREATE TABLE `produtos_pedidos`.`produtos` (
  `codigo_producto` INT NOT NULL AUTO_INCREMENT,
  `producto` VARCHAR(255) NULL,
  `precio_unitaro` DECIMAL(10,2) NULL,
  `stock` INT NULL,
  PRIMARY KEY (`codigo_producto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;
