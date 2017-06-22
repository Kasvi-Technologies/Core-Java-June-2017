package com.kasvisys.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.kasvisys.rest.*;

public class MessageApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public MessageApplication() {
		singletons.add(new MessageRestService());
		singletons.add(new MessageReceiveService());
		singletons.add(new RegExService());
		singletons.add(new InventoryService());
		singletons.add(new UserRegService());
		singletons.add(new RestDownloadService());
		singletons.add(new OrderInventoryService());
		
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
