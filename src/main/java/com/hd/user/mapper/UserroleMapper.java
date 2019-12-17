package com.hd.user.mapper;

import com.hd.user.domain.Userrole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserroleMapper {
    int deleteByPrimaryKey(Integer userroleid);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    Userrole selectByPrimaryKey(Integer userroleid);

    int updateByPrimaryKeySelective(Userrole record);

    int updateByPrimaryKey(Userrole record);
}