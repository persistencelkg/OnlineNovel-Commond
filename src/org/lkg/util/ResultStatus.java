package org.lkg.util;
/**
 * 
 * 反馈客户端的业务处理状态
 * 
 * @description:
 * @author: 浮~沉
 * @version: 1.0
 * @data 2019年12月27日 下午1:34:33
 * @CopyRight lkg.nb.com
 */
public enum ResultStatus {
	/*--------------------用户业务执行状态----------------------------*/
	LOGIN_SUCCESS,
	LOGIN_FAIL,
	USERNAME_NOT_EXIST,  	//用户名不存在
	REGIST_SUCCESS,
	REGIST_FAIL,
	USERNAME_EXIST,			//注册用户已存在
	
	SERVER_ERROR,			//服务端异常
	
	SUCCESS,FAIL,			//普通业务的状态
	/*-------------------小说业务执行状态---------------------------*/
	FILE_NOT_FOUND,			//FileNotFountException
	FILE_NOT_READ,			//IOException
	FILE_EXIT,				//上传文件覆盖问题
	
	UPLOAD_SUCCESS,
	UPLOAD_FAIL
}
