-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-06-2023 a las 01:32:29
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

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
  `usuario` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
  `usuario` varchar(45) DEFAULT NULL,
  `contrasenia` varchar(45) DEFAULT NULL,
  `sueldo` double DEFAULT NULL,
  `idDepo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `almacenista`
--

INSERT INTO `almacenista` (`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `usuario`, `contrasenia`, `sueldo`, `idDepo`) VALUES
(1, 'pablo', 'patos', 'repositor', 5, 46546565, 'almacenista', '12345pablo', 103458, 1),
(2, 'ramiro', 'lertora', 'hola', 4, 5465465, 'almacenista', '546546rama', 102458, 1),
(3, 'seba', 'lopez', 'alma', 2, 123456, 'alma', '123', 4512, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoriaproducto`
--

CREATE TABLE `categoriaproducto` (
  `idCategoria` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
  `telefono` int(12) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `razonSocial`, `condicionIVA`, `cuit`, `nombre`, `apellido`, `telefono`, `usuario`, `contraseña`) VALUES
(1, 'hola', 'hola', 1254, 'pedro', 'pepe', 5546546, 'cliente', '123456789'),
(2, 'hola', 'hola', 1254, 'hilda', 'pedro', 546546, 'cliente', '123456789'),
(4, 'hola', 'quetal', 12345, 'julieta', 'ruiz', 6546546, 'cliente', '54545juli'),
(5, 'holass', 'quehaceee', 123456, 'lautaro', 'fernandez', 6465465, 'cliente', '5454lauti'),
(6, 'este', 'van', 123698, 'esteban', 'quito', 6465465, 'cliente', '545465esteban'),
(7, 'hola', 'hola', 12345, 'maria', 'lopez', 65465, 'cliente', '54654'),
(8, 'hola', 'asasa', 12345, 'sofia', 'castro', 1234567891, 'cliente', '554'),
(9, 'hola', 'asasa', 12345, 'carlos', 'baker', 12345678, 'cliente', '6545664'),
(10, 'hola', 'asasa', 1234, 'paloma', 'pajaro', 123456, 'cliente', '5465');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deposito`
--

CREATE TABLE `deposito` (
  `idDepo` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiaprima`
--

CREATE TABLE `materiaprima` (
  `idMp` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `procedencia` varchar(45) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `stockDisponible` int(11) DEFAULT NULL,
  `idDepo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `materiaprima`
--

INSERT INTO `materiaprima` (`idMp`, `nombre`, `procedencia`, `precio`, `stockDisponible`, `idDepo`) VALUES
(1, 'Harina de trigo', 'Nacional', 2.5, 100, 1),
(2, 'Tomate', 'Local', 1.2, 50, 2),
(3, 'Queso Parmesano', 'Importado', 5.8, 20, 3),
(4, 'Aceite de oliva', 'Extranjero', 8.5, 30, 1),
(5, 'Carne molida', 'Nacional', 4.7, 40, 2),
(6, 'Albahaca', 'Local', 0.8, 15, 3);

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
  `usuario` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` double DEFAULT NULL,
  `turno` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `operario`
--

INSERT INTO `operario` (`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `usuario`, `contraseña`, `sueldo`, `turno`) VALUES
(1, 'claudio', 'pepper', 'produccion', 6, 1125478963, 'operario', '1234567clau', 125478, 'mañana'),
(3, 'greta', 'panser', 'mezcla', 4, 1125478693, 'operario', '12345698gret', 102458, 'medio dia'),
(4, 'pedro', 'carlos', 'repositor', 6, 6546546, 'operario', '5454carlos', 103456, 'mañana'),
(5, 'juan', 'arturo', 'repositor', 6, 6546, 'operario', '5465', 102458, 'mañana');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `descuento` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `formaPago` varchar(11) DEFAULT NULL,
  `idVendedor` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `descuento`, `total`, `formaPago`, `idVendedor`, `idCliente`, `estado`) VALUES
(1, 10.5, 50, 'Efectivo', 1, 1, 1),
(2, 0, 75.9, 'Tarjeta de ', 2, 3, 1),
(3, 5.25, 120, 'Transferenc', 1, 2, 1),
(4, 0, 25.5, 'Efectivo', 3, 4, 1),
(5, 8.75, 95.8, 'Tarjeta de ', 2, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_producto`
--

CREATE TABLE `pedido_producto` (
  `idPedido` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido_producto`
--

INSERT INTO `pedido_producto` (`idPedido`, `idProducto`, `cantidad`) VALUES
(1, 5, 10),
(2, 1, 1),
(3, 3, 1),
(3, 4, 1),
(4, 4, 1),
(5, 6, 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `produccion`
--

CREATE TABLE `produccion` (
  `idProduccion` int(11) NOT NULL,
  `fechaProduccion` datetime DEFAULT NULL,
  `totalProducido` double DEFAULT NULL,
  `idOperario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `idDepo` int(11) NOT NULL,
  `idProduccion` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre`, `precio`, `cantidad`, `idDepo`, `idProduccion`, `idCategoria`) VALUES
(1, 'Espaguetis', 5.99, 47, 1, 1, 1),
(2, 'Fusilli', 4.99, 39, 1, 1, 1),
(3, 'Salsa de tomate', 2.99, 93, 2, 1, 2),
(4, 'Salsa Alfredo', 3.99, 67, 2, 1, 2),
(5, 'Queso Parmesano', 7.99, 20, 3, 1, 3),
(6, 'Queso Mozzarella', 6.99, 20, 3, 1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor_x_materiaprima`
--

CREATE TABLE `proveedor_x_materiaprima` (
  `proveedor_cuit` int(11) NOT NULL,
  `materiaPrima_codigoMp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
  `usuario` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `usuario`, `contraseña`, `sueldo`) VALUES
(1, 'alda', 'rivera', 'ventas', 4, 6646546, 'vendedor', '1234alda', 102345);

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
-- Indices de la tabla `deposito`
--
ALTER TABLE `deposito`
  ADD PRIMARY KEY (`idDepo`);

--
-- Indices de la tabla `materiaprima`
--
ALTER TABLE `materiaprima`
  ADD PRIMARY KEY (`idMp`);

--
-- Indices de la tabla `operario`
--
ALTER TABLE `operario`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`);

--
-- Indices de la tabla `pedido_producto`
--
ALTER TABLE `pedido_producto`
  ADD PRIMARY KEY (`idPedido`,`idProducto`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `produccion`
--
ALTER TABLE `produccion`
  ADD PRIMARY KEY (`idProduccion`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `proveedor_x_materiaprima`
--
ALTER TABLE `proveedor_x_materiaprima`
  ADD PRIMARY KEY (`proveedor_cuit`,`materiaPrima_codigoMp`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `almacenista`
--
ALTER TABLE `almacenista`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `categoriaproducto`
--
ALTER TABLE `categoriaproducto`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `deposito`
--
ALTER TABLE `deposito`
  MODIFY `idDepo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `operario`
--
ALTER TABLE `operario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `produccion`
--
ALTER TABLE `produccion`
  MODIFY `idProduccion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedido_producto`
--
ALTER TABLE `pedido_producto`
  ADD CONSTRAINT `pedido_producto_ibfk_1` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`),
  ADD CONSTRAINT `pedido_producto_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
