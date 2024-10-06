package in.BikkadIT.ComponentScanning;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	public User() {
		super();
		System.out.println("User Class Constructor");
	}

}
