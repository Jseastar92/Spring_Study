package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {

	/*===== 4.4.4 Properties Type Mapping =====*/
	private Properties addressList;

	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}

	public Properties getAddressList() {
		return addressList;
	}

	/*===== 4.4.3 Map Type Mapping =====*/
	/*private Map<String, String> addressList;

	public void setAddressList(Map<String, String> addressList ) {
		this.addressList = addressList;
	}
	public Map<String, String> getAddressList() {
		return addressList;
	}
	*/


	/*===== 4.4.2 Set Type Mapping =====

	private Set< String> addressList;
	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}
	=====          				 =====*/

//	public void setAddressList(Properties addressList) {
//		this.addressList = addressList;
//	}

}
