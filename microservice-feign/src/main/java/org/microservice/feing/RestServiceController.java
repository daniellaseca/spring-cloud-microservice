package org.microservice.feing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceController {
		
	@Autowired
	private PhraseRetriever phraseRetriever;
	
	@RequestMapping("/")
	public String printPhrase() {
		 String results = phraseRetriever.helloWorld() + " I'm at " + phraseRetriever.geoInfo();
       return results;
	}
	
	@RequestMapping("/name/{name}")
	public String printPhrase(@PathVariable("name") String name) {
		 String results = phraseRetriever.hello(name) + " I'm at " + phraseRetriever.geoInfo();
       return results;
	}
}
