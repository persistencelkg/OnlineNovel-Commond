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
	
	private Classifcation classifcation;
	//预览信息,用户没有调用预览,就不应该过多展示预览信息,同时还可以节省网络流量
	private transient String preview;		
	
	public Novel() {}
	

	

	public Novel(String name, String author, String desc, String fileName, Classifcation classifcation) {
		this.name = name;
		this.author = author;
		this.desc = desc;
		this.fileName = fileName;
		this.classifcation = classifcation;
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


	public Classifcation getClassifcation() {
		return classifcation;
	}

	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setClassifcation(Classifcation classifcation) {
		this.classifcation = classifcation;
	}




	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
}
