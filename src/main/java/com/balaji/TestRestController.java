package com.balaji;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestRestController {
	
	//@RequestMapping("/welcome")
	//@RequestMapping(value = "/welcome", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping("/welcome")
	public String welcome() {//Welcome page, non-rest
		//System.out.println("I am in welcome");
        return "Welcome to RestTemplate Example.";
    }
	
	//@RequestMapping(value = "/alien", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping("/alien")
	public Alien getAlien() {
		System.out.println("I am in Alien");
    	Alien a1 = new Alien();
    	a1.setAlienId(1);
    	a1.setAlienName("Balaji");
    	a1.setAlienPoints(100);
    	 //ObjectMapper mapper = new ObjectMapper();
         //Converting the Object to JSONString
         
        
        return a1; 
    }
 
}
