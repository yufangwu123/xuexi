/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80014
Source Host           : localhost:3306
Source Database       : ceshi

Target Server Type    : MYSQL
Target Server Version : 80014
File Encoding         : 65001

Date: 2020-07-08 16:46:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'yufangwu', '123456');
INSERT INTO `user` VALUES ('2', 'user1', '123456');
INSERT INTO `user` VALUES ('3', 'user2', '123456');
INSERT INTO `user` VALUES ('4', 'user3', '123456');
INSERT INTO `user` VALUES ('5', 'user4', '123456');
INSERT INTO `user` VALUES ('6', 'user5', '123456');
INSERT INTO `user` VALUES ('7', 'user6', '123456');
INSERT INTO `user` VALUES ('8', 'user7', '123456');
INSERT INTO `user` VALUES ('9', 'user8', '123456');
INSERT INTO `user` VALUES ('10', 'user9', '123456');
INSERT INTO `user` VALUES ('11', 'user10', '123456');
INSERT INTO `user` VALUES ('12', 'user11', '123456');