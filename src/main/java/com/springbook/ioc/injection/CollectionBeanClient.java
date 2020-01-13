package com.springbook.ioc.injection;

import java.util.List;
import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");

//		List<String> addressList = bean.getAddressList();
		Properties addressList = bean.getAddressList();
		System.out.println(addressList);
//		for (String address : addressList) {
//			System.out.println(address.toString());
//		}

		factory.close();
	}
}
