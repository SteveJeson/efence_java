package com.zdzc.service;

import com.zdzc.entity.GpsSnapshot;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
public interface SnapshotService {
    List<GpsSnapshot> selectAll(Map<String, Object> param);
}
