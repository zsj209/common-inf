package com.hrocloud.common.dao;

import com.hrocloud.common.model.BaseInfo;
import com.hrocloud.common.page.PageParameter;
import org.apache.ibatis.annotations.Param;

import java.util.List;



public interface BaseMapper {

	public List selectMap(BaseInfo info);

	public List selectMapPage(@Param("info") BaseInfo info, @Param("page") PageParameter page);

	public List selectSingle(BaseInfo info);

	public Object selectOne(BaseInfo info);

	public Integer insert(BaseInfo info);

	public Integer update(BaseInfo info);

	public Integer delete(BaseInfo info);

}
