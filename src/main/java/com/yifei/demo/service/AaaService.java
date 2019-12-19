package com.yifei.demo.service;

import com.yifei.demo.domain.Aaa;
import com.yifei.demo.utils.core.PagingTool;

import java.util.List;

public interface AaaService {

    public int addAaa(Aaa aaa);

    public int delAaa(int barrageId);

    public int modifyAaa(Aaa aaa);

    Aaa getAaaByAaaId(int aaaId);

    int countTotal(PagingTool pagingTool);

    List<Aaa> getAaaList(PagingTool pagingTool);

    int deleteBatch(String[] idArr);
}
