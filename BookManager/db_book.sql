/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : db_book

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 20/05/2022 18:55:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `author` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` float NULL DEFAULT NULL,
  `bookDesc` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bookTypeId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_t_book`(`bookTypeId`) USING BTREE,
  CONSTRAINT `FK_t_book` FOREIGN KEY (`bookTypeId`) REFERENCES `t_booktype` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book
-- ----------------------------
INSERT INTO `t_book` VALUES (1, '数据结构', '王凯', '男', 80, '算法书籍', 2);
INSERT INTO `t_book` VALUES (2, 'Java编程思想1', 'JJ1', '女', 111, '这个一本好书籍1', 1);
INSERT INTO `t_book` VALUES (3, '美女的生活1', '呵呵2', '女', 121, '11112', 2);
INSERT INTO `t_book` VALUES (4, 'java代码', '风格', '女', 120, '是', 1);
INSERT INTO `t_book` VALUES (5, 'Java', '胡超', '男', 10, '好书', 1);
INSERT INTO `t_book` VALUES (6, 'java编程思想', '美女', '女', 100, '搜索', 2);
INSERT INTO `t_book` VALUES (7, '数据库', '胡超', '男', 100, '好书', 1);
INSERT INTO `t_book` VALUES (8, '算法设计', '普通人', '男', 60, '算法书', 1);
INSERT INTO `t_book` VALUES (9, '算法', '许昌人', '男', 45, '废人的书', 1);
INSERT INTO `t_book` VALUES (10, '操作系统', '超哥', '男', 60, '超级牛逼书', 1);
INSERT INTO `t_book` VALUES (11, '计算机网络', '超超', '男', 80, '牛逼牛逼', 1);
INSERT INTO `t_book` VALUES (12, '计算机网络', '毛毛', '男', 90, ' 超哥厉害', 2);
INSERT INTO `t_book` VALUES (13, 'python', '凤凤', '女', 70, '2好书', 2);
INSERT INTO `t_book` VALUES (14, '算法之道', '圆圆', '女', 9999, 'ACM铜牌大佬编写！！！', 17);

-- ----------------------------
-- Table structure for t_booktype
-- ----------------------------
DROP TABLE IF EXISTS `t_booktype`;
CREATE TABLE `t_booktype`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookTypeName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bookTypeDesc` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_booktype
-- ----------------------------
INSERT INTO `t_booktype` VALUES (1, '计算机类2', '计算机类书籍3');
INSERT INTO `t_booktype` VALUES (2, '计算机', '操作系统');
INSERT INTO `t_booktype` VALUES (3, '计算机 ', '数据结构');
INSERT INTO `t_booktype` VALUES (17, '算法类', '算法很重要！！');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'huchao', '10428376');

SET FOREIGN_KEY_CHECKS = 1;
