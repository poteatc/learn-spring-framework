package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.GamingConsole;
import com.in28minutes.spring.learnspringframework.game.MarioGame;
import com.in28minutes.spring.learnspringframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		// When launching SpringApplicationContext, spring framework creates an instance for all the components
		// context will manage all Beans
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		GamingConsole game = new MarioGame();
//		GameRunner runner = new GameRunner(game);
//		runner.run();
//
//		game = new SuperContraGame();
//		runner = new GameRunner(game);
		// Getting one of the bean instances from the context
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

	}

}
