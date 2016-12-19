package com.hrocloud.common.service;


import com.hrocloud.common.model.BaseInfo;

import java.util.List;

public interface BaseService {

	public List selectMap(BaseInfo info);

	public List selectSingle(BaseInfo info);

	public Object selectOne(BaseInfo info);

	public boolean insert(BaseInfo info) throws Exception;

	public boolean update(BaseInfo info) throws Exception;

	public boolean delete(BaseInfo info) throws Exception;

	public void execute(List<BaseInfo> list) throws Exception;

}
