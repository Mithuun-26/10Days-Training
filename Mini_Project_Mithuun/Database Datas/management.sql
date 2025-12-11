-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2025 at 03:55 PM
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
-- Database: `management`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `rollNo` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`rollNo`, `name`, `age`) VALUES
(23001, 'krithik Raj', 19),
(23002, 'Mithuun', 20),
(23003, 'Muthu', 21),
(23004, 'Kisshore', 19),
(23005, 'Gowsick', 19),
(23006, 'Pranesh', 20),
(23007, 'Shanmugavel', 20),
(23008, 'Rahul', 19),
(23009, 'Sneha', 20),
(23010, 'Sathish', 18),
(23011, 'Shyam', 21),
(23012, 'Manoj', 22),
(23013, 'Shanjay', 19),
(23014, 'Abdul', 20),
(23015, 'Harish', 18),
(23016, 'Ramesh', 21),
(23017, 'Neha', 19),
(23018, 'Ajay', 22),
(23019, 'Meera', 20),
(23020, 'Shiva', 19);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`rollNo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
