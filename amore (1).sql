-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-06-2023 a las 19:03:52
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

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
  `sueldo` varchar(45) DEFAULT NULL
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
  `usuario` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` varchar(45) DEFAULT NULL,
  `idDepo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `almacenista`
--

INSERT INTO `almacenista` (`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `usuario`, `contraseña`, `sueldo`, `idDepo`) VALUES
(1, 'pablo', 'patos', 'repositor', 5, 46546565, 'almacenista', '12345pablo', '103458.0', 1),
(2, 'ramiro', 'lertora', 'hola', 4, 5465465, 'almacenista', '546546rama', '102458.0', 1);

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
  `telefono` int(12) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiaprima`
--

CREATE TABLE `materiaprima` (
  `idMp` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `procedencia` varchar(45) DEFAULT NULL,
  `precio` decimal(10,0) DEFAULT NULL,
  `stockDisponible` int(11) DEFAULT NULL,
  `idDepo` int(11) NOT NULL
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
  `usuario` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` varchar(45) DEFAULT NULL,
  `turno` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `operario`
--

INSERT INTO `operario` (`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `usuario`, `contraseña`, `sueldo`, `turno`) VALUES
(1, 'claudio', 'pepper', 'produccion', 6, 1125478963, 'operario', '1234567clau', '125478.0', 'mañana'),
(3, 'greta', 'panser', 'mezcla', 4, 1125478693, 'operario', '12345698gret', '102458.0', 'medio dia'),
(4, 'pedro', 'carlos', 'repositor', 6, 6546546, 'operario', '5454carlos', '103456.0', 'mañana'),
(5, 'juan', 'arturo', 'repositor', 6, 6546, 'operario', '5465', '102458.0', 'mañana');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `descuento` decimal(10,0) DEFAULT NULL,
  `total` decimal(10,0) DEFAULT NULL,
  `formaPago` varchar(11) DEFAULT NULL,
  `idVendedor` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `produccion`
--

CREATE TABLE `produccion` (
  `idProduccion` int(11) NOT NULL,
  `fechaProduccion` datetime DEFAULT NULL,
  `totalProducido` int(11) DEFAULT NULL,
  `produccioncol` varchar(45) DEFAULT NULL,
  `idOperario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `precio` decimal(10,0) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `idDepo` int(11) NOT NULL,
  `idProduccion` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `cuit` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `montoComprado` decimal(10,0) DEFAULT NULL,
  `deuda` decimal(9,2) NOT NULL,
  `materialesQueProvee` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`cuit`, `nombre`, `montoComprado`, `deuda`, `materialesQueProvee`) VALUES
(12345, 'manolete', 25478, 20145.00, 'harina'),
(12536, 'alda', 14589, 0.00, 'fiambre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor_x_materiaprima`
--

CREATE TABLE `proveedor_x_materiaprima` (
  `proveedor_cuit` int(11) NOT NULL,
  `materiaPrima_codigoMp` int(11) NOT NULL
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
  `usuario` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `usuario`, `contraseña`, `sueldo`) VALUES
(1, 'alda', 'rivera', 'ventas', 4, 6646546, 'vendedor', '1234alda', '102345.0');

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
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`cuit`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

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
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
