package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication implements CommandLineRunner {

    @Autowired
    //@Qualifier("marioGame")
    //@Qualifier("superContraGame")
    GameRunner gameRunner;

    @Override
    public void run(String... args) throws Exception {
        gameRunner.run();
    }
}
