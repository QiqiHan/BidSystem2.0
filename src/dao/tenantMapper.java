package dao;

import DO.tenant;

public interface tenantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tenant record);

    int insertSelective(tenant record);

    tenant selectByPrimaryKey(Integer id);

    tenant selectByName(String name);

    int updateByPrimaryKeySelective(tenant record);

    int updateByPrimaryKey(tenant record);
}