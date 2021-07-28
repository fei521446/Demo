/*图片材料信息表*/
CREATE TABLE `material_annex` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `material_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '材料名称',
  `material_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '材料种类',
  `material_picture` blob COMMENT '预览图',
  `relation_id` int DEFAULT NULL COMMENT '关联表id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*异地出生受理信息表*/
CREATE TABLE `allopatry_birth_info` (
    `id` int NOT NULL AUTO_INCREMENT COMMENT '自增id',
    `declarant_card_number` varchar(100) DEFAULT NULL COMMENT '申报人公民身份号码',
    `declarant_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '申报人姓名',
    `declarant_phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '申报人联系电话',
    `declarant_family_relation` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '申报人家庭关系',
    `current_address` varchar(255) DEFAULT NULL COMMENT '现居住地址省市县(区)',
    `detail_address` varchar(255) DEFAULT NULL COMMENT '现居住地址区划内详细地址',
    `householder_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '户主姓名',
    `householder_card_number` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '户主公民身份号码',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;