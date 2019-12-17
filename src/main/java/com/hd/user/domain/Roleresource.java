package com.hd.user.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * roleresource
 * @author 
 */
@Data
@ApiModel("资源角色表")
public class Roleresource implements Serializable {
    private Integer roleresourceid;

    /**
     * 角色ID
     */
    @ApiModelProperty("角色ID")
    private Integer roleid;

    /**
     * 资源ID
     */
    @ApiModelProperty("资源ID")
    private Integer resourceid;

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