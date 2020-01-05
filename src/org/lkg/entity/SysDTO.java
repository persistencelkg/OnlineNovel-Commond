package org.lkg.entity;

import java.io.Serializable;

import org.lkg.util.ResultStatus;

/**
 * 数据传输对象包括:
 * 传输对象是个泛型对象,为了进一步规范泛型的正确性 还需要对泛型进行约束:即传输对象必须是实现Serizaliable的泛型对象
 * 1.客户端业务类型 :告知服务端它所需要服务的功能-枚举
 * 2.数据对象 :这里采用泛型 好处可以对目标对象进行检查
 * 3.反馈结果:告知客户端,服务端所处理的结果
 * @description:
 * @author: 浮~沉
 * @version: 1.0
 * @data 2019年12月27日 下午12:21:31
 * @CopyRight lkg.nb.com
 */
public class SysDTO<T extends Serializable> implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String type;
	private T data;
	private ResultStatus resust;
	
	
	public SysDTO () {}
	
	
	public SysDTO(String type, T data, ResultStatus resust) {
		this.type = type;
		this.data = data;
		this.resust = resust;
	}


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public ResultStatus getResust() {
		return resust;
	}
	public void setResust(ResultStatus resust) {
		this.resust = resust;
	}
	
	
}
