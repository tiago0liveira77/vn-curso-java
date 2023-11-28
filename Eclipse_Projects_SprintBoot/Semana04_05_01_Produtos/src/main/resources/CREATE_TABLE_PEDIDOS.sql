CREATE TABLE `produtos_pedidos`.`pedidos` (
  `id_pedido` INT NOT NULL AUTO_INCREMENT,
  `codigo_producto` INT NULL,
  `unidades` INT NULL,
  `total` DECIMAL(10,2) NULL,
  `fecha_pedido` DATETIME NULL,
  PRIMARY KEY (`id_pedido`),
  INDEX `codigo_producto_idx` (`codigo_producto` ASC) VISIBLE,
  CONSTRAINT `codigo_producto`
    FOREIGN KEY (`codigo_producto`)
    REFERENCES `produtos_pedidos`.`produtos` (`codigo_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;