package com.hd.user.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * resource
 * @author 
 */
@Data
@ApiModel("资源表")
public class Resource implements Serializable {
    /**
     * 资源ID
     */
    @ApiModelProperty("资源ID")
    private Integer resourceid;

    /**
     * 资源名称
     */
    @ApiModelProperty("资源名称")
    private String resourcename;

    /**
     * 资源URL连接
     */
    @ApiModelProperty("资源URL连接")
    private String resourceurl;

    /**
     * 资源描述
     */
    @ApiModelProperty("资源描述")
    private String resourcenote;

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