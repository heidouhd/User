package com.hd.user.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
@ApiModel("用户表")
public class User implements Serializable {
    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")
    private Long userid;

    /**
     * 用户姓名
     */
    @ApiModelProperty("用户姓名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 年龄
     */
    @ApiModelProperty("年龄")
    private Integer age;

    /**
     * 性别
     */
    @ApiModelProperty("性别")
    private String sex;

    /**
     * 手机号码
     */
    @ApiModelProperty("手机号码")
    private Integer mobilephone;

    /**
     * 住址
     */
    @ApiModelProperty("住址")
    private String address;

    /**
     * 证件类型 1 身份证 2军官证 3驾驶本
     */
    @ApiModelProperty("证件类型 1 身份证 2军官证 3驾驶本")
    private String idcardtype;

    /**
     * 证件号
     */
    @ApiModelProperty("证件号")
    private Integer idcardnum;

    /**
     * 状态 1正常 2注销 3冻结
     */
    @ApiModelProperty("状态 1正常 2注销 3冻结")
    private String state;

    /**
     * 解冻时间 
     */
    @ApiModelProperty("解冻时间 ")
    private Date thawtime;

    /**
     * 创建事件
     */
    @ApiModelProperty("创建事件")
    private Date createtime;

    /**
     * 刷新时间
     */
    @ApiModelProperty("刷新时间")
    private Date refreshtime;

    private static final long serialVersionUID = 1L;
}