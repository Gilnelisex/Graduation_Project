package com.example.test.mapper;

import com.example.test.domain.Dictionary;

/**
* @author Forzh
* @description 针对表【dictionary】的数据库操作Mapper
* @createDate 2022-03-03 16:39:44
* @Entity com.example.test.domain.Dictionary
*/
public interface DictionaryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);

}
