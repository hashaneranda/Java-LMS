-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 14, 2017 at 07:06 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javalms`
--

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `module_code` varchar(10) NOT NULL,
  `module_name` varchar(200) NOT NULL,
  `dept_ID` varchar(255) NOT NULL,
  `yr` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`module_code`, `module_name`, `dept_ID`, `yr`) VALUES
('', 'BSc (Honours) Marketing Management', 'SOB', 'year 1'),
('', 'BSc (Honours) Operations and Logistics Management', 'SOB', 'year 1'),
('BMIS104 ', 'Computer Technology', 'SOC', 'year 1'),
('BMIS102 ', 'Quantitative Techniques for Computing', 'SOC', 'year 1'),
('BMIS113 ', 'System Design Project', 'SOC', 'year 1'),
('BMIS110 ', 'System Software', 'SOC', 'year 2'),
('CN101.3 ', 'Data Communication and Networks', 'SOC', 'year 1'),
('CS107.3 ', 'Programming with C# -Plymouth Group A', 'SOC', 'year 1');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `dept_ID` varchar(255) NOT NULL,
  `dept_name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`dept_ID`, `dept_name`) VALUES
('SOB', 'School of Business'),
('SOC', 'School of Computing');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(5) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `user_fullname` varchar(255) NOT NULL,
  `user_email` varchar(255) NOT NULL,
  `user_image` text,
  `role` varchar(255) NOT NULL,
  `randSalt` varchar(255) NOT NULL DEFAULT '$2y$10$iusesomecrazystrings22',
  `Index_no` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `user_fullname`, `user_email`, `user_image`, `role`, `randSalt`, `Index_no`) VALUES
(6, 'hello', '123', 'hello', 'hello@gmail.com', '', 'student', '', '1234'),
(15, 'student1', '$1$hl3.W02.$C6fysWL5.PDaKDyM084jE0', 'student1', 'student1@gmail.com', '', 'student', '$2y$10$iusesomecrazystrings22', '1234'),
(16, 'admin', 'admin', '', '', NULL, 'admin', '$2y$10$iusesomecrazystrings22', NULL),
(17, 'student2', '1234', 'student2', 'mail', NULL, 'student', '$2y$10$iusesomecrazystrings22', '1234'),
(18, 'lec1', 'lec1', '', '', NULL, 'lecturer', '$2y$10$iusesomecrazystrings22', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`module_code`(4),`module_name`) USING BTREE,
  ADD KEY `fkcourseDept` (`dept_ID`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`dept_ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `courses`
--
ALTER TABLE `courses`
  ADD CONSTRAINT `fkcourseDept` FOREIGN KEY (`dept_ID`) REFERENCES `department` (`dept_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
