package utils;

public class ServiceFactory {

	public Object getService(Object service){
		return new TransactionInvocationHandler(service).getProxy();
	}
}
