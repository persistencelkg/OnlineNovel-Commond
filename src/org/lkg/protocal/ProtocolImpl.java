package org.lkg.protocal;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;

import org.lkg.entity.SysDTO;
/**
 * 协议接口-客户端的实现
 * @description:
 * @author: 浮~沉
 * @version: 1.0
 * @data 2019年12月27日 下午12:59:03
 * @CopyRight lkg.nb.com
 */
public class ProtocolImpl<T extends Serializable,S extends Serializable> implements Protocol<T,S>{
	
	private Socket socket=null;
	private ObjectOutputStream out=null;	//客户端先写后读
	private ObjectInputStream in=null;
	
	@Override
	public void Init(String host, int port) throws UnknownHostException, IOException {
		socket=new Socket(host,port);
		out=new ObjectOutputStream(socket.getOutputStream());
		in=new ObjectInputStream(socket.getInputStream());
	}

	@SuppressWarnings("unchecked")
	@Override
	public SysDTO<S> Communiate(SysDTO<T> dto) throws IOException, ClassNotFoundException {
		out.writeObject(dto);
		return (SysDTO<S>) in.readObject();
	}

	@Override
	public void destory() throws IOException {
		in.close();
		out.close();
		socket.close();
		
	}

	public Socket getSocket() {
		return socket;
	}

	public ObjectOutputStream getOut() {
		return out;
	}

	public ObjectInputStream getIn() {
		return in;
	}

	
	

}
