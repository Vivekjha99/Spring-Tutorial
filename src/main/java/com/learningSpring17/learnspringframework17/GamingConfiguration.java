package com.learningSpring17.learnspringframework17;

import com.learningSpring17.learnspringframework17.game.GameRunner;
import com.learningSpring17.learnspringframework17.game.GamingConsole;
import com.learningSpring17.learnspringframework17.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }
    //We are creating a pacMan game and wiring it to the gameRunner Bean.
    @Bean
    public GameRunner gamerunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
