package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.GamingConsole;
import com.in28minutes.spring.learnspringframework.game.MarioGame;
import com.in28minutes.spring.learnspringframework.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GamingConsole game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();

		game = new SuperContraGame();
		runner = new GameRunner(game);
		runner.run();

	}

}
