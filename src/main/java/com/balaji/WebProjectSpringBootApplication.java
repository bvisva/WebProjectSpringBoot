package com.balaji;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WebProjectSpringBootApplication{

	public static void main(String[] args) {
		SpringApplication.run(WebProjectSpringBootApplication.class, args);
	}
	
}	
	


/*@SpringBootApplication
public class WebProjectSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebProjectSpringBootApplication.class, args);
	}
	
	 //access command line arguments
    @Override
    public void run(String... args) throws Exception {
    	System.out.println("Inside run function..");
        //do something
		
    }*/


