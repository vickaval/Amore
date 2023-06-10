-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-06-2023 a las 02:08:16
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
CREATE DATABASE IF NOT EXISTS `amore` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `amore`;

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
  `contraseña` varchar(45) DEFAULT NULL,
  `sueldo` double DEFAULT NULL,
  `idDepo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `almacenista`
--

INSERT INTO `almacenista` (`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `usuario`, `contraseña`, `sueldo`, `idDepo`) VALUES
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
  `estado` int(11) NOT NULL DEFAULT 0,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `descuento`, `total`, `formaPago`, `idVendedor`, `idCliente`, `estado`, `idProducto`) VALUES
(1, 10.5, 50, 'Efectivo', 1, 1, 1, 2),
(2, 0, 75.9, 'Tarjeta de ', 2, 3, 0, 4),
(3, 5.25, 120, 'Transferenc', 1, 2, 1, 5),
(4, 0, 25.5, 'Efectivo', 3, 4, 1, 6),
(5, 8.75, 95.8, 'Tarjeta de ', 2, 1, 0, 6);

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
(1, 1, 2),
(1, 2, 1),
(2, 3, 3);

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
(1, 'Espaguetis', 5.99, 50, 1, 1, 1),
(2, 'Fusilli', 4.99, 40, 1, 1, 1),
(3, 'Salsa de tomate', 2.99, 100, 2, 1, 2),
(4, 'Salsa Alfredo', 3.99, 80, 2, 1, 2),
(5, 'Queso Parmesano', 7.99, 30, 3, 1, 3),
(6, 'Queso Mozzarella', 6.99, 35, 3, 1, 3);

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
--
-- Base de datos: `cafeteria`
--
CREATE DATABASE IF NOT EXISTS `cafeteria` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `cafeteria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `correoElectronico` varchar(45) NOT NULL,
  `telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `dni`, `nombre`, `apellido`, `correoElectronico`, `telefono`) VALUES
(1, 12345678, 'Juan', 'Pérez', 'juan.perez@example.com', 987654321),
(2, 23456789, 'Ana', 'García', 'ana.garcia@example.com', 5555678),
(3, 34567890, 'Carlos', 'Paz', 'carlos.sanchez@example.com', 5559012),
(4, 45678901, 'Laura', 'González', 'laura.gonzalez@example.com', 5553456),
(5, 56789012, 'Eduardo', 'Hernández', 'eduardo.hernandez@example.com', 5557890),
(6, 67890123, 'Sofía', 'Ramírez', 'sofia.ramirez@example.com', 5552345),
(7, 78901234, 'Marta', 'López', 'marta.lopez@example.com', 5556789),
(8, 89012345, 'Pedro', 'Martínez', 'pedro.martinez@example.com', 5550123),
(9, 90123456, 'María', 'Gómez', 'maria.gomez@example.com', 5554567),
(10, 1234567, 'Alejandro', 'Fernández', 'alejandro.fernandez@example.com', 5558901);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_pedido`
--

CREATE TABLE `detalle_pedido` (
  `iddetalle_pedido` int(11) NOT NULL,
  `idpedido` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalle_pedido`
--

INSERT INTO `detalle_pedido` (`iddetalle_pedido`, `idpedido`, `idproducto`, `cantidad`, `descripcion`) VALUES
(1, 1, 2, 1, 'Cafe con crema batida'),
(2, 1, 6, 1, 'Croissant de jamón y queso caliente'),
(3, 2, 2, 1, 'Licuado de banana'),
(4, 2, 5, 1, 'Muffin de arándanos con almendras picadas'),
(5, 3, 2, 1, 'Capuccino con canela extra'),
(6, 4, 8, 1, 'Sandwich pan negro'),
(7, 4, 2, 1, 'Chocolatada'),
(8, 5, 6, 1, 'Croissant de chocolate con almendras tostadas'),
(9, 6, 2, 1, 'Capuccino descafeinado'),
(10, 7, 7, 1, 'Queso brie');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `idempleado` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `correoElectronico` varchar(45) NOT NULL,
  `telefono` int(11) NOT NULL,
  `cargo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`idempleado`, `dni`, `nombre`, `apellido`, `correoElectronico`, `telefono`, `cargo`) VALUES
(1, 12345, 'Juan', 'Pérez', 'juanperez@gmail.com', 4444, 'Barista'),
(2, 23456789, 'Ana', 'García', 'anagarcia@gmail.com', 876543210, 'Mesera'),
(3, 34567890, 'Pedro', 'Rodríguez', 'pedrorodriguez@gmail.com', 765432109, 'Cocinero'),
(4, 45678901, 'Carla', 'González', 'carlagonzalez@gmail.com', 654321098, 'Cajero'),
(5, 987456, 'Luis', 'Martínez', 'luismartinez@gmail.com', 2222, 'Barista'),
(6, 67890123, 'Sofía', 'Hernández', 'sofiahernandez@gmail.com', 432109876, 'Mesera'),
(7, 78901234, 'Miguel', 'Flores', 'miguelflores@gmail.com', 321098765, 'Cocinero'),
(8, 89012345, 'María', 'López', 'marialopez@gmail.com', 210987654, 'Cajero'),
(9, 90123456, 'Pablo', 'Ramírez', 'pabloramirez@gmail.com', 109876543, 'Barista'),
(10, 11223344, 'Laura', 'Castillo', 'lauracastillo@gmail.com', 998877665, 'Mesera');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `idfactura` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `monto` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`idfactura`, `fecha`, `monto`) VALUES
(1, '2022-01-01', 100.5),
(2, '2022-01-02', 200.75),
(3, '2022-01-03', 98.55),
(4, '2022-01-04', 300.25),
(5, '2022-01-05', 150),
(6, '2022-01-06', 1051),
(7, '2022-01-07', 250.75),
(8, '2022-01-08', 175),
(9, '2022-01-09', 125.25),
(10, '2022-01-10', 80);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `idmesa` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `ubicacion` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`idmesa`, `capacidad`, `ubicacion`) VALUES
(1, 4, 'Terraza'),
(2, 6, 'Salón principal'),
(3, 5, 'Zona de bar'),
(4, 10, 'Sala VIP'),
(5, 4, 'Jardín'),
(6, 6, 'Sala de eventos'),
(7, 2, 'Sala de espera'),
(8, 10, 'Banquetes'),
(9, 12, 'Conferencias'),
(10, 4, 'Sala de reunion');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idpedido` int(11) NOT NULL,
  `fecha_hora` datetime NOT NULL,
  `estado` varchar(45) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idmesa` int(11) NOT NULL,
  `idempleado` int(11) NOT NULL,
  `idfactura` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idpedido`, `fecha_hora`, `estado`, `idCliente`, `idmesa`, `idempleado`, `idfactura`) VALUES
(1, '2023-04-12 12:00:00', 'En preparación', 1, 3, 2, 1),
(2, '2023-04-12 12:10:00', 'En espera', 2, 4, 1, 2),
(3, '2023-04-12 12:20:00', 'En preparación', 3, 1, 3, 3),
(4, '2023-04-12 12:30:00', 'En espera', 4, 5, 4, 4),
(5, '2023-04-12 12:40:00', 'En preparación', 5, 2, 1, 1),
(6, '2023-04-12 12:50:00', 'En espera', 6, 6, 2, 2),
(7, '2023-04-12 13:00:00', 'Listo para servir', 7, 3, 3, 1),
(8, '2023-04-12 13:10:00', 'Finalizado', 8, 4, 4, 2),
(9, '2023-04-12 13:20:00', 'Listo para servir', 9, 1, 1, 3),
(10, '2023-04-12 13:30:00', 'Finalizado', 10, 5, 2, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `tamaño` varchar(45) NOT NULL,
  `precio` double NOT NULL,
  `idtipoProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idproducto`, `nombre`, `descripcion`, `tamaño`, `precio`, `idtipoProducto`) VALUES
