package com.learningSpring17.learnspringframework17;

import com.learningSpring17.learnspringframework17.game.GameRunner;
import com.learningSpring17.learnspringframework17.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
