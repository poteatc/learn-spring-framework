package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.enterprise.example.MyWebController;
import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.GamingConsole;
import com.in28minutes.spring.learnspringframework.game.MarioGame;
import com.in28minutes.spring.learnspringframework.game.SuperContraGame;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		// When launching SpringApplicationContext, spring framework creates an instance for all the components
		// context will manage all Beans
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		// ApplicationContext is the IoC container
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());

		// Remember to toggle comment @SpringBootApplication if this is uncommented
		//SpringApplication.run(GameApplication.class, args);

		// Getting one of the bean instances from the context
		//GameRunner runner = context.getBean(GameRunner.class);
		//runner.run();

	}

}
