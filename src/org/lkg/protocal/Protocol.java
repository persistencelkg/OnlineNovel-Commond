package org.lkg.protocal;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;

import org.lkg.entity.SysDTO;

/**
 * 
 * @description:服务端和客户端的约定协议
 * @author: 浮~沉
 * @version: 1.0
 * @data 2019年12月27日 下午12:15:34
 */
public interface Protocol<T extends Serializable,S extends Serializable>{
	
	/**
	 * 连接协议:负责socket对象的建立和输入输出流的创建
	 * @param host 客户端IP
	 * @param port 服务端端口
	 * @throws UnknownHostException IP地址查找不到异常
	 * @throws IOException	IO异常
	 */
	public void Init(String host,int port) throws UnknownHostException,IOException;

		
	/**
	 * 数据传输协议:负责服务端和客户端的数据传输
	 * @param <T>  使用泛型必须指定类型,同时还需要注意传入类型和返回类型存在不一致的情况,这时需要再申明一个类型
	 * @param dto  客户端数据传输对象
	 * @return     返回客户端的请求结果
	 * @throws IOException	IO异常
	 * @throws ClassNotFoundException 传输对象找不到异常
	 */
	public SysDTO<S> Communiate(SysDTO<T> dto) throws IOException,ClassNotFoundException;
	
	
	/**
	 * 终止通信协议:用来处理客户端和服务端的告别
	 * @throws IOException IO异常
	 */
	public void destory() throws IOException;
}
