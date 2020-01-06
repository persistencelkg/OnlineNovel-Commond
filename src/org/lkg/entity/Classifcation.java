package org.lkg.entity;

import java.io.Serializable;
/**
 * 小说的分类信息
 * @description: 对于
 * @author: 浮~沉
 * @version: 1.0
 * @data 2020年1月6日 上午10:15:17
 * @CopyRight lkg.nb.com
 */
public class Classifcation implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String className;
	//数据传输时,客户端并不需要其他敏感信息时可以设置为transient
	private transient String catalog;  
	private transient String config;
	
	public Classifcation() {
	}
	
	public Classifcation(String className, String catalog, String config) {
		this.className = className;
		this.catalog = catalog;
		this.config = config;
	}

	public String getClassName() {
		return className;
	}

	public String getCatalog() {
		return catalog;
	}

	public String getConfig() {
		return config;
	}
	
	
	

}
