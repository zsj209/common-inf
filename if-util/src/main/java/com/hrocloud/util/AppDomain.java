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
		public int getDomainId() {
			// TODO Auto-generated method stub
			return DomainDefine.HRO.getIndex();
		}
	},
	HROMOBILE(1) {
		@Override
		public int getDomainId() {
			// TODO Auto-generated method stub
			return DomainDefine.HRO.getIndex();
		}
	};

	/**
	 * 根据appId获取AppDomain对象
	 * @param appId
	 * @return
	 */
	public static AppDomain appOf(int appId) {
		switch (appId) {
		case 0:
			return HROPC;
		case 1:
			return HROMOBILE;
		default:
			return HROPC;
		}
	}

	private int appId;

	AppDomain(int appId) {
		this.setAppId(appId);
	}

	public abstract int getDomainId();

	/**
	 * @return the key
	 */
	public long getAppId() {
		return appId;
	}

	/**
	 *
	 * @param appId
	 */
	public void setAppId(int appId) {
		this.appId = appId;
	}
	
}
