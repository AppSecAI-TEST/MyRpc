package com.it.netty.rpc.service;

import java.lang.reflect.Method;

import com.it.netty.rpc.proxy.RpcProxyClient;

public class test {
	public static void main(String[] args) {
		PersonService personService=RpcProxyClient.getProxy(PersonService.class);
		Person name = personService.getName();
		
		System.out.println(name.getClass().getName()+name.getName()+":"+name.getAge());
		Person name1 = personService.getName();
		System.out.println(name.getClass().getName()+name.getName()+":"+name.getAge());
	}
}
