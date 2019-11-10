-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 20, 2018 at 01:38 AM
-- Server version: 5.7.23-0ubuntu0.18.04.1
-- PHP Version: 7.2.7-0ubuntu0.18.04.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Pharmacy`
--

-- --------------------------------------------------------

--
-- Table structure for table `activirylog`
--

CREATE TABLE `activirylog` (
  `name` varchar(30) NOT NULL,
  `date and time` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `activirylog`
--

INSERT INTO `activirylog` (`name`, `date and time`) VALUES
('alaaEbeed', '18/10/2018 21:40:41'),
('alaaebeed', '18/10/2018 23:14:45'),
('alaaebeed', '18/10/2018 23:15:14'),
('alaaebeed', '19/10/2018 04:38:58'),
('alaaebeed', '19/10/2018 17:53:23'),
('alaaebeed', '19/10/2018 17:56:09'),
('alaaebeed', '19/10/2018 20:25:14'),
('alaaebeed', '19/10/2018 20:31:02'),
('alaaebeed', '19/10/2018 20:44:46'),
('alaaebeed', '19/10/2018 21:21:22'),
('alaaebeed', '19/10/2018 23:57:23'),
('alaaebeed', '19/10/2018 23:59:01'),
('alaaebeed', '20/10/2018 00:05:54'),
('alaaebeed', '20/10/2018 00:22:55');

-- --------------------------------------------------------

--
-- Table structure for table `Bill`
--

CREATE TABLE `Bill` (
  `id` int(11) NOT NULL,
  `cureCode` int(20) NOT NULL,
  `cureName` varchar(20) NOT NULL,
  `amount` int(20) NOT NULL,
  `rPrice` int(20) NOT NULL,
  `tPrice` int(20) NOT NULL,
  `date` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Bill`
--

INSERT INTO `Bill` (`id`, `cureCode`, `cureName`, `amount`, `rPrice`, `tPrice`, `date`) VALUES
(12, 321, 'antiflu', 60, 23, 24, '20/10/2018 00:26:15'),
(13, 123, 'florest', 7, 19, 20, '20/10/2018 00:26:39');

-- --------------------------------------------------------

--
-- Table structure for table `CureInfo`
--

CREATE TABLE `CureInfo` (
  `code` int(20) NOT NULL,
  `cureName` varchar(50) NOT NULL,
  `companyName` varchar(50) NOT NULL,
  `distributerName` varchar(50) NOT NULL,
  `distributerNumber` int(10) NOT NULL,
  `amount` int(10) NOT NULL,
  `tabsNumber` int(10) NOT NULL,
  `expireDate` date NOT NULL,
  `retialPrice` int(20) NOT NULL,
  `totalPrice` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `CureInfo`
--

INSERT INTO `CureInfo` (`code`, `cureName`, `companyName`, `distributerName`, `distributerNumber`, `amount`, `tabsNumber`, `expireDate`, `retialPrice`, `totalPrice`) VALUES
(123, 'florest', 'farmaco', 'adam', 10001001, 20, 7, '2018-10-19', 19, 20),
(321, 'antiflu', 'pharmaco', 'nadeen', 1000434, 0, 0, '1970-01-01', 23, 24);

-- --------------------------------------------------------

--
-- Table structure for table `salesReview`
--

CREATE TABLE `salesReview` (
  `cureCode` int(11) NOT NULL,
  `cureName` varchar(20) NOT NULL,
  `amount` int(20) NOT NULL,
  `rPrice` int(20) NOT NULL,
  `tPrice` int(20) NOT NULL,
  `date` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salesReview`
--

INSERT INTO `salesReview` (`cureCode`, `cureName`, `amount`, `rPrice`, `tPrice`, `date`) VALUES
(321, 'antiflu', -6, 23, 24, '19/10/2018 18:17:55'),
(123, 'florest', 95, 19, 20, '19/10/2018 18:36:23'),
(123, 'florest', 0, 19, 20, '19/10/2018 18:45:46'),
(321, 'antiflu', 0, 23, 24, '19/10/2018 18:45:52'),
(321, 'antiflu', 0, 23, 24, '19/10/2018 18:45:57'),
(321, 'antiflu', 0, 23, 24, '19/10/2018 18:45:59'),
(123, 'florest', 0, 19, 20, '19/10/2018 23:59:41'),
(321, 'antiflu', 0, 23, 24, '19/10/2018 23:59:49'),
(123, 'florest', 1, 19, 20, '20/10/2018 00:00:08'),
(321, 'florest', 1, 19, 20, '20/10/2018 00:00:17'),
(321, 'florest', 1, 19, 20, '20/10/2018 00:00:21'),
(321, 'antiflu', 2, 23, 24, '20/10/2018 00:00:39'),
(123, 'florest', 1, 19, 20, '20/10/2018 00:00:53'),
(321, 'antiflu', 1, 23, 24, '20/10/2018 00:01:09'),
(123, 'florest', 1, 19, 20, '20/10/2018 00:01:18'),
(1231, 'florest', 1, 19, 20, '20/10/2018 00:25:57'),
(1231, 'florest', 1, 19, 20, '20/10/2018 00:26:03'),
(321, 'antiflu', 60, 23, 24, '20/10/2018 00:26:15'),
(123, 'florest', 7, 19, 20, '20/10/2018 00:26:39');

-- --------------------------------------------------------

--
-- Table structure for table `Users`
--

CREATE TABLE `Users` (
  `id` int(30) NOT NULL,
  `firstName` varchar(60) NOT NULL,
  `lastName` varchar(60) NOT NULL,
  `userName` varchar(60) NOT NULL,
  `psswd` varchar(60) NOT NULL,
  `phoneNumber` int(60) NOT NULL,
  `personalId` int(60) NOT NULL,
  `address` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Users`
--

INSERT INTO `Users` (`id`, `firstName`, `lastName`, `userName`, `psswd`, `phoneNumber`, `personalId`, `address`) VALUES
(2, 'Alaa', 'ebeed', 'alaaEbeed', 'abc123', 1001102, 321312, 'fasal '),
(9, 'Alaa', 'ebeed', 'alaaEbeed', '123', 321312, 321321, 'fsdafsd'),
(10, 'alaa', 'Fares', 'AlaaFares', '123', 1001932723, 213543534, 'Alharam ST');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Bill`
--
ALTER TABLE `Bill`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `CureInfo`
--
ALTER TABLE `CureInfo`
  ADD PRIMARY KEY (`code`),
  ADD UNIQUE KEY `code` (`code`);

--
-- Indexes for table `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Bill`
--
ALTER TABLE `Bill`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `Users`
--
ALTER TABLE `Users`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
