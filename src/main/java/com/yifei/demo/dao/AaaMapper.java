package com.yifei.demo.dao;

import com.yifei.demo.domain.Aaa;
import com.yifei.demo.utils.core.PagingTool;

import java.util.List;

public interface AaaMapper {
    int deleteByPrimaryKey(Integer aaaId);

    int insert(Aaa record);

    int insertSelective(Aaa record);

    Aaa selectByPrimaryKey(Integer aaaId);

    int updateByPrimaryKeySelective(Aaa record);

    int updateByPrimaryKey(Aaa record);

    int countTotal(PagingTool pagingTool);

    List<Aaa> selectAaaList(PagingTool pagingTool);
}