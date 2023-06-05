-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-05-2023 a las 06:13:32
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `amore`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `nombreArea` varchar(45) DEFAULT NULL,
  `aniosAntiguedad` int(11) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacenista`
--

CREATE TABLE `almacenista` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `nombreArea` varchar(45) DEFAULT NULL,
  `aniosAntiguedad` int(11) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` varchar(45) DEFAULT NULL,
  `idDepo` int(11) NOT NULL,
  `usuario` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoriaproducto`
--

CREATE TABLE `categoriaproducto` (
  `idCategoria` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `razonSocial` varchar(45) DEFAULT NULL,
  `condicionIVA` varchar(11) DEFAULT NULL,
  `cuit` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `razonSocial`, `condicionIVA`, `cuit`, `nombre`, `apellido`, `telefono`, `contraseña`, `usuario`) VALUES
(1, 'hola', 'holis', 12345, 'laura', 'ibarra', 54654, '1234', 'cliente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deposito`
--

CREATE TABLE `deposito` (
  `idDepo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiaprima`
--

CREATE TABLE `materiaprima` (
  `codigoMp` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `provedencia` varchar(45) DEFAULT NULL,
  `precio` decimal(10,0) DEFAULT NULL,
  `stockDisponible` int(11) DEFAULT NULL,
  `deposito_idDepo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiaprima_x_proveedor`
--

CREATE TABLE `materiaprima_x_proveedor` (
  `proveedor_cuit` int(11) NOT NULL,
  `materiaPrima_codigoMp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operario`
--

CREATE TABLE `operario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `nombreArea` varchar(45) DEFAULT NULL,
  `aniosAntiguedad` int(11) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` varchar(45) DEFAULT NULL,
  `turno` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `operario`
--

INSERT INTO `operario` (`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `contraseña`, `sueldo`, `turno`, `usuario`) VALUES
(1, 'claudio', 'valerio', 'produccion', 6, 5546546, '1234', '203456.0', 'mañana', 'operario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `descuento` decimal(10,0) DEFAULT NULL,
  `total` decimal(10,0) DEFAULT NULL,
  `formaPago` int(11) DEFAULT NULL,
  `vendedor_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_x_cliente`
--

CREATE TABLE `pedido_x_cliente` (
  `cliente_id` int(11) NOT NULL,
  `pedido_idPedido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `produccion`
--

CREATE TABLE `produccion` (
  `idProduccion` int(11) NOT NULL,
  `fechaProduccion` datetime DEFAULT NULL,
  `totalProducido` int(11) DEFAULT NULL,
  `produccioncol` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `produccion_x_produccion`
--

CREATE TABLE `produccion_x_produccion` (
  `operario_id` int(11) NOT NULL,
  `produccion_idProduccion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `precio` decimal(10,0) DEFAULT NULL,
  `stockDisponible` int(11) DEFAULT NULL,
  `deposito_idDepo` int(11) NOT NULL,
  `produccion_idProduccion` int(11) NOT NULL,
  `categoriaProducto_idCategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `cuit` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `montoComprado` decimal(10,0) DEFAULT NULL,
  `administrador_id` int(11) NOT NULL,
  `materialesQueProvee` varchar(45) NOT NULL,
  `deuda` double(6,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `nombreArea` varchar(45) DEFAULT NULL,
  `aniosAntiguedad` int(11) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `turno` varchar(45) DEFAULT NULL,
  `razonSocial` varchar(45) DEFAULT NULL,
  `condicionIVA` int(11) DEFAULT NULL,
  `cuit` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `nombreArea` varchar(45) DEFAULT NULL,
  `aniosAntiguedad` int(11) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `contraseña`, `sueldo`, `usuario`) VALUES
(1, 'Alda', 'Rivera', 'ventas', 3, 56544, '1254', '305638.0', 'vendedor');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `almacenista`
--
ALTER TABLE `almacenista`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `categoriaproducto`
--
ALTER TABLE `categoriaproducto`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `materiaprima`
--
ALTER TABLE `materiaprima`
  ADD PRIMARY KEY (`codigoMp`),
  ADD KEY `fk_materiaPrima_deposito1_idx` (`deposito_idDepo`);

--
-- Indices de la tabla `materiaprima_x_proveedor`
--
ALTER TABLE `materiaprima_x_proveedor`
  ADD PRIMARY KEY (`proveedor_cuit`,`materiaPrima_codigoMp`),
  ADD KEY `fk_proveedor_has_materiaPrima_materiaPrima1_idx` (`materiaPrima_codigoMp`),
  ADD KEY `fk_proveedor_has_materiaPrima_proveedor1_idx` (`proveedor_cuit`);

--
-- Indices de la tabla `operario`
--
ALTER TABLE `operario`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `fk_pedido_vendedor1_idx` (`vendedor_id`);

--
-- Indices de la tabla `pedido_x_cliente`
--
ALTER TABLE `pedido_x_cliente`
  ADD PRIMARY KEY (`cliente_id`,`pedido_idPedido`),
  ADD KEY `fk_cliente_has_pedido_pedido1_idx` (`pedido_idPedido`),
  ADD KEY `fk_cliente_has_pedido_cliente1_idx` (`cliente_id`);

--
-- Indices de la tabla `produccion`
--
ALTER TABLE `produccion`
  ADD PRIMARY KEY (`idProduccion`);

--
-- Indices de la tabla `produccion_x_produccion`
--
ALTER TABLE `produccion_x_produccion`
  ADD PRIMARY KEY (`operario_id`,`produccion_idProduccion`),
  ADD KEY `fk_operario_has_produccion_produccion1_idx` (`produccion_idProduccion`),
  ADD KEY `fk_operario_has_produccion_operario1_idx` (`operario_id`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `fk_producto_deposito1_idx` (`deposito_idDepo`),
  ADD KEY `fk_producto_produccion1_idx` (`produccion_idProduccion`),
  ADD KEY `fk_producto_categoriaProducto1_idx` (`categoriaProducto_idCategoria`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`cuit`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoriaproducto`
--
ALTER TABLE `categoriaproducto`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `produccion`
--
ALTER TABLE `produccion`
  MODIFY `idProduccion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `almacenista`
--
ALTER TABLE `almacenista`
  ADD CONSTRAINT `fk_almacenista_deposito1` FOREIGN KEY (`idDepo`) REFERENCES `deposito` (`idDepo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `materiaprima`
--
ALTER TABLE `materiaprima`
  ADD CONSTRAINT `fk_materiaPrima_deposito1` FOREIGN KEY (`deposito_idDepo`) REFERENCES `deposito` (`idDepo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `materiaprima_x_proveedor`
--
ALTER TABLE `materiaprima_x_proveedor`
  ADD CONSTRAINT `fk_proveedor_has_materiaPrima_materiaPrima1` FOREIGN KEY (`materiaPrima_codigoMp`) REFERENCES `materiaprima` (`codigoMp`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_proveedor_has_materiaPrima_proveedor1` FOREIGN KEY (`proveedor_cuit`) REFERENCES `proveedor` (`cuit`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `fk_pedido_vendedor1` FOREIGN KEY (`vendedor_id`) REFERENCES `vendedor` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `pedido_x_cliente`
--
ALTER TABLE `pedido_x_cliente`
  ADD CONSTRAINT `fk_cliente_has_pedido_cliente1` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_cliente_has_pedido_pedido1` FOREIGN KEY (`pedido_idPedido`) REFERENCES `pedido` (`idPedido`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `produccion_x_produccion`
--
ALTER TABLE `produccion_x_produccion`
  ADD CONSTRAINT `fk_operario_has_produccion_operario1` FOREIGN KEY (`operario_id`) REFERENCES `operario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_operario_has_produccion_produccion1` FOREIGN KEY (`produccion_idProduccion`) REFERENCES `produccion` (`idProduccion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `fk_producto_categoriaProducto1` FOREIGN KEY (`categoriaProducto_idCategoria`) REFERENCES `categoriaproducto` (`idCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_producto_deposito1` FOREIGN KEY (`deposito_idDepo`) REFERENCES `deposito` (`idDepo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_producto_produccion1` FOREIGN KEY (`produccion_idProduccion`) REFERENCES `produccion` (`idProduccion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD CONSTRAINT `fk_proveedor_administrador1` FOREIGN KEY (`administrador_id`) REFERENCES `administrador` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
