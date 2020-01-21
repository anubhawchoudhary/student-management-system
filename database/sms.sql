-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2019 at 07:25 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sms`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('1BM17IS007', 'amogha'),
('1BM17IS013', 'DAKSH'),
('1BM17IS015', 'anubhaw'),
('brs', 'brs'),
('cgr', 'cgr'),
('xyz123', 'xyz123'),
('xyz234', 'xyz234');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `sname` varchar(50) DEFAULT NULL,
  `usn` varchar(15) NOT NULL,
  `address` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `parent_email` varchar(60) NOT NULL,
  `sports` varchar(200) DEFAULT NULL,
  `project` varchar(100) DEFAULT NULL,
  `social_service` varchar(200) DEFAULT NULL,
  `section` varchar(10) NOT NULL,
  `student_email` varchar(50) NOT NULL,
  `department` varchar(30) NOT NULL,
  `proctor_id` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`sname`, `usn`, `address`, `dob`, `parent_email`, `sports`, `project`, `social_service`, `section`, `student_email`, `department`, `proctor_id`) VALUES
('abhilash', '1bm17is001', 'banglore', '2000-01-01', 'daksh.is17@bmsce.ac.in', 'cricket', 'java-dbms', 'nss', 'A', 'abhilash.is17@bmsce.ac.in', 'ISE', 'xyz123'),
('abhiram', '1bm17is002', 'banglore', '2000-01-02', 'daksh.is17@bmsce.ac.in', 'football', 'java-dbms', 'ncc', 'A', 'abhiram.is17@bmsce.ac.in', 'ISE', 'xyz123'),
('abhishek', '1bm17is003', 'banglore', '2000-02-03', 'amoghahegde.is17@bmsce.ac.in', 'football', 'library mgmt', 'nss', 'A', 'abhishek.is17@bmsce.ac.in', 'ISE', 'xyz123'),
('anjali', '1bm17is004', 'banglore', '2000-01-04', 'anubhawchoudhary@gmail.com', NULL, NULL, NULL, 'A', 'anjali.is17@bmsce.ac.in', 'ISE', 'xyz123'),
('abhayram', '1bm17is005', 'banglore', '2000-01-05', 'anubhawchoudhary@gmail.com', 'badminton', 'python', NULL, 'A', 'abhayram@bmsce.ac.in', 'ISE', 'xyz123'),
('aditya', '1bm17is006', 'banglore', '2000-01-06', 'amoghahegde.is17@bmsce.ac.in', 'cricket', 'ada', NULL, 'A', 'aditya.is17@bmsce.ac.in', 'ISE', 'xyz123'),
('Amogh', '1BM17IS007', '629 10TH CROSS PADMANABHANAGAR BLR', '2000-02-26', 'amoghahegde.is17@bmsce.ac.in', 'BADMINTON', 'DBMS', 'NSS', 'A', 'amoghahegde.is17@bmsce.ac.in', 'ISE', 'abc123'),
('aishwarya', '1bm17is008', 'blr', '2000-01-08', 'daksh.is17@bmsce.ac.in', 'tennis', NULL, NULL, 'A', 'aishwarya@bmsce.ac.in', 'ISE', 'xyz123'),
('ajay', '1bm17is009', 'banglore', '2000-01-09', 'daksh.is17@bmsce.ac.in', NULL, NULL, NULL, 'A', 'ajay@bmsce,ac.in', 'ISE', 'xyz123'),
('ananya', '1bm17is010', 'raipur', '2000-02-26', 'daksh.is17@bmsce.ac.in', NULL, NULL, NULL, 'A', 'ananya@gmail.com', 'ISE', 'xyz123'),
('ankith', '1bm17is011', 'coorg', '1999-02-06', 'daksh.is17@bmsce.ac.in', 'gokarting', NULL, NULL, 'A', 'ankith@gmail.com', 'ISE', 'xyz234'),
('anupriya', '1bm17is012', 'amethi', '2000-01-01', 'anubhawchoudhary@gmail.com', 'handball', 'python', NULL, 'B', 'anupriya@gmail.com', 'ISE', 'xyz234'),
('Daksh gupta', '1BM17IS013', 'BMSCE HOSTELS', '1998-02-07', 'daksh.is17@bmsce.ac.in', 'tennis\ncricket', 'JAVA\r\nDBMS\r\nWP', 'DC STUDENTS TEAM', 'A', 'daksh.is17@bmsce.ac.in', 'ISE', 'abc234'),
('arvindh', '1bm17is014', 'jayanagar', '1998-02-07', 'anubhawchoudhary@gmail.com', 'cricket', 'dbms', NULL, 'B', 'arvindh@gmail.com', 'ISE', 'xyz234'),
('Anubhaw', '1BM17IS015', 'BMSCE HOSTELS', '1999-02-06', 'anubhawchoudhary@gmail.com', 'CRICKET', 'DBMS', 'NSS', 'A', 'anubhav.is17@bmsce.ac.in', 'ISE', 'xyz123'),
('ayush', '1bm17is016', 'delhi', '1999-02-06', 'daksh.is17@bmsce.ac.in', 'hockey', 'proctoring system', 'nss', 'B', 'ayush@gmail.com', 'ISE', 'xyz234'),
('dhanya', '1bm17is017', 'anantpur', '1998-02-07', 'daksh.is17@bmsce.ac.in', 'handball', 'cvc', 'ncc', 'B', 'dhanya@gmail.com', 'ISE', 'xyz234'),
('gagan', '1bm17is018', 'yelahanka', '2000-02-03', 'daksh.is17@bmsce.ac.in', NULL, NULL, NULL, 'B', 'gagan@gmail.com', 'ISE', 'xyz234'),
('sahil', '1BM17IS019', 'bengaluru', '2000-10-09', 'adit@gmail.com', NULL, NULL, NULL, 'A', 'sahil.is17@bmsce.ac.in', 'ISE', 'xyz123');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `teacher_id` varchar(25) NOT NULL,
  `tname` varchar(25) NOT NULL,
  `temail` varchar(50) NOT NULL,
  `department` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`teacher_id`, `tname`, `temail`, `department`) VALUES
('xyz123', 'BR Shambhavi', 'drshambhavi@bmsce.ac.in', 'ISE'),
('xyz234', 'Chandrakala raju', 'chandrakala@bmsce.ac.in', 'ISE');

-- --------------------------------------------------------

--
-- Table structure for table `teaches`
--

CREATE TABLE `teaches` (
  `course_code` varchar(40) NOT NULL,
  `course_name` varchar(40) NOT NULL,
  `credits` int(10) NOT NULL,
  `semester` int(11) NOT NULL,
  `marks` int(100) DEFAULT NULL,
  `attendence` double DEFAULT NULL,
  `usn` varchar(15) NOT NULL,
  `teacher_id` varchar(20) NOT NULL,
  `year` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teaches`
