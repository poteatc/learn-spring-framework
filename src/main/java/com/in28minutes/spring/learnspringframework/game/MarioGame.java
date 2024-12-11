package com.in28minutes.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("marioGame")
@Primary
public class MarioGame implements GamingConsole{
    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("down");
    }

    public void left() {
        System.out.println("left");
    }

    public void right() {
        System.out.println("right");
    }
}
