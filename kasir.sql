-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 01, 2021 at 04:16 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `nama`, `username`, `password`) VALUES
(1, 'admin', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `detail_transaction`
--

CREATE TABLE `detail_transaction` (
  `kode_tr` char(8) NOT NULL,
  `unm_user` varchar(25) DEFAULT NULL,
  `unm_client` varchar(32) NOT NULL,
  `amount` int(8) DEFAULT NULL,
  `payment` int(8) DEFAULT NULL,
  `cashback` int(8) DEFAULT NULL,
  `dt` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_transaction`
--

INSERT INTO `detail_transaction` (`kode_tr`, `unm_user`, `unm_client`, `amount`, `payment`, `cashback`, `dt`) VALUES
('KT001', 'admin', 'Duri', 9000, 20900, 11900, '2021-07-01'),
('KT002', 'admin', 'Gud Dog', 4000, 150000, 146000, '2021-07-01'),
('KT003', 'admin', 'asd', 6000, 500000, 494000, '2021-07-01');

-- --------------------------------------------------------

--
-- Table structure for table `ms_food`
--

CREATE TABLE `ms_food` (
  `id_food` char(5) NOT NULL,
  `nm_food` varchar(35) NOT NULL,
  `ktgry_food` varchar(10) NOT NULL,
  `prc_food` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ms_food`
--

INSERT INTO `ms_food` (`id_food`, `nm_food`, `ktgry_food`, `prc_food`) VALUES
('IF001', 'Rujak Cingur', 'Dessert', 5000),
('IF002', 'Es Teh', 'Drink', 1000),
('IF003', 'Ote Ote', 'Snack', 1000),
('IF005', 'Nasi Goreng', 'Food', 4000),
('IF008', 'Teh Hangat', 'Drink', 2000),
('IF009', 'Jeruk Hangat', 'Drink', 2000),
('IF010', 'Onde Onde', 'Snack', 1000),
('IF011', 'Pisang Goreng', 'Snack', 1500),
('IF012', 'Es Teler', 'Dessert', 4000),
('IF013', 'Bakso', 'Food', 6000),
('IF014', 'Sate', 'Food', 7000),
('IF015', 'Perkedel', 'Snack', 1500),
('IF016', 'Ayam Geprek', 'Food', 20000),
('IF017', 'kolak', 'Dessert', 4000);

-- --------------------------------------------------------

--
-- Table structure for table `tr_transaction`
--

CREATE TABLE `tr_transaction` (
  `id_transaction` int(8) NOT NULL,
  `kode_tr` char(5) NOT NULL,
  `Menu` varchar(35) NOT NULL,
  `Category` varchar(10) NOT NULL,
  `Price` int(8) NOT NULL,
  `Qty` int(5) NOT NULL,
  `Amount` int(8) NOT NULL,
  `dt` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tr_transaction`
--

INSERT INTO `tr_transaction` (`id_transaction`, `kode_tr`, `Menu`, `Category`, `Price`, `Qty`, `Amount`, `dt`) VALUES
(1, 'KT001', 'Bakso', 'Food', 6000, 1, 6000, '2021-07-01'),
(2, 'KT001', 'Es Teh', 'Drink', 1000, 3, 3000, '2021-07-01'),
(3, 'KT002', 'Nasigoreng', 'Food', 4000, 1, 4000, '2021-07-01'),
(4, 'KT003', 'Bakso', 'Food', 6000, 1, 6000, '2021-07-01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `detail_transaction`
--
ALTER TABLE `detail_transaction`
  ADD PRIMARY KEY (`kode_tr`);

--
-- Indexes for table `ms_food`
--
ALTER TABLE `ms_food`
  ADD PRIMARY KEY (`id_food`);

--
-- Indexes for table `tr_transaction`
--
ALTER TABLE `tr_transaction`
  ADD PRIMARY KEY (`id_transaction`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tr_transaction`
--
ALTER TABLE `tr_transaction`
  MODIFY `id_transaction` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
