package com.hd.user.mapper;

import com.hd.user.domain.Roleresource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleresourceMapper {
    int deleteByPrimaryKey(Integer roleresourceid);

    int insert(Roleresource record);

    int insertSelective(Roleresource record);

    Roleresource selectByPrimaryKey(Integer roleresourceid);

    int updateByPrimaryKeySelective(Roleresource record);

    int updateByPrimaryKey(Roleresource record);
}