package com.springbook.ioc.injection;

import java.util.List;
import java.util.Properties;

public class CollectionBean {
//	private Properties addressList;
	public List<String> addressList;

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public List<String> getAddressList(){
		return addressList;
	}

//	public void setAddressList(Properties addressList) {
//		this.addressList = addressList;
//	}

//	public Properties getAddressList() {
//		return addressList;
//	}
}
