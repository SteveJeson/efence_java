package com.zdzc.dao;

import com.zdzc.entity.Efence;
import java.util.List;

public interface EfenceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Efence record);

    Efence selectByPrimaryKey(Integer id);

    List<Efence> selectAll();

    int updateByPrimaryKey(Efence record);

    Efence selectByCode(String code);
}