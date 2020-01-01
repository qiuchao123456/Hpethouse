/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : pethouse

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 01/01/2020 20:58:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for adminusers
-- ----------------------------
DROP TABLE IF EXISTS `adminusers`;
CREATE TABLE `adminusers`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户Id',
  `aName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户昵称',
  `aPwd` int(11) NOT NULL COMMENT '用户密码',
  `age` int(11) NOT NULL COMMENT '年龄',
  `sex` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of adminusers
-- ----------------------------
INSERT INTO `adminusers` VALUES (1, '邱超', 123, 18, '男');
INSERT INTO `adminusers` VALUES (2, '李政松', 123, 18, '男');
INSERT INTO `adminusers` VALUES (3, '罗扬', 123, 18, '男');
INSERT INTO `adminusers` VALUES (4, '李鑫', 123, 18, '男');
INSERT INTO `adminusers` VALUES (5, '石俊敏', 123, 18, '女');
INSERT INTO `adminusers` VALUES (6, '欧武良', 123, 18, '男');

SET FOREIGN_KEY_CHECKS = 1;
