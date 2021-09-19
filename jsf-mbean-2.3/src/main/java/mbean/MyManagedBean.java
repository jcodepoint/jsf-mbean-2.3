import javax.inject.Inject;
import javax.inject.Named;

import services.MyService;

@Named(value = "myBean")
public class MyManagedBean {

	@Inject
	MyService service;
	
	public String getMessage() {
		return "The First One!";
	}
	
	public String getMessageFromService() {
		return service.getNewMessage();
	}
	
}
