/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : erp

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-10-19 18:20:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `producer` varchar(150) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '生产商',
  `contact` varchar(150) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '联系人',
  `email` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '联系电话',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `typ` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '型号',
  `colour_temperature` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '色温',
  `bri` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '亮度',
  `price` double DEFAULT NULL COMMENT '价格',
  `note` text COLLATE utf8mb4_bin COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='产品：LED-产品';

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', 'producer-1', 'contact-1', '123@com1', 'phone-1', '2015-10-12 15:55:27', '2015-10-12 15:55:29', 'typ-11', 'colour-1', 'bri-1', '2', 0x6E6F74652D31);
INSERT INTO `product` VALUES ('2', 'producer-2', 'contact-2', '456@com2', 'phone-2', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-22', 'colour-2', 'bri-2', '4', 0x6E6F74652D32);
INSERT INTO `product` VALUES ('3', 'producer-3', 'contact-3', '456@com3', 'phone-3', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-23', 'colour-3', 'bri-3', '5', 0x6E6F74652D33);
INSERT INTO `product` VALUES ('4', 'producer-4', 'contact-4', '456@com4', 'phone-4', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-24', 'colour-4', 'bri-4', '6', 0x6E6F74652D34);
INSERT INTO `product` VALUES ('5', 'producer-5', 'contact-5', '456@com5', 'phone-5', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-25', 'colour-5', 'bri-5', '7', 0x6E6F74652D35);
INSERT INTO `product` VALUES ('6', 'producer-6', 'contact-6', '456@com6', 'phone-6', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-26', 'colour-6', 'bri-6', '8', 0x6E6F74652D36);
INSERT INTO `product` VALUES ('7', 'producer-7', 'contact-7', '456@com7', 'phone-7', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-27', 'colour-7', 'bri-7', '9', 0x6E6F74652D37);
INSERT INTO `product` VALUES ('8', 'producer-8', 'contact-8', '456@com8', 'phone-8', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-28', 'colour-8', 'bri-8', '10', 0x6E6F74652D38);
INSERT INTO `product` VALUES ('9', 'producer-9', 'contact-9', '456@com9', 'phone-9', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-29', 'colour-9', 'bri-9', '11', 0x6E6F74652D39);
INSERT INTO `product` VALUES ('10', 'producer-10', 'contact-10', '456@com10', 'phone-10', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-210', 'colour-10', 'bri-10', '12', 0x6E6F74652D3130);
INSERT INTO `product` VALUES ('11', 'producer-11', 'contact-11', '456@com11', 'phone-11', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-211', 'colour-11', 'bri-11', '13', 0x6E6F74652D3131);
INSERT INTO `product` VALUES ('12', 'producer-12', 'contact-12', '456@com12', 'phone-12', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-212', 'colour-12', 'bri-12', '14', 0x6E6F74652D3132);
INSERT INTO `product` VALUES ('13', 'producer-13', 'contact-13', '456@com13', 'phone-13', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-213', 'colour-13', 'bri-13', '15', 0x6E6F74652D3133);
INSERT INTO `product` VALUES ('14', 'producer-14', 'contact-14', '456@com14', 'phone-14', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-214', 'colour-14', 'bri-14', '16', 0x6E6F74652D3134);
INSERT INTO `product` VALUES ('15', 'producer-15', 'contact-15', '456@com15', 'phone-15', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-215', 'colour-15', 'bri-15', '17', 0x6E6F74652D3135);
INSERT INTO `product` VALUES ('16', 'producer-16', 'contact-16', '456@com16', 'phone-16', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-216', 'colour-16', 'bri-16', '18', 0x6E6F74652D3136);
INSERT INTO `product` VALUES ('17', 'producer-17', 'contact-17', '456@com17', 'phone-17', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-217', 'colour-17', 'bri-17', '19', 0x6E6F74652D3137);
INSERT INTO `product` VALUES ('18', 'producer-18', 'contact-18', '456@com18', 'phone-18', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-218', 'colour-18', 'bri-18', '20', 0x6E6F74652D3138);
INSERT INTO `product` VALUES ('19', 'producer-19', 'contact-19', '456@com19', 'phone-19', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-219', 'colour-19', 'bri-19', '21', 0x6E6F74652D3139);
INSERT INTO `product` VALUES ('20', 'producer-20', 'contact-20', '456@com20', 'phone-20', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-220', 'colour-20', 'bri-20', '22', 0x6E6F74652D3230);
INSERT INTO `product` VALUES ('21', 'producer-21', 'contact-21', '456@com21', 'phone-21', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-221', 'colour-21', 'bri-21', '23', 0x6E6F74652D3231);
INSERT INTO `product` VALUES ('22', 'producer-22', 'contact-22', '456@com22', 'phone-22', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-222', 'colour-22', 'bri-22', '24', 0x6E6F74652D3232);
INSERT INTO `product` VALUES ('23', 'producer-23', 'contact-23', '456@com23', 'phone-23', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-223', 'colour-23', 'bri-23', '25', 0x6E6F74652D3233);
INSERT INTO `product` VALUES ('24', 'producer-24', 'contact-24', '456@com24', 'phone-24', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-224', 'colour-24', 'bri-24', '26', 0x6E6F74652D3234);
INSERT INTO `product` VALUES ('25', 'producer-25', 'contact-25', '456@com25', 'phone-25', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-225', 'colour-25', 'bri-25', '27', 0x6E6F74652D3235);
INSERT INTO `product` VALUES ('26', 'producer-26', 'contact-26', '456@com26', 'phone-26', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-226', 'colour-26', 'bri-26', '28', 0x6E6F74652D3236);
INSERT INTO `product` VALUES ('27', 'producer-27', 'contact-27', null, 'phone-27', '2015-10-19 15:33:21', '2015-10-19 15:33:21', null, 'colour-27', 'bri-27', null, 0x6E6F74652D3237);
INSERT INTO `product` VALUES ('28', 'producer-28', 'contact-28', '456@com28', 'phone-28', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-228', 'colour-28', 'bri-28', '30', 0x6E6F74652D3238);
INSERT INTO `product` VALUES ('29', 'producer-29', 'contact-29', '456@com29', 'phone-29', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-229', 'colour-29', 'bri-29', '31', 0x6E6F74652D3239);
INSERT INTO `product` VALUES ('30', 'producer-30', 'contact-30', '456@com30', 'phone-30', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-230', 'colour-30', 'bri-30', '32', 0x6E6F74652D3330);
INSERT INTO `product` VALUES ('31', 'producer-31', 'contact-31', '456@com31', 'phone-31', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-231', 'colour-31', 'bri-31', '33', 0x6E6F74652D3331);
INSERT INTO `product` VALUES ('32', 'producer-32', 'contact-32', '456@com32', 'phone-32', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-232', 'colour-32', 'bri-32', '34', 0x6E6F74652D3332);
INSERT INTO `product` VALUES ('33', 'producer-33', 'contact-33', '456@com33', 'phone-33', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-233', 'colour-33', 'bri-33', '35', 0x6E6F74652D3333);
INSERT INTO `product` VALUES ('34', 'producer-34', 'contact-34', '456@com34', 'phone-34', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-234', 'colour-34', 'bri-34', '36', 0x6E6F74652D3334);
INSERT INTO `product` VALUES ('35', 'producer-35', 'contact-35', '456@com35', 'phone-35', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-235', 'colour-35', 'bri-35', '37', 0x6E6F74652D3335);
INSERT INTO `product` VALUES ('36', 'producer-36', 'contact-36', '456@com36', 'phone-36', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-236', 'colour-36', 'bri-36', '38', 0x6E6F74652D3336);
INSERT INTO `product` VALUES ('37', 'producer-37', 'contact-37', '456@com37', 'phone-37', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-237', 'colour-37', 'bri-37', '39', 0x6E6F74652D3337);
INSERT INTO `product` VALUES ('38', 'producer-38', 'contact-38', '456@com38', 'phone-38', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-238', 'colour-38', 'bri-38', '40', 0x6E6F74652D3338);
INSERT INTO `product` VALUES ('39', 'producer-39', 'contact-39', '456@com39', 'phone-39', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-239', 'colour-39', 'bri-39', '41', 0x6E6F74652D3339);
INSERT INTO `product` VALUES ('40', 'producer-40', 'contact-40', '456@com40', 'phone-40', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-240', 'colour-40', 'bri-40', '42', 0x6E6F74652D3430);
INSERT INTO `product` VALUES ('41', 'producer-41', 'contact-41', '456@com41', 'phone-41', '2015-10-09 15:55:59', '2015-10-15 15:56:01', 'typ-241', 'colour-41', 'bri-41', '43', 0x6E6F74652D3431);
