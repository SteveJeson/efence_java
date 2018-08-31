package com.zdzc.service.impl;

import com.zdzc.dao.EfenceJobMapper;
import com.zdzc.entity.EfenceJob;
import com.zdzc.service.EfenceJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
@Service
public class EfenceJobServiceImpl implements EfenceJobService {
    @Autowired
    EfenceJobMapper mapper;

    @Override
    public void insertEfenceJob(EfenceJob efenceJob) {
        efenceJob.setJobCode(UUID.randomUUID().toString());
        mapper.insert(efenceJob);
    }
}
