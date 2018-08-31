package com.zdzc.service.impl;

import com.zdzc.dao.EfenceMapper;
import com.zdzc.entity.Efence;
import com.zdzc.service.EfenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
@Service
public class EfenceServiceImpl implements EfenceService {

    @Autowired
    private EfenceMapper efenceMapper;

    @Override
    public Efence selectEfenceByCode(String code) throws Exception {
        return efenceMapper.selectByCode(code);
    }
}
