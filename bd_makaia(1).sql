-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-02-2024 a las 23:34:45
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bd_makaia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aspirante`
--

CREATE TABLE IF NOT EXISTS `aspirante` (
`id` bigint(20) NOT NULL,
  `celular` bigint(20) NOT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `contacto_emergencia` bigint(20) DEFAULT NULL,
  `departamento` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `edad` bigint(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `email_emergencia` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` datetime(6) DEFAULT NULL,
  `nacionalidad` varchar(255) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `numero_documento` bigint(20) DEFAULT NULL,
  `ocupacion_si` varchar(255) DEFAULT NULL,
  `organizacion` varchar(255) DEFAULT NULL,
  `persona_emergencia` varchar(255) DEFAULT NULL,
  `tiempo_libre` varchar(255) DEFAULT NULL,
  `ultimo_titulo` varchar(255) DEFAULT NULL,
  `tipo_doc_id` bigint(20) NOT NULL,
  `bootcamp_info_id` bigint(20) NOT NULL,
  `discapacidad_id` bigint(20) NOT NULL,
  `genero_id` bigint(20) NOT NULL,
  `grupo_etnico_id` bigint(20) NOT NULL,
  `nivel_educacion_id` bigint(20) NOT NULL,
  `ocupacion_id` bigint(20) NOT NULL,
  `poblacion_id_id` bigint(20) NOT NULL,
  `salario_actual_id` bigint(20) NOT NULL,
  `entrenamiento_id` bigint(20) NOT NULL,
  `estrato_id` bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `aspirante`
--

