CREATE TABLE `user` (
  `userId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户姓名',
  `password` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '密码',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `sex` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '性别',
  `mobilePhone` int(11) DEFAULT NULL COMMENT '手机号码',
  `address` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '住址',
  `idCardType` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '证件类型 1 身份证 2军官证 3驾驶本',
  `idCardNum` int(11) DEFAULT NULL COMMENT '证件号',
  `state` char(255) COLLATE utf8mb4_bin DEFAULT '1' COMMENT '状态 1正常 2注销 3冻结',
  `thawTime` datetime DEFAULT NULL COMMENT '解冻时间 ',
  `createTime` datetime DEFAULT NULL COMMENT '创建事件',
  `refreshTime` timestamp NULL DEFAULT NULL COMMENT '刷新时间',
  PRIMARY KEY (`userId`) USING BTREE,
  UNIQUE KEY `idx_mobilePhone` (`mobilePhone`) USING BTREE,
  UNIQUE KEY `idx_idCardNum` (`idCardNum`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户表';

CREATE TABLE `role` (
  `roleId` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `roleName` varchar(60) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '角色名称',
  `roleNote` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '角色描述',
  `state` char(255) COLLATE utf8mb4_bin DEFAULT '1' COMMENT '状态 1正常 2失效',
  `createTime` datetime DEFAULT NULL COMMENT '创建事件',
  `refreshTime` timestamp NULL DEFAULT NULL COMMENT '刷新时间',
  PRIMARY KEY (`roleId`),
  UNIQUE KEY `idx_roleName` (`roleName`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='角色表';

CREATE TABLE `resource` (
  `resourceId` int(11) NOT NULL AUTO_INCREMENT COMMENT '资源ID',
  `resourceName` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '资源名称',
  `resourceUrl` varchar(120) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '资源URL连接',
  `resourceNote` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '资源描述',
  `state` char(255) COLLATE utf8mb4_bin DEFAULT '1' COMMENT '状态 1正常 2失效',
  `createTime` datetime DEFAULT NULL COMMENT '创建事件',
  `refreshTime` timestamp NULL DEFAULT NULL COMMENT '刷新时间',
  PRIMARY KEY (`resourceId`),
  UNIQUE KEY `idx_resourceUrl` (`resourceUrl`) USING BTREE,
  KEY `idx_resourceName` (`resourceName`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='资源表';

CREATE TABLE `userrole` (
  `userRoleId` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色用户ID',
  `userId` bigint(20) NOT NULL COMMENT '用户ID',
  `roleId` int(11) NOT NULL COMMENT '角色ID',
  `state` char(255) COLLATE utf8mb4_bin DEFAULT '1' COMMENT '状态 1正常 2失效',
  `createTime` datetime DEFAULT NULL COMMENT '创建事件',
  `refreshTime` timestamp NULL DEFAULT NULL COMMENT '刷新时间',
  PRIMARY KEY (`userRoleId`),
  KEY `idx_userId` (`userId`) USING BTREE,
  KEY `idx_roleId` (`roleId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户角色表';

CREATE TABLE `roleresource` (
  `roleResourceId` int(11) NOT NULL,
  `roleId` int(11) NOT NULL COMMENT '角色ID',
  `resourceId` int(11) NOT NULL COMMENT '资源ID',
  `state` char(255) COLLATE utf8mb4_bin DEFAULT '1' COMMENT '状态 1正常 2失效',
  `createTime` datetime DEFAULT NULL COMMENT '创建事件',
  `refreshTime` timestamp NULL DEFAULT NULL COMMENT '刷新时间',
  PRIMARY KEY (`roleResourceId`),
  KEY `idx_roleId` (`roleId`) USING BTREE,
  KEY `idx_resourceId` (`resourceId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='资源角色表';