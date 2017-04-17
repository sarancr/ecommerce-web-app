CREATE DATABASE  IF NOT EXISTS `ecomdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ecomdb`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: ecomdb
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(128) DEFAULT NULL,
  `lastname` varchar(128) DEFAULT NULL,
  `company_name` varchar(128) DEFAULT NULL,
  `address1` varchar(256) DEFAULT NULL,
  `address2` varchar(256) DEFAULT NULL,
  `city` varchar(128) DEFAULT NULL,
  `county` varchar(64) DEFAULT NULL,
  `zip` varchar(45) DEFAULT NULL,
  `country` varchar(64) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`address_id`),
  KEY `fk_address_user_id_idx` (`user_id`),
  CONSTRAINT `fk_address_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=343411 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (292,NULL,NULL,NULL,'Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(2912,NULL,NULL,NULL,'Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(4422,NULL,NULL,NULL,'Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(11111,NULL,NULL,NULL,'CCC Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(32323,NULL,NULL,NULL,'CCC Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(34442,NULL,NULL,NULL,'CCC Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(37823,NULL,NULL,NULL,'CCC Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(343342,NULL,NULL,NULL,'CCC Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(343348,NULL,NULL,NULL,'ZZ Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(343349,NULL,NULL,NULL,'ZZ Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(343350,NULL,NULL,NULL,'ZZ Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(343351,NULL,NULL,NULL,'ZZ Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(343352,NULL,NULL,NULL,'ZZ Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(343353,NULL,NULL,NULL,'ZZ Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(343354,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343355,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343356,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343357,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343358,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343359,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343360,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343361,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343362,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343363,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343364,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343365,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343366,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343367,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343368,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343369,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343370,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343371,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343372,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343373,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL),(343374,NULL,NULL,NULL,'ZZ Fremont blvd - cali',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL),(343375,'Saravanan','Vijyappan','','41277 Roberts Ave','APT 26','Fremont','CA','94538-4946',NULL,2,'saravvij@gmail.com','2018559091',NULL),(343376,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343377,'Saravanan','Vijyappan','','41277 Roberts Ave','APT 26','Fremont','CA','94538-4946',NULL,2,'saravvij@gmail.com','2018559091',NULL),(343378,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343379,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343380,'Saravanan','Vijyappan','','41277 Roberts Ave','APT 26','Fremont','CA','94538-4946',NULL,2,'saravvij@gmail.com','2018559091',NULL),(343381,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343382,'Saravanan','Vijayappan','','41277 Roberts Ave','','asasa','asa','aasa',NULL,2,'asaAsas@gmail.com','2000111',NULL),(343383,'Saravanan','Vijyappan','','41277 Roberts Ave','APT 26','Fremont','CA','94538-4946',NULL,2,'saravvij@gmail.com','2018559091',NULL),(343384,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343385,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343386,'Saravanan','Vijyappan','','41277 Roberts Ave','APT 26','Fremont','CA','94538-4946',NULL,2,'saravvij@gmail.com','2018559091',NULL),(343387,'Saravanan','Vijyappan','','41277 Roberts Ave','APT 26','Fremont','CA','94538-4946',NULL,2,'saravvij@gmail.com','2018559091',NULL),(343388,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343389,'SARANYA','CHITHU','','38000 Camden Street APT 110','','FREMONT','California','94536',NULL,1,'srny.cr@gmail.com','2018559091',NULL),(343390,'Saravanan','Vijyappan','','41277 Roberts Ave','APT 26','Fremont','CA','94538-4946',NULL,1,'saravvij@gmail.com22','2018559091h',NULL),(343391,'saran','sarav','agL;','CAMDER','Murad Nagar, near Choti Masjid','Hyderabad','AP','500028',NULL,2,'srny.cr@gmail.com','2018559091',NULL),(343392,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343393,'Saravanan','Vijyappan','','41277 Roberts Ave','APT 26','Fremont','CA','94538-4946',NULL,2,'saravvij@gmail.com','2018559091',NULL),(343394,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343395,'vimasara','saran','','asjklll','12','Hyderabad','AP','500028',NULL,1,'vimsara','2018559091',NULL),(343396,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343397,'vimala','saran','','CAMDER','23','','us','3435',NULL,2,'dhs','2018559091',NULL),(343400,'SARANYA','saran','','CAMDER','23','','us','83988',NULL,2,'v1@c.com','77777777',NULL),(343401,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343402,'SARANYA','saran','','41277 Roberts Ave','APT 26','Fremont','CA','94538-4946',NULL,1,'saravvij@gmail.com','2018559091',NULL),(343403,'sara','vima','','ersdg','23','camden','us','234556',NULL,1,'saravim@gmail.com','38219009',NULL),(343404,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343405,'sara','vim','','25800 Carlos Bee Blvd','#277','Hayward','CA','94542',NULL,2,'vimsara@gmail.com','5108767505',NULL),(343406,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343407,'','','','','','','','',NULL,2,'','',NULL),(343408,'SRV Boys Higher','School','','S/0 M.SHANMUGAM','AANDIKADU','paramathy velur taluk','Tamil Nadu','637213',NULL,2,'','9047043090',NULL),(343409,'','','','','','','','',NULL,0,NULL,NULL,NULL),(343410,'vimala','sara','','25200','','Hayward','California','94542',NULL,1,'vimsara@gmail.com','5108767505',NULL);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `name` varchar(256) DEFAULT NULL,
  `published` int(11) DEFAULT '1',
  `description` varchar(2048) DEFAULT NULL,
  `last_updated` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1000,'Laptop',1,'Laptop','2015-08-23 07:41:24'),(1001,'TV',1,'TV','2015-08-23 07:41:24'),(1002,'Apple',1,'Apple','2015-08-23 07:41:48');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderheader`
