package com.yifei.demo.service.impl;

import com.yifei.demo.dao.AaaMapper;
import com.yifei.demo.domain.Aaa;
import com.yifei.demo.service.AaaService;
import com.yifei.demo.utils.core.PagingTool;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AaaServiceImpl implements AaaService {
    @Resource
    private AaaMapper aaaMapper;


    @Override
    public int addAaa(Aaa aaa) {
        return aaaMapper.insertSelective(aaa);
    }

    @Override
    public int delAaa(int aaaId) {
        return aaaMapper.deleteByPrimaryKey(aaaId);
    }

    @Override
    public int modifyAaa(Aaa aaa) {
        return aaaMapper.updateByPrimaryKeySelective(aaa);
    }

    @Override
    public Aaa getAaaByAaaId(int aaaId) {
        return aaaMapper.selectByPrimaryKey(aaaId);
    }

    @Override
    public int countTotal(PagingTool pagingTool) {
        return aaaMapper.countTotal(pagingTool);
    }

    @Override
    public List<Aaa> getAaaList(PagingTool pagingTool) {
        return aaaMapper.selectAaaList(pagingTool);
    }

    @Override
    public int deleteBatch(String[] idArr) {
        return 0;
    }
}
