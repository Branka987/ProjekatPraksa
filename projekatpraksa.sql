-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 08, 2021 at 12:39 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projekatpraksa`
--

-- --------------------------------------------------------

--
-- Table structure for table `korisnici`
--

CREATE TABLE `korisnici` (
  `ID` int(100) UNSIGNED NOT NULL,
  `ime` varchar(110) NOT NULL,
  `prezime` varchar(110) NOT NULL,
  `email` varchar(110) NOT NULL,
  `password` varchar(110) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `korisnici`
--

INSERT INTO `korisnici` (`ID`, `ime`, `prezime`, `email`, `password`) VALUES
(3, 'a', 'a', 'a', 'a'),
(6, 'a', 'a', 'b', 'a'),
(7, 'Branka', 'T', 'branka', 'branka'),
(8, 'Mici', 'Mici', 'm', 'mi'),
(9, 'Mihailo', 'Mihailo', 'mi', 'mii'),
(10, 'Mihailo', 'Mihailo', 'mi', 'miii'),
(11, 'Braa', 'brrr', 'bi', 'bi'),
(12, 'Nov Korisnik', 'Novajlija', 'n', 'n'),
(13, 'Nov', 'New', 'v', 'v'),
(14, 'B', 'Ba', 'ba', 'ba');

-- --------------------------------------------------------

--
-- Table structure for table `poruka`
--

CREATE TABLE `poruka` (
  `ID` int(100) NOT NULL,
  `idKorisnik` int(100) NOT NULL,
  `poruka` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `poruka`
--

INSERT INTO `poruka` (`ID`, `idKorisnik`, `poruka`) VALUES
(3, 7, 'Poruka od Branke: Cao!'),
(191, 9, 'Poruka od Mihaila'),
(194, 7, 'Cao svima'),
(195, 7, 'Poruka od Mihaila'),
(196, 14, 'Hello everybady!');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `korisnici`
--
ALTER TABLE `korisnici`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `poruka`
--
ALTER TABLE `poruka`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `korisnici`
--
ALTER TABLE `korisnici`
  MODIFY `ID` int(100) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `poruka`
--
ALTER TABLE `poruka`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=198;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
