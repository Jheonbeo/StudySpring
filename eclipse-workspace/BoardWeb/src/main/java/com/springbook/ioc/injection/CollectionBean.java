package com.springbook.ioc.injection;

import java.util.List;

public class CollectionBean {
	public CollectionBean() {
		System.out.println("===> CollectionBean ��ü ����");
	}

	private List<String> addressList;

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	
}
