package org.netyards.netserver.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author Tiger
 *  Jun 20, 2016
 * 
 */
public class MessageServer {
	 public static final String EXIT_CODE="exitCode";
	 public static final String EXIT_REASON = "exitReason";
	 
	 //
	 private List<MessageServer> instances = Collections.synchronizedList(new ArrayList<MessageServer>());
	 private ConcurrentMap<Object, Object> map = new ConcurrentHashMap<Object, Object>();
	 
	 
	 
	 public MessageServer(){
		 
	 }
	 

}
