package org.microservice.feing;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("zuulserver")
public interface StringClients {
	
	@RequestMapping(method = RequestMethod.GET, value = "/locate")
	public String location();

	@RequestMapping(method = RequestMethod.GET, value = "/greeting/{name}")
	public String hello(@PathVariable("name") String name);
	
	@RequestMapping(method = RequestMethod.GET, value = "/greeting")
	public String helloWorld();
}