--

INSERT INTO `teaches` (`course_code`, `course_name`, `credits`, `semester`, `marks`, `attendence`, `usn`, `teacher_id`, `year`) VALUES
('15IS4DCDBMS', 'Database management', 6, 5, 94, 97, '1BM17IS013', 'xyz123', '2018'),
('15IS4DCDCDCN', 'DCN', 4, 4, 0, 75, '1BM17IS015', 'xyz234', '2019'),
('15IS4DCdcn', 'DCN', 4, 5, 100, 100, '1bm17is003', 'xyz234', '2019'),
('15IS4DCENM', 'engineering management', 6, 5, 100, 87, '1bm17is003', 'xyz123', '2017'),
('15IS4DCJAVA', 'oops with java', 6, 5, 52, 86, '1bm17is001', 'xyz234', '2019'),
('15IS4DCJAVA', 'oops with java', 6, 5, 67, 100, '1bm17is002', 'xyz234', '2019'),
('15IS4DCJAVA', 'oops with java', 6, 5, 88, 88, '1BM17IS007', 'xyz123', '2019'),
('15IS4DCJAVA', 'oops with java', 6, 5, 100, 67, '1bm17is014', 'xyz123', '2016'),
('15IS4DCWP', 'web programming', 4, 5, 86, NULL, '1bm17is011', 'xyz123', '2019'),
('15ISDCDBM', 'Database management', 6, 5, 100, 78, '1bm17017', 'xyz123', '2018'),
('15ISDCDBM', 'database management', 4, 5, 67, 97, '1bm17is004', 'xyz123', '2017'),
('15ISDCDBM', 'Database management', 4, 4, 56, 86, '1BM17IS004', 'xyz234', '2019'),
('15ISDCDBM', 'database management', 4, 6, 100, 48, '1bm17is005', 'xyz234', '2018'),
('15ISDCDBM', 'DBMS', 6, 5, 0, 100, '1BM17IS015', 'xyz234', '2019'),
('15ISDCPY', 'python', 4, 4, 67, 78, '1bm17is010', 'xyz123', '2017'),
('15ISDCPY', 'python', 4, 6, 76, NULL, '1bm17is012', 'xyz123', '2019'),
('15ISDCPY', 'python', 4, 5, 48, 67, '1bm17is018', 'xyz123', '2017'),
('15ISDCWEP', 'WP', 4, 5, 0, 100, '1BM17IS013', 'HD', '2019'),
('15ISDYCPP', 'C++', 6, 4, 73, 78, '1bm17is013', 'xyz234', '2019'),
('15ISDYdbm', 'database management', 6, 56, 90, 78, '1bm17is009', 'xyz', '2017'),
('15ISDYPY', 'PYTHON', 6, 4, 100, 100, '1BM17IS006', 'xyz234', '2018'),
('ISISDYPY', 'python', 4, 6, 78, 56, '1bm17is008', 'xyz234', '2018');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`usn`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`teacher_id`);

--
-- Indexes for table `teaches`
--
ALTER TABLE `teaches`
  ADD PRIMARY KEY (`course_code`,`usn`,`teacher_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
