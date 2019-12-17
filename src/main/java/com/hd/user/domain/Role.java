package com.hd.user.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * role
 * @author 
 */
@Data
@ApiModel("角色表")
public class Role implements Serializable {
    /**
     * 角色ID
     */
    @ApiModelProperty("角色ID")
    private Integer roleid;

    /**
     * 角色名称
     */
    @ApiModelProperty("角色名称")
    private String rolename;

    /**
     * 角色描述
     */
    @ApiModelProperty("角色描述")
    private String rolenote;

    /**
     * 状态 1正常 2失效
     */
    @ApiModelProperty("状态 1正常 2失效")
    private String state;

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