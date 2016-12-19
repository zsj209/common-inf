/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hrocloud.util;

/**
 *application - domain matrix *
 * 实现带有抽象方法的枚举 *
 * 
 * @author Stanley Zou
 * */
public enum AppDomain {

	HROPC(0) {
		@Override
		public long getDomainId() {
			// TODO Auto-generated method stub
			return DomainDefine.HRO.getIndex();
		}
	},
	HROMOBILE(1) {
		@Override
		public long getDomainId() {
			// TODO Auto-generated method stub
			return DomainDefine.HRO.getIndex();
		}
	};

	/**
	 * 根据appId获取AppDomain对象
	 * @param appId
	 * @return
	 */
	public static AppDomain appOf(long appId) {
		switch ((int)appId) {
		case 0:
			return HROPC;
		case 1:
			return HROMOBILE;
		default:
			return HROPC;
		}
	}

	private long appId;

	AppDomain(long appId) {
		this.setAppId(appId);
	}

	public abstract long getDomainId();

	/**
	 * @return the key
	 */
	public long getAppId() {
		return appId;
	}

	/**
	 * @param key the key to set
	 */
	public void setAppId(long appId) {
		this.appId = appId;
	}
	
}
