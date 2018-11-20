package com.springbook.ioc.injection;

import java.util.*;

public class CollectionBean {
	public CollectionBean() {
		System.out.println("===> CollectionBean 객체 생성");
	}
	
	//List와 다르게 Set은 중복값 허용X
	private Set<String> addressList;
	private Map<String, String> mapList;

	public Set<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}

	public Map<String, String> getMapList() {
		return mapList;
	}

	public void setMapList(Map<String, String> mapList) {
		this.mapList = mapList;
	}
	
}
