/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.22-log : Database - epet
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`epet` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `epet`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `deal_type` int(4) DEFAULT NULL,
  `pet_id` int(4) DEFAULT NULL,
  `seller_id` int(4) DEFAULT NULL,
  `buyer_id` int(4) DEFAULT NULL,
  `price` int(4) DEFAULT NULL,
  `deal_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_account_pet` (`pet_id`),
  KEY `fk_account_petOwner` (`seller_id`),
  CONSTRAINT `fk_account_pet` FOREIGN KEY (`pet_id`) REFERENCES `pet` (`id`),
  CONSTRAINT `fk_account_petOwner` FOREIGN KEY (`seller_id`) REFERENCES `petowner` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `account` */

insert  into `account`(`id`,`deal_type`,`pet_id`,`seller_id`,`buyer_id`,`price`,`deal_time`) values (2,1,4,1,1,5,'2016-08-20 00:00:00'),(3,1,3,1,1,5,'2016-08-20 00:00:00'),(4,1,3,1,1,5,'2016-09-10 00:00:00'),(5,2,2,2,1,3,'2016-09-10 00:00:00'),(6,2,3,1,1,3,'2016-10-15 00:00:00');

/*Table structure for table `newtable` */

DROP TABLE IF EXISTS `newtable`;

CREATE TABLE `newtable` (
  `id` int(4) NOT NULL DEFAULT '0',
  `name` char(10) DEFAULT NULL,
  `password` char(10) DEFAULT NULL,
  `money` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `newtable` */

insert  into `newtable`(`id`,`name`,`password`,`money`) values (1,'小明','123456',178),(2,'小强','123456',498);

/*Table structure for table `newtable2` */

DROP TABLE IF EXISTS `newtable2`;

CREATE TABLE `newtable2` (
  `id` int(4) NOT NULL DEFAULT '0',
  `name` char(10) DEFAULT NULL,
  `password` char(10) DEFAULT NULL,
  `money` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `newtable2` */

/*Table structure for table `newtable3` */

DROP TABLE IF EXISTS `newtable3`;

CREATE TABLE `newtable3` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `name` char(10) DEFAULT NULL,
  `password` char(10) DEFAULT NULL,
  `money` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `newtable3` */

/*Table structure for table `pet` */

DROP TABLE IF EXISTS `pet`;

CREATE TABLE `pet` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `name` char(10) NOT NULL,
  `typeName` char(10) DEFAULT NULL,
  `health` int(4) DEFAULT NULL,
  `love` int(4) DEFAULT NULL,
  `birthday` timestamp NULL DEFAULT NULL,
  `owner_id` int(4) DEFAULT NULL,
  `store_id` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_pet_petOwner` (`owner_id`),
  KEY `fk_pet_petStore` (`store_id`),
  CONSTRAINT `fk_pet_petOwner` FOREIGN KEY (`owner_id`) REFERENCES `petowner` (`id`),
  CONSTRAINT `fk_pet_petStore` FOREIGN KEY (`store_id`) REFERENCES `petstore` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `pet` */

insert  into `pet`(`id`,`name`,`typeName`,`health`,`love`,`birthday`,`owner_id`,`store_id`) values (1,'花花','dog',1,50,'2015-08-20 00:00:00',1,1),(2,'贝贝','penguin',1,60,'2015-08-20 00:00:00',NULL,2),(3,'成成','dog',1,60,'2015-09-10 00:00:00',NULL,1),(4,'露露','bird',1,70,'2016-01-10 00:00:00',NULL,1),(5,'老虎','tiger',1,2,'2016-02-10 00:00:00',2,1),(6,'老虎','tiger',1,2,'2016-03-15 00:00:00',NULL,1),(7,'老虎','tiger',1,11,'2016-02-15 00:00:00',NULL,1),(8,'狮子','lion',1,2,'2016-04-15 00:00:00',NULL,2);

/*Table structure for table `petowner` */

DROP TABLE IF EXISTS `petowner`;

CREATE TABLE `petowner` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `name` char(10) DEFAULT NULL,
  `password` char(10) DEFAULT NULL,
  `money` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `petowner` */

insert  into `petowner`(`id`,`name`,`password`,`money`) values (1,'小明','123456',178),(2,'小强','123456',498);

/*Table structure for table `petstore` */

DROP TABLE IF EXISTS `petstore`;

CREATE TABLE `petstore` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(10) DEFAULT NULL,
  `password` char(10) DEFAULT NULL,
  `balance` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `petstore` */

insert  into `petstore`(`id`,`name`,`password`,`balance`) values (1,'北京信息中心','123456',624),(2,'重庆观音桥','123456',800);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
