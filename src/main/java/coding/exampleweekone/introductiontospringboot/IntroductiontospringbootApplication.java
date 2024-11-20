package coding.exampleweekone.introductiontospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductiontospringbootApplication implements CommandLineRunner {
	@Autowired
	Apple obj;


	public static void main(String[] args) {
		SpringApplication.run(IntroductiontospringbootApplication.class, args);



	}


	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
	}
}