(1, 'Café Americano', 'Café negro', 'Pequeño', 2.5, 1),
(2, 'Café con Leche', 'Café con leche', 'Mediano', 3.5, 1),
(3, 'Capuchino', 'Cafe instantaneo super bien batido', 'Mediano', 4.5, 1),
(4, 'Expreso', 'Cafe descafeinado', 'Pequeño', 3, 1),
(5, 'Muffin de Arándanos', 'Muffin con arándanos', 'Individual', 2.75, 2),
(6, 'Croissant', 'Croissant de mantequilla', 'Individual', 2.5, 2),
(7, 'Bagel de Queso', 'Bagel con queso crema', 'Individual', 3.25, 2),
(8, 'Sándwich de Jamón y Queso', 'Sándwich con jamón y queso', 'Mediano', 4.75, 3),
(9, 'Ensalada de Pollo', 'Ensalada con pollo y aderezo', 'Grande', 6.25, 4),
(10, 'Jugo de Naranja', 'Jugo de naranja natural', 'Grande', 3.5, 5);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `reporte_empleados_desempeno`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `reporte_empleados_desempeno` (
`nombre` varchar(45)
,`apellido` varchar(45)
,`num_pedidos` bigint(21)
,`total_ventas` double
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `reporte_pedidos_cliente_fecha`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `reporte_pedidos_cliente_fecha` (
`nombre` varchar(45)
,`apellido` varchar(45)
,`fecha_hora` datetime
,`num_pedidos` bigint(21)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoproducto`
--

CREATE TABLE `tipoproducto` (
  `idtipoProducto` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipoproducto`
--

INSERT INTO `tipoproducto` (`idtipoProducto`, `tipo`) VALUES
(1, 'Café'),
(2, 'Panadería'),
(3, 'Sándwiches'),
(4, 'Ensaladas'),
(5, 'Bebidas'),
(6, 'Postres'),
(7, 'Merienda'),
(8, 'Comida vegetariana'),
(9, 'Vegano'),
(10, 'Platos principales');

-- --------------------------------------------------------

--
-- Estructura para la vista `reporte_empleados_desempeno`
--
DROP TABLE IF EXISTS `reporte_empleados_desempeno`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `reporte_empleados_desempeno`  AS SELECT `e`.`nombre` AS `nombre`, `e`.`apellido` AS `apellido`, count(`p`.`idpedido`) AS `num_pedidos`, sum(`f`.`monto`) AS `total_ventas` FROM ((`empleado` `e` left join `pedido` `p` on(`e`.`idempleado` = `p`.`idempleado`)) left join `factura` `f` on(`p`.`idfactura` = `f`.`idfactura`)) GROUP BY `e`.`idempleado` ;

-- --------------------------------------------------------

--
-- Estructura para la vista `reporte_pedidos_cliente_fecha`
--
DROP TABLE IF EXISTS `reporte_pedidos_cliente_fecha`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `reporte_pedidos_cliente_fecha`  AS SELECT `c`.`nombre` AS `nombre`, `c`.`apellido` AS `apellido`, `p`.`fecha_hora` AS `fecha_hora`, count(0) AS `num_pedidos` FROM (`cliente` `c` join `pedido` `p` on(`c`.`idCliente` = `p`.`idCliente`)) GROUP BY `c`.`idCliente`, `p`.`fecha_hora` ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD KEY `idx_idCliente_cliente` (`idCliente`);

--
-- Indices de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD PRIMARY KEY (`iddetalle_pedido`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`idempleado`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`idfactura`);

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`idmesa`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idpedido`,`idempleado`),
  ADD KEY `idx_idCliente_pedido` (`idCliente`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idproducto`,`idtipoProducto`),
  ADD KEY `idx_nombre_producto` (`nombre`);

--
-- Indices de la tabla `tipoproducto`
--
ALTER TABLE `tipoproducto`
  ADD PRIMARY KEY (`idtipoProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  MODIFY `iddetalle_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `idempleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `idfactura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `idmesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idpedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- Base de datos: `calendario`
--
CREATE DATABASE IF NOT EXISTS `calendario` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `calendario`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventos`
--

CREATE TABLE `eventos` (
  `id` int(11) NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `eventos`
--

INSERT INTO `eventos` (`id`, `titulo`, `descripcion`, `fecha`, `ubicacion`) VALUES
(1, 'musica', 'rock nacional', '2023-05-30', 'Luna Park');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `eventos`
--
ALTER TABLE `eventos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `eventos`
--
ALTER TABLE `eventos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Base de datos: `carrito`
--
CREATE DATABASE IF NOT EXISTS `carrito` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `carrito`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `idCategoria` tinyint(2) UNSIGNED NOT NULL,
  `categoria` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `precio` float NOT NULL,
  `descripcion` text COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`idCategoria`, `categoria`, `precio`, `descripcion`) VALUES
(1, 'TV', 10000, 'Buenisima'),
(2, 'heladeras', 0, ''),
(3, 'mesitas', 0, ''),
(4, 'lavarropas', 0, ''),
(5, 'computadoras', 0, ''),
(7, 'luces', 0, ''),
(8, 'copas', 0, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `codigoProducto` int(12) UNSIGNED NOT NULL,
  `nombreProducto` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `precioProducto` float(9,2) UNSIGNED DEFAULT NULL,
  `cantidadProducto` smallint(5) DEFAULT NULL,
  `fotoProducto` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fotoMarca` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `descripcionProducto` text COLLATE utf8_spanish_ci DEFAULT NULL,
  `detallesProducto` text COLLATE utf8_spanish_ci DEFAULT NULL,
  `categoriaProducto` tinyint(2) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`codigoProducto`, `nombreProducto`, `precioProducto`, `cantidadProducto`, `fotoProducto`, `fotoMarca`, `descripcionProducto`, `detallesProducto`, `categoriaProducto`) VALUES
(1, 'TV LG 42 pulgadas', 10000.00, 5, NULL, NULL, 'La mejor tele para ver el mundial', 'Se ve genial', 1),
(2, 'TV', 5000.00, 3, NULL, NULL, '							Una tele para ver en el dormitorio\r\n					', '							Se ve muy bien realmente\r\n					', 1),
(3, 'Heladera Patrick tropical', 6000.00, 2, NULL, NULL, 'Enfria re bien', 'Color blanco', 2),
(4, 'Mesita de pino', 5000.00, 2, NULL, NULL, '		Mesa de pino', 'color cedro		', 3),
(5, 'Lavarropas Samsung', 70000.00, 4, NULL, NULL, 'Carga superior		', 'Con wi-fi		', 4),
(6, 'tv nuevo', 8000.00, 3, '1669905406.jpg', NULL, 'sdfdf', 'sdfdf', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`codigoProducto`),
  ADD KEY `fk1` (`categoriaProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `idCategoria` tinyint(2) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `fk1` FOREIGN KEY (`categoriaProducto`) REFERENCES `categorias` (`idCategoria`) ON UPDATE CASCADE;
--
-- Base de datos: `comercio`
--
CREATE DATABASE IF NOT EXISTS `comercio` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `comercio`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `mail` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `nombre`, `apellido`, `telefono`, `mail`) VALUES
(1, 'Juan', 'Pérez', '555-1234', 'juanperez@gmail.com'),
(2, 'María', 'González', '555-5678', 'mariagonzalez@hotmail.com'),
(3, 'Pedro', 'Sánchez', NULL, 'pedrosanchez@yahoo.com'),
(4, 'Laura', 'Ramírez', '555-2345', 'lauraramirez@gmail.com'),
(5, 'Jorge', 'Martínez', NULL, 'jorgemartinez@hotmail.com'),
(6, 'Ana', 'Fernández', '555-6789', 'anafernandez@yahoo.com'),
(7, 'Diego', 'López', '555-4564', 'diegote@yahoo.com'),
(8, 'Pedro', 'Saenz', NULL, 'pedrosz@yahoo.com'),
(9, 'Diana', 'Ramírez', '555-2345', 'lauraramirez@gmail.com'),
(10, 'Jorgelina', 'Suarez', NULL, 'jormartinez@hotmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `codigo` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `nombre`, `tipo`, `codigo`) VALUES
(1, 'Camiseta', 'Ropa', 'C001'),
(2, 'Pantalón', 'Ropa', 'C002'),
(3, 'Zapatos', 'Calzado', 'C003'),
(4, 'Televisor', 'Electrónica', 'E001'),
(5, 'Laptop', 'Computación', 'E002'),
(6, 'Mouse', 'Periférico', 'E003'),
(7, 'Celular', 'Telefonía', 'T001'),
(8, 'Auriculares', 'Audio', 'T002'),
(9, 'Altavoces', 'Audio', 'T003'),
(10, 'Impresora', 'Computación', 'E004');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `producto_id` int(11) NOT NULL,
  `monto_venta` double NOT NULL,
  `fecha_venta` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`id`, `cliente_id`, `producto_id`, `monto_venta`, `fecha_venta`) VALUES
(1, 3, 5, 201, '2022-02-15'),
(2, 1, 2, 309, '2022-01-05'),
(3, 4, 7, 234, '2022-03-08'),
(4, 2, 1, 907, '2022-02-01'),
(5, 5, 3, 209, '2022-01-20'),
(6, 3, 6, 543, '2022-02-28'),
(7, 1, 4, 786.9, '2022-03-10'),
(8, 4, 2, 321.75, '2022-02-14'),
(9, 2, 9, 653, '2022-01-12'),
(10, 5, 8, 878.35, '2022-03-01');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cliente_id` (`cliente_id`),
  ADD KEY `producto_id` (`producto_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`);
--
-- Base de datos: `espectaculos`
--
CREATE DATABASE IF NOT EXISTS `espectaculos` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `espectaculos`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asiento`
--

CREATE TABLE `asiento` (
  `idasiento` int(11) NOT NULL,
  `fila` char(1) NOT NULL,
  `numero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `asiento`
--

INSERT INTO `asiento` (`idasiento`, `fila`, `numero`) VALUES
(1, 'A', 101);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `controlador`
--

CREATE TABLE `controlador` (
  `id_controlador` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `calle` varchar(45) NOT NULL,
  `numero` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `pais` varchar(45) NOT NULL,
  `codigo_postal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `controlador`
--

INSERT INTO `controlador` (`id_controlador`, `nombre`, `apellido`, `calle`, `numero`, `piso`, `ciudad`, `pais`, `codigo_postal`) VALUES
(1, 'CECILIA', 'DIAZ', 'SIEMPRE VIVA', 45, 1, 'LANUS', 'ARGENTINA', 1454);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `controlador_telefono`
--

CREATE TABLE `controlador_telefono` (
  `controlador_id_controlador` int(11) NOT NULL,
  `telefono_id_telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `controlador_telefono`
--

INSERT INTO `controlador_telefono` (`controlador_id_controlador`, `telefono_id_telefono`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `controlar_entrada`
--

CREATE TABLE `controlar_entrada` (
  `entrada_id_entrada` int(11) NOT NULL,
  `controlador_id_controlador` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrada`
--

CREATE TABLE `entrada` (
  `id_entrada` int(11) NOT NULL,
  `asiento_idasiento` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `id_espectador` int(11) NOT NULL,
  `vendedor_id_vendedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `espectaculo`
--

CREATE TABLE `espectaculo` (
  `idespectaculo` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `horario` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `espectaculo_sala`
--

CREATE TABLE `espectaculo_sala` (
  `espectaculo_idespectaculo` int(11) NOT NULL,
  `espectaculo_calificacion_id_calificacion` int(11) NOT NULL,
  `sala_idsala` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `espectador`
--

CREATE TABLE `espectador` (
  `id_espectador` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `dni` int(11) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `telefono` int(11) NOT NULL,
  `calle` varchar(45) NOT NULL,
  `numero` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `pais` varchar(45) NOT NULL,
  `codigo_postal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `espectador_telefono`
--

CREATE TABLE `espectador_telefono` (
  `espectador_id_espectador` int(11) NOT NULL,
  `telefono_id_telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala`
--

CREATE TABLE `sala` (
  `idsala` int(11) NOT NULL,
  `calle` varchar(45) NOT NULL,
  `numero` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `pais` varchar(45) NOT NULL,
  `codigo_postal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala_asiento`
--

CREATE TABLE `sala_asiento` (
  `sala_idsala` int(11) NOT NULL,
  `asiento_idasiento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefono`
--

CREATE TABLE `telefono` (
  `id_telefono` int(11) NOT NULL,
  `cod_pais` int(11) DEFAULT NULL,
  `cod_area` int(11) DEFAULT NULL,
  `numero` double DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `id_vendedor` int(11) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `dni` int(11) NOT NULL,
  `telefono` int(11) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `calle` varchar(45) NOT NULL,
  `numero` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `codigo_postal` int(11) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `pais` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor_telefono`
--

CREATE TABLE `vendedor_telefono` (
  `vendedor_id_vendedor` int(11) NOT NULL,
  `telefono_id_telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asiento`
--
ALTER TABLE `asiento`
  ADD PRIMARY KEY (`idasiento`);

--
-- Indices de la tabla `controlador`
--
ALTER TABLE `controlador`
  ADD PRIMARY KEY (`id_controlador`);

--
-- Indices de la tabla `controlador_telefono`
--
ALTER TABLE `controlador_telefono`
  ADD PRIMARY KEY (`controlador_id_controlador`,`telefono_id_telefono`);

--
-- Indices de la tabla `controlar_entrada`
--
ALTER TABLE `controlar_entrada`
  ADD PRIMARY KEY (`entrada_id_entrada`,`controlador_id_controlador`);

--
-- Indices de la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD PRIMARY KEY (`id_entrada`,`vendedor_id_vendedor`);

--
-- Indices de la tabla `espectaculo`
--
ALTER TABLE `espectaculo`
  ADD PRIMARY KEY (`idespectaculo`);

--
-- Indices de la tabla `espectaculo_sala`
--
ALTER TABLE `espectaculo_sala`
  ADD PRIMARY KEY (`espectaculo_idespectaculo`,`espectaculo_calificacion_id_calificacion`,`sala_idsala`);

--
-- Indices de la tabla `espectador`
--
ALTER TABLE `espectador`
  ADD PRIMARY KEY (`id_espectador`);

--
-- Indices de la tabla `espectador_telefono`
--
ALTER TABLE `espectador_telefono`
  ADD PRIMARY KEY (`espectador_id_espectador`,`telefono_id_telefono`);

--
-- Indices de la tabla `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`idsala`);

--
-- Indices de la tabla `sala_asiento`
--
ALTER TABLE `sala_asiento`
  ADD PRIMARY KEY (`sala_idsala`,`asiento_idasiento`);

--
-- Indices de la tabla `telefono`
--
ALTER TABLE `telefono`
  ADD PRIMARY KEY (`id_telefono`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`id_vendedor`);

--
-- Indices de la tabla `vendedor_telefono`
--
ALTER TABLE `vendedor_telefono`
  ADD PRIMARY KEY (`vendedor_id_vendedor`,`telefono_id_telefono`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asiento`
--
ALTER TABLE `asiento`
  MODIFY `idasiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `controlador`
--
ALTER TABLE `controlador`
  MODIFY `id_controlador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `entrada`
--
ALTER TABLE `entrada`
  MODIFY `id_entrada` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `espectaculo`
--
ALTER TABLE `espectaculo`
  MODIFY `idespectaculo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `espectador`
--
ALTER TABLE `espectador`
  MODIFY `id_espectador` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sala`
--
ALTER TABLE `sala`
  MODIFY `idsala` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `telefono`
--
ALTER TABLE `telefono`
  MODIFY `id_telefono` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `id_vendedor` int(11) NOT NULL AUTO_INCREMENT;
--
-- Base de datos: `jardineria`
--
CREATE DATABASE IF NOT EXISTS `jardineria` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `jardineria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `codigo_cliente` int(11) NOT NULL,
  `nombre_cliente` varchar(50) NOT NULL,
  `nombre_contacto` varchar(30) DEFAULT NULL,
  `apellido_contacto` varchar(30) DEFAULT NULL,
  `telefono` varchar(15) NOT NULL,
  `fax` varchar(15) NOT NULL,
  `linea_direccion1` varchar(50) NOT NULL,
  `linea_direccion2` varchar(50) DEFAULT NULL,
  `ciudad` varchar(50) NOT NULL,
  `region` varchar(50) DEFAULT NULL,
  `pais` varchar(50) DEFAULT NULL,
  `codigo_postal` varchar(10) DEFAULT NULL,
  `codigo_empleado_rep_ventas` int(11) DEFAULT NULL,
  `limite_credito` decimal(15,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`codigo_cliente`, `nombre_cliente`, `nombre_contacto`, `apellido_contacto`, `telefono`, `fax`, `linea_direccion1`, `linea_direccion2`, `ciudad`, `region`, `pais`, `codigo_postal`, `codigo_empleado_rep_ventas`, `limite_credito`) VALUES
(1, 'GoldFish Garden', 'Daniel G', 'GoldFish', '5556901745', '5556901746', 'False Street 52 2 A', NULL, 'San Francisco', NULL, 'USA', '24006', 19, '3000.00'),
(3, 'Gardening Associates', 'Anne', 'Wright', '5557410345', '5557410346', 'Wall-e Avenue', NULL, 'Miami', 'Miami', 'USA', '24010', 19, '6000.00'),
(4, 'Gerudo Valley', 'Link', 'Flaute', '5552323129', '5552323128', 'Oaks Avenue nº22', NULL, 'New York', NULL, 'USA', '85495', 22, '12000.00'),
(5, 'Tendo Garden', 'Akane', 'Tendo', '55591233210', '55591233211', 'Null Street nº69', NULL, 'Miami', NULL, 'USA', '696969', 22, '600000.00'),
(6, 'Lasas S.A.', 'Antonio', 'Lasas', '34916540145', '34914851312', 'C/Leganes 15', NULL, 'Fuenlabrada', 'Madrid', 'Spain', '28945', 8, '154310.00'),
(7, 'Beragua', 'Jose', 'Bermejo', '654987321', '916549872', 'C/pintor segundo', 'Getafe', 'Madrid', 'Madrid', 'Spain', '28942', 11, '20000.00'),
(8, 'Club Golf Puerta del hierro', 'Paco', 'Lopez', '62456810', '919535678', 'C/sinesio delgado', 'Madrid', 'Madrid', 'Madrid', 'Spain', '28930', 11, '40000.00'),
(9, 'Naturagua', 'Guillermo', 'Rengifo', '689234750', '916428956', 'C/majadahonda', 'Boadilla', 'Madrid', 'Madrid', 'Spain', '28947', 11, '32000.00'),
(10, 'DaraDistribuciones', 'David', 'Serrano', '675598001', '916421756', 'C/azores', 'Fuenlabrada', 'Madrid', 'Madrid', 'Spain', '28946', 11, '50000.00'),
(11, 'Madrileña de riegos', 'Jose', 'Tacaño', '655983045', '916689215', 'C/Lagañas', 'Fuenlabrada', 'Madrid', 'Madrid', 'Spain', '28943', 11, '20000.00'),
(12, 'Lasas S.A.', 'Antonio', 'Lasas', '34916540145', '34914851312', 'C/Leganes 15', NULL, 'Fuenlabrada', 'Madrid', 'Spain', '28945', 8, '154310.00'),
(13, 'Camunas Jardines S.L.', 'Pedro', 'Camunas', '34914873241', '34914871541', 'C/Virgenes 45', 'C/Princesas 2 1ºB', 'San Lorenzo del Escorial', 'Madrid', 'Spain', '28145', 8, '16481.00'),
(14, 'Dardena S.A.', 'Juan', 'Rodriguez', '34912453217', '34912484764', 'C/Nueva York 74', NULL, 'Madrid', 'Madrid', 'Spain', '28003', 8, '321000.00'),
(15, 'Jardin de Flores', 'Javier', 'Villar', '654865643', '914538776', 'C/ Oña 34', NULL, 'Madrid', 'Madrid', 'Spain', '28950', 30, '40000.00'),
(16, 'Flores Marivi', 'Maria', 'Rodriguez', '666555444', '912458657', 'C/Leganes24', NULL, 'Fuenlabrada', 'Madrid', 'Spain', '28945', 5, '1500.00'),
(17, 'Flowers, S.A', 'Beatriz', 'Fernandez', '698754159', '978453216', 'C/Luis Salquillo4', NULL, 'Montornes del valles', 'Barcelona', 'Spain', '24586', 5, '3500.00'),
(18, 'Naturajardin', 'Victoria', 'Cruz', '612343529', '916548735', 'Plaza Magallón 15', NULL, 'Madrid', 'Madrid', 'Spain', '28011', 30, '5050.00'),
(19, 'Golf S.A.', 'Luis', 'Martinez', '916458762', '912354475', 'C/Estancado', NULL, 'Santa cruz de Tenerife', 'Islas Canarias', 'Spain', '38297', 12, '30000.00'),
(20, 'Americh Golf Management SL', 'Mario', 'Suarez', '964493072', '964493063', 'C/Letardo', NULL, 'Barcelona', 'Cataluña', 'Spain', '12320', 12, '20000.00'),
(21, 'Aloha', 'Cristian', 'Rodrigez', '916485852', '914489898', 'C/Roman 3', NULL, 'Canarias', 'Canarias', 'Spain', '35488', 12, '50000.00'),
(22, 'El Prat', 'Francisco', 'Camacho', '916882323', '916493211', 'Avenida Tibidabo', NULL, 'Barcelona', 'Cataluña', 'Spain', '12320', 12, '30000.00'),
(23, 'Sotogrande', 'Maria', 'Santillana', '915576622', '914825645', 'C/Paseo del Parque', NULL, 'Sotogrande', 'Cadiz', 'Spain', '11310', 12, '60000.00'),
(24, 'Vivero Humanes', 'Federico', 'Gomez', '654987690', '916040875', 'C/Miguel Echegaray 54', NULL, 'Humanes', 'Madrid', 'Spain', '28970', 30, '7430.00'),
(25, 'Fuenla City', 'Tony', 'Muñoz Mena', '675842139', '915483754', 'C/Callo 52', NULL, 'Fuenlabrada', 'Madrid', 'Spain', '28574', 5, '4500.00'),
(26, 'Jardines y Mansiones Cactus SL', 'Eva María', 'Sánchez', '916877445', '914477777', 'Polígono Industrial Maspalomas, Nº52', 'Móstoles', 'Madrid', 'Madrid', 'Spain', '29874', 9, '76000.00'),
(27, 'Jardinerías Matías SL', 'Matías', 'San Martín', '916544147', '917897474', 'C/Francisco Arce, Nº44', 'Bustarviejo', 'Madrid', 'Madrid', 'Spain', '37845', 9, '100500.00'),
(28, 'Agrojardin', 'Benito', 'Lopez', '675432926', '916549264', 'C/Mar Caspio 43', NULL, 'Getafe', 'Madrid', 'Spain', '28904', 30, '8040.00'),
(29, 'Top Campo', 'Joseluis', 'Sanchez', '685746512', '974315924', 'C/Ibiza 32', NULL, 'Humanes', 'Madrid', 'Spain', '28574', 5, '5500.00'),
(30, 'Jardineria Sara', 'Sara', 'Marquez', '675124537', '912475843', 'C/Lima 1', NULL, 'Fuenlabrada', 'Madrid', 'Spain', '27584', 5, '7500.00'),
(31, 'Campohermoso', 'Luis', 'Jimenez', '645925376', '916159116', 'C/Peru 78', NULL, 'Fuenlabrada', 'Madrid', 'Spain', '28945', 30, '3250.00'),
(32, 'france telecom', 'FraÃ§ois', 'Toulou', '(33)5120578961', '(33)5120578961', '6 place d Alleray 15Ã¨me', NULL, 'Paris', NULL, 'France', '75010', 16, '10000.00'),
(33, 'Musée du Louvre', 'Pierre', 'Delacroux', '(33)0140205050', '(33)0140205442', 'Quai du Louvre', NULL, 'Paris', NULL, 'France', '75058', 16, '30000.00'),
(35, 'Tutifruti S.A', 'Jacob', 'Jones', '2 9261-2433', '2 9283-1695', 'level 24, St. Martins Tower.-31 Market St.', NULL, 'Sydney', 'Nueva Gales del Sur', 'Australia', '2000', 31, '10000.00'),
(36, 'Flores S.L.', 'Antonio', 'Romero', '654352981', '685249700', 'Avenida España', NULL, 'Madrid', 'Fuenlabrada', 'Spain', '29643', 18, '6000.00'),
(37, 'The Magic Garden', 'Richard', 'Mcain', '926523468', '9364875882', 'Lihgting Park', NULL, 'London', 'London', 'United Kingdom', '65930', 18, '10000.00'),
(38, 'El Jardin Viviente S.L', 'Justin', 'Smith', '2 8005-7161', '2 8005-7162', '176 Cumberland Street The rocks', NULL, 'Sydney', 'Nueva Gales del Sur', 'Australia', '2003', 31, '8000.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_pedido`
--

CREATE TABLE `detalle_pedido` (
  `codigo_pedido` int(11) NOT NULL,
  `codigo_producto` varchar(15) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio_unidad` decimal(15,2) NOT NULL,
  `numero_linea` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `detalle_pedido`
--

INSERT INTO `detalle_pedido` (`codigo_pedido`, `codigo_producto`, `cantidad`, `precio_unidad`, `numero_linea`) VALUES
(1, 'FR-67', 10, '70.00', 3),
(1, 'OR-127', 40, '4.00', 1),
(1, 'OR-141', 25, '4.00', 2),
(1, 'OR-241', 15, '19.00', 4),
(1, 'OR-99', 23, '14.00', 5),
(2, 'FR-4', 3, '29.00', 6),
(2, 'FR-40', 7, '8.00', 7),
(2, 'OR-140', 50, '4.00', 3),
(2, 'OR-141', 20, '5.00', 2),
(2, 'OR-159', 12, '6.00', 5),
(2, 'OR-227', 67, '64.00', 1),
(2, 'OR-247', 5, '462.00', 4),
(3, 'FR-48', 120, '9.00', 6),
(3, 'OR-122', 32, '5.00', 4),
(3, 'OR-123', 11, '5.00', 5),
(3, 'OR-213', 30, '266.00', 1),
(3, 'OR-217', 15, '65.00', 2),
(3, 'OR-218', 24, '25.00', 3),
(4, 'FR-31', 12, '8.00', 7),
(4, 'FR-34', 42, '8.00', 6),
(4, 'FR-40', 42, '9.00', 8),
(4, 'OR-152', 3, '6.00', 5),
(4, 'OR-155', 4, '6.00', 3),
(4, 'OR-156', 17, '9.00', 4),
(4, 'OR-157', 38, '10.00', 2),
(4, 'OR-222', 21, '59.00', 1),
(8, 'FR-106', 3, '11.00', 1),
(8, 'FR-108', 1, '32.00', 2),
(8, 'FR-11', 10, '100.00', 3),
(9, 'AR-001', 80, '1.00', 3),
(9, 'AR-008', 450, '1.00', 2),
(9, 'FR-106', 80, '8.00', 1),
(9, 'FR-69', 15, '91.00', 2),
(10, 'FR-82', 5, '70.00', 2),
(10, 'FR-91', 30, '75.00', 1),
(10, 'OR-234', 5, '64.00', 3),
(11, 'AR-006', 180, '1.00', 3),
(11, 'OR-247', 80, '8.00', 1),
(12, 'AR-009', 290, '1.00', 1),
(13, '11679', 5, '14.00', 1),
(13, '21636', 12, '14.00', 2),
(13, 'FR-11', 5, '100.00', 3),
(14, 'FR-100', 8, '11.00', 2),
(14, 'FR-13', 13, '57.00', 1),
(15, 'FR-84', 4, '13.00', 3),
(15, 'OR-101', 2, '6.00', 2),
(15, 'OR-156', 6, '10.00', 1),
(15, 'OR-203', 9, '10.00', 4),
(16, '30310', 12, '12.00', 1),
(16, 'FR-36', 10, '9.00', 2),
(17, '11679', 5, '14.00', 1),
(17, '22225', 5, '12.00', 3),
(17, 'FR-37', 5, '9.00', 2),
(17, 'FR-64', 5, '22.00', 4),
(17, 'OR-136', 5, '18.00', 5),
(18, '22225', 4, '12.00', 2),
(18, 'FR-22', 2, '4.00', 1),
(18, 'OR-159', 10, '6.00', 3),
(19, '30310', 9, '12.00', 5),
(19, 'FR-23', 6, '8.00', 4),
(19, 'FR-75', 1, '32.00', 2),
(19, 'FR-84', 5, '13.00', 1),
(19, 'OR-208', 20, '4.00', 3),
(20, '11679', 14, '14.00', 1),
(20, '30310', 8, '12.00', 2),
(21, '21636', 5, '14.00', 3),
(21, 'FR-18', 22, '4.00', 1),
(21, 'FR-53', 3, '8.00', 2),
(22, 'OR-240', 1, '6.00', 1),
(23, 'AR-002', 110, '1.00', 4),
(23, 'FR-107', 50, '22.00', 3),
(23, 'FR-85', 4, '70.00', 2),
(23, 'OR-249', 30, '5.00', 1),
(24, '22225', 3, '15.00', 1),
(24, 'FR-1', 4, '7.00', 4),
(24, 'FR-23', 2, '7.00', 2),
(24, 'OR-241', 10, '20.00', 3),
(25, 'FR-77', 15, '69.00', 1),
(25, 'FR-9', 4, '30.00', 3),
(25, 'FR-94', 10, '30.00', 2),
(26, 'FR-15', 9, '25.00', 3),
(26, 'OR-188', 4, '25.00', 1),
(26, 'OR-218', 14, '25.00', 2),
(27, 'OR-101', 22, '6.00', 2),
(27, 'OR-102', 22, '6.00', 3),
(27, 'OR-186', 40, '6.00', 1),
(28, 'FR-11', 8, '99.00', 3),
(28, 'OR-213', 3, '266.00', 2),
(28, 'OR-247', 1, '462.00', 1),
(29, 'FR-82', 4, '70.00', 4),
(29, 'FR-9', 4, '28.00', 1),
(29, 'FR-94', 20, '31.00', 5),
(29, 'OR-129', 2, '111.00', 2),
(29, 'OR-160', 10, '9.00', 3),
(30, 'AR-004', 10, '1.00', 6),
(30, 'FR-108', 2, '32.00', 2),
(30, 'FR-12', 2, '19.00', 3),
(30, 'FR-72', 4, '31.00', 5),
(30, 'FR-89', 10, '45.00', 1),
(30, 'OR-120', 5, '5.00', 4),
(31, 'AR-009', 25, '2.00', 3),
(31, 'FR-102', 1, '20.00', 1),
(31, 'FR-4', 6, '29.00', 2),
(32, '11679', 1, '14.00', 4),
(32, '21636', 4, '15.00', 5),
(32, '22225', 1, '15.00', 3),
(32, 'OR-128', 29, '100.00', 2),
(32, 'OR-193', 5, '20.00', 1),
(33, 'FR-17', 423, '2.00', 4),
(33, 'FR-29', 120, '8.00', 3),
(33, 'OR-214', 212, '10.00', 2),
(33, 'OR-247', 150, '462.00', 1),
(34, 'FR-3', 56, '7.00', 4),
(34, 'FR-7', 12, '29.00', 3),
(34, 'OR-172', 20, '18.00', 1),
(34, 'OR-174', 24, '18.00', 2),
(35, '21636', 12, '14.00', 4),
(35, 'FR-47', 55, '8.00', 3),
(35, 'OR-165', 3, '10.00', 2),
(35, 'OR-181', 36, '10.00', 1),
(35, 'OR-225', 72, '10.00', 5),
(36, '30310', 4, '12.00', 2),
(36, 'FR-1', 2, '7.00', 3),
(36, 'OR-147', 6, '7.00', 4),
(36, 'OR-203', 1, '12.00', 5),
(36, 'OR-99', 15, '13.00', 1),
(37, 'FR-105', 4, '70.00', 1),
(37, 'FR-57', 203, '8.00', 2),
(37, 'OR-176', 38, '10.00', 3),
(38, '11679', 5, '14.00', 1),
(38, '21636', 2, '14.00', 2),
(39, '22225', 3, '12.00', 1),
(39, '30310', 6, '12.00', 2),
(40, 'AR-001', 4, '1.00', 1),
(40, 'AR-002', 8, '1.00', 2),
(41, 'AR-003', 5, '1.00', 1),
(41, 'AR-004', 5, '1.00', 2),
(42, 'AR-005', 3, '1.00', 1),
(42, 'AR-006', 1, '1.00', 2),
(43, 'AR-007', 9, '1.00', 1),
(44, 'AR-008', 5, '1.00', 1),
(45, 'AR-009', 6, '1.00', 1),
(45, 'AR-010', 4, '1.00', 2),
(46, 'FR-1', 4, '7.00', 1),
(46, 'FR-10', 8, '7.00', 2),
(47, 'FR-100', 9, '11.00', 1),
(47, 'FR-101', 5, '13.00', 2),
(48, 'FR-102', 1, '18.00', 1),
(48, 'FR-103', 1, '25.00', 2),
(48, 'OR-234', 50, '64.00', 1),
(48, 'OR-236', 45, '49.00', 2),
(48, 'OR-237', 50, '19.00', 3),
(49, 'OR-204', 50, '10.00', 1),
(49, 'OR-205', 10, '10.00', 2),
(49, 'OR-206', 5, '5.00', 3),
(50, 'OR-225', 12, '10.00', 1),
(50, 'OR-226', 15, '38.00', 2),
(50, 'OR-227', 44, '64.00', 3),
(51, 'OR-209', 50, '10.00', 1),
(51, 'OR-210', 80, '39.00', 2),
(51, 'OR-211', 70, '59.00', 3),
(52, 'FR-67', 10, '70.00', 1),
(53, 'FR-2', 1, '7.00', 1),
(53, 'FR-85', 1, '70.00', 3),
(53, 'FR-86', 2, '11.00', 2),
(53, 'OR-116', 6, '7.00', 4),
(54, '11679', 3, '14.00', 3),
(54, 'FR-100', 45, '10.00', 2),
(54, 'FR-18', 5, '4.00', 1),
(54, 'FR-79', 3, '22.00', 4),
(54, 'OR-116', 8, '7.00', 6),
(54, 'OR-123', 3, '5.00', 5),
(54, 'OR-168', 2, '10.00', 7),
(55, 'OR-115', 9, '7.00', 1),
(55, 'OR-213', 2, '266.00', 2),
(55, 'OR-227', 6, '64.00', 5),
(55, 'OR-243', 2, '64.00', 4),
(55, 'OR-247', 1, '462.00', 3),
(56, 'OR-129', 1, '115.00', 5),
(56, 'OR-130', 10, '18.00', 6),
(56, 'OR-179', 1, '6.00', 3),
(56, 'OR-196', 3, '10.00', 4),
(56, 'OR-207', 4, '4.00', 2),
(56, 'OR-250', 3, '10.00', 1),
(57, 'FR-69', 6, '91.00', 4),
(57, 'FR-81', 3, '49.00', 3),
(57, 'FR-84', 2, '13.00', 1),
(57, 'FR-94', 6, '9.00', 2),
(58, 'OR-102', 65, '18.00', 3),
(58, 'OR-139', 80, '4.00', 1),
(58, 'OR-172', 69, '15.00', 2),
(58, 'OR-177', 150, '15.00', 4),
(59, 'FR-67', 10, '70.00', 1),
(60, 'FR-67', 10, '70.00', 1),
(61, 'FR-67', 10, '70.00', 1),
(62, 'FR-67', 10, '70.00', 1),
(63, 'FR-67', 10, '70.00', 1),
(64, 'FR-67', 10, '70.00', 1),
(65, 'FR-67', 10, '70.00', 1),
(66, 'FR-67', 10, '70.00', 1),
(67, 'FR-67', 10, '70.00', 1),
(68, 'FR-67', 10, '70.00', 1),
(74, 'FR-67', 15, '70.00', 1),
(74, 'OR-227', 34, '64.00', 2),
(74, 'OR-247', 42, '8.00', 3),
(75, 'AR-006', 60, '1.00', 2),
(75, 'FR-87', 24, '22.00', 3),
(75, 'OR-157', 46, '10.00', 1),
(76, 'AR-009', 250, '1.00', 5),
(76, 'FR-79', 40, '22.00', 3),
(76, 'FR-87', 24, '22.00', 4),
(76, 'FR-94', 35, '9.00', 1),
(76, 'OR-196', 25, '10.00', 2),
(77, '22225', 34, '12.00', 2),
(77, '30310', 15, '12.00', 1),
(78, 'FR-53', 25, '8.00', 2),
(78, 'FR-85', 56, '70.00', 3),
(78, 'OR-157', 42, '10.00', 4),
(78, 'OR-208', 30, '4.00', 1),
(79, 'OR-240', 50, '6.00', 1),
(80, 'FR-11', 40, '100.00', 3),
(80, 'FR-36', 47, '9.00', 2),
(80, 'OR-136', 75, '18.00', 1),
(81, 'OR-208', 30, '4.00', 1),
(82, 'OR-227', 34, '64.00', 1),
(83, 'OR-208', 30, '4.00', 1),
(89, 'FR-108', 3, '32.00', 2),
(89, 'FR-3', 15, '7.00', 6),
(89, 'FR-42', 12, '8.00', 4),
(89, 'FR-66', 5, '49.00', 1),
(89, 'FR-87', 4, '22.00', 3),
(89, 'OR-157', 8, '10.00', 5),
(90, 'AR-001', 19, '1.00', 1),
(90, 'AR-002', 10, '1.00', 2),
(90, 'AR-003', 12, '1.00', 3),
(91, 'FR-100', 52, '11.00', 1),
(91, 'FR-101', 14, '13.00', 2),
(91, 'FR-102', 35, '18.00', 3),
(92, 'FR-108', 12, '23.00', 1),
(92, 'FR-11', 20, '100.00', 2),
(92, 'FR-12', 30, '21.00', 3),
(93, 'FR-54', 25, '9.00', 1),
(93, 'FR-58', 51, '11.00', 2),
(93, 'FR-60', 3, '32.00', 3),
(94, '11679', 12, '14.00', 1),
(94, 'FR-11', 33, '100.00', 3),
(94, 'FR-4', 79, '29.00', 2),
(95, 'FR-10', 9, '7.00', 2),
(95, 'FR-75', 6, '32.00', 1),
(95, 'FR-82', 5, '70.00', 3),
(96, 'FR-43', 6, '8.00', 1),
(96, 'FR-6', 16, '7.00', 4),
(96, 'FR-71', 10, '22.00', 3),
(96, 'FR-90', 4, '70.00', 2),
(97, 'FR-41', 12, '8.00', 1),
(97, 'FR-54', 14, '9.00', 2),
(97, 'OR-156', 10, '10.00', 3),
(98, 'FR-33', 14, '8.00', 4),
(98, 'FR-56', 16, '8.00', 3),
(98, 'FR-60', 8, '32.00', 1),
(98, 'FR-8', 18, '6.00', 5),
(98, 'FR-85', 6, '70.00', 2),
(99, 'OR-157', 15, '10.00', 2),
(99, 'OR-227', 30, '64.00', 1),
(100, 'FR-87', 20, '22.00', 1),
(100, 'FR-94', 40, '9.00', 2),
(101, 'AR-006', 50, '1.00', 1),
(101, 'AR-009', 159, '1.00', 2),
(102, '22225', 32, '12.00', 2),
(102, '30310', 23, '12.00', 1),
(103, 'FR-53', 12, '8.00', 2),
(103, 'OR-208', 52, '4.00', 1),
(104, 'FR-85', 9, '70.00', 1),
(104, 'OR-157', 113, '10.00', 2),
(105, 'OR-227', 21, '64.00', 2),
(105, 'OR-240', 27, '6.00', 1),
(106, 'AR-009', 231, '1.00', 1),
(106, 'OR-136', 47, '18.00', 2),
(107, '30310', 143, '12.00', 2),
(107, 'FR-11', 15, '100.00', 1),
(108, 'FR-53', 53, '8.00', 1),
(108, 'OR-208', 59, '4.00', 2),
(109, 'FR-22', 8, '4.00', 5),
(109, 'FR-36', 12, '9.00', 3),
(109, 'FR-45', 14, '8.00', 4),
(109, 'OR-104', 20, '10.00', 1),
(109, 'OR-119', 10, '5.00', 2),
(109, 'OR-125', 3, '5.00', 6),
(109, 'OR-130', 2, '18.00', 7),
(110, 'AR-010', 6, '1.00', 3),
(110, 'FR-1', 14, '7.00', 1),
(110, 'FR-16', 1, '45.00', 2),
(111, 'FR-67', 10, '70.00', 1),
(112, 'FR-67', 10, '70.00', 1),
(113, 'FR-67', 10, '70.00', 1),
(114, 'FR-67', 10, '70.00', 1),
(115, 'FR-67', 10, '70.00', 1),
(116, '21636', 5, '14.00', 1),
(116, 'AR-001', 32, '1.00', 2),
(116, 'AR-005', 18, '1.00', 5),
(116, 'FR-33', 13, '8.00', 3),
(116, 'OR-200', 10, '4.00', 4),
(117, 'FR-78', 2, '15.00', 1),
(117, 'FR-80', 1, '32.00', 3),
(117, 'OR-146', 17, '4.00', 2),
(117, 'OR-179', 4, '6.00', 4),
(118, 'FR-67', 10, '70.00', 1),
(119, 'FR-67', 10, '70.00', 1),
(120, 'FR-67', 10, '70.00', 1),
(121, 'FR-67', 10, '70.00', 1),
(122, 'FR-67', 10, '70.00', 1),
(123, 'FR-67', 10, '70.00', 1),
(124, 'FR-67', 10, '70.00', 1),
(125, 'FR-67', 10, '70.00', 1),
(126, 'FR-67', 10, '70.00', 1),
(127, 'FR-67', 10, '70.00', 1),
(128, 'AR-004', 15, '1.00', 1),
(128, 'OR-150', 18, '2.00', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `codigo_empleado` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) DEFAULT NULL,
  `extension` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `codigo_oficina` varchar(10) NOT NULL,
  `codigo_jefe` int(11) DEFAULT NULL,
  `puesto` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`codigo_empleado`, `nombre`, `apellido1`, `apellido2`, `extension`, `email`, `codigo_oficina`, `codigo_jefe`, `puesto`) VALUES
(1, 'Marcos', 'Magaña', 'Perez', '3897', 'marcos@jardineria.es', 'TAL-ES', NULL, 'Director General'),
(2, 'Ruben', 'López', 'Martinez', '2899', 'rlopez@jardineria.es', 'TAL-ES', 1, 'Subdirector Marketing'),
(3, 'Alberto', 'Soria', 'Carrasco', '2837', 'asoria@jardineria.es', 'TAL-ES', 2, 'Subdirector Ventas'),
(4, 'Maria', 'Solís', 'Jerez', '2847', 'msolis@jardineria.es', 'TAL-ES', 2, 'Secretaria'),
(5, 'Felipe', 'Rosas', 'Marquez', '2844', 'frosas@jardineria.es', 'TAL-ES', 3, 'Representante Ventas'),
(6, 'Juan Carlos', 'Ortiz', 'Serrano', '2845', 'cortiz@jardineria.es', 'TAL-ES', 3, 'Representante Ventas'),
(7, 'Carlos', 'Soria', 'Jimenez', '2444', 'csoria@jardineria.es', 'MAD-ES', 3, 'Director Oficina'),
(8, 'Mariano', 'López', 'Murcia', '2442', 'mlopez@jardineria.es', 'MAD-ES', 7, 'Representante Ventas'),
(9, 'Lucio', 'Campoamor', 'Martín', '2442', 'lcampoamor@jardineria.es', 'MAD-ES', 7, 'Representante Ventas'),
(10, 'Hilario', 'Rodriguez', 'Huertas', '2444', 'hrodriguez@jardineria.es', 'MAD-ES', 7, 'Representante Ventas'),
(11, 'Emmanuel', 'Magaña', 'Perez', '2518', 'manu@jardineria.es', 'BCN-ES', 3, 'Director Oficina'),
(12, 'José Manuel', 'Martinez', 'De la Osa', '2519', 'jmmart@hotmail.es', 'BCN-ES', 11, 'Representante Ventas'),
(13, 'David', 'Palma', 'Aceituno', '2519', 'dpalma@jardineria.es', 'BCN-ES', 11, 'Representante Ventas'),
(14, 'Oscar', 'Palma', 'Aceituno', '2519', 'opalma@jardineria.es', 'BCN-ES', 11, 'Representante Ventas'),
(15, 'Francois', 'Fignon', '', '9981', 'ffignon@gardening.com', 'PAR-FR', 3, 'Director Oficina'),
(16, 'Lionel', 'Narvaez', '', '9982', 'lnarvaez@gardening.com', 'PAR-FR', 15, 'Representante Ventas'),
(17, 'Laurent', 'Serra', '', '9982', 'lserra@gardening.com', 'PAR-FR', 15, 'Representante Ventas'),
(18, 'Michael', 'Bolton', '', '7454', 'mbolton@gardening.com', 'SFC-USA', 3, 'Director Oficina'),
(19, 'Walter Santiago', 'Sanchez', 'Lopez', '7454', 'wssanchez@gardening.com', 'SFC-USA', 18, 'Representante Ventas'),
(20, 'Hilary', 'Washington', '', '7565', 'hwashington@gardening.com', 'BOS-USA', 3, 'Director Oficina'),
(21, 'Marcus', 'Paxton', '', '7565', 'mpaxton@gardening.com', 'BOS-USA', 20, 'Representante Ventas'),
(22, 'Lorena', 'Paxton', '', '7665', 'lpaxton@gardening.com', 'BOS-USA', 20, 'Representante Ventas'),
(23, 'Nei', 'Nishikori', '', '8734', 'nnishikori@gardening.com', 'TOK-JP', 3, 'Director Oficina'),
(24, 'Narumi', 'Riko', '', '8734', 'nriko@gardening.com', 'TOK-JP', 23, 'Representante Ventas'),
(25, 'Takuma', 'Nomura', '', '8735', 'tnomura@gardening.com', 'TOK-JP', 23, 'Representante Ventas'),
(26, 'Amy', 'Johnson', '', '3321', 'ajohnson@gardening.com', 'LON-UK', 3, 'Director Oficina'),
(27, 'Larry', 'Westfalls', '', '3322', 'lwestfalls@gardening.com', 'LON-UK', 26, 'Representante Ventas'),
(28, 'John', 'Walton', '', '3322', 'jwalton@gardening.com', 'LON-UK', 26, 'Representante Ventas'),
(29, 'Kevin', 'Fallmer', '', '3210', 'kfalmer@gardening.com', 'SYD-AU', 3, 'Director Oficina'),
(30, 'Julian', 'Bellinelli', '', '3211', 'jbellinelli@gardening.com', 'SYD-AU', 29, 'Representante Ventas'),
(31, 'Mariko', 'Kishi', '', '3211', 'mkishi@gardening.com', 'SYD-AU', 29, 'Representante Ventas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gama_producto`
--

CREATE TABLE `gama_producto` (
  `gama` varchar(50) NOT NULL,
  `descripcion_texto` text DEFAULT NULL,
  `descripcion_html` text DEFAULT NULL,
  `imagen` varchar(256) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `gama_producto`
--

INSERT INTO `gama_producto` (`gama`, `descripcion_texto`, `descripcion_html`, `imagen`) VALUES
('Aromáticas', 'Plantas aromáticas', NULL, NULL),
('Frutales', 'Árboles pequeños de producción frutal', NULL, NULL),
('Herbaceas', 'Plantas para jardin decorativas', NULL, NULL),
('Herramientas', 'Herramientas para todo tipo de acción', NULL, NULL),
('Ornamentales', 'Plantas vistosas para la decoración del jardín', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oficina`
--

CREATE TABLE `oficina` (
  `codigo_oficina` varchar(10) NOT NULL,
  `ciudad` varchar(30) NOT NULL,
  `pais` varchar(50) NOT NULL,
  `region` varchar(50) DEFAULT NULL,
  `codigo_postal` varchar(10) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `linea_direccion1` varchar(50) NOT NULL,
  `linea_direccion2` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `oficina`
--

INSERT INTO `oficina` (`codigo_oficina`, `ciudad`, `pais`, `region`, `codigo_postal`, `telefono`, `linea_direccion1`, `linea_direccion2`) VALUES
('BCN-ES', 'Barcelona', 'España', 'Barcelona', '08019', '+34 93 3561182', 'Avenida Diagonal, 38', '3A escalera Derecha'),
('BOS-USA', 'Boston', 'EEUU', 'MA', '02108', '+1 215 837 0825', '1550 Court Place', 'Suite 102'),
('LON-UK', 'Londres', 'Inglaterra', 'EMEA', 'EC2N 1HN', '+44 20 78772041', '52 Old Broad Street', 'Ground Floor'),
('MAD-ES', 'Madrid', 'España', 'Madrid', '28032', '+34 91 7514487', 'Bulevar Indalecio Prieto, 32', ''),
('PAR-FR', 'Paris', 'Francia', 'EMEA', '75017', '+33 14 723 4404', '29 Rue Jouffroy d\'abbans', ''),
('SFC-USA', 'San Francisco', 'EEUU', 'CA', '94080', '+1 650 219 4782', '100 Market Street', 'Suite 300'),
('SYD-AU', 'Sydney', 'Australia', 'APAC', 'NSW 2010', '+61 2 9264 2451', '5-11 Wentworth Avenue', 'Floor #2'),
('TAL-ES', 'Talavera de la Reina', 'España', 'Castilla-LaMancha', '45632', '+34 925 867231', 'Francisco Aguirre, 32', '5º piso (exterior)'),
('TOK-JP', 'Tokyo', 'Japón', 'Chiyoda-Ku', '102-8578', '+81 33 224 5000', '4-1 Kioicho', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `codigo_cliente` int(11) NOT NULL,
  `forma_pago` varchar(40) NOT NULL,
  `id_transaccion` varchar(50) NOT NULL,
  `fecha_pago` date NOT NULL,
  `total` decimal(15,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pago`
--

INSERT INTO `pago` (`codigo_cliente`, `forma_pago`, `id_transaccion`, `fecha_pago`, `total`) VALUES
(1, 'PayPal', 'ak-std-000001', '2008-11-10', '2000.00'),
(1, 'PayPal', 'ak-std-000002', '2008-12-10', '2000.00'),
(3, 'PayPal', 'ak-std-000003', '2009-01-16', '5000.00'),
(3, 'PayPal', 'ak-std-000004', '2009-02-16', '5000.00'),
(3, 'PayPal', 'ak-std-000005', '2009-02-19', '926.00'),
(4, 'PayPal', 'ak-std-000006', '2007-01-08', '20000.00'),
(4, 'PayPal', 'ak-std-000007', '2007-01-08', '20000.00'),
(4, 'PayPal', 'ak-std-000008', '2007-01-08', '20000.00'),
(4, 'PayPal', 'ak-std-000009', '2007-01-08', '20000.00'),
(4, 'PayPal', 'ak-std-000010', '2007-01-08', '1849.00'),
(5, 'Transferencia', 'ak-std-000011', '2006-01-18', '23794.00'),
(7, 'Cheque', 'ak-std-000012', '2009-01-13', '2390.00'),
(9, 'PayPal', 'ak-std-000013', '2009-01-06', '929.00'),
(13, 'PayPal', 'ak-std-000014', '2008-08-04', '2246.00'),
(14, 'PayPal', 'ak-std-000015', '2008-07-15', '4160.00'),
(15, 'PayPal', 'ak-std-000016', '2009-01-15', '2081.00'),
(15, 'PayPal', 'ak-std-000035', '2009-02-15', '10000.00'),
(16, 'PayPal', 'ak-std-000017', '2009-02-16', '4399.00'),
(19, 'PayPal', 'ak-std-000018', '2009-03-06', '232.00'),
(23, 'PayPal', 'ak-std-000019', '2009-03-26', '272.00'),
(26, 'PayPal', 'ak-std-000020', '2008-03-18', '18846.00'),
(27, 'PayPal', 'ak-std-000021', '2009-02-08', '10972.00'),
(28, 'PayPal', 'ak-std-000022', '2009-01-13', '8489.00'),
(30, 'PayPal', 'ak-std-000024', '2009-01-16', '7863.00'),
(35, 'PayPal', 'ak-std-000025', '2007-10-06', '3321.00'),
(38, 'PayPal', 'ak-std-000026', '2006-05-26', '1171.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `codigo_pedido` int(11) NOT NULL,
  `fecha_pedido` date NOT NULL,
  `fecha_esperada` date NOT NULL,
  `fecha_entrega` date DEFAULT NULL,
  `estado` varchar(15) NOT NULL,
  `comentarios` text DEFAULT NULL,
  `codigo_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`codigo_pedido`, `fecha_pedido`, `fecha_esperada`, `fecha_entrega`, `estado`, `comentarios`, `codigo_cliente`) VALUES
(1, '2006-01-17', '2006-01-19', '2006-01-19', 'Entregado', 'Pagado a plazos', 5),
(2, '2007-10-23', '2007-10-28', '2007-10-26', 'Entregado', 'La entrega llego antes de lo esperado', 5),
(3, '2008-06-20', '2008-06-25', NULL, 'Rechazado', 'Limite de credito superado', 5),
(4, '2009-01-20', '2009-01-26', NULL, 'Pendiente', NULL, 5),
(8, '2008-11-09', '2008-11-14', '2008-11-14', 'Entregado', 'El cliente paga la mitad con tarjeta y la otra mitad con efectivo, se le realizan dos facturas', 1),
(9, '2008-12-22', '2008-12-27', '2008-12-28', 'Entregado', 'El cliente comprueba la integridad del paquete, todo correcto', 1),
(10, '2009-01-15', '2009-01-20', NULL, 'Pendiente', 'El cliente llama para confirmar la fecha - Esperando al proveedor', 3),
(11, '2009-01-20', '2009-01-27', NULL, 'Pendiente', 'El cliente requiere que el pedido se le entregue de 16:00h a 22:00h', 1),
(12, '2009-01-22', '2009-01-27', NULL, 'Pendiente', 'El cliente requiere que el pedido se le entregue de 9:00h a 13:00h', 1),
(13, '2009-01-12', '2009-01-14', '2009-01-15', 'Entregado', NULL, 7),
(14, '2009-01-02', '2009-01-02', NULL, 'Rechazado', 'mal pago', 7),
(15, '2009-01-09', '2009-01-12', '2009-01-11', 'Entregado', NULL, 7),
(16, '2009-01-06', '2009-01-07', '2009-01-15', 'Entregado', NULL, 7),
(17, '2009-01-08', '2009-01-09', '2009-01-11', 'Entregado', 'mal estado', 7),
(18, '2009-01-05', '2009-01-06', '2009-01-07', 'Entregado', NULL, 9),
(19, '2009-01-18', '2009-02-12', NULL, 'Pendiente', 'entregar en murcia', 9),
(20, '2009-01-20', '2009-02-15', NULL, 'Pendiente', NULL, 9),
(21, '2009-01-09', '2009-01-09', '2009-01-09', 'Rechazado', 'mal pago', 9),
(22, '2009-01-11', '2009-01-11', '2009-01-13', 'Entregado', NULL, 9),
(23, '2008-12-30', '2009-01-10', NULL, 'Rechazado', 'El pedido fue anulado por el cliente', 5),
(24, '2008-07-14', '2008-07-31', '2008-07-25', 'Entregado', NULL, 14),
(25, '2009-02-02', '2009-02-08', NULL, 'Rechazado', 'El cliente carece de saldo en la cuenta asociada', 1),
(26, '2009-02-06', '2009-02-12', NULL, 'Rechazado', 'El cliente anula la operacion para adquirir mas producto', 3),
(27, '2009-02-07', '2009-02-13', NULL, 'Entregado', 'El pedido aparece como entregado pero no sabemos en que fecha', 3),
(28, '2009-02-10', '2009-02-17', '2009-02-20', 'Entregado', 'El cliente se queja bastante de la espera asociada al producto', 3),
(29, '2008-08-01', '2008-09-01', '2008-09-01', 'Rechazado', 'El cliente no está conforme con el pedido', 14),
(30, '2008-08-03', '2008-09-03', '2008-08-31', 'Entregado', NULL, 13),
(31, '2008-09-04', '2008-09-30', '2008-10-04', 'Rechazado', 'El cliente ha rechazado por llegar 5 dias tarde', 13),
(32, '2007-01-07', '2007-01-19', '2007-01-27', 'Entregado', 'Entrega tardia, el cliente puso reclamacion', 4),
(33, '2007-05-20', '2007-05-28', NULL, 'Rechazado', 'El pedido fue anulado por el cliente', 4),
(34, '2007-06-20', '2008-06-28', '2008-06-28', 'Entregado', 'Pagado a plazos', 4),
(35, '2008-03-10', '2009-03-20', NULL, 'Rechazado', 'Limite de credito superado', 4),
(36, '2008-10-15', '2008-12-15', '2008-12-10', 'Entregado', NULL, 14),
(37, '2008-11-03', '2009-11-13', NULL, 'Pendiente', 'El pedido nunca llego a su destino', 4),
(38, '2009-03-05', '2009-03-06', '2009-03-07', 'Entregado', NULL, 19),
(39, '2009-03-06', '2009-03-07', '2009-03-09', 'Pendiente', NULL, 19),
(40, '2009-03-09', '2009-03-10', '2009-03-13', 'Rechazado', NULL, 19),
(41, '2009-03-12', '2009-03-13', '2009-03-13', 'Entregado', NULL, 19),
(42, '2009-03-22', '2009-03-23', '2009-03-27', 'Entregado', NULL, 19),
(43, '2009-03-25', '2009-03-26', '2009-03-28', 'Pendiente', NULL, 23),
(44, '2009-03-26', '2009-03-27', '2009-03-30', 'Pendiente', NULL, 23),
(45, '2009-04-01', '2009-03-04', '2009-03-07', 'Entregado', NULL, 23),
(46, '2009-04-03', '2009-03-04', '2009-03-05', 'Rechazado', NULL, 23),
(47, '2009-04-15', '2009-03-17', '2009-03-17', 'Entregado', NULL, 23),
(48, '2008-03-17', '2008-03-30', '2008-03-29', 'Entregado', 'Según el Cliente, el pedido llegó defectuoso', 26),
(49, '2008-07-12', '2008-07-22', '2008-07-30', 'Entregado', 'El pedido llegó 1 día tarde, pero no hubo queja por parte de la empresa compradora', 26),
(50, '2008-03-17', '2008-08-09', NULL, 'Pendiente', 'Al parecer, el pedido se ha extraviado a la altura de Sotalbo (Ávila)', 26),
(51, '2008-10-01', '2008-10-14', '2008-10-14', 'Entregado', 'Todo se entregó a tiempo y en perfecto estado, a pesar del pésimo estado de las carreteras.', 26),
(52, '2008-12-07', '2008-12-21', NULL, 'Pendiente', 'El transportista ha llamado a Eva María para indicarle que el pedido llegará más tarde de lo esperado.', 26),
(53, '2008-10-15', '2008-11-15', '2008-11-09', 'Entregado', 'El pedido llega 6 dias antes', 13),
(54, '2009-01-11', '2009-02-11', NULL, 'Pendiente', NULL, 14),
(55, '2008-12-10', '2009-01-10', '2009-01-11', 'Entregado', 'Retrasado 1 dia por problemas de transporte', 14),
(56, '2008-12-19', '2009-01-20', NULL, 'Rechazado', 'El cliente a anulado el pedido el dia 2009-01-10', 13),
(57, '2009-01-05', '2009-02-05', NULL, 'Pendiente', NULL, 13),
(58, '2009-01-24', '2009-01-31', '2009-01-30', 'Entregado', 'Todo correcto', 3),
(59, '2008-11-09', '2008-11-14', '2008-11-14', 'Entregado', 'El cliente paga la mitad con tarjeta y la otra mitad con efectivo, se le realizan dos facturas', 1),
(60, '2008-12-22', '2008-12-27', '2008-12-28', 'Entregado', 'El cliente comprueba la integridad del paquete, todo correcto', 1),
(61, '2009-01-15', '2009-01-20', NULL, 'Pendiente', 'El cliente llama para confirmar la fecha - Esperando al proveedor', 3),
(62, '2009-01-20', '2009-01-27', NULL, 'Pendiente', 'El cliente requiere que el pedido se le entregue de 16:00h a 22:00h', 1),
(63, '2009-01-22', '2009-01-27', NULL, 'Pendiente', 'El cliente requiere que el pedido se le entregue de 9:00h a 13:00h', 1),
(64, '2009-01-24', '2009-01-31', '2009-01-30', 'Entregado', 'Todo correcto', 1),
(65, '2009-02-02', '2009-02-08', NULL, 'Rechazado', 'El cliente carece de saldo en la cuenta asociada', 1),
(66, '2009-02-06', '2009-02-12', NULL, 'Rechazado', 'El cliente anula la operacion para adquirir mas producto', 3),
(67, '2009-02-07', '2009-02-13', NULL, 'Entregado', 'El pedido aparece como entregado pero no sabemos en que fecha', 3),
(68, '2009-02-10', '2009-02-17', '2009-02-20', 'Entregado', 'El cliente se queja bastante de la espera asociada al producto', 3),
(74, '2009-01-14', '2009-01-22', NULL, 'Rechazado', 'El pedido no llego el dia que queria el cliente por fallo del transporte', 15),
(75, '2009-01-11', '2009-01-13', '2009-01-13', 'Entregado', 'El pedido llego perfectamente', 15),
(76, '2008-11-15', '2008-11-23', '2008-11-23', 'Entregado', NULL, 15),
(77, '2009-01-03', '2009-01-08', NULL, 'Pendiente', 'El pedido no pudo ser entregado por problemas meteorologicos', 15),
(78, '2008-12-15', '2008-12-17', '2008-12-17', 'Entregado', 'Fue entregado, pero faltaba mercancia que sera entregada otro dia', 15),
(79, '2009-01-12', '2009-01-13', '2009-01-13', 'Entregado', NULL, 28),
(80, '2009-01-25', '2009-01-26', NULL, 'Pendiente', 'No terminó el pago', 28),
(81, '2009-01-18', '2009-01-24', NULL, 'Rechazado', 'Los producto estaban en mal estado', 28),
(82, '2009-01-20', '2009-01-29', '2009-01-29', 'Entregado', 'El pedido llego un poco mas tarde de la hora fijada', 28),
(83, '2009-01-24', '2009-01-28', NULL, 'Entregado', NULL, 28),
(89, '2007-10-05', '2007-12-13', '2007-12-10', 'Entregado', 'La entrega se realizo dias antes de la fecha esperada por lo que el cliente quedo satisfecho', 35),
(90, '2009-02-07', '2008-02-17', NULL, 'Pendiente', 'Debido a la nevada caída en la sierra, el pedido no podrá llegar hasta el día ', 27),
(91, '2009-03-18', '2009-03-29', '2009-03-27', 'Entregado', 'Todo se entregó a su debido tiempo, incluso con un día de antelación', 27),
(92, '2009-04-19', '2009-04-30', '2009-05-03', 'Entregado', 'El pedido se entregó tarde debido a la festividad celebrada en España durante esas fechas', 27),
(93, '2009-05-03', '2009-05-30', '2009-05-17', 'Entregado', 'El pedido se entregó antes de lo esperado.', 27),
(94, '2009-10-18', '2009-11-01', NULL, 'Pendiente', 'El pedido está en camino.', 27),
(95, '2008-01-04', '2008-01-19', '2008-01-19', 'Entregado', NULL, 35),
(96, '2008-03-20', '2008-04-12', '2008-04-13', 'Entregado', 'La entrega se retraso un dia', 35),
(97, '2008-10-08', '2008-11-25', '2008-11-25', 'Entregado', NULL, 35),
(98, '2009-01-08', '2009-02-13', NULL, 'Pendiente', NULL, 35),
(99, '2009-02-15', '2009-02-27', NULL, 'Pendiente', NULL, 16),
(100, '2009-01-10', '2009-01-15', '2009-01-15', 'Entregado', 'El pedido llego perfectamente', 16),
(101, '2009-03-07', '2009-03-27', NULL, 'Rechazado', 'El pedido fue rechazado por el cliente', 16),
(102, '2008-12-28', '2009-01-08', '2009-01-08', 'Entregado', 'Pago pendiente', 16),
(103, '2009-01-15', '2009-01-20', '2009-01-24', 'Pendiente', NULL, 30),
(104, '2009-03-02', '2009-03-06', '2009-03-06', 'Entregado', NULL, 30),
(105, '2009-02-14', '2009-02-20', NULL, 'Rechazado', 'el producto ha sido rechazado por la pesima calidad', 30),
(106, '2009-05-13', '2009-05-15', '2009-05-20', 'Pendiente', NULL, 30),
(107, '2009-04-06', '2009-04-10', '2009-04-10', 'Entregado', NULL, 30),
(108, '2009-04-09', '2009-04-15', '2009-04-15', 'Entregado', NULL, 16),
(109, '2006-05-25', '2006-07-28', '2006-07-28', 'Entregado', NULL, 38),
(110, '2007-03-19', '2007-04-24', '2007-04-24', 'Entregado', NULL, 38),
(111, '2008-03-05', '2008-03-30', '2008-03-30', 'Entregado', NULL, 36),
(112, '2009-03-05', '2009-04-06', '2009-05-07', 'Pendiente', NULL, 36),
(113, '2008-10-28', '2008-11-09', '2009-01-09', 'Rechazado', 'El producto ha sido rechazado por la tardanza de el envio', 36),
(114, '2009-01-15', '2009-01-29', '2009-01-31', 'Entregado', 'El envio llego dos dias más tarde debido al mal tiempo', 36),
(115, '2008-11-29', '2009-01-26', '2009-02-27', 'Pendiente', NULL, 36),
(116, '2008-06-28', '2008-08-01', '2008-08-01', 'Entregado', NULL, 38),
(117, '2008-08-25', '2008-10-01', NULL, 'Rechazado', 'El pedido ha sido rechazado por la acumulacion de pago pendientes del cliente', 38),
(118, '2009-02-15', '2009-02-27', NULL, 'Pendiente', NULL, 16),
(119, '2009-01-10', '2009-01-15', '2009-01-15', 'Entregado', 'El pedido llego perfectamente', 16),
(120, '2009-03-07', '2009-03-27', NULL, 'Rechazado', 'El pedido fue rechazado por el cliente', 16),
(121, '2008-12-28', '2009-01-08', '2009-01-08', 'Entregado', 'Pago pendiente', 16),
(122, '2009-04-09', '2009-04-15', '2009-04-15', 'Entregado', NULL, 16),
(123, '2009-01-15', '2009-01-20', '2009-01-24', 'Pendiente', NULL, 30),
(124, '2009-03-02', '2009-03-06', '2009-03-06', 'Entregado', NULL, 30),
(125, '2009-02-14', '2009-02-20', NULL, 'Rechazado', 'el producto ha sido rechazado por la pesima calidad', 30),
(126, '2009-05-13', '2009-05-15', '2009-05-20', 'Pendiente', NULL, 30),
(127, '2009-04-06', '2009-04-10', '2009-04-10', 'Entregado', NULL, 30),
(128, '2008-11-10', '2008-12-10', '2008-12-29', 'Rechazado', 'El pedido ha sido rechazado por el cliente por el retraso en la entrega', 38);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `codigo_producto` varchar(15) NOT NULL,
  `nombre` varchar(70) NOT NULL,
  `gama` varchar(50) NOT NULL,
  `dimensiones` varchar(25) DEFAULT NULL,
  `proveedor` varchar(50) DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  `cantidad_en_stock` smallint(6) NOT NULL,
  `precio_venta` decimal(15,2) NOT NULL,
  `precio_proveedor` decimal(15,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codigo_producto`, `nombre`, `gama`, `dimensiones`, `proveedor`, `descripcion`, `cantidad_en_stock`, `precio_venta`, `precio_proveedor`) VALUES
('11679', 'Sierra de Poda 400MM', 'Herramientas', '0,258', 'HiperGarden Tools', 'Gracias a la poda se consigue manipular un poco la naturaleza, dándole la forma que más nos guste. Este trabajo básico de jardinería también facilita que las plantas crezcan de un modo más equilibrado, y que las flores y los frutos vuelvan cada año con regularidad. Lo mejor es dar forma cuando los ejemplares son jóvenes, de modo que exijan pocos cuidados cuando sean adultos. Además de saber cuándo y cómo hay que podar, tener unas herramientas adecuadas para esta labor es también de vital importancia.', 15, '14.00', '11.00'),
('21636', 'Pala', 'Herramientas', '0,156', 'HiperGarden Tools', 'Palas de acero con cresta de corte en la punta para cortar bien el terreno. Buena penetración en tierras muy compactas.', 15, '14.00', '13.00'),
('22225', 'Rastrillo de Jardín', 'Herramientas', '1,064', 'HiperGarden Tools', 'Fabuloso rastillo que le ayudará a eliminar piedras, hojas, ramas y otros elementos incómodos en su jardín.', 15, '12.00', '11.00'),
('30310', 'Azadón', 'Herramientas', '0,168', 'HiperGarden Tools', 'Longitud:24cm. Herramienta fabricada en acero y pintura epoxi,alargando su durabilidad y preveniendo la corrosión.Diseño pensado para el ahorro de trabajo.', 15, '12.00', '11.00'),
('AR-001', 'Ajedrea', 'Aromáticas', '15-20', 'Murcia Seasons', 'Planta aromática que fresca se utiliza para condimentar carnes y ensaladas, y seca, para pastas, sopas y guisantes', 140, '1.00', '0.00'),
('AR-002', 'Lavándula Dentata', 'Aromáticas', '15-20', 'Murcia Seasons', 'Espliego de jardín, Alhucema rizada, Alhucema dentada, Cantueso rizado. Familia: Lamiaceae.Origen: España y Portugal. Mata de unos 60 cm de alto. Las hojas son aromáticas, dentadas y de color verde grisáceas.  Produce compactas espigas de flores pequeñas, ligeramente aromáticas, tubulares,de color azulado y con brácteas púrpuras.  Frutos: nuececillas alargadas encerradas en el tubo del cáliz.  Se utiliza en jardineria y no en perfumeria como otros cantuesos, espliegos y lavandas.  Tiene propiedades aromatizantes y calmantes. Adecuadas para la formación de setos bajos. Se dice que su aroma ahuyenta pulgones y otros insectos perjudiciales para las plantas vecinas.', 140, '1.00', '0.00'),
('AR-003', 'Mejorana', 'Aromáticas', '15-20', 'Murcia Seasons', 'Origanum majorana. No hay que confundirlo con el orégano. Su sabor se parece más al tomillo, pero es más dulce y aromático.Se usan las hojas frescas o secas, picadas, machacadas o en polvo, en sopas, rellenos, quiches y tartas, tortillas, platos con papas y, como aderezo, en ramilletes de hierbas.El sabor delicado de la mejorana se elimina durante la cocción, de manera que es mejor agregarla cuando el plato esté en su punto o en aquéllos que apenas necesitan cocción.', 140, '1.00', '0.00'),
('AR-004', 'Melissa ', 'Aromáticas', '15-20', 'Murcia Seasons', 'Es una planta perenne (dura varios años) conocida por el agradable y característico olor a limón que desprenden en verano. Nunca debe faltar en la huerta o jardín por su agradable aroma y por los variados usos que tiene: planta olorosa, condimentaria y medicinal. Su cultivo es muy fácil. Le va bien un suelo ligero, con buen drenaje y riego sin exceso. A pleno sol o por lo menos 5 horas de sol por día. Cada año, su abonado mineral correspondiente.En otoño, la melisa pierde el agradable olor a limón que desprende en verano sus flores azules y blancas. En este momento se debe cortar a unos 20 cm. del suelo. Brotará de forma densa en primavera.', 140, '1.00', '0.00'),
('AR-005', 'Mentha Sativa', 'Aromáticas', '15-20', 'Murcia Seasons', '¿Quién no conoce la Hierbabuena? Se trata de una plantita muy aromática, agradable y cultivada extensamente por toda España. Es hierba perenne (por tanto vive varios años, no es anual). Puedes cultivarla en maceta o plantarla en la tierra del jardín o en un rincón del huerto. Lo más importante es que cuente con bastante agua. En primavera debes aportar fertilizantes minerales. Vive mejor en semisombra que a pleno sol.Si ves orugas o los agujeros en hojas consecuencia de su ataque, retíralas una a una a mano; no uses insecticidas químicos.', 140, '1.00', '0.00'),
('AR-006', 'Petrosilium Hortense (Peregil)', 'Aromáticas', '15-20', 'Murcia Seasons', 'Nombre científico o latino: Petroselinum hortense, Petroselinum crispum. Nombre común o vulgar: Perejil, Perejil rizado Familia: Umbelliferae (Umbelíferas). Origen: el origen del perejil se encuentra en el Mediterraneo. Esta naturalizada en casi toda Europa. Se utiliza como condimento y para adorno, pero también en ensaladas. Se suele regalar en las fruterías y verdulerías.El perejil lo hay de 2 tipos: de hojas planas y de hojas rizadas.', 140, '1.00', '0.00'),
('AR-007', 'Salvia Mix', 'Aromáticas', '15-20', 'Murcia Seasons', 'La Salvia es un pequeño arbusto que llega hasta el metro de alto.Tiene una vida breve, de unos pocos años.En el jardín, como otras aromáticas, queda muy bien en una rocalla o para hacer una bordura perfumada a cada lado de un camino de Salvia. Abona después de cada corte y recorta el arbusto una vez pase la floración.', 140, '1.00', '0.00'),
('AR-008', 'Thymus Citriodra (Tomillo limón)', 'Aromáticas', '15-20', 'Murcia Seasons', 'Nombre común o vulgar: Tomillo, Tremoncillo Familia: Labiatae (Labiadas).Origen: Región mediterránea.Arbustillo bajo, de 15 a 40 cm de altura. Las hojas son muy pequeñas, de unos 6 mm de longitud; según la variedad pueden ser verdes, verdes grisáceas, amarillas, o jaspeadas. Las flores aparecen de mediados de primavera hasta bien entrada la época estival y se presentan en racimos terminales que habitualmente son de color violeta o púrpura aunque también pueden ser blancas. Esta planta despide un intenso y típico aroma, que se incrementa con el roce. El tomillo resulta de gran belleza cuando está en flor. El tomillo atrae a avispas y abejas. En jardinería se usa como manchas, para hacer borduras, para aromatizar el ambiente, llenar huecos, cubrir rocas, para jardines en miniatura, etc. Arranque las flores y hojas secas del tallo y añadálos a un popurri, introdúzcalos en saquitos de hierbas o en la almohada.También puede usar las ramas secas con flores para añadir aroma y textura a cestos abiertos.', 140, '1.00', '0.00'),
('AR-009', 'Thymus Vulgaris', 'Aromáticas', '15-20', 'Murcia Seasons', 'Nombre común o vulgar: Tomillo, Tremoncillo Familia: Labiatae (Labiadas). Origen: Región mediterránea. Arbustillo bajo, de 15 a 40 cm de altura. Las hojas son muy pequeñas, de unos 6 mm de longitud; según la variedad pueden ser verdes, verdes grisáceas, amarillas, o jaspeadas. Las flores aparecen de mediados de primavera hasta bien entrada la época estival y se presentan en racimos terminales que habitualmente son de color violeta o púrpura aunque también pueden ser blancas. Esta planta despide un intenso y típico aroma, que se incrementa con el roce. El tomillo resulta de gran belleza cuando está en flor. El tomillo atrae a avispas y abejas.\r\n En jardinería se usa como manchas, para hacer borduras, para aromatizar el ambiente, llenar huecos, cubrir rocas, para jardines en miniatura, etc. Arranque las flores y hojas secas del tallo y añadálos a un popurri, introdúzcalos en saquitos de hierbas o en la almohada. También puede usar las ramas secas con flores para añadir aroma y textura a cestos abiertos.', 140, '1.00', '0.00'),
('AR-010', 'Santolina Chamaecyparys', 'Aromáticas', '15-20', 'Murcia Seasons', '', 140, '1.00', '0.00'),
('FR-1', 'Expositor Cítricos Mix', 'Frutales', '100-120', 'Frutales Talavera S.A', '', 15, '7.00', '5.00'),
('FR-10', 'Limonero 2 años injerto', 'Frutales', '', 'NaranjasValencianas.com', 'El limonero, pertenece al grupo de los cítricos, teniendo su origen hace unos 20 millones de años en el sudeste asiático. Fue introducido por los árabes en el área mediterránea entre los años 1.000 a 1.200, habiendo experimentando numerosas modificaciones debidas tanto a la selección natural mediante hibridaciones espontáneas como a las producidas por el hombre, en este caso buscando las necesidades del mercado.', 15, '7.00', '5.00'),
('FR-100', 'Nectarina', 'Frutales', '8/10', 'Frutales Talavera S.A', 'Se trata de un árbol derivado por mutación de los melocotoneros comunes, y los únicos caracteres diferenciales son la ausencia de tomentosidad en la piel del fruto. La planta, si se deja crecer libremente, adopta un porte globoso con unas dimensiones medias de 4-6 metros', 50, '11.00', '8.00'),
('FR-101', 'Nogal', 'Frutales', '8/10', 'Frutales Talavera S.A', '', 50, '13.00', '10.00'),
('FR-102', 'Olea-Olivos', 'Frutales', '8/10', 'Frutales Talavera S.A', 'Existen dos hipótesis sobre el origen del olivo, una que postula que proviene de las costas de Siria, Líbano e Israel y otra que considera que lo considera originario de Asia menor. La llegada a Europa probablemente tuvo lugar de mano de los Fenicios, en transito por Chipre, Creta, e Islas del Mar Egeo, pasando a Grecia y más tarde a Italia. Los primeros indicios de la presencia del olivo en las costas mediterráneas españolas coinciden con el dominio romano, aunque fueron posteriormente los árabes los que impulsaron su cultivo en Andalucía, convirtiendo a España en el primer país productor de aceite de oliva a nivel mundial.', 50, '18.00', '14.00'),
('FR-103', 'Olea-Olivos', 'Frutales', '10/12', 'Frutales Talavera S.A', 'Existen dos hipótesis sobre el origen del olivo, una que postula que proviene de las costas de Siria, Líbano e Israel y otra que considera que lo considera originario de Asia menor. La llegada a Europa probablemente tuvo lugar de mano de los Fenicios, en transito por Chipre, Creta, e Islas del Mar Egeo, pasando a Grecia y más tarde a Italia. Los primeros indicios de la presencia del olivo en las costas mediterráneas españolas coinciden con el dominio romano, aunque fueron posteriormente los árabes los que impulsaron su cultivo en Andalucía, convirtiendo a España en el primer país productor de aceite de oliva a nivel mundial.', 50, '25.00', '20.00'),
('FR-104', 'Olea-Olivos', 'Frutales', '12/4', 'Frutales Talavera S.A', 'Existen dos hipótesis sobre el origen del olivo, una que postula que proviene de las costas de Siria, Líbano e Israel y otra que considera que lo considera originario de Asia menor. La llegada a Europa probablemente tuvo lugar de mano de los Fenicios, en transito por Chipre, Creta, e Islas del Mar Egeo, pasando a Grecia y más tarde a Italia. Los primeros indicios de la presencia del olivo en las costas mediterráneas españolas coinciden con el dominio romano, aunque fueron posteriormente los árabes los que impulsaron su cultivo en Andalucía, convirtiendo a España en el primer país productor de aceite de oliva a nivel mundial.', 50, '49.00', '39.00'),
('FR-105', 'Olea-Olivos', 'Frutales', '14/16', 'Frutales Talavera S.A', 'Existen dos hipótesis sobre el origen del olivo, una que postula que proviene de las costas de Siria, Líbano e Israel y otra que considera que lo considera originario de Asia menor. La llegada a Europa probablemente tuvo lugar de mano de los Fenicios, en transito por Chipre, Creta, e Islas del Mar Egeo, pasando a Grecia y más tarde a Italia. Los primeros indicios de la presencia del olivo en las costas mediterráneas españolas coinciden con el dominio romano, aunque fueron posteriormente los árabes los que impulsaron su cultivo en Andalucía, convirtiendo a España en el primer país productor de aceite de oliva a nivel mundial.', 50, '70.00', '56.00'),
('FR-106', 'Peral', 'Frutales', '8/10', 'Frutales Talavera S.A', 'Árbol piramidal, redondeado en su juventud, luego oval, que llega hasta 20 metros de altura y por término medio vive 65 años.Tronco alto, grueso, de corteza agrietada, gris, de la cual se destacan con frecuencia placas lenticulares.Las ramas se insertan formando ángulo agudo con el tronco (45º), de corteza lisa, primero verde y luego gris-violácea, con numerosas lenticelas.', 50, '11.00', '8.00'),
('FR-107', 'Peral', 'Frutales', '10/12', 'Frutales Talavera S.A', 'Árbol piramidal, redondeado en su juventud, luego oval, que llega hasta 20 metros de altura y por término medio vive 65 años.Tronco alto, grueso, de corteza agrietada, gris, de la cual se destacan con frecuencia placas lenticulares.Las ramas se insertan formando ángulo agudo con el tronco (45º), de corteza lisa, primero verde y luego gris-violácea, con numerosas lenticelas.', 50, '22.00', '17.00'),
('FR-108', 'Peral', 'Frutales', '12/14', 'Frutales Talavera S.A', 'Árbol piramidal, redondeado en su juventud, luego oval, que llega hasta 20 metros de altura y por término medio vive 65 años.Tronco alto, grueso, de corteza agrietada, gris, de la cual se destacan con frecuencia placas lenticulares.Las ramas se insertan formando ángulo agudo con el tronco (45º), de corteza lisa, primero verde y luego gris-violácea, con numerosas lenticelas.', 50, '32.00', '25.00'),
('FR-11', 'Limonero 30/40', 'Frutales', '', 'NaranjasValencianas.com', 'El limonero, pertenece al grupo de los cítricos, teniendo su origen hace unos 20 millones de años en el sudeste asiático. Fue introducido por los árabes en el área mediterránea entre los años 1.000 a 1.200, habiendo experimentando numerosas modificaciones debidas tanto a la selección natural mediante hibridaciones espontáneas como a las producidas por el', 15, '100.00', '80.00'),
('FR-12', 'Kunquat ', 'Frutales', '', 'NaranjasValencianas.com', 'su nombre científico se origina en honor a un hoticultor escocés que recolectó especímenes en China, (\"Fortunella\"), Robert Fortune (1812-1880), y \"margarita\", del latín margaritus-a-um = perla, en alusión a sus pequeños y brillantes frutos. Se trata de un arbusto o árbol pequeño de 2-3 m de altura, inerme o con escasas espinas.Hojas lanceoladas de 4-8 (-15) cm de longitud, con el ápice redondeado y la base cuneada.Tienen el margen crenulado en su mitad superior, el haz verde brillante y el envés más pálido.Pecíolo ligeramente marginado.Flores perfumadas solitarias o agrupadas en inflorescencias axilares, blancas.El fruto es lo más característico, es el más pequeño de todos los cítricos y el único cuya cáscara se puede comer.Frutos pequeños, con semillas, de corteza fina, dulce, aromática y comestible, y de pulpa naranja amarillenta y ligeramente ácida.Sus frutos son muy pequeños y tienen un carácter principalmente ornamental.', 15, '21.00', '16.00'),
('FR-13', 'Kunquat  EXTRA con FRUTA', 'Frutales', '150-170', 'NaranjasValencianas.com', 'su nombre científico se origina en honor a un hoticultor escocés que recolectó especímenes en China, (\"Fortunella\"), Robert Fortune (1812-1880), y \"margarita\", del latín margaritus-a-um = perla, en alusión a sus pequeños y brillantes frutos. Se trata de un arbusto o árbol pequeño de 2-3 m de altura, inerme o con escasas espinas.Hojas lanceoladas de 4-8 (-15) cm de longitud, con el ápice redondeado y la base cuneada.Tienen el margen crenulado en su mitad superior, el haz verde brillante y el envés más pálido.Pecíolo ligeramente marginado.Flores perfumadas solitarias o agrupadas en inflorescencias axilares, blancas.El fruto es lo más característico, es el más pequeño de todos los cítricos y el único cuya cáscara se puede comer.Frutos pequeños, con semillas, de corteza fina, dulce, aromática y comestible, y de pulpa naranja amarillenta y ligeramente ácida.Sus frutos son muy pequeños y tienen un carácter principalmente ornamental.', 15, '57.00', '45.00'),
('FR-14', 'Calamondin Mini', 'Frutales', '', 'Frutales Talavera S.A', 'Se trata de un pequeño arbolito de copa densa, con tendencia a la verticalidad, inerme o con cortas espinas. Sus hojas son pequeñas, elípticas de 5-10 cm de longitud, con los pecíolos estrechamente alados.Posee 1 o 2 flores en situación axilar, al final de las ramillas.Sus frutos son muy pequeños (3-3,5 cm de diámetro), con pocas semillas, esféricos u ovales, con la zona apical aplanada; corteza de color naranja-rojizo, muy fina y fácilmente separable de la pulpa, que es dulce, ácida y comestible..', 15, '10.00', '8.00'),
('FR-15', 'Calamondin Copa ', 'Frutales', '', 'Frutales Talavera S.A', 'Se trata de un pequeño arbolito de copa densa, con tendencia a la verticalidad, inerme o con cortas espinas. Sus hojas son pequeñas, elípticas de 5-10 cm de longitud, con los pecíolos estrechamente alados.Posee 1 o 2 flores en situación axilar, al final de las ramillas.Sus frutos son muy pequeños (3-3,5 cm de diámetro), con pocas semillas, esféricos u ovales, con la zona apical aplanada; corteza de color naranja-rojizo, muy fina y fácilmente separable de la pulpa, que es dulce, ácida y comestible..', 15, '25.00', '20.00'),
('FR-16', 'Calamondin Copa EXTRA Con FRUTA', 'Frutales', '100-120', 'Frutales Talavera S.A', 'Se trata de un pequeño arbolito de copa densa, con tendencia a la verticalidad, inerme o con cortas espinas. Sus hojas son pequeñas, elípticas de 5-10 cm de longitud, con los pecíolos estrechamente alados.Posee 1 o 2 flores en situación axilar, al final de las ramillas.Sus frutos son muy pequeños (3-3,5 cm de diámetro), con pocas semillas, esféricos u ovales, con la zona apical aplanada; corteza de color naranja-rojizo, muy fina y fácilmente separable de la pulpa, que es dulce, ácida y comestible..', 15, '45.00', '36.00'),
('FR-17', 'Rosal bajo 1Âª -En maceta-inicio brotación', 'Frutales', '', 'Frutales Talavera S.A', '', 15, '2.00', '1.00'),
('FR-18', 'ROSAL TREPADOR', 'Frutales', '', 'Frutales Talavera S.A', '', 350, '4.00', '3.00'),
('FR-19', 'Camelia Blanco, Chrysler Rojo, Soraya Naranja, ', 'Frutales', '', 'NaranjasValencianas.com', '', 350, '4.00', '3.00'),
('FR-2', 'Naranjo -Plantón joven 1 año injerto', 'Frutales', '', 'NaranjasValencianas.com', 'El naranjo es un árbol pequeño, que no supera los 3-5 metros de altura, con una copa compacta, cónica, transformada en esérica gracias a la poda. Su tronco es de color gris y liso, y las hojas son perennes, coriáceas, de un verde intenso y brillante, con forma oval o elíptico-lanceolada. Poseen, en el caso del naranjo amargo, un típico peciolo alado en forma de Â‘corazónÂ’, que en el naranjo dulce es más estrecho y menos patente.', 15, '6.00', '4.00'),
('FR-20', 'Landora Amarillo, Rose Gaujard bicolor blanco-rojo', 'Frutales', '', 'Frutales Talavera S.A', '', 350, '4.00', '3.00'),
('FR-21', 'Kordes Perfect bicolor rojo-amarillo, Roundelay rojo fuerte', 'Frutales', '', 'Frutales Talavera S.A', '', 350, '4.00', '3.00'),
('FR-22', 'Pitimini rojo', 'Frutales', '', 'Frutales Talavera S.A', '', 350, '4.00', '3.00'),
('FR-23', 'Rosal copa ', 'Frutales', '', 'Frutales Talavera S.A', '', 400, '8.00', '6.00'),
('FR-24', 'Albaricoquero Corbato', 'Frutales', '', 'Melocotones de Cieza S.A.', 'árbol que puede pasar de los 6 m de altura, en la región mediterránea con ramas formando una copa redondeada. La corteza del tronco es pardo-violácea, agrietada; las ramas son rojizas y extendidas cuando jóvenes y las ramas secundarias son cortas, divergentes y escasas. Las yemas latentes son frecuentes especialmente sobre las ramas viejas.', 400, '8.00', '6.00'),
('FR-25', 'Albaricoquero Moniqui', 'Frutales', '', 'Melocotones de Cieza S.A.', 'árbol que puede pasar de los 6 m de altura, en la región mediterránea con ramas formando una copa redondeada. La corteza del tronco es pardo-violácea, agrietada; las ramas son rojizas y extendidas cuando jóvenes y las ramas secundarias son cortas, divergentes y escasas. Las yemas latentes son frecuentes especialmente sobre las ramas viejas.', 400, '8.00', '6.00'),
('FR-26', 'Albaricoquero Kurrot', 'Frutales', '', 'Melocotones de Cieza S.A.', 'árbol que puede pasar de los 6 m de altura, en la región mediterránea con ramas formando una copa redondeada. La corteza del tronco es pardo-violácea, agrietada; las ramas son rojizas y extendidas cuando jóvenes y las ramas secundarias son cortas, divergentes y escasas. Las yemas latentes son frecuentes especialmente sobre las ramas viejas.', 400, '8.00', '6.00'),
('FR-27', 'Cerezo Burlat', 'Frutales', '', 'Jerte Distribuciones S.L.', 'Las principales especies de cerezo cultivadas en el mundo son el cerezo dulce (Prunus avium), el guindo (P. cerasus) y el cerezo \"Duke\", híbrido de los anteriores. Ambas especies son naturales del sureste de Europa y oeste de Asia. El cerezo dulce tuvo su origen probablemente en el mar Negro y en el mar Caspio, difundiéndose después hacia Europa y Asia, llevado por los pájaros y las migraciones humanas. Fue uno de los frutales más apreciados por los griegos y con el Imperio Romano se extendió a regiones muy diversas. En la actualidad, el cerezo se encuentra difundido por numerosas regiones y países del mundo con clima templado', 400, '8.00', '6.00'),
('FR-28', 'Cerezo Picota', 'Frutales', '', 'Jerte Distribuciones S.L.', 'Las principales especies de cerezo cultivadas en el mundo son el cerezo dulce (Prunus avium), el guindo (P. cerasus) y el cerezo \"Duke\", híbrido de los anteriores. Ambas especies son naturales del sureste de Europa y oeste de Asia. El cerezo dulce tuvo su origen probablemente en el mar Negro y en el mar Caspio, difundiéndose después hacia Europa y Asia, llevado por los pájaros y las migraciones humanas. Fue uno de los frutales más apreciados por los griegos y con el Imperio Romano se extendió a regiones muy diversas. En la actualidad, el cerezo se encuentra difundido por numerosas regiones y países del mundo con clima templado', 400, '8.00', '6.00'),
('FR-29', 'Cerezo Napoleón', 'Frutales', '', 'Jerte Distribuciones S.L.', 'Las principales especies de cerezo cultivadas en el mundo son el cerezo dulce (Prunus avium), el guindo (P. cerasus) y el cerezo \"Duke\", híbrido de los anteriores. Ambas especies son naturales del sureste de Europa y oeste de Asia. El cerezo dulce tuvo su origen probablemente en el mar Negro y en el mar Caspio, difundiéndose después hacia Europa y Asia, llevado por los pájaros y las migraciones humanas. Fue uno de los frutales más apreciados por los griegos y con el Imperio Romano se extendió a regiones muy diversas. En la actualidad, el cerezo se encuentra difundido por numerosas regiones y países del mundo con clima templado', 400, '8.00', '6.00'),
('FR-3', 'Naranjo 2 años injerto', 'Frutales', '', 'NaranjasValencianas.com', 'El naranjo es un árbol pequeño, que no supera los 3-5 metros de altura, con una copa compacta, cónica, transformada en esérica gracias a la poda. Su tronco es de color gris y liso, y las hojas son perennes, coriáceas, de un verde intenso y brillante, con forma oval o elíptico-lanceolada. Poseen, en el caso del naranjo amargo, un típico peciolo alado en forma de Â‘corazónÂ’, que en el naranjo dulce es más estrecho y menos patente.', 15, '7.00', '5.00'),
('FR-30', 'Ciruelo R. Claudia Verde   ', 'Frutales', '', 'Frutales Talavera S.A', 'árbol de tamaño mediano que alcanza una altura máxima de 5-6 m. Tronco de corteza pardo-azulada, brillante, lisa o agrietada longitudinalmente. Produce ramas alternas, pequeñas, delgadas, unas veces lisas, glabras y otras pubescentes y vellosas', 400, '8.00', '6.00'),
('FR-31', 'Ciruelo Santa Rosa', 'Frutales', '', 'Frutales Talavera S.A', 'árbol de tamaño mediano que alcanza una altura máxima de 5-6 m. Tronco de corteza pardo-azulada, brillante, lisa o agrietada longitudinalmente. Produce ramas alternas, pequeñas, delgadas, unas veces lisas, glabras y otras pubescentes y vellosas', 400, '8.00', '6.00'),
('FR-32', 'Ciruelo Golden Japan', 'Frutales', '', 'Frutales Talavera S.A', 'árbol de tamaño mediano que alcanza una altura máxima de 5-6 m. Tronco de corteza pardo-azulada, brillante, lisa o agrietada longitudinalmente. Produce ramas alternas, pequeñas, delgadas, unas veces lisas, glabras y otras pubescentes y vellosas', 400, '8.00', '6.00'),
('FR-33', 'Ciruelo Friar', 'Frutales', '', 'Frutales Talavera S.A', 'árbol de tamaño mediano que alcanza una altura máxima de 5-6 m. Tronco de corteza pardo-azulada, brillante, lisa o agrietada longitudinalmente. Produce ramas alternas, pequeñas, delgadas, unas veces lisas, glabras y otras pubescentes y vellosas', 400, '8.00', '6.00'),
('FR-34', 'Ciruelo Reina C. De Ollins', 'Frutales', '', 'Frutales Talavera S.A', 'árbol de tamaño mediano que alcanza una altura máxima de 5-6 m. Tronco de corteza pardo-azulada, brillante, lisa o agrietada longitudinalmente. Produce ramas alternas, pequeñas, delgadas, unas veces lisas, glabras y otras pubescentes y vellosas', 400, '8.00', '6.00'),
('FR-35', 'Ciruelo Claudia Negra', 'Frutales', '', 'Frutales Talavera S.A', 'árbol de tamaño mediano que alcanza una altura máxima de 5-6 m. Tronco de corteza pardo-azulada, brillante, lisa o agrietada longitudinalmente. Produce ramas alternas, pequeñas, delgadas, unas veces lisas, glabras y otras pubescentes y vellosas', 400, '8.00', '6.00'),
('FR-36', 'Granado Mollar de Elche', 'Frutales', '', 'Frutales Talavera S.A', 'pequeño árbol caducifolio, a veces con porte arbustivo, de 3 a 6 m de altura, con el tronco retorcido. Madera dura y corteza escamosa de color grisáceo. Las ramitas jóvenes son más o menos cuadrangulares o angostas y de cuatro alas, posteriormente se vuelven redondas con corteza de color café grisáceo, la mayoría de las ramas, pero especialmente las pequeñas ramitas axilares, son en forma de espina o terminan en una espina aguda; la copa es extendida.', 400, '9.00', '7.00'),
('FR-37', 'Higuera Napolitana', 'Frutales', '', 'Frutales Talavera S.A', 'La higuera (Ficus carica L.) es un árbol típico de secano en los países mediterráneos. Su rusticidad y su fácil multiplicación hacen de la higuera un frutal muy apropiado para el cultivo extensivo.. Siempre ha sido considerado como árbol que no requiere cuidado alguno una vez plantado y arraigado, limitándose el hombre a recoger de él los frutos cuando maduran, unos para consumo en fresco y otros para conserva. Las únicas higueras con cuidados culturales esmerados, en muchas comarcas, son las brevales, por el interés económico de su primera cosecha, la de brevas.', 400, '9.00', '7.00'),
('FR-38', 'Higuera Verdal', 'Frutales', '', 'Frutales Talavera S.A', 'La higuera (Ficus carica L.) es un árbol típico de secano en los países mediterráneos. Su rusticidad y su fácil multiplicación hacen de la higuera un frutal muy apropiado para el cultivo extensivo.. Siempre ha sido considerado como árbol que no requiere cuidado alguno una vez plantado y arraigado, limitándose el hombre a recoger de él los frutos cuando maduran, unos para consumo en fresco y otros para conserva. Las únicas higueras con cuidados culturales esmerados, en muchas comarcas, son las brevales, por el interés económico de su primera cosecha, la de brevas.', 400, '9.00', '7.00'),
('FR-39', 'Higuera Breva', 'Frutales', '', 'Frutales Talavera S.A', 'La higuera (Ficus carica L.) es un árbol típico de secano en los países mediterráneos. Su rusticidad y su fácil multiplicación hacen de la higuera un frutal muy apropiado para el cultivo extensivo.. Siempre ha sido considerado como árbol que no requiere cuidado alguno una vez plantado y arraigado, limitándose el hombre a recoger de él los frutos cuando maduran, unos para consumo en fresco y otros para conserva. Las únicas higueras con cuidados culturales esmerados, en muchas comarcas, son las brevales, por el interés económico de su primera cosecha, la de brevas.', 400, '9.00', '7.00'),
('FR-4', 'Naranjo calibre 8/10', 'Frutales', '', 'NaranjasValencianas.com', 'El naranjo es un árbol pequeño, que no supera los 3-5 metros de altura, con una copa compacta, cónica, transformada en esérica gracias a la poda. Su tronco es de color gris y liso, y las hojas son perennes, coriáceas, de un verde intenso y brillante, con forma oval o elíptico-lanceolada. Poseen, en el caso del naranjo amargo, un típico peciolo alado en forma de Â‘corazónÂ’, que en el naranjo dulce es más estrecho y menos patente.', 15, '29.00', '23.00'),
('FR-40', 'Manzano Starking Delicious', 'Frutales', '', 'Frutales Talavera S.A', 'alcanza como máximo 10 m. de altura y tiene una copa globosa. Tronco derecho que normalmente alcanza de 2 a 2,5 m. de altura, con corteza cubierta de lenticelas, lisa, adherida, de color ceniciento verdoso sobre los ramos y escamosa y gris parda sobre las partes viejas del árbol. Tiene una vida de unos 60-80 años. Las ramas se insertan en ángulo abierto sobre el tallo, de color verde oscuro, a veces tendiendo a negruzco o violáceo. Los brotes jóvenes terminan con frecuencia en una espina', 400, '8.00', '6.00'),
('FR-41', 'Manzano Reineta', 'Frutales', '', 'Frutales Talavera S.A', 'alcanza como máximo 10 m. de altura y tiene una copa globosa. Tronco derecho que normalmente alcanza de 2 a 2,5 m. de altura, con corteza cubierta de lenticelas, lisa, adherida, de color ceniciento verdoso sobre los ramos y escamosa y gris parda sobre las partes viejas del árbol. Tiene una vida de unos 60-80 años. Las ramas se insertan en ángulo abierto sobre el tallo, de color verde oscuro, a veces tendiendo a negruzco o violáceo. Los brotes jóvenes terminan con frecuencia en una espina', 400, '8.00', '6.00'),
('FR-42', 'Manzano Golden Delicious', 'Frutales', '', 'Frutales Talavera S.A', 'alcanza como máximo 10 m. de altura y tiene una copa globosa. Tronco derecho que normalmente alcanza de 2 a 2,5 m. de altura, con corteza cubierta de lenticelas, lisa, adherida, de color ceniciento verdoso sobre los ramos y escamosa y gris parda sobre las partes viejas del árbol. Tiene una vida de unos 60-80 años. Las ramas se insertan en ángulo abierto sobre el tallo, de color verde oscuro, a veces tendiendo a negruzco o violáceo. Los brotes jóvenes terminan con frecuencia en una espina', 400, '8.00', '6.00'),
('FR-43', 'Membrillero Gigante de Wranja', 'Frutales', '', 'Frutales Talavera S.A', '', 400, '8.00', '6.00'),
('FR-44', 'Melocotonero Spring Crest', 'Frutales', '', 'Melocotones de Cieza S.A.', 'Árbol caducifolio de porte bajo con corteza lisa, de color ceniciento. Sus hojas son alargadas con el margen ligeramente aserrado, de color verde brillante, algo más claras por el envés. El melocotonero está muy arraigado en la cultura asiática.\r\nEn Japón, el noble heroe Momotaro, una especie de Cid japonés, nació del interior de un enorme melocotón que flotaba río abajo.\r\nEn China se piensa que comer melocotón confiere longevidad al ser humano, ya que formaba parte de la dieta de sus dioses inmortales.', 400, '8.00', '6.00'),
('FR-45', 'Melocotonero Amarillo de Agosto', 'Frutales', '', 'Melocotones de Cieza S.A.', 'Árbol caducifolio de porte bajo con corteza lisa, de color ceniciento. Sus hojas son alargadas con el margen ligeramente aserrado, de color verde brillante, algo más claras por el envés. El melocotonero está muy arraigado en la cultura asiática.\r\nEn Japón, el noble heroe Momotaro, una especie de Cid japonés, nació del interior de un enorme melocotón que flotaba río abajo.\r\nEn China se piensa que comer melocotón confiere longevidad al ser humano, ya que formaba parte de la dieta de sus dioses inmortales.', 400, '8.00', '6.00'),
('FR-46', 'Melocotonero Federica', 'Frutales', '', 'Melocotones de Cieza S.A.', 'Árbol caducifolio de porte bajo con corteza lisa, de color ceniciento. Sus hojas son alargadas con el margen ligeramente aserrado, de color verde brillante, algo más claras por el envés. El melocotonero está muy arraigado en la cultura asiática.\r\nEn Japón, el noble heroe Momotaro, una especie de Cid japonés, nació del interior de un enorme melocotón que flotaba río abajo.\r\nEn China se piensa que comer melocotón confiere longevidad al ser humano, ya que formaba parte de la dieta de sus dioses inmortales.', 400, '8.00', '6.00'),
('FR-47', 'Melocotonero Paraguayo', 'Frutales', '', 'Melocotones de Cieza S.A.', 'Árbol caducifolio de porte bajo con corteza lisa, de color ceniciento. Sus hojas son alargadas con el margen ligeramente aserrado, de color verde brillante, algo más claras por el envés. El melocotonero está muy arraigado en la cultura asiática.\r\nEn Japón, el noble heroe Momotaro, una especie de Cid japonés, nació del interior de un enorme melocotón que flotaba río abajo.\r\nEn China se piensa que comer melocotón confiere longevidad al ser humano, ya que formaba parte de la dieta de sus dioses inmortales.', 400, '8.00', '6.00'),
('FR-48', 'Nogal Común', 'Frutales', '', 'Frutales Talavera S.A', '', 400, '9.00', '7.00'),
('FR-49', 'Parra Uva de Mesa', 'Frutales', '', 'Frutales Talavera S.A', '', 400, '8.00', '6.00'),
('FR-5', 'Mandarino -Plantón joven', 'Frutales', '', 'Frutales Talavera S.A', '', 15, '6.00', '4.00'),
('FR-50', 'Peral Castell', 'Frutales', '', 'Frutales Talavera S.A', 'Árbol piramidal, redondeado en su juventud, luego oval, que llega hasta 20 metros de altura y por término medio vive 65 años.Tronco alto, grueso, de corteza agrietada, gris, de la cual se destacan con frecuencia placas lenticulares.Las ramas se insertan formando ángulo agudo con el tronco (45º), de corteza lisa, primero verde y luego gris-violácea, con numerosas lenticelas.', 400, '8.00', '6.00'),
('FR-51', 'Peral Williams', 'Frutales', '', 'Frutales Talavera S.A', 'Árbol piramidal, redondeado en su juventud, luego oval, que llega hasta 20 metros de altura y por término medio vive 65 años.Tronco alto, grueso, de corteza agrietada, gris, de la cual se destacan con frecuencia placas lenticulares.Las ramas se insertan formando ángulo agudo con el tronco (45º), de corteza lisa, primero verde y luego gris-violácea, con numerosas lenticelas.', 400, '8.00', '6.00'),
('FR-52', 'Peral Conference', 'Frutales', '', 'Frutales Talavera S.A', 'Árbol piramidal, redondeado en su juventud, luego oval, que llega hasta 20 metros de altura y por término medio vive 65 años.Tronco alto, grueso, de corteza agrietada, gris, de la cual se destacan con frecuencia placas lenticulares.Las ramas se insertan formando ángulo agudo con el tronco (45º), de corteza lisa, primero verde y luego gris-violácea, con numerosas lenticelas.', 400, '8.00', '6.00'),
('FR-53', 'Peral Blanq. de Aranjuez', 'Frutales', '', 'Frutales Talavera S.A', 'Árbol piramidal, redondeado en su juventud, luego oval, que llega hasta 20 metros de altura y por término medio vive 65 años.Tronco alto, grueso, de corteza agrietada, gris, de la cual se destacan con frecuencia placas lenticulares.Las ramas se insertan formando ángulo agudo con el tronco (45º), de corteza lisa, primero verde y luego gris-violácea, con numerosas lenticelas.', 400, '8.00', '6.00'),
('FR-54', 'Níspero Tanaca', 'Frutales', '', 'Frutales Talavera S.A', 'Aunque originario del Sudeste de China, el níspero llegó a Europa procedente de Japón en el siglo XVIII como árbol ornamental. En el siglo XIX se inició el consumo de los frutos en toda el área mediterránea, donde se adaptó muy bien a las zonas de cultivo de los cítricos.El cultivo intensivo comenzó a desarrollarse a finales de los años 60 y principios de los 70, cuando comenzaron a implantarse las variedades y técnicas de cultivo actualmente utilizadas.', 400, '9.00', '7.00'),
('FR-55', 'Olivo Cipresino', 'Frutales', '', 'Frutales Talavera S.A', 'Existen dos hipótesis sobre el origen del olivo, una que postula que proviene de las costas de Siria, Líbano e Israel y otra que considera que lo considera originario de Asia menor. La llegada a Europa probablemente tuvo lugar de mano de los Fenicios, en transito por Chipre, Creta, e Islas del Mar Egeo, pasando a Grecia y más tarde a Italia. Los primeros indicios de la presencia del olivo en las costas mediterráneas españolas coinciden con el dominio romano, aunque fueron posteriormente los árabes los que impulsaron su cultivo en Andalucía, convirtiendo a España en el primer país productor de aceite de oliva a nivel mundial.', 400, '8.00', '6.00'),
('FR-56', 'Nectarina', 'Frutales', '', 'Frutales Talavera S.A', '', 400, '8.00', '6.00'),
('FR-57', 'Kaki Rojo Brillante', 'Frutales', '', 'NaranjasValencianas.com', 'De crecimiento algo lento los primeros años, llega a alcanzar hasta doce metros de altura o más, aunque en cultivo se prefiere algo más bajo (5-6). Tronco corto y copa extendida. Ramifica muy poco debido a la dominancia apical. Porte más o menos piramidal, aunque con la edad se hace más globoso.', 400, '9.00', '7.00'),
('FR-58', 'Albaricoquero', 'Frutales', '8/10', 'Melocotones de Cieza S.A.', 'árbol que puede pasar de los 6 m de altura, en la región mediterránea con ramas formando una copa redondeada. La corteza del tronco es pardo-violácea, agrietada; las ramas son rojizas y extendidas cuando jóvenes y las ramas secundarias son cortas, divergentes y escasas. Las yemas latentes son frecuentes especialmente sobre las ramas viejas.', 200, '11.00', '8.00'),
('FR-59', 'Albaricoquero', 'Frutales', '10/12', 'Melocotones de Cieza S.A.', 'árbol que puede pasar de los 6 m de altura, en la región mediterránea con ramas formando una copa redondeada. La corteza del tronco es pardo-violácea, agrietada; las ramas son rojizas y extendidas cuando jóvenes y las ramas secundarias son cortas, divergentes y escasas. Las yemas latentes son frecuentes especialmente sobre las ramas viejas.', 200, '22.00', '17.00'),
('FR-6', 'Mandarino 2 años injerto', 'Frutales', '', 'Frutales Talavera S.A', '', 15, '7.00', '5.00'),
('FR-60', 'Albaricoquero', 'Frutales', '12/14', 'Melocotones de Cieza S.A.', 'árbol que puede pasar de los 6 m de altura, en la región mediterránea con ramas formando una copa redondeada. La corteza del tronco es pardo-violácea, agrietada; las ramas son rojizas y extendidas cuando jóvenes y las ramas secundarias son cortas, divergentes y escasas. Las yemas latentes son frecuentes especialmente sobre las ramas viejas.', 200, '32.00', '25.00'),
('FR-61', 'Albaricoquero', 'Frutales', '14/16', 'Melocotones de Cieza S.A.', 'árbol que puede pasar de los 6 m de altura, en la región mediterránea con ramas formando una copa redondeada. La corteza del tronco es pardo-violácea, agrietada; las ramas son rojizas y extendidas cuando jóvenes y las ramas secundarias son cortas, divergentes y escasas. Las yemas latentes son frecuentes especialmente sobre las ramas viejas.', 200, '49.00', '39.00'),
('FR-62', 'Albaricoquero', 'Frutales', '16/18', 'Melocotones de Cieza S.A.', 'árbol que puede pasar de los 6 m de altura, en la región mediterránea con ramas formando una copa redondeada. La corteza del tronco es pardo-violácea, agrietada; las ramas son rojizas y extendidas cuando jóvenes y las ramas secundarias son cortas, divergentes y escasas. Las yemas latentes son frecuentes especialmente sobre las ramas viejas.', 200, '70.00', '56.00'),
('FR-63', 'Cerezo', 'Frutales', '8/10', 'Jerte Distribuciones S.L.', 'Las principales especies de cerezo cultivadas en el mundo son el cerezo dulce (Prunus avium), el guindo (P. cerasus) y el cerezo \"Duke\", híbrido de los anteriores. Ambas especies son naturales del sureste de Europa y oeste de Asia. El cerezo dulce tuvo su origen probablemente en el mar Negro y en el mar Caspio, difundiéndose después hacia Europa y Asia, llevado por los pájaros y las migraciones humanas. Fue uno de los frutales más apreciados por los griegos y con el Imperio Romano se extendió a regiones muy diversas. En la actualidad, el cerezo se encuentra difundido por numerosas regiones y países del mundo con clima templado', 300, '11.00', '8.00'),
('FR-64', 'Cerezo', 'Frutales', '10/12', 'Jerte Distribuciones S.L.', 'Las principales especies de cerezo cultivadas en el mundo son el cerezo dulce (Prunus avium), el guindo (P. cerasus) y el cerezo \"Duke\", híbrido de los anteriores. Ambas especies son naturales del sureste de Europa y oeste de Asia. El cerezo dulce tuvo su origen probablemente en el mar Negro y en el mar Caspio, difundiéndose después hacia Europa y Asia, llevado por los pájaros y las migraciones humanas. Fue uno de los frutales más apreciados por los griegos y con el Imperio Romano se extendió a regiones muy diversas. En la actualidad, el cerezo se encuentra difundido por numerosas regiones y países del mundo con clima templado', 15, '22.00', '17.00'),
('FR-65', 'Cerezo', 'Frutales', '12/14', 'Jerte Distribuciones S.L.', 'Las principales especies de cerezo cultivadas en el mundo son el cerezo dulce (Prunus avium), el guindo (P. cerasus) y el cerezo \"Duke\", híbrido de los anteriores. Ambas especies son naturales del sureste de Europa y oeste de Asia. El cerezo dulce tuvo su origen probablemente en el mar Negro y en el mar Caspio, difundiéndose después hacia Europa y Asia, llevado por los pájaros y las migraciones humanas. Fue uno de los frutales más apreciados por los griegos y con el Imperio Romano se extendió a regiones muy diversas. En la actualidad, el cerezo se encuentra difundido por numerosas regiones y países del mundo con clima templado', 200, '32.00', '25.00'),
('FR-66', 'Cerezo', 'Frutales', '14/16', 'Jerte Distribuciones S.L.', 'Las principales especies de cerezo cultivadas en el mundo son el cerezo dulce (Prunus avium), el guindo (P. cerasus) y el cerezo \"Duke\", híbrido de los anteriores. Ambas especies son naturales del sureste de Europa y oeste de Asia. El cerezo dulce tuvo su origen probablemente en el mar Negro y en el mar Caspio, difundiéndose después hacia Europa y Asia, llevado por los pájaros y las migraciones humanas. Fue uno de los frutales más apreciados por los griegos y con el Imperio Romano se extendió a regiones muy diversas. En la actualidad, el cerezo se encuentra difundido por numerosas regiones y países del mundo con clima templado', 50, '49.00', '39.00'),
('FR-67', 'Cerezo', 'Frutales', '16/18', 'Jerte Distribuciones S.L.', 'Las principales especies de cerezo cultivadas en el mundo son el cerezo dulce (Prunus avium), el guindo (P. cerasus) y el cerezo \"Duke\", híbrido de los anteriores. Ambas especies son naturales del sureste de Europa y oeste de Asia. El cerezo dulce tuvo su origen probablemente en el mar Negro y en el mar Caspio, difundiéndose después hacia Europa y Asia, llevado por los pájaros y las migraciones humanas. Fue uno de los frutales más apreciados por los griegos y con el Imperio Romano se extendió a regiones muy diversas. En la actualidad, el cerezo se encuentra difundido por numerosas regiones y países del mundo con clima templado', 50, '70.00', '56.00'),
('FR-68', 'Cerezo', 'Frutales', '18/20', 'Jerte Distribuciones S.L.', 'Las principales especies de cerezo cultivadas en el mundo son el cerezo dulce (Prunus avium), el guindo (P. cerasus) y el cerezo \"Duke\", híbrido de los anteriores. Ambas especies son naturales del sureste de Europa y oeste de Asia. El cerezo dulce tuvo su origen probablemente en el mar Negro y en el mar Caspio, difundiéndose después hacia Europa y Asia, llevado por los pájaros y las migraciones humanas. Fue uno de los frutales más apreciados por los griegos y con el Imperio Romano se extendió a regiones muy diversas. En la actualidad, el cerezo se encuentra difundido por numerosas regiones y países del mundo con clima templado', 50, '80.00', '64.00'),
('FR-69', 'Cerezo', 'Frutales', '20/25', 'Jerte Distribuciones S.L.', 'Las principales especies de cerezo cultivadas en el mundo son el cerezo dulce (Prunus avium), el guindo (P. cerasus) y el cerezo \"Duke\", híbrido de los anteriores. Ambas especies son naturales del sureste de Europa y oeste de Asia. El cerezo dulce tuvo su origen probablemente en el mar Negro y en el mar Caspio, difundiéndose después hacia Europa y Asia, llevado por los pájaros y las migraciones humanas. Fue uno de los frutales más apreciados por los griegos y con el Imperio Romano se extendió a regiones muy diversas. En la actualidad, el cerezo se encuentra difundido por numerosas regiones y países del mundo con clima templado', 50, '91.00', '72.00'),
('FR-7', 'Mandarino calibre 8/10', 'Frutales', '', 'Frutales Talavera S.A', '', 15, '29.00', '23.00'),
('FR-70', 'Ciruelo', 'Frutales', '8/10', 'Frutales Talavera S.A', 'árbol de tamaño mediano que alcanza una altura máxima de 5-6 m. Tronco de corteza pardo-azulada, brillante, lisa o agrietada longitudinalmente. Produce ramas alternas, pequeñas, delgadas, unas veces lisas, glabras y otras pubescentes y vellosas', 50, '11.00', '8.00'),
('FR-71', 'Ciruelo', 'Frutales', '10/12', 'Frutales Talavera S.A', 'árbol de tamaño mediano que alcanza una altura máxima de 5-6 m. Tronco de corteza pardo-azulada, brillante, lisa o agrietada longitudinalmente. Produce ramas alternas, pequeñas, delgadas, unas veces lisas, glabras y otras pubescentes y vellosas', 50, '22.00', '17.00'),
('FR-72', 'Ciruelo', 'Frutales', '12/14', 'Frutales Talavera S.A', 'árbol de tamaño mediano que alcanza una altura máxima de 5-6 m. Tronco de corteza pardo-azulada, brillante, lisa o agrietada longitudinalmente. Produce ramas alternas, pequeñas, delgadas, unas veces lisas, glabras y otras pubescentes y vellosas', 50, '32.00', '25.00'),
('FR-73', 'Granado', 'Frutales', '8/10', 'Frutales Talavera S.A', 'pequeño árbol caducifolio, a veces con porte arbustivo, de 3 a 6 m de altura, con el tronco retorcido. Madera dura y corteza escamosa de color grisáceo. Las ramitas jóvenes son más o menos cuadrangulares o angostas y de cuatro alas, posteriormente se vuelven redondas con corteza de color café grisáceo, la mayoría de las ramas, pero especialmente las pequeñas ramitas axilares, son en forma de espina o terminan en una espina aguda; la copa es extendida.', 50, '13.00', '10.00'),
('FR-74', 'Granado', 'Frutales', '10/12', 'Frutales Talavera S.A', 'pequeño árbol caducifolio, a veces con porte arbustivo, de 3 a 6 m de altura, con el tronco retorcido. Madera dura y corteza escamosa de color grisáceo. Las ramitas jóvenes son más o menos cuadrangulares o angostas y de cuatro alas, posteriormente se vuelven redondas con corteza de color café grisáceo, la mayoría de las ramas, pero especialmente las pequeñas ramitas axilares, son en forma de espina o terminan en una espina aguda; la copa es extendida.', 50, '22.00', '17.00'),
('FR-75', 'Granado', 'Frutales', '12/14', 'Frutales Talavera S.A', 'pequeño árbol caducifolio, a veces con porte arbustivo, de 3 a 6 m de altura, con el tronco retorcido. Madera dura y corteza escamosa de color grisáceo. Las ramitas jóvenes son más o menos cuadrangulares o angostas y de cuatro alas, posteriormente se vuelven redondas con corteza de color café grisáceo, la mayoría de las ramas, pero especialmente las pequeñas ramitas axilares, son en forma de espina o terminan en una espina aguda; la copa es extendida.', 50, '32.00', '25.00'),
('FR-76', 'Granado', 'Frutales', '14/16', 'Frutales Talavera S.A', 'pequeño árbol caducifolio, a veces con porte arbustivo, de 3 a 6 m de altura, con el tronco retorcido. Madera dura y corteza escamosa de color grisáceo. Las ramitas jóvenes son más o menos cuadrangulares o angostas y de cuatro alas, posteriormente se vuelven redondas con corteza de color café grisáceo, la mayoría de las ramas, pero especialmente las pequeñas ramitas axilares, son en forma de espina o terminan en una espina aguda; la copa es extendida.', 50, '49.00', '39.00'),
('FR-77', 'Granado', 'Frutales', '16/18', 'Frutales Talavera S.A', 'pequeño árbol caducifolio, a veces con porte arbustivo, de 3 a 6 m de altura, con el tronco retorcido. Madera dura y corteza escamosa de color grisáceo. Las ramitas jóvenes son más o menos cuadrangulares o angostas y de cuatro alas, posteriormente se vuelven redondas con corteza de color café grisáceo, la mayoría de las ramas, pero especialmente las pequeñas ramitas axilares, son en forma de espina o terminan en una espina aguda; la copa es extendida.', 50, '70.00', '56.00'),
('FR-78', 'Higuera', 'Frutales', '8/10', 'Frutales Talavera S.A', 'La higuera (Ficus carica L.) es un árbol típico de secano en los países mediterráneos. Su rusticidad y su fácil multiplicación hacen de la higuera un frutal muy apropiado para el cultivo extensivo.. Siempre ha sido considerado como árbol que no requiere cuidado alguno una vez plantado y arraigado, limitándose el hombre a recoger de él los frutos cuando maduran, unos para consumo en fresco y otros para conserva. Las únicas higueras con cuidados culturales esmerados, en muchas comarcas, son las brevales, por el interés económico de su primera cosecha, la de brevas.', 50, '15.00', '12.00'),
('FR-79', 'Higuera', 'Frutales', '10/12', 'Frutales Talavera S.A', 'La higuera (Ficus carica L.) es un árbol típico de secano en los países mediterráneos. Su rusticidad y su fácil multiplicación hacen de la higuera un frutal muy apropiado para el cultivo extensivo.. Siempre ha sido considerado como árbol que no requiere cuidado alguno una vez plantado y arraigado, limitándose el hombre a recoger de él los frutos cuando maduran, unos para consumo en fresco y otros para conserva. Las únicas higueras con cuidados culturales esmerados, en muchas comarcas, son las brevales, por el interés económico de su primera cosecha, la de brevas.', 50, '22.00', '17.00'),
('FR-8', 'Limonero -Plantón joven', 'Frutales', '', 'NaranjasValencianas.com', 'El limonero, pertenece al grupo de los cítricos, teniendo su origen hace unos 20 millones de años en el sudeste asiático. Fue introducido por los árabes en el área mediterránea entre los años 1.000 a 1.200, habiendo experimentando numerosas modificaciones debidas tanto a la selección natural mediante hibridaciones espontáneas como a las producidas por el', 15, '6.00', '4.00'),
('FR-80', 'Higuera', 'Frutales', '12/14', 'Frutales Talavera S.A', 'La higuera (Ficus carica L.) es un árbol típico de secano en los países mediterráneos. Su rusticidad y su fácil multiplicación hacen de la higuera un frutal muy apropiado para el cultivo extensivo.. Siempre ha sido considerado como árbol que no requiere cuidado alguno una vez plantado y arraigado, limitándose el hombre a recoger de él los frutos cuando maduran, unos para consumo en fresco y otros para conserva. Las únicas higueras con cuidados culturales esmerados, en muchas comarcas, son las brevales, por el interés económico de su primera cosecha, la de brevas.', 50, '32.00', '25.00');
INSERT INTO `producto` (`codigo_producto`, `nombre`, `gama`, `dimensiones`, `proveedor`, `descripcion`, `cantidad_en_stock`, `precio_venta`, `precio_proveedor`) VALUES
('FR-81', 'Higuera', 'Frutales', '14/16', 'Frutales Talavera S.A', 'La higuera (Ficus carica L.) es un árbol típico de secano en los países mediterráneos. Su rusticidad y su fácil multiplicación hacen de la higuera un frutal muy apropiado para el cultivo extensivo.. Siempre ha sido considerado como árbol que no requiere cuidado alguno una vez plantado y arraigado, limitándose el hombre a recoger de él los frutos cuando maduran, unos para consumo en fresco y otros para conserva. Las únicas higueras con cuidados culturales esmerados, en muchas comarcas, son las brevales, por el interés económico de su primera cosecha, la de brevas.', 50, '49.00', '39.00'),
('FR-82', 'Higuera', 'Frutales', '16/18', 'Frutales Talavera S.A', 'La higuera (Ficus carica L.) es un árbol típico de secano en los países mediterráneos. Su rusticidad y su fácil multiplicación hacen de la higuera un frutal muy apropiado para el cultivo extensivo.. Siempre ha sido considerado como árbol que no requiere cuidado alguno una vez plantado y arraigado, limitándose el hombre a recoger de él los frutos cuando maduran, unos para consumo en fresco y otros para conserva. Las únicas higueras con cuidados culturales esmerados, en muchas comarcas, son las brevales, por el interés económico de su primera cosecha, la de brevas.', 50, '70.00', '56.00'),
('FR-83', 'Higuera', 'Frutales', '18/20', 'Frutales Talavera S.A', 'La higuera (Ficus carica L.) es un árbol típico de secano en los países mediterráneos. Su rusticidad y su fácil multiplicación hacen de la higuera un frutal muy apropiado para el cultivo extensivo.. Siempre ha sido considerado como árbol que no requiere cuidado alguno una vez plantado y arraigado, limitándose el hombre a recoger de él los frutos cuando maduran, unos para consumo en fresco y otros para conserva. Las únicas higueras con cuidados culturales esmerados, en muchas comarcas, son las brevales, por el interés económico de su primera cosecha, la de brevas.', 50, '80.00', '64.00'),
('FR-84', 'Kaki', 'Frutales', '8/10', 'NaranjasValencianas.com', 'De crecimiento algo lento los primeros años, llega a alcanzar hasta doce metros de altura o más, aunque en cultivo se prefiere algo más bajo (5-6). Tronco corto y copa extendida. Ramifica muy poco debido a la dominancia apical. Porte más o menos piramidal, aunque con la edad se hace más globoso.', 50, '13.00', '10.00'),
('FR-85', 'Kaki', 'Frutales', '16/18', 'NaranjasValencianas.com', 'De crecimiento algo lento los primeros años, llega a alcanzar hasta doce metros de altura o más, aunque en cultivo se prefiere algo más bajo (5-6). Tronco corto y copa extendida. Ramifica muy poco debido a la dominancia apical. Porte más o menos piramidal, aunque con la edad se hace más globoso.', 50, '70.00', '56.00'),
('FR-86', 'Manzano', 'Frutales', '8/10', 'Frutales Talavera S.A', 'alcanza como máximo 10 m. de altura y tiene una copa globosa. Tronco derecho que normalmente alcanza de 2 a 2,5 m. de altura, con corteza cubierta de lenticelas, lisa, adherida, de color ceniciento verdoso sobre los ramos y escamosa y gris parda sobre las partes viejas del árbol. Tiene una vida de unos 60-80 años. Las ramas se insertan en ángulo abierto sobre el tallo, de color verde oscuro, a veces tendiendo a negruzco o violáceo. Los brotes jóvenes terminan con frecuencia en una espina', 50, '11.00', '8.00'),
('FR-87', 'Manzano', 'Frutales', '10/12', 'Frutales Talavera S.A', 'alcanza como máximo 10 m. de altura y tiene una copa globosa. Tronco derecho que normalmente alcanza de 2 a 2,5 m. de altura, con corteza cubierta de lenticelas, lisa, adherida, de color ceniciento verdoso sobre los ramos y escamosa y gris parda sobre las partes viejas del árbol. Tiene una vida de unos 60-80 años. Las ramas se insertan en ángulo abierto sobre el tallo, de color verde oscuro, a veces tendiendo a negruzco o violáceo. Los brotes jóvenes terminan con frecuencia en una espina', 50, '22.00', '17.00'),
('FR-88', 'Manzano', 'Frutales', '12/14', 'Frutales Talavera S.A', 'alcanza como máximo 10 m. de altura y tiene una copa globosa. Tronco derecho que normalmente alcanza de 2 a 2,5 m. de altura, con corteza cubierta de lenticelas, lisa, adherida, de color ceniciento verdoso sobre los ramos y escamosa y gris parda sobre las partes viejas del árbol. Tiene una vida de unos 60-80 años. Las ramas se insertan en ángulo abierto sobre el tallo, de color verde oscuro, a veces tendiendo a negruzco o violáceo. Los brotes jóvenes terminan con frecuencia en una espina', 50, '32.00', '25.00'),
('FR-89', 'Manzano', 'Frutales', '14/16', 'Frutales Talavera S.A', 'alcanza como máximo 10 m. de altura y tiene una copa globosa. Tronco derecho que normalmente alcanza de 2 a 2,5 m. de altura, con corteza cubierta de lenticelas, lisa, adherida, de color ceniciento verdoso sobre los ramos y escamosa y gris parda sobre las partes viejas del árbol. Tiene una vida de unos 60-80 años. Las ramas se insertan en ángulo abierto sobre el tallo, de color verde oscuro, a veces tendiendo a negruzco o violáceo. Los brotes jóvenes terminan con frecuencia en una espina', 50, '49.00', '39.00'),
('FR-9', 'Limonero calibre 8/10', 'Frutales', '', 'NaranjasValencianas.com', 'El limonero, pertenece al grupo de los cítricos, teniendo su origen hace unos 20 millones de años en el sudeste asiático. Fue introducido por los árabes en el área mediterránea entre los años 1.000 a 1.200, habiendo experimentando numerosas modificaciones debidas tanto a la selección natural mediante hibridaciones espontáneas como a las producidas por el', 15, '29.00', '23.00'),
('FR-90', 'Níspero', 'Frutales', '16/18', 'Frutales Talavera S.A', 'Aunque originario del Sudeste de China, el níspero llegó a Europa procedente de Japón en el siglo XVIII como árbol ornamental. En el siglo XIX se inició el consumo de los frutos en toda el área mediterránea, donde se adaptó muy bien a las zonas de cultivo de los cítricos.El cultivo intensivo comenzó a desarrollarse a finales de los años 60 y principios de los 70, cuando comenzaron a implantarse las variedades y técnicas de cultivo actualmente utilizadas.', 50, '70.00', '56.00'),
('FR-91', 'Níspero', 'Frutales', '18/20', 'Frutales Talavera S.A', 'Aunque originario del Sudeste de China, el níspero llegó a Europa procedente de Japón en el siglo XVIII como árbol ornamental. En el siglo XIX se inició el consumo de los frutos en toda el área mediterránea, donde se adaptó muy bien a las zonas de cultivo de los cítricos.El cultivo intensivo comenzó a desarrollarse a finales de los años 60 y principios de los 70, cuando comenzaron a implantarse las variedades y técnicas de cultivo actualmente utilizadas.', 50, '80.00', '64.00'),
('FR-92', 'Melocotonero', 'Frutales', '8/10', 'Melocotones de Cieza S.A.', 'Árbol caducifolio de porte bajo con corteza lisa, de color ceniciento. Sus hojas son alargadas con el margen ligeramente aserrado, de color verde brillante, algo más claras por el envés. El melocotonero está muy arraigado en la cultura asiática.\r\nEn Japón, el noble heroe Momotaro, una especie de Cid japonés, nació del interior de un enorme melocotón que flotaba río abajo.\r\nEn China se piensa que comer melocotón confiere longevidad al ser humano, ya que formaba parte de la dieta de sus dioses inmortales.', 50, '11.00', '8.00'),
('FR-93', 'Melocotonero', 'Frutales', '10/12', 'Melocotones de Cieza S.A.', 'Árbol caducifolio de porte bajo con corteza lisa, de color ceniciento. Sus hojas son alargadas con el margen ligeramente aserrado, de color verde brillante, algo más claras por el envés. El melocotonero está muy arraigado en la cultura asiática.\r\nEn Japón, el noble heroe Momotaro, una especie de Cid japonés, nació del interior de un enorme melocotón que flotaba río abajo.\r\nEn China se piensa que comer melocotón confiere longevidad al ser humano, ya que formaba parte de la dieta de sus dioses inmortales.', 50, '22.00', '17.00'),
('FR-94', 'Melocotonero', 'Frutales', '12/14', 'Melocotones de Cieza S.A.', 'Árbol caducifolio de porte bajo con corteza lisa, de color ceniciento. Sus hojas son alargadas con el margen ligeramente aserrado, de color verde brillante, algo más claras por el envés. El melocotonero está muy arraigado en la cultura asiática.\r\nEn Japón, el noble heroe Momotaro, una especie de Cid japonés, nació del interior de un enorme melocotón que flotaba río abajo.\r\nEn China se piensa que comer melocotón confiere longevidad al ser humano, ya que formaba parte de la dieta de sus dioses inmortales.', 50, '32.00', '25.00'),
('FR-95', 'Melocotonero', 'Frutales', '14/16', 'Melocotones de Cieza S.A.', 'Árbol caducifolio de porte bajo con corteza lisa, de color ceniciento. Sus hojas son alargadas con el margen ligeramente aserrado, de color verde brillante, algo más claras por el envés. El melocotonero está muy arraigado en la cultura asiática.\r\nEn Japón, el noble heroe Momotaro, una especie de Cid japonés, nació del interior de un enorme melocotón que flotaba río abajo.\r\nEn China se piensa que comer melocotón confiere longevidad al ser humano, ya que formaba parte de la dieta de sus dioses inmortales.', 50, '49.00', '39.00'),
('FR-96', 'Membrillero', 'Frutales', '8/10', 'Frutales Talavera S.A', 'arbolito caducifolio de 4-6 m de altura con el tronco tortuoso y la corteza lisa, grisácea, que se desprende en escamas con la edad. Copa irregular, con ramas inermes, flexuosas, parduzcas, punteadas. Ramillas jóvenes tomentosas', 50, '11.00', '8.00'),
('FR-97', 'Membrillero', 'Frutales', '10/12', 'Frutales Talavera S.A', 'arbolito caducifolio de 4-6 m de altura con el tronco tortuoso y la corteza lisa, grisácea, que se desprende en escamas con la edad. Copa irregular, con ramas inermes, flexuosas, parduzcas, punteadas. Ramillas jóvenes tomentosas', 50, '22.00', '17.00'),
('FR-98', 'Membrillero', 'Frutales', '12/14', 'Frutales Talavera S.A', 'arbolito caducifolio de 4-6 m de altura con el tronco tortuoso y la corteza lisa, grisácea, que se desprende en escamas con la edad. Copa irregular, con ramas inermes, flexuosas, parduzcas, punteadas. Ramillas jóvenes tomentosas', 50, '32.00', '25.00'),
('FR-99', 'Membrillero', 'Frutales', '14/16', 'Frutales Talavera S.A', 'arbolito caducifolio de 4-6 m de altura con el tronco tortuoso y la corteza lisa, grisácea, que se desprende en escamas con la edad. Copa irregular, con ramas inermes, flexuosas, parduzcas, punteadas. Ramillas jóvenes tomentosas', 50, '49.00', '39.00'),
('OR-001', 'Arbustos Mix Maceta', 'Ornamentales', '40-60', 'Valencia Garden Service', '', 25, '5.00', '4.00'),
('OR-100', 'Mimosa Injerto CLASICA Dealbata ', 'Ornamentales', '100-110', 'Viveros EL OASIS', 'Acacia dealbata. Nombre común o vulgar: Mimosa fina, Mimosa, Mimosa común, Mimosa plateada, Aromo francés. Familia: Mimosaceae. Origen: Australia, Sureste, (N. G. del Sur y Victoria). Arbol de follaje persistente muy usado en parques por su atractiva floración amarilla hacia fines del invierno. Altura: de 3 a 10 metros generalmente. Crecimiento rápido. Follaje perenne de tonos plateados, muy ornamental. Sus hojas son de textura fina, de color verde y sus flores amarillas que aparecen en racimos grandes. Florece de Enero a Marzo (Hemisferio Norte). Legumbre de 5-9 cm de longitud, recta o ligeramente curvada, con los bordes algo constreñidos entre las semillas, que se disponen en el fruto longitudinalmente...', 100, '12.00', '9.00'),
('OR-101', 'Expositor Mimosa Semilla Mix', 'Ornamentales', '170-200', 'Viveros EL OASIS', 'Acacia dealbata. Nombre común o vulgar: Mimosa fina, Mimosa, Mimosa común, Mimosa plateada, Aromo francés. Familia: Mimosaceae. Origen: Australia, Sureste, (N. G. del Sur y Victoria). Arbol de follaje persistente muy usado en parques por su atractiva floración amarilla hacia fines del invierno. Altura: de 3 a 10 metros generalmente. Crecimiento rápido. Follaje perenne de tonos plateados, muy ornamental. Sus hojas son de textura fina, de color verde y sus flores amarillas que aparecen en racimos grandes. Florece de Enero a Marzo (Hemisferio Norte). Legumbre de 5-9 cm de longitud, recta o ligeramente curvada, con los bordes algo constreñidos entre las semillas, que se disponen en el fruto longitudinalmente...', 100, '6.00', '4.00'),
('OR-102', 'Mimosa Semilla Bayleyana  ', 'Ornamentales', '170-200', 'Viveros EL OASIS', 'Acacia dealbata. Nombre común o vulgar: Mimosa fina, Mimosa, Mimosa común, Mimosa plateada, Aromo francés. Familia: Mimosaceae. Origen: Australia, Sureste, (N. G. del Sur y Victoria). Arbol de follaje persistente muy usado en parques por su atractiva floración amarilla hacia fines del invierno. Altura: de 3 a 10 metros generalmente. Crecimiento rápido. Follaje perenne de tonos plateados, muy ornamental. Sus hojas son de textura fina, de color verde y sus flores amarillas que aparecen en racimos grandes. Florece de Enero a Marzo (Hemisferio Norte). Legumbre de 5-9 cm de longitud, recta o ligeramente curvada, con los bordes algo constreñidos entre las semillas, que se disponen en el fruto longitudinalmente...', 100, '6.00', '4.00'),
('OR-103', 'Mimosa Semilla Bayleyana   ', 'Ornamentales', '200-225', 'Viveros EL OASIS', 'Acacia dealbata. Nombre común o vulgar: Mimosa fina, Mimosa, Mimosa común, Mimosa plateada, Aromo francés. Familia: Mimosaceae. Origen: Australia, Sureste, (N. G. del Sur y Victoria). Arbol de follaje persistente muy usado en parques por su atractiva floración amarilla hacia fines del invierno. Altura: de 3 a 10 metros generalmente. Crecimiento rápido. Follaje perenne de tonos plateados, muy ornamental. Sus hojas son de textura fina, de color verde y sus flores amarillas que aparecen en racimos grandes. Florece de Enero a Marzo (Hemisferio Norte). Legumbre de 5-9 cm de longitud, recta o ligeramente curvada, con los bordes algo constreñidos entre las semillas, que se disponen en el fruto longitudinalmente...', 100, '10.00', '8.00'),
('OR-104', 'Mimosa Semilla Cyanophylla    ', 'Ornamentales', '200-225', 'Viveros EL OASIS', 'Acacia dealbata. Nombre común o vulgar: Mimosa fina, Mimosa, Mimosa común, Mimosa plateada, Aromo francés. Familia: Mimosaceae. Origen: Australia, Sureste, (N. G. del Sur y Victoria). Arbol de follaje persistente muy usado en parques por su atractiva floración amarilla hacia fines del invierno. Altura: de 3 a 10 metros generalmente. Crecimiento rápido. Follaje perenne de tonos plateados, muy ornamental. Sus hojas son de textura fina, de color verde y sus flores amarillas que aparecen en racimos grandes. Florece de Enero a Marzo (Hemisferio Norte). Legumbre de 5-9 cm de longitud, recta o ligeramente curvada, con los bordes algo constreñidos entre las semillas, que se disponen en el fruto longitudinalmente...', 100, '10.00', '8.00'),
('OR-105', 'Mimosa Semilla Espectabilis  ', 'Ornamentales', '160-170', 'Viveros EL OASIS', 'Acacia dealbata. Nombre común o vulgar: Mimosa fina, Mimosa, Mimosa común, Mimosa plateada, Aromo francés. Familia: Mimosaceae. Origen: Australia, Sureste, (N. G. del Sur y Victoria). Arbol de follaje persistente muy usado en parques por su atractiva floración amarilla hacia fines del invierno. Altura: de 3 a 10 metros generalmente. Crecimiento rápido. Follaje perenne de tonos plateados, muy ornamental. Sus hojas son de textura fina, de color verde y sus flores amarillas que aparecen en racimos grandes. Florece de Enero a Marzo (Hemisferio Norte). Legumbre de 5-9 cm de longitud, recta o ligeramente curvada, con los bordes algo constreñidos entre las semillas, que se disponen en el fruto longitudinalmente...', 100, '6.00', '4.00'),
('OR-106', 'Mimosa Semilla Longifolia   ', 'Ornamentales', '200-225', 'Viveros EL OASIS', 'Acacia dealbata. Nombre común o vulgar: Mimosa fina, Mimosa, Mimosa común, Mimosa plateada, Aromo francés. Familia: Mimosaceae. Origen: Australia, Sureste, (N. G. del Sur y Victoria). Arbol de follaje persistente muy usado en parques por su atractiva floración amarilla hacia fines del invierno. Altura: de 3 a 10 metros generalmente. Crecimiento rápido. Follaje perenne de tonos plateados, muy ornamental. Sus hojas son de textura fina, de color verde y sus flores amarillas que aparecen en racimos grandes. Florece de Enero a Marzo (Hemisferio Norte). Legumbre de 5-9 cm de longitud, recta o ligeramente curvada, con los bordes algo constreñidos entre las semillas, que se disponen en el fruto longitudinalmente...', 100, '10.00', '8.00'),
('OR-107', 'Mimosa Semilla Floribunda 4 estaciones', 'Ornamentales', '120-140', 'Viveros EL OASIS', 'Acacia dealbata. Nombre común o vulgar: Mimosa fina, Mimosa, Mimosa común, Mimosa plateada, Aromo francés. Familia: Mimosaceae. Origen: Australia, Sureste, (N. G. del Sur y Victoria). Arbol de follaje persistente muy usado en parques por su atractiva floración amarilla hacia fines del invierno. Altura: de 3 a 10 metros generalmente. Crecimiento rápido. Follaje perenne de tonos plateados, muy ornamental. Sus hojas son de textura fina, de color verde y sus flores amarillas que aparecen en racimos grandes. Florece de Enero a Marzo (Hemisferio Norte). Legumbre de 5-9 cm de longitud, recta o ligeramente curvada, con los bordes algo constreñidos entre las semillas, que se disponen en el fruto longitudinalmente...', 100, '6.00', '4.00'),
('OR-108', 'Abelia Floribunda', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 100, '5.00', '4.00'),
('OR-109', 'Callistemom (Mix)', 'Ornamentales', '35-45', 'Viveros EL OASIS', 'Limpitatubos. arbolito de 6-7 m de altura. Ramas flexibles y colgantes (de ahí lo de \"llorón\")..', 100, '5.00', '4.00'),
('OR-110', 'Callistemom (Mix)', 'Ornamentales', '40-60', 'Viveros EL OASIS', 'Limpitatubos. arbolito de 6-7 m de altura. Ramas flexibles y colgantes (de ahí lo de \"llorón\")..', 100, '2.00', '1.00'),
('OR-111', 'Corylus Avellana \"Contorta\"', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 100, '5.00', '4.00'),
('OR-112', 'Escallonia (Mix)', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 120, '5.00', '4.00'),
('OR-113', 'Evonimus Emerald Gayeti', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 120, '5.00', '4.00'),
('OR-114', 'Evonimus Pulchellus', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 120, '5.00', '4.00'),
('OR-115', 'Forsytia Intermedia \"Lynwood\"', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 120, '7.00', '5.00'),
('OR-116', 'Hibiscus Syriacus  \"Diana\" -Blanco Puro', 'Ornamentales', '35-45', 'Viveros EL OASIS', 'Por su capacidad de soportar podas, pueden ser fácilmente moldeadas como bonsái en el transcurso de pocos años. Flores de muchos colores según la variedad, desde el blanco puro al rojo intenso, del amarillo al anaranjado. La flor apenas dura 1 día, pero continuamente aparecen nuevas y la floración se prolonga durante todo el periodo de crecimiento vegetativo.', 120, '7.00', '5.00'),
('OR-117', 'Hibiscus Syriacus  \"Helene\" -Blanco-C.rojo', 'Ornamentales', '35-45', 'Viveros EL OASIS', 'Por su capacidad de soportar podas, pueden ser fácilmente moldeadas como bonsái en el transcurso de pocos años. Flores de muchos colores según la variedad, desde el blanco puro al rojo intenso, del amarillo al anaranjado. La flor apenas dura 1 día, pero continuamente aparecen nuevas y la floración se prolonga durante todo el periodo de crecimiento vegetativo.', 120, '7.00', '5.00'),
('OR-118', 'Hibiscus Syriacus \"Pink Giant\" Rosa', 'Ornamentales', '35-45', 'Viveros EL OASIS', 'Por su capacidad de soportar podas, pueden ser fácilmente moldeadas como bonsái en el transcurso de pocos años. Flores de muchos colores según la variedad, desde el blanco puro al rojo intenso, del amarillo al anaranjado. La flor apenas dura 1 día, pero continuamente aparecen nuevas y la floración se prolonga durante todo el periodo de crecimiento vegetativo.', 120, '7.00', '5.00'),
('OR-119', 'Laurus Nobilis Arbusto - Ramificado Bajo', 'Ornamentales', '40-50', 'Viveros EL OASIS', '', 120, '5.00', '4.00'),
('OR-120', 'Lonicera Nitida ', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 120, '5.00', '4.00'),
('OR-121', 'Lonicera Nitida \"Maigrum\"', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 120, '5.00', '4.00'),
('OR-122', 'Lonicera Pileata', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 120, '5.00', '4.00'),
('OR-123', 'Philadelphus \"Virginal\"', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 120, '5.00', '4.00'),
('OR-124', 'Prunus pisardii  ', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 120, '5.00', '4.00'),
('OR-125', 'Viburnum Tinus \"Eve Price\"', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 120, '5.00', '4.00'),
('OR-126', 'Weigelia \"Bristol Ruby\"', 'Ornamentales', '35-45', 'Viveros EL OASIS', '', 120, '5.00', '4.00'),
('OR-127', 'Camelia japonica', 'Ornamentales', '40-60', 'Viveros EL OASIS', 'Arbusto excepcional por su floración otoñal, invernal o primaveral. Flores: Las flores son solitarias, aparecen en el ápice de cada rama, y son con una corola simple o doble, y comprendiendo varios colores. Suelen medir unos 7-12 cm de diÃ metro y tienen 5 sépalos y 5 pétalos. Estambres numerosos unidos en la mitad o en 2/3 de su longitud.', 50, '7.00', '5.00'),
('OR-128', 'Camelia japonica ejemplar', 'Ornamentales', '200-250', 'Viveros EL OASIS', 'Arbusto excepcional por su floración otoñal, invernal o primaveral. Flores: Las flores son solitarias, aparecen en el ápice de cada rama, y son con una corola simple o doble, y comprendiendo varios colores. Suelen medir unos 7-12 cm de diÃ metro y tienen 5 sépalos y 5 pétalos. Estambres numerosos unidos en la mitad o en 2/3 de su longitud.', 50, '98.00', '78.00'),
('OR-129', 'Camelia japonica ejemplar', 'Ornamentales', '250-300', 'Viveros EL OASIS', 'Arbusto excepcional por su floración otoñal, invernal o primaveral. Flores: Las flores son solitarias, aparecen en el ápice de cada rama, y son con una corola simple o doble, y comprendiendo varios colores. Suelen medir unos 7-12 cm de diÃ metro y tienen 5 sépalos y 5 pétalos. Estambres numerosos unidos en la mitad o en 2/3 de su longitud.', 50, '110.00', '88.00'),
('OR-130', 'Callistemom COPA', 'Ornamentales', '110/120', 'Viveros EL OASIS', 'Limpitatubos. arbolito de 6-7 m de altura. Ramas flexibles y colgantes (de ahí lo de \"llorón\")..', 50, '18.00', '14.00'),
('OR-131', 'Leptospermum formado PIRAMIDE', 'Ornamentales', '80-100', 'Viveros EL OASIS', '', 50, '18.00', '14.00'),
('OR-132', 'Leptospermum COPA', 'Ornamentales', '110/120', 'Viveros EL OASIS', '', 50, '18.00', '14.00'),
('OR-133', 'Nerium oleander-CALIDAD \"GARDEN\"', 'Ornamentales', '40-45', 'Viveros EL OASIS', '', 50, '2.00', '1.00'),
('OR-134', 'Nerium Oleander Arbusto GRANDE', 'Ornamentales', '160-200', 'Viveros EL OASIS', '', 100, '38.00', '30.00'),
('OR-135', 'Nerium oleander COPA  Calibre 6/8', 'Ornamentales', '50-60', 'Viveros EL OASIS', '', 100, '5.00', '4.00'),
('OR-136', 'Nerium oleander ARBOL Calibre 8/10', 'Ornamentales', '225-250', 'Viveros EL OASIS', '', 100, '18.00', '14.00'),
('OR-137', 'ROSAL TREPADOR', 'Ornamentales', '', 'Viveros EL OASIS', '', 100, '4.00', '3.00'),
('OR-138', 'Camelia Blanco, Chrysler Rojo, Soraya Naranja, ', 'Ornamentales', '', 'Viveros EL OASIS', '', 100, '4.00', '3.00'),
('OR-139', 'Landora Amarillo, Rose Gaujard bicolor blanco-rojo', 'Ornamentales', '', 'Viveros EL OASIS', '', 100, '4.00', '3.00'),
('OR-140', 'Kordes Perfect bicolor rojo-amarillo, Roundelay rojo fuerte', 'Ornamentales', '', 'Viveros EL OASIS', '', 100, '4.00', '3.00'),
('OR-141', 'Pitimini rojo', 'Ornamentales', '', 'Viveros EL OASIS', '', 100, '4.00', '3.00'),
('OR-142', 'Solanum Jazminoide', 'Ornamentales', '150-160', 'Viveros EL OASIS', '', 100, '2.00', '1.00'),
('OR-143', 'Wisteria Sinensis  azul, rosa, blanca', 'Ornamentales', '', 'Viveros EL OASIS', '', 100, '9.00', '7.00'),
('OR-144', 'Wisteria Sinensis INJERTADAS DECÃ“', 'Ornamentales', '140-150', 'Viveros EL OASIS', '', 100, '12.00', '9.00'),
('OR-145', 'Bougamvillea Sanderiana Tutor', 'Ornamentales', '80-100', 'Viveros EL OASIS', '', 100, '2.00', '1.00'),
('OR-146', 'Bougamvillea Sanderiana Tutor', 'Ornamentales', '125-150', 'Viveros EL OASIS', '', 100, '4.00', '3.00'),
('OR-147', 'Bougamvillea Sanderiana Tutor', 'Ornamentales', '180-200', 'Viveros EL OASIS', '', 100, '7.00', '5.00'),
('OR-148', 'Bougamvillea Sanderiana Espaldera', 'Ornamentales', '45-50', 'Viveros EL OASIS', '', 100, '7.00', '5.00'),
('OR-149', 'Bougamvillea Sanderiana Espaldera', 'Ornamentales', '140-150', 'Viveros EL OASIS', '', 100, '17.00', '13.00'),
('OR-150', 'Bougamvillea roja, naranja', 'Ornamentales', '110-130', 'Viveros EL OASIS', '', 100, '2.00', '1.00'),
('OR-151', 'Bougamvillea Sanderiana, 3 tut. piramide', 'Ornamentales', '', 'Viveros EL OASIS', '', 100, '6.00', '4.00'),
('OR-152', 'Expositor Árboles clima continental', 'Ornamentales', '170-200', 'Viveros EL OASIS', '', 100, '6.00', '4.00'),
('OR-153', 'Expositor Árboles clima mediterráneo', 'Ornamentales', '170-200', 'Viveros EL OASIS', '', 100, '6.00', '4.00'),
('OR-154', 'Expositor Árboles borde del mar', 'Ornamentales', '170-200', 'Viveros EL OASIS', '', 100, '6.00', '4.00'),
('OR-155', 'Acer Negundo  ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 100, '6.00', '4.00'),
('OR-156', 'Acer platanoides  ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 100, '10.00', '8.00'),
('OR-157', 'Acer Pseudoplatanus ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 100, '10.00', '8.00'),
('OR-158', 'Brachychiton Acerifolius  ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 100, '6.00', '4.00'),
('OR-159', 'Brachychiton Discolor  ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 100, '6.00', '4.00'),
('OR-160', 'Brachychiton Rupestris', 'Ornamentales', '170-200', 'Viveros EL OASIS', '', 100, '10.00', '8.00'),
('OR-161', 'Cassia Corimbosa  ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 100, '6.00', '4.00'),
('OR-162', 'Cassia Corimbosa ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 100, '10.00', '8.00'),
('OR-163', 'Chitalpa Summer Bells   ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-164', 'Erytrina Kafra', 'Ornamentales', '170-180', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-165', 'Erytrina Kafra', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-166', 'Eucalyptus Citriodora  ', 'Ornamentales', '170-200', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-167', 'Eucalyptus Ficifolia  ', 'Ornamentales', '170-200', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-168', 'Eucalyptus Ficifolia   ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-169', 'Hibiscus Syriacus  Var. Injertadas 1 Tallo ', 'Ornamentales', '170-200', 'Viveros EL OASIS', '', 80, '12.00', '9.00'),
('OR-170', 'Lagunaria Patersonii  ', 'Ornamentales', '140-150', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-171', 'Lagunaria Patersonii   ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-172', 'Lagunaria patersonii  calibre 8/10', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '18.00', '14.00'),
('OR-173', 'Morus Alba  ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-174', 'Morus Alba  calibre 8/10', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '18.00', '14.00'),
('OR-175', 'Platanus Acerifolia   ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-176', 'Prunus pisardii  ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-177', 'Robinia Pseudoacacia Casque Rouge   ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '15.00', '12.00'),
('OR-178', 'Salix Babylonica  Pendula  ', 'Ornamentales', '170-200', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-179', 'Sesbania Punicea   ', 'Ornamentales', '170-200', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-180', 'Tamarix  Ramosissima Pink Cascade   ', 'Ornamentales', '170-200', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-181', 'Tamarix  Ramosissima Pink Cascade   ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-182', 'Tecoma Stands   ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-183', 'Tecoma Stands  ', 'Ornamentales', '200-225', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-184', 'Tipuana Tipu  ', 'Ornamentales', '170-200', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-185', 'Pleioblastus distichus-Bambú enano', 'Ornamentales', '15-20', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-186', 'Sasa palmata ', 'Ornamentales', '20-30', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-187', 'Sasa palmata ', 'Ornamentales', '40-45', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-188', 'Sasa palmata ', 'Ornamentales', '50-60', 'Viveros EL OASIS', '', 80, '25.00', '20.00'),
('OR-189', 'Phylostachys aurea', 'Ornamentales', '180-200', 'Viveros EL OASIS', '', 80, '22.00', '17.00'),
('OR-190', 'Phylostachys aurea', 'Ornamentales', '250-300', 'Viveros EL OASIS', '', 80, '32.00', '25.00'),
('OR-191', 'Phylostachys Bambusa Spectabilis', 'Ornamentales', '180-200', 'Viveros EL OASIS', '', 80, '24.00', '19.00'),
('OR-192', 'Phylostachys biseti', 'Ornamentales', '160-170', 'Viveros EL OASIS', '', 80, '22.00', '17.00'),
('OR-193', 'Phylostachys biseti', 'Ornamentales', '160-180', 'Viveros EL OASIS', '', 80, '20.00', '16.00'),
('OR-194', 'Pseudosasa japonica (Metake)', 'Ornamentales', '225-250', 'Viveros EL OASIS', '', 80, '20.00', '16.00'),
('OR-195', 'Pseudosasa japonica (Metake) ', 'Ornamentales', '30-40', 'Viveros EL OASIS', '', 80, '6.00', '4.00'),
('OR-196', 'Cedrus Deodara ', 'Ornamentales', '80-100', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-197', 'Cedrus Deodara \"Feeling Blue\" Novedad', 'Ornamentales', 'rastrero', 'Viveros EL OASIS', '', 80, '12.00', '9.00'),
('OR-198', 'Juniperus chinensis \"Blue Alps\"', 'Ornamentales', '20-30', 'Viveros EL OASIS', '', 80, '4.00', '3.00'),
('OR-199', 'Juniperus Chinensis Stricta', 'Ornamentales', '20-30', 'Viveros EL OASIS', '', 80, '4.00', '3.00'),
('OR-200', 'Juniperus horizontalis Wiltonii', 'Ornamentales', '20-30', 'Viveros EL OASIS', '', 80, '4.00', '3.00'),
('OR-201', 'Juniperus squamata \"Blue Star\"', 'Ornamentales', '20-30', 'Viveros EL OASIS', '', 80, '4.00', '3.00'),
('OR-202', 'Juniperus x media Phitzeriana verde', 'Ornamentales', '20-30', 'Viveros EL OASIS', '', 80, '4.00', '3.00'),
('OR-203', 'Pinus Canariensis', 'Ornamentales', '80-100', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-204', 'Pinus Halepensis', 'Ornamentales', '160-180', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-205', 'Pinus Pinea -Pino Piñonero', 'Ornamentales', '70-80', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-206', 'Thuja Esmeralda ', 'Ornamentales', '80-100', 'Viveros EL OASIS', '', 80, '5.00', '4.00'),
('OR-207', 'Tuja Occidentalis Woodwardii', 'Ornamentales', '20-30', 'Viveros EL OASIS', '', 80, '4.00', '3.00'),
('OR-208', 'Tuja orientalis \"Aurea nana\"', 'Ornamentales', '20-30', 'Viveros EL OASIS', '', 80, '4.00', '3.00'),
('OR-209', 'Archontophoenix Cunninghamiana', 'Ornamentales', '80 - 100', 'Viveros EL OASIS', '', 80, '10.00', '8.00'),
('OR-210', 'Beucarnea Recurvata', 'Ornamentales', '130  - 150', 'Viveros EL OASIS', '', 2, '39.00', '31.00'),
('OR-211', 'Beucarnea Recurvata', 'Ornamentales', '180 - 200', 'Viveros EL OASIS', '', 5, '59.00', '47.00'),
('OR-212', 'Bismarckia Nobilis', 'Ornamentales', '200 - 220', 'Viveros EL OASIS', '', 4, '217.00', '173.00'),
('OR-213', 'Bismarckia Nobilis', 'Ornamentales', '240 - 260', 'Viveros EL OASIS', '', 4, '266.00', '212.00'),
('OR-214', 'Brahea Armata', 'Ornamentales', '45 - 60', 'Viveros EL OASIS', '', 0, '10.00', '8.00'),
('OR-215', 'Brahea Armata', 'Ornamentales', '120 - 140', 'Viveros EL OASIS', '', 100, '112.00', '89.00'),
('OR-216', 'Brahea Edulis', 'Ornamentales', '80 - 100', 'Viveros EL OASIS', '', 100, '19.00', '15.00'),
('OR-217', 'Brahea Edulis', 'Ornamentales', '140 - 160', 'Viveros EL OASIS', '', 100, '64.00', '51.00'),
('OR-218', 'Butia Capitata', 'Ornamentales', '70 - 90', 'Viveros EL OASIS', '', 100, '25.00', '20.00'),
('OR-219', 'Butia Capitata', 'Ornamentales', '90 - 110', 'Viveros EL OASIS', '', 100, '29.00', '23.00'),
('OR-220', 'Butia Capitata', 'Ornamentales', '90 - 120', 'Viveros EL OASIS', '', 100, '36.00', '28.00'),
('OR-221', 'Butia Capitata', 'Ornamentales', '85 - 105', 'Viveros EL OASIS', '', 100, '59.00', '47.00'),
('OR-222', 'Butia Capitata', 'Ornamentales', '130 - 150', 'Viveros EL OASIS', '', 100, '87.00', '69.00'),
('OR-223', 'Chamaerops Humilis', 'Ornamentales', '40 - 45', 'Viveros EL OASIS', '', 100, '4.00', '3.00'),
('OR-224', 'Chamaerops Humilis', 'Ornamentales', '50 - 60', 'Viveros EL OASIS', '', 100, '7.00', '5.00'),
('OR-225', 'Chamaerops Humilis', 'Ornamentales', '70 - 90', 'Viveros EL OASIS', '', 100, '10.00', '8.00'),
('OR-226', 'Chamaerops Humilis', 'Ornamentales', '115 - 130', 'Viveros EL OASIS', '', 100, '38.00', '30.00'),
('OR-227', 'Chamaerops Humilis', 'Ornamentales', '130 - 150', 'Viveros EL OASIS', '', 100, '64.00', '51.00'),
('OR-228', 'Chamaerops Humilis \"Cerifera\"', 'Ornamentales', '70 - 80', 'Viveros EL OASIS', '', 100, '32.00', '25.00'),
('OR-229', 'Chrysalidocarpus Lutescens -ARECA', 'Ornamentales', '130 - 150', 'Viveros EL OASIS', '', 100, '22.00', '17.00'),
('OR-230', 'Cordyline Australis -DRACAENA', 'Ornamentales', '190 - 210', 'Viveros EL OASIS', '', 100, '38.00', '30.00'),
('OR-231', 'Cycas Revoluta', 'Ornamentales', '55 - 65', 'Viveros EL OASIS', '', 100, '15.00', '12.00'),
('OR-232', 'Cycas Revoluta', 'Ornamentales', '80 - 90', 'Viveros EL OASIS', '', 100, '34.00', '27.00'),
('OR-233', 'Dracaena Drago', 'Ornamentales', '60 - 70', 'Viveros EL OASIS', '', 1, '13.00', '10.00'),
('OR-234', 'Dracaena Drago', 'Ornamentales', '130 - 150', 'Viveros EL OASIS', '', 2, '64.00', '51.00'),
('OR-235', 'Dracaena Drago', 'Ornamentales', '150 - 175', 'Viveros EL OASIS', '', 2, '92.00', '73.00'),
('OR-236', 'Jubaea Chilensis', 'Ornamentales', '', 'Viveros EL OASIS', '', 100, '49.00', '39.00'),
('OR-237', 'Livistonia Australis', 'Ornamentales', '100 - 125', 'Viveros EL OASIS', '', 50, '19.00', '15.00'),
('OR-238', 'Livistonia Decipiens', 'Ornamentales', '90 - 110', 'Viveros EL OASIS', '', 50, '19.00', '15.00'),
('OR-239', 'Livistonia Decipiens', 'Ornamentales', '180 - 200', 'Viveros EL OASIS', '', 50, '49.00', '39.00'),
('OR-240', 'Phoenix Canariensis', 'Ornamentales', '110 - 130', 'Viveros EL OASIS', '', 50, '6.00', '4.00'),
('OR-241', 'Phoenix Canariensis', 'Ornamentales', '180 - 200', 'Viveros EL OASIS', '', 50, '19.00', '15.00'),
('OR-242', 'Rhaphis Excelsa', 'Ornamentales', '80 - 100', 'Viveros EL OASIS', '', 50, '21.00', '16.00'),
('OR-243', 'Rhaphis Humilis', 'Ornamentales', '150- 170', 'Viveros EL OASIS', '', 50, '64.00', '51.00'),
('OR-244', 'Sabal Minor', 'Ornamentales', '60 - 75', 'Viveros EL OASIS', '', 50, '11.00', '8.00'),
('OR-245', 'Sabal Minor', 'Ornamentales', '120 - 140', 'Viveros EL OASIS', '', 50, '34.00', '27.00'),
('OR-246', 'Trachycarpus Fortunei', 'Ornamentales', '90 - 105', 'Viveros EL OASIS', '', 50, '18.00', '14.00'),
('OR-247', 'Trachycarpus Fortunei', 'Ornamentales', '250-300', 'Viveros EL OASIS', '', 2, '462.00', '369.00'),
('OR-248', 'Washingtonia Robusta', 'Ornamentales', '60 - 70', 'Viveros EL OASIS', '', 15, '3.00', '2.00'),
('OR-249', 'Washingtonia Robusta', 'Ornamentales', '130 - 150', 'Viveros EL OASIS', '', 15, '5.00', '4.00'),
('OR-250', 'Yucca Jewel', 'Ornamentales', '80 - 105', 'Viveros EL OASIS', '', 15, '10.00', '8.00'),
('OR-251', 'Zamia Furfuracaea', 'Ornamentales', '90 - 110', 'Viveros EL OASIS', '', 15, '168.00', '134.00'),
('OR-99', 'Mimosa DEALBATA Gaulois Astier  ', 'Ornamentales', '200-225', 'Viveros EL OASIS', 'Acacia dealbata. Nombre común o vulgar: Mimosa fina, Mimosa, Mimosa común, Mimosa plateada, Aromo francés. Familia: Mimosaceae. Origen: Australia, Sureste, (N. G. del Sur y Victoria). Arbol de follaje persistente muy usado en parques por su atractiva floración amarilla hacia fines del invierno. Altura: de 3 a 10 metros generalmente. Crecimiento rápido. Follaje perenne de tonos plateados, muy ornamental. Sus hojas son de textura fina, de color verde y sus flores amarillas que aparecen en racimos grandes. Florece de Enero a Marzo (Hemisferio Norte). Legumbre de 5-9 cm de longitud, recta o ligeramente curvada, con los bordes algo constreñidos entre las semillas, que se disponen en el fruto longitudinalmente...', 100, '14.00', '11.00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codigo_cliente`),
  ADD KEY `codigo_empleado_rep_ventas` (`codigo_empleado_rep_ventas`);

--
-- Indices de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD PRIMARY KEY (`codigo_pedido`,`codigo_producto`),
  ADD KEY `codigo_producto` (`codigo_producto`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`codigo_empleado`),
  ADD KEY `codigo_oficina` (`codigo_oficina`),
  ADD KEY `codigo_jefe` (`codigo_jefe`);

--
-- Indices de la tabla `gama_producto`
--
ALTER TABLE `gama_producto`
  ADD PRIMARY KEY (`gama`);

--
-- Indices de la tabla `oficina`
--
ALTER TABLE `oficina`
  ADD PRIMARY KEY (`codigo_oficina`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`codigo_cliente`,`id_transaccion`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`codigo_pedido`),
  ADD KEY `codigo_cliente` (`codigo_cliente`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codigo_producto`),
  ADD KEY `gama` (`gama`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`codigo_empleado_rep_ventas`) REFERENCES `empleado` (`codigo_empleado`);

--
-- Filtros para la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD CONSTRAINT `detalle_pedido_ibfk_1` FOREIGN KEY (`codigo_pedido`) REFERENCES `pedido` (`codigo_pedido`),
  ADD CONSTRAINT `detalle_pedido_ibfk_2` FOREIGN KEY (`codigo_producto`) REFERENCES `producto` (`codigo_producto`);

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`codigo_oficina`) REFERENCES `oficina` (`codigo_oficina`),
  ADD CONSTRAINT `empleado_ibfk_2` FOREIGN KEY (`codigo_jefe`) REFERENCES `empleado` (`codigo_empleado`);

--
-- Filtros para la tabla `pago`
--
ALTER TABLE `pago`
  ADD CONSTRAINT `pago_ibfk_1` FOREIGN KEY (`codigo_cliente`) REFERENCES `cliente` (`codigo_cliente`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`codigo_cliente`) REFERENCES `cliente` (`codigo_cliente`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`gama`) REFERENCES `gama_producto` (`gama`);
--
-- Base de datos: `libreria`
--
CREATE DATABASE IF NOT EXISTS `libreria` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `libreria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `editoriales`
--

CREATE TABLE `editoriales` (
  `codigo` int(11) NOT NULL,
  `nombre` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `editoriales`
--

INSERT INTO `editoriales` (`codigo`, `nombre`) VALUES
(1, 'Planeta'),
(2, 'Emece'),
(3, 'Paidos'),
(4, 'Siglo XXI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `codigo` int(11) NOT NULL,
  `titulo` text DEFAULT NULL,
  `autor` text DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `codigoeditorial` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`codigo`, `titulo`, `autor`, `precio`, `codigoeditorial`) VALUES
(1, 'Uno', 'Richard Bach', NULL, 1),
(2, 'Ilusiones', 'Richard Bach', NULL, 1),
(3, 'Aprenda PHP', 'Mario Molina', NULL, 4),
(4, 'El aleph', 'Borges', NULL, 2),
(5, 'Puente al infinito', 'Richard Bach', NULL, 2),
(6, 'Ficciones', 'Borges', NULL, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `editoriales`
--
ALTER TABLE `editoriales`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `editoriales`
--
ALTER TABLE `editoriales`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Base de datos: `mibase`
--
CREATE DATABASE IF NOT EXISTS `mibase` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `mibase`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `dni` int(9) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `apellido` varchar(15) NOT NULL,
  `rol` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`dni`, `nombre`, `apellido`, `rol`) VALUES
(12345678, 'seba', 'lopez', 1),
(12345678, 'anastasia', 'peperoni', 3),
(12345678, 'ana', 'sanchez', 4),
(12345678, 'lorena', 'alvarez', 5),
(12345678, 'pepe', 'diaz', 6),
(12345678, 'diego', 'sanchez', 7),
(12345678, 'analia', 'diaz', 8),
(12345678, 'alan', 'estevez', 9);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`rol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `rol` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- Base de datos: `phpmyadmin`
--
CREATE DATABASE IF NOT EXISTS `phpmyadmin` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `phpmyadmin`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__bookmark`
--

CREATE TABLE `pma__bookmark` (
  `id` int(10) UNSIGNED NOT NULL,
  `dbase` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `user` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `label` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `query` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Bookmarks';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__central_columns`
--

CREATE TABLE `pma__central_columns` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_length` text COLLATE utf8_bin DEFAULT NULL,
  `col_collation` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_isNull` tinyint(1) NOT NULL,
  `col_extra` varchar(255) COLLATE utf8_bin DEFAULT '',
  `col_default` text COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Central list of columns';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__column_info`
--

CREATE TABLE `pma__column_info` (
  `id` int(5) UNSIGNED NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `column_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `mimetype` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Column information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__designer_settings`
--

CREATE TABLE `pma__designer_settings` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `settings_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Settings related to Designer';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__export_templates`
--

CREATE TABLE `pma__export_templates` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `export_type` varchar(10) COLLATE utf8_bin NOT NULL,
  `template_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `template_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved export templates';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__favorite`
--

CREATE TABLE `pma__favorite` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Favorite tables';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__history`
--

CREATE TABLE `pma__history` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `timevalue` timestamp NOT NULL DEFAULT current_timestamp(),
  `sqlquery` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='SQL history for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__navigationhiding`
--

CREATE TABLE `pma__navigationhiding` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Hidden items of navigation tree';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__pdf_pages`
--

CREATE TABLE `pma__pdf_pages` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `page_nr` int(10) UNSIGNED NOT NULL,
  `page_descr` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='PDF relation pages for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__recent`
--

CREATE TABLE `pma__recent` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Recently accessed tables';

--
-- Volcado de datos para la tabla `pma__recent`
--

INSERT INTO `pma__recent` (`username`, `tables`) VALUES
('root', '[{\"db\":\"amore\",\"table\":\"producto\"},{\"db\":\"amore\",\"table\":\"pedido_producto\"},{\"db\":\"amore\",\"table\":\"pedido\"},{\"db\":\"amore\",\"table\":\"almacenista\"},{\"db\":\"amore\",\"table\":\"materiaprima\"},{\"db\":\"carrito\",\"table\":\"categorias\"},{\"db\":\"amore\",\"table\":\"operario\"},{\"db\":\"test_sitioweb\",\"table\":\"usuarios\"},{\"db\":\"sitio_web\",\"table\":\"categoria\"},{\"db\":\"sitio_web\",\"table\":\"producto\"}]');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__relation`
--

CREATE TABLE `pma__relation` (
  `master_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Relation table';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__savedsearches`
--

CREATE TABLE `pma__savedsearches` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved searches';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__table_coords`
--

CREATE TABLE `pma__table_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pdf_page_number` int(11) NOT NULL DEFAULT 0,
  `x` float UNSIGNED NOT NULL DEFAULT 0,
  `y` float UNSIGNED NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for phpMyAdmin PDF output';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__table_info`
--

CREATE TABLE `pma__table_info` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `display_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__table_uiprefs`
--

CREATE TABLE `pma__table_uiprefs` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `prefs` text COLLATE utf8_bin NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tables'' UI preferences';

--
-- Volcado de datos para la tabla `pma__table_uiprefs`
--

INSERT INTO `pma__table_uiprefs` (`username`, `db_name`, `table_name`, `prefs`, `last_update`) VALUES
('root', 'amore', 'pedido', '{\"CREATE_TIME\":\"2023-06-08 11:17:01\"}', '2023-06-09 23:07:18'),
('root', 'cafeteria', 'cliente', '{\"CREATE_TIME\":\"2023-04-12 15:40:53\",\"col_order\":[0,1,2,3,4,5],\"col_visib\":[1,1,1,1,1,1]}', '2023-04-22 22:05:05'),
('root', 'cafeteria', 'detalle_pedido', '{\"sorted_col\":\"`detalle_pedido`.`idproducto`  ASC\"}', '2023-04-13 00:10:51'),
('root', 'cafeteria', 'empleado', '{\"CREATE_TIME\":\"2023-04-12 15:40:53\",\"col_order\":[0,1,2,3,4,5,6],\"col_visib\":[1,1,1,1,1,1,1]}', '2023-04-22 21:54:17'),
('root', 'sitio_web', 'categoria', '{\"CREATE_TIME\":\"2023-05-03 10:28:38\"}', '2023-06-06 02:36:04'),
('root', 'test', 'usuarios', '{\"sorted_col\":\"`usuarios`.`CLAVE`  ASC\"}', '2022-12-04 20:45:20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__tracking`
--

CREATE TABLE `pma__tracking` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `version` int(10) UNSIGNED NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `schema_snapshot` text COLLATE utf8_bin NOT NULL,
  `schema_sql` text COLLATE utf8_bin DEFAULT NULL,
  `data_sql` longtext COLLATE utf8_bin DEFAULT NULL,
  `tracking` set('UPDATE','REPLACE','INSERT','DELETE','TRUNCATE','CREATE DATABASE','ALTER DATABASE','DROP DATABASE','CREATE TABLE','ALTER TABLE','RENAME TABLE','DROP TABLE','CREATE INDEX','DROP INDEX','CREATE VIEW','ALTER VIEW','DROP VIEW') COLLATE utf8_bin DEFAULT NULL,
  `tracking_active` int(1) UNSIGNED NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Database changes tracking for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__userconfig`
--

CREATE TABLE `pma__userconfig` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `timevalue` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `config_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User preferences storage for phpMyAdmin';

--
-- Volcado de datos para la tabla `pma__userconfig`
--

INSERT INTO `pma__userconfig` (`username`, `timevalue`, `config_data`) VALUES
('root', '2023-06-09 23:52:10', '{\"Console\\/Mode\":\"collapse\",\"lang\":\"es\"}');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__usergroups`
--

CREATE TABLE `pma__usergroups` (
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL,
  `tab` varchar(64) COLLATE utf8_bin NOT NULL,
  `allowed` enum('Y','N') COLLATE utf8_bin NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User groups with configured menu items';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__users`
--

CREATE TABLE `pma__users` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Users and their assignments to user groups';

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pma__central_columns`
--
ALTER TABLE `pma__central_columns`
  ADD PRIMARY KEY (`db_name`,`col_name`);

--
-- Indices de la tabla `pma__column_info`
--
ALTER TABLE `pma__column_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `db_name` (`db_name`,`table_name`,`column_name`);

--
-- Indices de la tabla `pma__designer_settings`
--
ALTER TABLE `pma__designer_settings`
  ADD PRIMARY KEY (`username`);

--
-- Indices de la tabla `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_user_type_template` (`username`,`export_type`,`template_name`);

--
-- Indices de la tabla `pma__favorite`
--
ALTER TABLE `pma__favorite`
  ADD PRIMARY KEY (`username`);

--
-- Indices de la tabla `pma__history`
--
ALTER TABLE `pma__history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`,`db`,`table`,`timevalue`);

--
-- Indices de la tabla `pma__navigationhiding`
--
ALTER TABLE `pma__navigationhiding`
  ADD PRIMARY KEY (`username`,`item_name`,`item_type`,`db_name`,`table_name`);

--
-- Indices de la tabla `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  ADD PRIMARY KEY (`page_nr`),
  ADD KEY `db_name` (`db_name`);

--
-- Indices de la tabla `pma__recent`
--
ALTER TABLE `pma__recent`
  ADD PRIMARY KEY (`username`);

--
-- Indices de la tabla `pma__relation`
--
ALTER TABLE `pma__relation`
  ADD PRIMARY KEY (`master_db`,`master_table`,`master_field`),
  ADD KEY `foreign_field` (`foreign_db`,`foreign_table`);

--
-- Indices de la tabla `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_savedsearches_username_dbname` (`username`,`db_name`,`search_name`);

--
-- Indices de la tabla `pma__table_coords`
--
ALTER TABLE `pma__table_coords`
  ADD PRIMARY KEY (`db_name`,`table_name`,`pdf_page_number`);

--
-- Indices de la tabla `pma__table_info`
--
ALTER TABLE `pma__table_info`
  ADD PRIMARY KEY (`db_name`,`table_name`);

--
-- Indices de la tabla `pma__table_uiprefs`
--
ALTER TABLE `pma__table_uiprefs`
  ADD PRIMARY KEY (`username`,`db_name`,`table_name`);

--
-- Indices de la tabla `pma__tracking`
--
ALTER TABLE `pma__tracking`
  ADD PRIMARY KEY (`db_name`,`table_name`,`version`);

--
-- Indices de la tabla `pma__userconfig`
--
ALTER TABLE `pma__userconfig`
  ADD PRIMARY KEY (`username`);

--
-- Indices de la tabla `pma__usergroups`
--
ALTER TABLE `pma__usergroups`
  ADD PRIMARY KEY (`usergroup`,`tab`,`allowed`);

--
-- Indices de la tabla `pma__users`
--
ALTER TABLE `pma__users`
  ADD PRIMARY KEY (`username`,`usergroup`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pma__column_info`
--
ALTER TABLE `pma__column_info`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pma__history`
--
ALTER TABLE `pma__history`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  MODIFY `page_nr` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- Base de datos: `producto`
--
CREATE DATABASE IF NOT EXISTS `producto` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `producto`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fruta`
--

CREATE TABLE `fruta` (
  `id_fruta` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `codigo` varchar(45) DEFAULT NULL,
  `imagen` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `fruta`
--

INSERT INTO `fruta` (`id_fruta`, `nombre`, `precio`, `codigo`, `imagen`) VALUES
(1, 'Manzana', 15, 'A01', 'imgs/manzana.jpg'),
(2, 'Naranja', 18, 'A02', 'imgs/naranja.jpg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `fruta`
--
ALTER TABLE `fruta`
  ADD PRIMARY KEY (`id_fruta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `fruta`
--
ALTER TABLE `fruta`
  MODIFY `id_fruta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Base de datos: `sitio_web`
--
CREATE DATABASE IF NOT EXISTS `sitio_web` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `sitio_web`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL,
  `categoria` varchar(45) NOT NULL,
  `imagen` varchar(100) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `categoria`, `imagen`, `precio`, `descripcion`) VALUES
(1, 'Lenguajes de programacion', 'img/lenguajes.png\r\n', 1500, 'Aprende los fundamentos de los lenguajes de programación más populares y potencia tu capacidad para desarrollar software de calidad de manera efectiva.'),
(2, 'Base de datos', 'img/lenguajes.png', 6500, 'Descubre cómo diseñar y administrar bases de datos eficientes para almacenar, organizar y gestionar grandes volúmenes de información de manera segura y confiable.'),
(3, 'Diseño web', 'img/web.jpg', 1690, 'Sumergite en el mundo del diseño web y aprende a crear sitios web atractivos y funcionales utilizando las últimas tecnologías y tendencias en diseño y desarrollo web.'),
(4, 'Computacion en la nube', 'img/database.png', 4950, 'Explora los fundamentos de la computación en la nube y adquiere habilidades prácticas para implementar, gestionar y asegurar servicios en la nube, aprovechando la escalabilidad y flexibilidad que ofrece esta tecnología.'),
(5, 'Arquitectura de sistemas', 'img/cloud.jpg', 7900, 'Conviértete en un experto en arquitectura de sistemas y aprende a diseñar soluciones tecnológicas sólidas y escalables que cumplan con los requisitos de rendimiento, seguridad y disponibilidad.'),
(6, 'Analisis funcional', 'img/audit.jpg', 5500, 'Desarrolla habilidades en análisis funcional de sistemas y mejora tu capacidad para comprender, documentar y especificar los requisitos y funcionalidades de un sistema de software, garantizando su correcta implementación.');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- Base de datos: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `test`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID` int(8) UNSIGNED NOT NULL,
  `NOMBRE` varchar(100) DEFAULT NULL,
  `APELLIDO` varchar(100) DEFAULT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `CLAVE` varchar(100) DEFAULT NULL,
  `NIVEL` varchar(100) DEFAULT NULL,
  `FECHA_ALTA` datetime DEFAULT NULL,
  `ESTADO` enum('activo','banneado') NOT NULL DEFAULT 'activo'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID`, `NOMBRE`, `APELLIDO`, `EMAIL`, `CLAVE`, `NIVEL`, `FECHA_ALTA`, `ESTADO`) VALUES
(1, 'Bautista', 'Carloni', 'gr@dv.com', '81dc9bdb52d04dc20036dbd8313ed055', 'Admin', '2014-11-06 21:35:46', 'activo'),
(2, NULL, NULL, 'facu@dv.net', '81dc9bdb52d04dc20036dbd8313ed055', 'usuario', NULL, 'activo'),
(3, NULL, NULL, 'facu2@dv.net', '81dc9bdb52d04dc20036dbd8313ed055', 'usuario', '2014-11-06 21:41:12', 'activo'),
(4, NULL, NULL, 'asdadasd@asdasd', '81dc9bdb52d04dc20036dbd8313ed055', 'usuario', '2014-11-06 21:50:21', 'banneado'),
(6, NULL, NULL, 'a@email.com', '81dc9bdb52d04dc20036dbd8313ed055', 'usuario', '2014-11-06 22:03:47', 'activo'),
(11, 'seba', 'lopez', 'seba@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'usuario', '2022-11-22 10:45:21', 'activo'),
(12, 'pepe', 'pipo', 'pepe@alta.com', 'c33367701511b4f6020ec61ded352059', 'usuario', '2022-12-04 17:15:20', 'activo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `sdfsdfsdfdsfdsf` (`EMAIL`) USING BTREE;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(8) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- Base de datos: `test_sitioweb`
--
CREATE DATABASE IF NOT EXISTS `test_sitioweb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `test_sitioweb`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(45) DEFAULT NULL,
  `APELLIDO` varchar(45) DEFAULT NULL,
  `EMAIL` varchar(45) DEFAULT NULL,
  `CLAVE` varchar(45) DEFAULT NULL,
  `NIVEL` varchar(45) DEFAULT NULL,
  `FECHA_ALTA` date DEFAULT NULL,
  `ESTADO` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID`, `NOMBRE`, `APELLIDO`, `EMAIL`, `CLAVE`, `NIVEL`, `FECHA_ALTA`, `ESTADO`) VALUES
(1, 'seba', 'lopez', 'seba@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'Admin', NULL, 'activo'),
(39, 'pepe', 'pig', 'pepe@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'usuario', '2023-04-14', 'activo'),
(40, 'pepe', 'pipo', 'seba@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'usuario', '2023-04-14', NULL),
(41, 'Prog_Java', 'saldaño', 'seba@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'usuario', '2023-04-14', NULL),
(42, 'sql', 'dfd', 'seba@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'usuario', '2023-04-14', NULL),
(43, 'fdf', 'saldaño', 'seba@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'usuario', '2023-04-14', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;
--
-- Base de datos: `tienda`
--
CREATE DATABASE IF NOT EXISTS `tienda` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `tienda`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fabricante`
--

CREATE TABLE `fabricante` (
  `codigo` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `fabricante`
--

INSERT INTO `fabricante` (`codigo`, `nombre`) VALUES
(1, 'Asus'),
(2, 'Lenovo'),
(3, 'Hewlett-Packard'),
(4, 'Samsung'),
(5, 'Seagate'),
(6, 'Crucial'),
(7, 'Gigabyte'),
(8, 'Huawei'),
(9, 'Xiaomi');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `codigo` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `precio` double NOT NULL,
  `codigo_fabricante` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codigo`, `nombre`, `precio`, `codigo_fabricante`) VALUES
(1, 'Disco duro SATA3 1TB', 86.99, 5),
(2, 'Memoria RAM DDR4 8GB', 120, 6),
(3, 'Disco SSD 1 TB', 150.99, 4),
(4, 'GeForce GTX 1050Ti', 185, 7),
(5, 'GeForce GTX 1080 Xtreme', 755, 6),
(6, 'Monitor 24 LED Full HD', 202, 1),
(7, 'Monitor 27 LED Full HD', 245.99, 1),
(8, 'Portátil Yoga 520', 559, 2),
(9, 'Portátil Ideapd 320', 444, 2),
(10, 'Impresora HP Deskjet 3720', 59.99, 3),
(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `fabricante`
--
ALTER TABLE `fabricante`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codigo_fabricante` (`codigo_fabricante`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `fabricante`
--
ALTER TABLE `fabricante`
  MODIFY `codigo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `codigo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`codigo_fabricante`) REFERENCES `fabricante` (`codigo`);
--
-- Base de datos: `universidad`
--
CREATE DATABASE IF NOT EXISTS `universidad` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `universidad`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `id` int(10) UNSIGNED NOT NULL,
  `nif` varchar(9) DEFAULT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) DEFAULT NULL,
  `ciudad` varchar(25) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `fecha_nacimiento` date NOT NULL,
  `sexo` enum('H','M') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`id`, `nif`, `nombre`, `apellido1`, `apellido2`, `ciudad`, `direccion`, `telefono`, `fecha_nacimiento`, `sexo`) VALUES
(1, '89542419S', 'Juan', 'Saez', 'Vega', 'Almería', 'C/ Mercurio', '618253876', '1992-08-08', 'H'),
(2, '26902806M', 'Salvador', 'Sánchez', 'Pérez', 'Almería', 'C/ Real del barrio alto', '950254837', '1991-03-28', 'H'),
(4, '17105885A', 'Pedro', 'Heller', 'Pagac', 'Almería', 'C/ Estrella fugaz', NULL, '2000-10-05', 'H'),
(6, '04233869Y', 'José', 'Koss', 'Bayer', 'Almería', 'C/ Júpiter', '628349590', '1998-01-28', 'H'),
(7, '97258166K', 'Ismael', 'Strosin', 'Turcotte', 'Almería', 'C/ Neptuno', NULL, '1999-05-24', 'H'),
(9, '82842571K', 'Ramón', 'Herzog', 'Tremblay', 'Almería', 'C/ Urano', '626351429', '1996-11-21', 'H'),
(11, '46900725E', 'Daniel', 'Herman', 'Pacocha', 'Almería', 'C/ Andarax', '679837625', '1997-04-26', 'H'),
(19, '11578526G', 'Inma', 'Lakin', 'Yundt', 'Almería', 'C/ Picos de Europa', '678652431', '1998-09-01', 'M'),
(21, '79089577Y', 'Juan', 'Gutiérrez', 'López', 'Almería', 'C/ Los pinos', '678652431', '1998-01-01', 'H'),
(22, '41491230N', 'Antonio', 'Domínguez', 'Guerrero', 'Almería', 'C/ Cabo de Gata', '626652498', '1999-02-11', 'H'),
(23, '64753215G', 'Irene', 'Hernández', 'Martínez', 'Almería', 'C/ Zapillo', '628452384', '1996-03-12', 'M'),
(24, '85135690V', 'Sonia', 'Gea', 'Ruiz', 'Almería', 'C/ Mercurio', '678812017', '1995-04-13', 'M');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno_se_matricula_asignatura`
--

CREATE TABLE `alumno_se_matricula_asignatura` (
  `id_alumno` int(10) UNSIGNED NOT NULL,
  `id_asignatura` int(10) UNSIGNED NOT NULL,
  `id_curso_escolar` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumno_se_matricula_asignatura`
--

INSERT INTO `alumno_se_matricula_asignatura` (`id_alumno`, `id_asignatura`, `id_curso_escolar`) VALUES
(1, 1, 1),
(1, 1, 2),
(1, 1, 3),
(1, 1, 4),
(1, 2, 1),
(1, 2, 2),
(1, 2, 3),
(1, 2, 4),
(1, 3, 1),
(1, 3, 2),
(1, 3, 3),
(1, 3, 4),
(1, 4, 1),
(1, 5, 1),
(1, 6, 1),
(1, 7, 1),
(1, 8, 1),
(1, 9, 1),
(1, 10, 1),
(2, 1, 1),
(2, 2, 1),
(2, 3, 1),
(4, 1, 1),
(4, 1, 2),
(4, 2, 1),
(4, 2, 2),
(4, 3, 1),
(4, 3, 2),
(4, 4, 2),
(4, 5, 2),
(4, 6, 2),
(4, 7, 2),
(4, 8, 2),
(4, 9, 2),
(4, 10, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignatura`
--

CREATE TABLE `asignatura` (
  `id` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `creditos` float UNSIGNED NOT NULL,
  `tipo` enum('básica','obligatoria','optativa') NOT NULL,
  `curso` tinyint(3) UNSIGNED NOT NULL,
  `cuatrimestre` tinyint(3) UNSIGNED NOT NULL,
  `id_profesor` int(10) UNSIGNED DEFAULT NULL,
  `id_grado` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `asignatura`
--

INSERT INTO `asignatura` (`id`, `nombre`, `creditos`, `tipo`, `curso`, `cuatrimestre`, `id_profesor`, `id_grado`) VALUES
(1, 'Álgegra lineal y matemática discreta', 6, 'básica', 1, 1, NULL, 4),
(2, 'Cálculo', 6, 'básica', 1, 1, NULL, 4),
(3, 'Física para informática', 6, 'básica', 1, 1, NULL, 4),
(4, 'Introducción a la programación', 6, 'básica', 1, 1, NULL, 4),
(5, 'Organización y gestión de empresas', 6, 'básica', 1, 1, NULL, 4),
(6, 'Estadística', 6, 'básica', 1, 2, NULL, 4),
(7, 'Estructura y tecnología de computadores', 6, 'básica', 1, 2, NULL, 4),
(8, 'Fundamentos de electrónica', 6, 'básica', 1, 2, NULL, 4),
(9, 'Lógica y algorítmica', 6, 'básica', 1, 2, NULL, 4),
(10, 'Metodología de la programación', 6, 'básica', 1, 2, NULL, 4),
(11, 'Arquitectura de Computadores', 6, 'básica', 2, 1, 3, 4),
(12, 'Estructura de Datos y Algoritmos I', 6, 'obligatoria', 2, 1, 3, 4),
(13, 'Ingeniería del Software', 6, 'obligatoria', 2, 1, 14, 4),
(14, 'Sistemas Inteligentes', 6, 'obligatoria', 2, 1, 3, 4),
(15, 'Sistemas Operativos', 6, 'obligatoria', 2, 1, 14, 4),
(16, 'Bases de Datos', 6, 'básica', 2, 2, 14, 4),
(17, 'Estructura de Datos y Algoritmos II', 6, 'obligatoria', 2, 2, 14, 4),
(18, 'Fundamentos de Redes de Computadores', 6, 'obligatoria', 2, 2, 3, 4),
(19, 'Planificación y Gestión de Proyectos Informáticos', 6, 'obligatoria', 2, 2, 3, 4),
(20, 'Programación de Servicios Software', 6, 'obligatoria', 2, 2, 14, 4),
(21, 'Desarrollo de interfaces de usuario', 6, 'obligatoria', 3, 1, 14, 4),
(22, 'Ingeniería de Requisitos', 6, 'optativa', 3, 1, NULL, 4),
(23, 'Integración de las Tecnologías de la Información en las Organizaciones', 6, 'optativa', 3, 1, NULL, 4),
(24, 'Modelado y Diseño del Software 1', 6, 'optativa', 3, 1, NULL, 4),
(25, 'Multiprocesadores', 6, 'optativa', 3, 1, NULL, 4),
(26, 'Seguridad y cumplimiento normativo', 6, 'optativa', 3, 1, NULL, 4),
(27, 'Sistema de Información para las Organizaciones', 6, 'optativa', 3, 1, NULL, 4),
(28, 'Tecnologías web', 6, 'optativa', 3, 1, NULL, 4),
(29, 'Teoría de códigos y criptografía', 6, 'optativa', 3, 1, NULL, 4),
(30, 'Administración de bases de datos', 6, 'optativa', 3, 2, NULL, 4),
(31, 'Herramientas y Métodos de Ingeniería del Software', 6, 'optativa', 3, 2, NULL, 4),
(32, 'Informática industrial y robótica', 6, 'optativa', 3, 2, NULL, 4),
(33, 'Ingeniería de Sistemas de Información', 6, 'optativa', 3, 2, NULL, 4),
(34, 'Modelado y Diseño del Software 2', 6, 'optativa', 3, 2, NULL, 4),
(35, 'Negocio Electrónico', 6, 'optativa', 3, 2, NULL, 4),
(36, 'Periféricos e interfaces', 6, 'optativa', 3, 2, NULL, 4),
(37, 'Sistemas de tiempo real', 6, 'optativa', 3, 2, NULL, 4),
(38, 'Tecnologías de acceso a red', 6, 'optativa', 3, 2, NULL, 4),
(39, 'Tratamiento digital de imágenes', 6, 'optativa', 3, 2, NULL, 4),
(40, 'Administración de redes y sistemas operativos', 6, 'optativa', 4, 1, NULL, 4),
(41, 'Almacenes de Datos', 6, 'optativa', 4, 1, NULL, 4),
(42, 'Fiabilidad y Gestión de Riesgos', 6, 'optativa', 4, 1, NULL, 4),
(43, 'Líneas de Productos Software', 6, 'optativa', 4, 1, NULL, 4),
(44, 'Procesos de Ingeniería del Software 1', 6, 'optativa', 4, 1, NULL, 4),
(45, 'Tecnologías multimedia', 6, 'optativa', 4, 1, NULL, 4),
(46, 'Análisis y planificación de las TI', 6, 'optativa', 4, 2, NULL, 4),
(47, 'Desarrollo Rápido de Aplicaciones', 6, 'optativa', 4, 2, NULL, 4),
(48, 'Gestión de la Calidad y de la Innovación Tecnológica', 6, 'optativa', 4, 2, NULL, 4),
(49, 'Inteligencia del Negocio', 6, 'optativa', 4, 2, NULL, 4),
(50, 'Procesos de Ingeniería del Software 2', 6, 'optativa', 4, 2, NULL, 4),
(51, 'Seguridad Informática', 6, 'optativa', 4, 2, NULL, 4),
(52, 'Biologia celular', 6, 'básica', 1, 1, NULL, 7),
(53, 'Física', 6, 'básica', 1, 1, NULL, 7),
(54, 'Matemáticas I', 6, 'básica', 1, 1, NULL, 7),
(55, 'Química general', 6, 'básica', 1, 1, NULL, 7),
(56, 'Química orgánica', 6, 'básica', 1, 1, NULL, 7),
(57, 'Biología vegetal y animal', 6, 'básica', 1, 2, NULL, 7),
(58, 'Bioquímica', 6, 'básica', 1, 2, NULL, 7),
(59, 'Genética', 6, 'básica', 1, 2, NULL, 7),
(60, 'Matemáticas II', 6, 'básica', 1, 2, NULL, 7),
(61, 'Microbiología', 6, 'básica', 1, 2, NULL, 7),
(62, 'Botánica agrícola', 6, 'obligatoria', 2, 1, NULL, 7),
(63, 'Fisiología vegetal', 6, 'obligatoria', 2, 1, NULL, 7),
(64, 'Genética molecular', 6, 'obligatoria', 2, 1, NULL, 7),
(65, 'Ingeniería bioquímica', 6, 'obligatoria', 2, 1, NULL, 7),
(66, 'Termodinámica y cinética química aplicada', 6, 'obligatoria', 2, 1, NULL, 7),
(67, 'Biorreactores', 6, 'obligatoria', 2, 2, NULL, 7),
(68, 'Biotecnología microbiana', 6, 'obligatoria', 2, 2, NULL, 7),
(69, 'Ingeniería genética', 6, 'obligatoria', 2, 2, NULL, 7),
(70, 'Inmunología', 6, 'obligatoria', 2, 2, NULL, 7),
(71, 'Virología', 6, 'obligatoria', 2, 2, NULL, 7),
(72, 'Bases moleculares del desarrollo vegetal', 4.5, 'obligatoria', 3, 1, NULL, 7),
(73, 'Fisiología animal', 4.5, 'obligatoria', 3, 1, NULL, 7),
(74, 'Metabolismo y biosíntesis de biomoléculas', 6, 'obligatoria', 3, 1, NULL, 7),
(75, 'Operaciones de separación', 6, 'obligatoria', 3, 1, NULL, 7),
(76, 'Patología molecular de plantas', 4.5, 'obligatoria', 3, 1, NULL, 7),
(77, 'Técnicas instrumentales básicas', 4.5, 'obligatoria', 3, 1, NULL, 7),
(78, 'Bioinformática', 4.5, 'obligatoria', 3, 2, NULL, 7),
(79, 'Biotecnología de los productos hortofrutículas', 4.5, 'obligatoria', 3, 2, NULL, 7),
(80, 'Biotecnología vegetal', 6, 'obligatoria', 3, 2, NULL, 7),
(81, 'Genómica y proteómica', 4.5, 'obligatoria', 3, 2, NULL, 7),
(82, 'Procesos biotecnológicos', 6, 'obligatoria', 3, 2, NULL, 7),
(83, 'Técnicas instrumentales avanzadas', 4.5, 'obligatoria', 3, 2, NULL, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso_escolar`
--

CREATE TABLE `curso_escolar` (
  `id` int(10) UNSIGNED NOT NULL,
  `anyo_inicio` year(4) NOT NULL,
  `anyo_fin` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `curso_escolar`
--

INSERT INTO `curso_escolar` (`id`, `anyo_inicio`, `anyo_fin`) VALUES
(1, 2014, 2015),
(2, 2015, 2016),
(3, 2016, 2017),
(4, 2017, 2018);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `id` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`id`, `nombre`) VALUES
(1, 'Informática'),
(2, 'Matemáticas'),
(3, 'Economía y Empresa'),
(4, 'Educación'),
(5, 'Agronomía'),
(6, 'Química y Física'),
(7, 'Filología'),
(8, 'Derecho'),
(9, 'Biología y Geología');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grado`
--

CREATE TABLE `grado` (
  `id` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `grado`
--

INSERT INTO `grado` (`id`, `nombre`) VALUES
(1, 'Grado en Ingeniería Agrícola (Plan 2015)'),
(2, 'Grado en Ingeniería Eléctrica (Plan 2014)'),
(3, 'Grado en Ingeniería Electrónica Industrial (Plan 2010)'),
(4, 'Grado en Ingeniería Informática (Plan 2015)'),
(5, 'Grado en Ingeniería Mecánica (Plan 2010)'),
(6, 'Grado en Ingeniería Química Industrial (Plan 2010)'),
(7, 'Grado en Biotecnología (Plan 2015)'),
(8, 'Grado en Ciencias Ambientales (Plan 2009)'),
(9, 'Grado en Matemáticas (Plan 2010)'),
(10, 'Grado en Química (Plan 2009)');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `id` int(10) UNSIGNED NOT NULL,
  `nif` varchar(9) DEFAULT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) DEFAULT NULL,
  `ciudad` varchar(25) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `fecha_nacimiento` date NOT NULL,
  `sexo` enum('H','M') NOT NULL,
  `id_departamento` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`id`, `nif`, `nombre`, `apellido1`, `apellido2`, `ciudad`, `direccion`, `telefono`, `fecha_nacimiento`, `sexo`, `id_departamento`) VALUES
(3, '11105554G', 'Zoe', 'Ramirez', 'Gea', 'Almería', 'C/ Marte', '618223876', '1979-08-19', 'M', 1),
(5, '38223286T', 'David', 'Schmidt', 'Fisher', 'Almería', 'C/ Venus', '678516294', '1978-01-19', 'H', 2),
(8, '79503962T', 'Cristina', 'Lemke', 'Rutherford', 'Almería', 'C/ Saturno', '669162534', '1977-08-21', 'M', 3),
(10, '61142000L', 'Esther', 'Spencer', 'Lakin', 'Almería', 'C/ Plutón', NULL, '1977-05-19', 'M', 4),
(12, '85366986W', 'Carmen', 'Streich', 'Hirthe', 'Almería', 'C/ Almanzora', NULL, '1971-04-29', 'M', 4),
(13, '73571384L', 'Alfredo', 'Stiedemann', 'Morissette', 'Almería', 'C/ Guadalquivir', '950896725', '1980-02-01', 'H', 6),
(14, '82937751G', 'Manolo', 'Hamill', 'Kozey', 'Almería', 'C/ Duero', '950263514', '1977-01-02', 'H', 1),
(15, '80502866Z', 'Alejandro', 'Kohler', 'Schoen', 'Almería', 'C/ Tajo', '668726354', '1980-03-14', 'H', 2),
(16, '10485008K', 'Antonio', 'Fahey', 'Considine', 'Almería', 'C/ Sierra de los Filabres', NULL, '1982-03-18', 'H', 3),
(17, '85869555K', 'Guillermo', 'Ruecker', 'Upton', 'Almería', 'C/ Sierra de Gádor', NULL, '1973-05-05', 'H', 4),
(18, '04326833G', 'Micaela', 'Monahan', 'Murray', 'Almería', 'C/ Veleta', '662765413', '1976-02-25', 'H', 5),
(20, '79221403L', 'Francesca', 'Schowalter', 'Muller', 'Almería', 'C/ Quinto pino', NULL, '1980-10-31', 'H', 6),
(21, '13175769N', 'Pepe', 'Sánchez', 'Ruiz', 'Almería', 'C/ Quinto pino', NULL, '1980-10-16', 'H', 1),
(22, '98816696W', 'Juan', 'Guerrero', 'Martínez', 'Almería', 'C/ Quinto pino', NULL, '1980-11-21', 'H', 1),
(23, '77194445M', 'María', 'Domínguez', 'Hernández', 'Almería', 'C/ Quinto pino', NULL, '1980-12-13', 'M', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nif` (`nif`);

--
-- Indices de la tabla `alumno_se_matricula_asignatura`
--
ALTER TABLE `alumno_se_matricula_asignatura`
  ADD PRIMARY KEY (`id_alumno`,`id_asignatura`,`id_curso_escolar`),
  ADD KEY `id_asignatura` (`id_asignatura`),
  ADD KEY `id_curso_escolar` (`id_curso_escolar`);

--
-- Indices de la tabla `asignatura`
--
ALTER TABLE `asignatura`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_profesor` (`id_profesor`),
  ADD KEY `id_grado` (`id_grado`);

--
-- Indices de la tabla `curso_escolar`
--
ALTER TABLE `curso_escolar`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `grado`
--
ALTER TABLE `grado`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nif` (`nif`),
  ADD KEY `id_departamento` (`id_departamento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `asignatura`
--
ALTER TABLE `asignatura`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=84;

--
-- AUTO_INCREMENT de la tabla `curso_escolar`
--
ALTER TABLE `curso_escolar`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `departamento`
--
ALTER TABLE `departamento`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `grado`
--
ALTER TABLE `grado`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumno_se_matricula_asignatura`
--
ALTER TABLE `alumno_se_matricula_asignatura`
  ADD CONSTRAINT `alumno_se_matricula_asignatura_ibfk_1` FOREIGN KEY (`id_alumno`) REFERENCES `alumno` (`id`),
  ADD CONSTRAINT `alumno_se_matricula_asignatura_ibfk_2` FOREIGN KEY (`id_asignatura`) REFERENCES `asignatura` (`id`),
  ADD CONSTRAINT `alumno_se_matricula_asignatura_ibfk_3` FOREIGN KEY (`id_curso_escolar`) REFERENCES `curso_escolar` (`id`);

--
-- Filtros para la tabla `asignatura`
--
ALTER TABLE `asignatura`
  ADD CONSTRAINT `asignatura_ibfk_1` FOREIGN KEY (`id_profesor`) REFERENCES `profesor` (`id`),
  ADD CONSTRAINT `asignatura_ibfk_2` FOREIGN KEY (`id_grado`) REFERENCES `grado` (`id`);

--
-- Filtros para la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD CONSTRAINT `profesor_ibfk_1` FOREIGN KEY (`id_departamento`) REFERENCES `departamento` (`id`);
--
-- Base de datos: `viajes`
--
CREATE DATABASE IF NOT EXISTS `viajes` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `viajes`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chofer`
--

CREATE TABLE `chofer` (
  `id_chofer` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `chofer`
--

INSERT INTO `chofer` (`id_chofer`, `nombre`, `apellido`) VALUES
(1, 'Pablo', 'Tomu'),
(2, 'Miriam', 'Valle'),
(3, 'Daniel', 'Rojo'),
(4, 'Rosa', 'Perez'),
(5, 'Seba', 'Driver');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE `horario` (
  `id_horario` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `momento_dia` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `horario`
--

INSERT INTO `horario` (`id_horario`, `fecha`, `momento_dia`) VALUES
(1, '2020-10-22', 'Mañana'),
(2, '2020-10-22', 'Tarde'),
(3, '2020-10-22', 'Noche'),
(4, '2020-10-23', 'Mañana'),
(5, '2020-10-23', 'Tarde'),
(6, '2020-10-23', 'Noche');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `omnibus`
--

CREATE TABLE `omnibus` (
  `id_omnibus` int(11) NOT NULL,
  `asientos_ext` int(11) NOT NULL,
  `asientos_int` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `omnibus`
--

INSERT INTO `omnibus` (`id_omnibus`, `asientos_ext`, `asientos_int`) VALUES
(1, 20, 30),
(2, 15, 20),
(3, 20, 40),
(4, 20, 30);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recorrido`
--

CREATE TABLE `recorrido` (
  `id_recorrido` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `cant_paradas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `recorrido`
--

INSERT INTO `recorrido` (`id_recorrido`, `nombre`, `cant_paradas`) VALUES
(1, 'Puerto Madero', 6),
(2, 'Recoleta', 9),
(3, 'Boca', 4),
(4, 'Palermo', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viaje`
--

CREATE TABLE `viaje` (
  `id_viaje` int(11) NOT NULL,
  `id_omnibus` int(11) NOT NULL,
  `id_recorrido` int(11) NOT NULL,
  `id_horario` int(11) NOT NULL,
  `id_chofer` int(11) NOT NULL,
  `cant_reservas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `viaje`
--

INSERT INTO `viaje` (`id_viaje`, `id_omnibus`, `id_recorrido`, `id_horario`, `id_chofer`, `cant_reservas`) VALUES
(1, 1, 1, 1, 1, 50),
(2, 1, 1, 2, 1, 40),
(3, 1, 1, 3, 1, 60),
(4, 2, 2, 1, 2, 25),
(5, 2, 2, 2, 2, 20),
(6, 2, 2, 3, 2, 15),
(7, 3, 3, 1, 3, 10),
(8, 3, 3, 2, 3, 50),
(9, 3, 3, 3, 3, 70);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `chofer`
--
ALTER TABLE `chofer`
  ADD PRIMARY KEY (`id_chofer`);

--
-- Indices de la tabla `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`id_horario`);

--
-- Indices de la tabla `omnibus`
--
ALTER TABLE `omnibus`
  ADD PRIMARY KEY (`id_omnibus`);

--
-- Indices de la tabla `recorrido`
--
ALTER TABLE `recorrido`
  ADD PRIMARY KEY (`id_recorrido`);

--
-- Indices de la tabla `viaje`
--
ALTER TABLE `viaje`
  ADD PRIMARY KEY (`id_viaje`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `chofer`
--
ALTER TABLE `chofer`
  MODIFY `id_chofer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `horario`
--
ALTER TABLE `horario`
  MODIFY `id_horario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `omnibus`
--
ALTER TABLE `omnibus`
  MODIFY `id_omnibus` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `recorrido`
--
ALTER TABLE `recorrido`
  MODIFY `id_recorrido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `viaje`
--
ALTER TABLE `viaje`
  MODIFY `id_viaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
