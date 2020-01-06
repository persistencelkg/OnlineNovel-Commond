package org.lkg.entity;

import java.io.Serializable;

/**
 * 小说信息类 
 * @description:
 * @author: 浮~沉
 * @version: 1.0
 * @data 2020年1月6日 上午10:20:51
 * @CopyRight lkg.nb.com
 */
public class Novel implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	private String author;
	private String desc;
	private transient String fileName;
	
	public Novel() {
	
	}
	
	
	public Novel(String name, String author, String desc, String fileName) {
		this.name = name;
		this.author = author;
		this.desc = desc;
		this.fileName = fileName;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}


	public String getDesc() {
		return desc;
	}


	public String getFileName() {
		return fileName;
	}
	
	
	
	
}