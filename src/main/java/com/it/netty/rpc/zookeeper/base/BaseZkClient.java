package com.it.netty.rpc.zookeeper.base;
/**
 * 基础客户端类
 * @author 17070680
 *
 */
public interface BaseZkClient {
	void registURI(String path,URI uri);
	void initAllURI(String path);
}
