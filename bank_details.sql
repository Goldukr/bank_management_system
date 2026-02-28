-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 28, 2022 at 03:03 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.1.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank_details`
--

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE `details` (
  `Title` text NOT NULL,
  `Full_name` text NOT NULL,
  `Father_name` text NOT NULL,
  `aadhar_no` text NOT NULL,
  `Dob` text NOT NULL,
  `email` text NOT NULL,
  `Mobile_No` text NOT NULL,
  `Password` text NOT NULL,
  `Account_Number` text NOT NULL,
  `card` text NOT NULL,
  `balance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`Title`, `Full_name`, `Father_name`, `aadhar_no`, `Dob`, `email`, `Mobile_No`, `Password`, `Account_Number`, `card`, `balance`) VALUES
('MR', 'goldu kumar', 'suresh prasad', '123456789456', '12-12-2000', 'goldu@yahoo.com', '7461834106', '5683', '917461834106', '9174618341066599', 5000),
('MRS', 'Riya raj', 'Mohan sharma', '7896554123654', '15-5-2000', 'riyaraj@ymail.com', '8975632147', '9632', '918975632147', '9189756321476599', 500),
('MR', 'Rohit raj', 'binod ', '123456789654', '9-06-2002', 'rohit12@gmail.com', '8965471236', '8956', '918965471236', '9189654712366599', 0),
('MR', 'nitin', 'rakesh yadav', '632589745632', '6-06-2001', 'nitinyadav@gmail.com', '9632587412', '5696', '919632587412', '9196325874126599', 0),
('MR', 'Ritik Raj', 'Mr raju Raj', '8897563214756', '3-06-2001', 'ritikraj@gmail.com', '9685321478', '5683', '919685321478', '9196853214786599', 0),
('MR', 'Ritik Raj', 'Raju Raj', '965874123669', '8-12-2003', 'Ritikraj@gmail.com', '9685741236', '5683', '919685741236', '9196857412366599', 0);

-- --------------------------------------------------------

--
-- Table structure for table `details1`
--

CREATE TABLE `details1` (
  `housenumber` text NOT NULL,
  `streetname` text NOT NULL,
  `area` text NOT NULL,
  `city` text NOT NULL,
  `pincode` text NOT NULL,
  `state` text NOT NULL,
  `Mobile no` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `details1`
--

INSERT INTO `details1` (`housenumber`, `streetname`, `area`, `city`, `pincode`, `state`, `Mobile no`) VALUES
('a-381', 'jj colony', 'hastal road uttam nagar', 'Delhi', '10059', 'Delhi', '123456789456'),
('112', 'Tumariya tola ward no.2', 'Raxaul', 'Raxaul', '845305', 'Bihar', '9685741236');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
