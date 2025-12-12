-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 12, 2025 at 03:52 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bankingsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `txnId` int(11) NOT NULL,
  `accountNumber` int(11) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `dateTime` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`txnId`, `accountNumber`, `type`, `amount`, `dateTime`) VALUES
(1, 152, 'DEPOSIT', 25550, '2025-12-12 20:18:02');

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

CREATE TABLE `userdetails` (
  `accountNumber` int(11) DEFAULT NULL,
  `holderName` varchar(50) DEFAULT NULL,
  `balance` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`accountNumber`, `holderName`, `balance`) VALUES
(151, 'Virat Kohli', 1000000),
(152, 'Rohit Sharma', 875550),
(153, 'MS Dhoni', 922000),
(154, 'KL Rahul', 610000),
(155, 'Rishabh Pant', 745000),
(156, 'Hardik Pandya', 530000),
(157, 'Jasprit Bumrah', 480000),
(158, 'Shubman Gill', 660000),
(159, 'Suryakumar Yadav', 705000),
(160, 'Ravindra Jadeja', 830000),
(161, 'Shikhar Dhawan', 510000),
(162, 'Yuvraj Singh', 1200000),
(163, 'Sachin Tendulkar', 2500000),
(164, 'Rahul Dravid', 1750000),
(165, 'Sourav Ganguly', 1600000),
(166, 'Anil Kumble', 1450000),
(167, 'Ishan Kishan', 495000),
(168, 'Mohammed Shami', 720000),
(169, 'Bhuvneshwar Kumar', 680000),
(170, 'Axar Patel', 540000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`txnId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `txnId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
