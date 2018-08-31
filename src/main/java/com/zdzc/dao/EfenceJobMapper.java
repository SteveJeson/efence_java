package com.zdzc.dao;

import com.zdzc.entity.EfenceJob;
import java.util.List;

public interface EfenceJobMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EfenceJob record);

    EfenceJob selectByPrimaryKey(Integer id);

    List<EfenceJob> selectAll();

    int updateByPrimaryKey(EfenceJob record);
}