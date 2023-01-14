-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: bsm_208
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `a_sirket`
--

DROP TABLE IF EXISTS `a_sirket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `a_sirket` (
  `A_sirketid` int NOT NULL AUTO_INCREMENT,
  `userid` varchar(45) DEFAULT NULL,
  `A_sirket_koltukno` varchar(45) NOT NULL,
  `A_sirket_koltukfiyat` varchar(45) NOT NULL,
  `A_sirket_koltukturu` varchar(45) NOT NULL,
  PRIMARY KEY (`A_sirketid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `a_sirket`
--

LOCK TABLES `a_sirket` WRITE;
/*!40000 ALTER TABLE `a_sirket` DISABLE KEYS */;
INSERT INTO `a_sirket` VALUES (1,'0','1','150','Ekonomi'),(2,'0','2','150','Ekonomi'),(3,'0','3','150','Ekonomi'),(4,'0','4','150','Ekonomi'),(5,'0','5','150','Ekonomi'),(6,'0','6','300','Business'),(7,'0','7','300','Business'),(8,'0','8','300','Business'),(9,'0','9','300','Business'),(10,'0','10','300','Business'),(11,'0','11','450','First'),(12,'0','12','450','First'),(13,'0','13','450','First'),(14,'0','14','450','First'),(15,'0','15','450','First');
/*!40000 ALTER TABLE `a_sirket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-30  1:09:42
