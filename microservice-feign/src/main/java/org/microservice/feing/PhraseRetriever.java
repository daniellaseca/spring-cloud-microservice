package org.microservice.feing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Component
public class PhraseRetriever {

	@Autowired
	private StringClients stringClient;

	@HystrixCommand(fallbackMethod="retrieveFallbackGeoinfo")
	public String geoInfo() {
		return stringClient.location();
	}

	@HystrixCommand(fallbackMethod="retrieveFallbackHelloParamater")
	public String hello(String name) {
		
		return stringClient.hello(name);
	}
	
	@HystrixCommand(fallbackMethod="retrieveFallbackHello")
	public String helloWorld() {
		
		return stringClient.helloWorld();
	}	
	public String retrieveFallbackGeoinfo() {
		return "Madrid";
	}
	
	public String retrieveFallbackGeoinfo(String name) {
		return "Madrid";
	}
	
	public String retrieveFallbackHello() {
		return "hi world!";
	}
	public String retrieveFallbackHelloParamater(String name) {
		return "hi world!";
	}
}
