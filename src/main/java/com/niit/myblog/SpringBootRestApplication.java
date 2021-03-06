package com.niit.myblog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.niit.myblog.model.Quote;

@SpringBootApplication
public class SpringBootRestApplication {
	
	//private static final Logger log=  LoggerFactory.getLogger(SpringBootRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder)
	{
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run (RestTemplate restTemplate) throws Exception{
		return args -> {
			Quote quote= restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random",Quote.class);
			//log.info(quote.toString());
			System.out.println("*****************8Consuming web services************");
			System.out.println(quote.toString());
				
			
		};
	}

}
