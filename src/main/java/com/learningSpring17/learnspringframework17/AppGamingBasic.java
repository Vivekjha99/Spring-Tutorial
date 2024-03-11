package com.learningSpring17.learnspringframework17;

import com.learningSpring17.learnspringframework17.game.GameRunner;
import com.learningSpring17.learnspringframework17.game.PacmanGame;

public class AppGamingBasic {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            var game=new PacmanGame();
            var gameRunner=new GameRunner(game);
            gameRunner.run();
        }
}

