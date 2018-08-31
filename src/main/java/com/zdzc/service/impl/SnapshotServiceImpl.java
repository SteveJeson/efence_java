package com.zdzc.service.impl;

import com.zdzc.dao.GpsSnapshotMapper;
import com.zdzc.entity.GpsSnapshot;
import com.zdzc.service.SnapshotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
@Service
@Order(1)
public class SnapshotServiceImpl implements SnapshotService {

    @Autowired
    private GpsSnapshotMapper snapshotMapper;

    @Override
    public List<GpsSnapshot> selectAll(Map<String, Object> param) {
        return snapshotMapper.selectAll(param);
    }
}