INSERT INTO `aspirante` (`id`, `celular`, `ciudad`, `contacto_emergencia`, `departamento`, `direccion`, `edad`, `email`, `email_emergencia`, `fecha_nacimiento`, `nacionalidad`, `nombre`, `numero_documento`, `ocupacion_si`, `organizacion`, `persona_emergencia`, `tiempo_libre`, `ultimo_titulo`, `tipo_doc_id`, `bootcamp_info_id`, `discapacidad_id`, `genero_id`, `grupo_etnico_id`, `nivel_educacion_id`, `ocupacion_id`, `poblacion_id_id`, `salario_actual_id`, `entrenamiento_id`, `estrato_id`) VALUES
(1, 321, 'Cucaita', 311, 'Boyacá', 'cll 7', 24, 'ex@example.com', 'ex@example.com', '1999-06-08 19:00:00.000000', 'Colombia', 'prueba ', 1234, '', '', 'Edisson', 'Estudiando', 'Tec', 1, 3, 1, 2, 1, 5, 1, 6, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `botcamp_info`
--

CREATE TABLE IF NOT EXISTS `botcamp_info` (
`id` bigint(20) NOT NULL,
  `descripcion` varchar(70) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `botcamp_info`
--

INSERT INTO `botcamp_info` (`id`, `descripcion`) VALUES
(1, 'Redes Sociales'),
(2, 'Linkedin'),
(3, 'Me lo recomendó un amigo o amiga'),
(4, 'A través de la fundación Haceb'),
(5, 'A través de la fundación Fraternidad Medellin'),
(6, 'A través de Parceros por Bogotá'),
(7, 'A través de SDMujer'),
(8, 'A través de la fundación Otero Lievano '),
(9, 'A través de la fundación tiempo de juego'),
(10, 'A través de RedInncol'),
(11, 'A través de otra Organización o Institución'),
(12, 'A través de un correo electrónico '),
(13, 'A través de un evento del Bootcamp'),
(14, 'Me lo recomendó un familiar'),
(15, 'A través de la Gerencia de Diversidades Sexuales e Identidad de Genero'),
(16, 'Fundación Columbus School'),
(17, 'Fundación Juanfe'),
(18, 'A través de ruta N');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `discapacidad`
--

CREATE TABLE IF NOT EXISTS `discapacidad` (
`id` bigint(20) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `discapacidad`
--

INSERT INTO `discapacidad` (`id`, `descripcion`) VALUES
(1, 'Ninguna'),
(2, 'Fisica'),
(3, 'Auditiva'),
(4, 'Visual'),
(5, 'Intelectual '),
(6, 'Psicosocial'),
(7, 'Multiple');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenamiento`
--

CREATE TABLE IF NOT EXISTS `entrenamiento` (
`id` bigint(20) NOT NULL,
  `formacion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `entrenamiento`
--

INSERT INTO `entrenamiento` (`id`, `formacion`) VALUES
(1, 'Desarrollo Web Back End'),
(2, 'Desarrollo Web Front End'),
(3, 'Analisis de Datos'),
(4, 'Cloud');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estrato`
--

CREATE TABLE IF NOT EXISTS `estrato` (
`id` bigint(20) NOT NULL,
  `num_estrato` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estrato`
--

INSERT INTO `estrato` (`id`, `num_estrato`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero`
--

CREATE TABLE IF NOT EXISTS `genero` (
`id` bigint(20) NOT NULL,
  `descripcion` varchar(30) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`id`, `descripcion`) VALUES
(1, 'Mujer'),
(2, 'Hombre'),
(3, 'Otro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo_etnico`
--

CREATE TABLE IF NOT EXISTS `grupo_etnico` (
`id` bigint(20) NOT NULL,
  `descripcion` varchar(70) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `grupo_etnico`
--

INSERT INTO `grupo_etnico` (`id`, `descripcion`) VALUES
(1, 'Ningún Grupo Étnico '),
(2, 'Indígena'),
(3, 'Gitano(a) o Rrom'),
(4, 'Raizal '),
(5, 'Palenquero(a) '),
(6, 'Negro(a), Mulato(a), Afrodescendiente, Afrocolombiano(a)');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nivel_educacion`
--

CREATE TABLE IF NOT EXISTS `nivel_educacion` (
`id` bigint(20) NOT NULL,
  `descripcion` varchar(70) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `nivel_educacion`
--

INSERT INTO `nivel_educacion` (`id`, `descripcion`) VALUES
(1, 'Primaria'),
(2, 'Bachillerato'),
(3, 'Técnica '),
(4, 'Tecnología '),
(5, 'Pregrado '),
(6, 'Posgrado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ocupacion`
--

CREATE TABLE IF NOT EXISTS `ocupacion` (
`id` bigint(20) NOT NULL,
  `descripcion` varchar(70) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ocupacion`
--

INSERT INTO `ocupacion` (`id`, `descripcion`) VALUES
(1, 'No estudio ni trabajo'),
(2, 'Estudio'),
(3, 'Trabajo de manera formal'),
(4, 'Trabajo de manera informal'),
(5, 'Soy cuidador o cuidadora');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `poblacionid`
--

CREATE TABLE IF NOT EXISTS `poblacionid` (
`id` bigint(20) NOT NULL,
  `descripcion` varchar(70) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `poblacionid`
--

INSERT INTO `poblacionid` (`id`, `descripcion`) VALUES
(1, 'Desplazado'),
(2, 'Discapacidad'),
(3, 'LGTBQ+'),
(4, 'Migrante'),
(5, 'Victima del conflicto'),
(6, 'Ninguna de las anteriores');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE IF NOT EXISTS `roles` (
`id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`id`, `descripcion`) VALUES
(1, 'Programador'),
(2, 'Reclutador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salario_actual`
--

CREATE TABLE IF NOT EXISTS `salario_actual` (
`id` bigint(20) NOT NULL,
  `rango_salarial` varchar(70) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `salario_actual`
--

INSERT INTO `salario_actual` (`id`, `rango_salarial`) VALUES
(1, 'No aplica'),
(2, 'Menos de un salario mínimo '),
(3, 'Un salario mínimo '),
(4, 'Más de un salario mínimo'),
(5, 'Dos o más salarios mínimos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_doc`
--

CREATE TABLE IF NOT EXISTS `tipo_doc` (
`id` bigint(20) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_doc`
--

INSERT INTO `tipo_doc` (`id`, `descripcion`) VALUES
(1, 'Cedula de Ciudadania Colombiana'),
(2, 'Tarjeta de Identidad Colombiana'),
(3, 'Cédula de Identidad Venezolana'),
(4, 'PPT(Permiso por Protección Temporal)'),
(5, 'PEP(Permiso Especial de Permanencia)'),
(6, 'Cédula de Extranjería');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
`id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `rol_id` bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `email`, `password`, `rol_id`) VALUES
(1, 'admin@admin.com', '$2a$08$GltUqwUCMhSUmkiygJx90Oywipozja6r8WfpnbzcikqljDU21SRQq', 1),
(2, 'admin2@admin.com', '$2a$08$LEBW80XBe8KHj71gKwnbe.fPVY5K192HR60VK6.porerz74oXjAoe', 1),
(3, 'david@admin.com', '$2a$08$mqhWMf.JhO7xLUrkQdh3xuSUwZNbcWaCpkqH79rpebSMTa0apu18G', 2),
(4, 'david@gmail.com', '$2a$08$f7qoYj9FW3iIizcdUAj.ju1d2cfPiX0h7FHdigu4Wc2D00uc7iPkC', 1),
(5, 'fabian@admin.com', '$2a$08$gLcTBK9FWJVioKB6zP3SnuEAWdnAJ.nP1MPmfx7oyzyKM8JuqeGSK', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aspirante`
--
ALTER TABLE `aspirante`
 ADD PRIMARY KEY (`id`), ADD KEY `FKlyhkfg0rvrfporw17xdsbugq4` (`tipo_doc_id`), ADD KEY `FKldo9uvahhc4n1guoy3ujxnw82` (`bootcamp_info_id`), ADD KEY `FKhvr0lidwr3nwmmq0ypeh4n70u` (`discapacidad_id`), ADD KEY `FK3hnql0okrhf63p8cnyh2xj5hr` (`genero_id`), ADD KEY `FK47s3juesclmxc3phdtorlowd4` (`grupo_etnico_id`), ADD KEY `FKnaribppbpc2vtj5lrcu527je2` (`nivel_educacion_id`), ADD KEY `FKe1vfvlfkp8ts0lgud2aar9ni7` (`ocupacion_id`), ADD KEY `FKotjoovr7xi2ahebx7t5oftkas` (`poblacion_id_id`), ADD KEY `FKn08xs01ny3vdg7lqpk1wylua9` (`salario_actual_id`), ADD KEY `FK5lpd22mt5tu9tge2g16d8sx0g` (`entrenamiento_id`), ADD KEY `FK22edp8m0fciidvtvcuf0jd12j` (`estrato_id`);

--
-- Indices de la tabla `botcamp_info`
--
ALTER TABLE `botcamp_info`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `discapacidad`
--
ALTER TABLE `discapacidad`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `entrenamiento`
--
ALTER TABLE `entrenamiento`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `estrato`
--
ALTER TABLE `estrato`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `genero`
--
ALTER TABLE `genero`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `grupo_etnico`
--
ALTER TABLE `grupo_etnico`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `nivel_educacion`
--
ALTER TABLE `nivel_educacion`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ocupacion`
--
ALTER TABLE `ocupacion`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `poblacionid`
--
ALTER TABLE `poblacionid`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `salario_actual`
--
ALTER TABLE `salario_actual`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipo_doc`
--
ALTER TABLE `tipo_doc`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
 ADD PRIMARY KEY (`id`), ADD KEY `FKehtf9w9752mgyxuamu1649laq` (`rol_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `aspirante`
--
ALTER TABLE `aspirante`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `botcamp_info`
--
ALTER TABLE `botcamp_info`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT de la tabla `discapacidad`
--
ALTER TABLE `discapacidad`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `entrenamiento`
--
ALTER TABLE `entrenamiento`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `estrato`
--
ALTER TABLE `estrato`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `genero`
--
ALTER TABLE `genero`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `grupo_etnico`
--
ALTER TABLE `grupo_etnico`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `nivel_educacion`
--
ALTER TABLE `nivel_educacion`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `ocupacion`
--
ALTER TABLE `ocupacion`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `poblacionid`
--
ALTER TABLE `poblacionid`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `roles`
--
ALTER TABLE `roles`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `salario_actual`
--
ALTER TABLE `salario_actual`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `tipo_doc`
--
ALTER TABLE `tipo_doc`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `aspirante`
--
ALTER TABLE `aspirante`
ADD CONSTRAINT `FK22edp8m0fciidvtvcuf0jd12j` FOREIGN KEY (`estrato_id`) REFERENCES `estrato` (`id`),
ADD CONSTRAINT `FK3hnql0okrhf63p8cnyh2xj5hr` FOREIGN KEY (`genero_id`) REFERENCES `genero` (`id`),
ADD CONSTRAINT `FK47s3juesclmxc3phdtorlowd4` FOREIGN KEY (`grupo_etnico_id`) REFERENCES `grupo_etnico` (`id`),
ADD CONSTRAINT `FK5lpd22mt5tu9tge2g16d8sx0g` FOREIGN KEY (`entrenamiento_id`) REFERENCES `entrenamiento` (`id`),
ADD CONSTRAINT `FKe1vfvlfkp8ts0lgud2aar9ni7` FOREIGN KEY (`ocupacion_id`) REFERENCES `ocupacion` (`id`),
ADD CONSTRAINT `FKhvr0lidwr3nwmmq0ypeh4n70u` FOREIGN KEY (`discapacidad_id`) REFERENCES `discapacidad` (`id`),
ADD CONSTRAINT `FKldo9uvahhc4n1guoy3ujxnw82` FOREIGN KEY (`bootcamp_info_id`) REFERENCES `botcamp_info` (`id`),
ADD CONSTRAINT `FKlyhkfg0rvrfporw17xdsbugq4` FOREIGN KEY (`tipo_doc_id`) REFERENCES `tipo_doc` (`id`),
ADD CONSTRAINT `FKn08xs01ny3vdg7lqpk1wylua9` FOREIGN KEY (`salario_actual_id`) REFERENCES `salario_actual` (`id`),
ADD CONSTRAINT `FKnaribppbpc2vtj5lrcu527je2` FOREIGN KEY (`nivel_educacion_id`) REFERENCES `nivel_educacion` (`id`),
ADD CONSTRAINT `FKotjoovr7xi2ahebx7t5oftkas` FOREIGN KEY (`poblacion_id_id`) REFERENCES `poblacionid` (`id`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
ADD CONSTRAINT `FKehtf9w9752mgyxuamu1649laq` FOREIGN KEY (`rol_id`) REFERENCES `roles` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
