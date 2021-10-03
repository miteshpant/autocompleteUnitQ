package com.unitq.autocomplete;

import com.unitq.autocomplete.service.Utility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class AutocompleteApplication {

//	TODO if we need cache servivce we can enable the connection between autocomplete service and cache
//	cache can be implemented simply on a hash map and can store upto say 30 words and van be evicted on LRU strategy
//	It can be a write back cache
//	@Bean
//	private RestTemplate restTemplate(){
//		return new RestTemplate();
//	}

	@Bean
	public Utility trieUtility() throws FileNotFoundException {
		List result = null;
		FileReader fileReader = new FileReader("src/main/resources/words.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Stream<String> lines = bufferedReader.lines();
		result = lines.collect(Collectors.toList());
		return new Utility(result);
	}

	public static void main(String[] args) {

		log.info("Starting text auto complete service");
		SpringApplication.run(AutocompleteApplication.class, args);

	}

}