--

DROP TABLE IF EXISTS `orderheader`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderheader` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `billto_address` int(11) DEFAULT NULL,
  `shipto_address` int(11) DEFAULT NULL,
  `notes` varchar(1024) DEFAULT NULL,
  `total` decimal(10,0) DEFAULT NULL,
  `shipping_cost` decimal(10,0) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `coupon_code` varchar(64) DEFAULT NULL,
  `paymethod` varchar(45) DEFAULT NULL,
  `last_updated` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`),
  KEY `fk_billto_address_id_idx` (`billto_address`),
  KEY `fk_user_id_idx` (`user_id`),
  KEY `fk_order_shipto_address_idx` (`shipto_address`),
  CONSTRAINT `fk_order_billto_address` FOREIGN KEY (`billto_address`) REFERENCES `address` (`address_id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_shipto_address` FOREIGN KEY (`shipto_address`) REFERENCES `address` (`address_id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderheader`
--

LOCK TABLES `orderheader` WRITE;
/*!40000 ALTER TABLE `orderheader` DISABLE KEYS */;
INSERT INTO `orderheader` VALUES (1,12,343410,343410,NULL,1200,0,'In Process',NULL,'BANK TRNS',NULL,NULL);
/*!40000 ALTER TABLE `orderheader` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderline`
--

DROP TABLE IF EXISTS `orderline`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderline` (
  `orderline_id` int(11) NOT NULL AUTO_INCREMENT,
  `qty` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `product_name` varchar(256) DEFAULT NULL,
  `orderline_price` decimal(10,0) DEFAULT NULL,
  `orderline_total_price` decimal(10,0) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `last_updated` datetime DEFAULT NULL,
  PRIMARY KEY (`orderline_id`),
  KEY `fk_orderline_product_id_idx` (`product_id`),
  CONSTRAINT `fk_orderline_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderline`
--

LOCK TABLES `orderline` WRITE;
/*!40000 ALTER TABLE `orderline` DISABLE KEYS */;
INSERT INTO `orderline` VALUES (1,1,101,'iPhone',500,500,1,NULL),(2,1,100,'Apple new mac book 2015 ',700,700,1,NULL);
/*!40000 ALTER TABLE `orderline` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(512) DEFAULT NULL,
  `description` varchar(5000) DEFAULT NULL,
  `listprice` decimal(10,0) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `img_url` varchar(1024) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `last_updated` datetime DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `fk_product_category_id_idx` (`category_id`),
  CONSTRAINT `fk_product_category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (100,'Apple new mac book 2015 ','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tristique, diam in consequat iaculis, est purus iaculis mauris, imperdiet facilisis ante ligula at nulla. Quisque volutpat nulla risus, id maximus ex aliquet ut. Suspendisse potenti. Nulla varius lectus id turpis dignissim porta. Quisque magna arcu, blandit quis felis vehicula, feugiat gravida diam. Nullam nec turpis ligula. Aliquam quis blandit elit, ac sodales nisl. Aliquam eget dolor eget elit malesuada aliquet. In varius lorem lorem, semper bibendum lectus lobortis ac.',850,700,'img/product-2.jpg',1002,NULL),(101,'iPhone','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tristique, diam in consequat iaculis, est purus iaculis mauris, imperdiet facilisis ante ligula at nulla. Quisque volutpat nulla risus, id maximus ex aliquet ut. Suspendisse potenti. Nulla varius lectus id turpis dignissim porta. Quisque magna arcu, blandit quis felis vehicula, feugiat gravida diam. Nullam nec turpis ligula. Aliquam quis blandit elit, ac sodales nisl. Aliquam eget dolor eget elit malesuada aliquet. In varius lorem lorem, semper bibendum lectus lobortis ac.',650,500,'img/product-3.jpg',1002,NULL),(102,'Sony Smart TV - 2015','Watch your favorite shows, movies and video clips in striking detail, enhanced with boosted contrast and real-time color upscaling. Multiple inputs, smartphone mirroring and powerful features from Android TV provide a wide variety of programs for you to explore and enjoy. Get access to a world of instant entertainment with this product. Just connect to the Internet and stream movies, listen to music, and access a wide variety of other content.',900,799,'img/product-1.jpg',1002,NULL);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `review` (
  `review_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `reviewer_name` varchar(128) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL,
  `review_text` varchar(5000) DEFAULT NULL,
  `last_updated` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`review_id`),
  KEY `fk_review_product_id_idx` (`product_id`),
  CONSTRAINT `fk_review_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscriber`
--

DROP TABLE IF EXISTS `subscriber`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subscriber` (
  `subscriber_id` int(11) NOT NULL,
  `email` varchar(128) DEFAULT NULL,
  `active` int(11) DEFAULT '1',
  `last_updated` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`subscriber_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscriber`
--

LOCK TABLES `subscriber` WRITE;
/*!40000 ALTER TABLE `subscriber` DISABLE KEYS */;
/*!40000 ALTER TABLE `subscriber` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(128) DEFAULT NULL,
  `lastname` varchar(128) DEFAULT NULL,
  `email` varchar(128) NOT NULL,
  `phone` varchar(128) DEFAULT NULL,
  `password` varchar(1028) NOT NULL,
  `last_updated` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'saran','Vijyappan','saravvij@gmail.com','2018559091','aa',NULL),(6,'Saravanan','Vijayappan','asaAsas@gmail.com','2000111','sdsdsds',NULL),(7,'SARANYA','CHITHU','srny.cr@gmail.com','2018559091','hello',NULL),(8,'Saravanan','Vijyappan','saravvij@gmail.com22','2018559091h','hello',NULL),(9,'vimala','saran','dhs','2018559091','hello',NULL),(10,'SARANYA','saran','v1@c.com','77777777','hello',NULL),(11,'sara','vima','saravim@gmail.com','38219009','hello',NULL),(12,'vimala','sara','vimsara@gmail.com','5108767505','hello',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wishitem`
--

DROP TABLE IF EXISTS `wishitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wishitem` (
  `wishitem_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `last_updated` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`wishitem_id`),
  KEY `fk_product_id_idx` (`product_id`),
  KEY `fk_wishlist_user_id_idx` (`user_id`),
  CONSTRAINT `fk_wishitem_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_wishitem_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wishitem`
--

LOCK TABLES `wishitem` WRITE;
/*!40000 ALTER TABLE `wishitem` DISABLE KEYS */;
INSERT INTO `wishitem` VALUES (1,100,12,NULL);
/*!40000 ALTER TABLE `wishitem` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-26 18:47:22
