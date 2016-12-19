package com.hrocloud.common.service.impl;

import com.hrocloud.common.dao.BaseMapper;
import com.hrocloud.common.model.BaseInfo;
import com.hrocloud.common.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class BaseServiceImpl implements BaseService {

    @Autowired
    private BaseMapper baseMapper;

    @Override
    public List selectMap(BaseInfo info) {
        info.load();
        return baseMapper.selectMap(info);
    }

    @Override
    public List selectSingle(BaseInfo info) {
        info.load();
        return baseMapper.selectSingle(info);
    }

    @Override
    public Object selectOne(BaseInfo info) {
        info.load();
        return baseMapper.selectOne(info);
    }

    @Override
    public boolean insert(BaseInfo info) throws Exception {
        info.load();
        int i = baseMapper.insert(info);
        return i > 0 ? true : false;
    }

    @Override
    public boolean update(BaseInfo info) throws Exception {
        info.load();
        int i = baseMapper.update(info);
        return i > 0 ? true : false;
    }

    @Override
    public boolean delete(BaseInfo info) throws Exception {
        info.load();
        int i = baseMapper.delete(info);
        return i > 0 ? true : false;
    }

    @Override
    @Transactional
    public void execute(List<BaseInfo> list) throws Exception {
        for (BaseInfo info : list) {
            info.load();
            baseMapper.update(info);
        }
    }

}
