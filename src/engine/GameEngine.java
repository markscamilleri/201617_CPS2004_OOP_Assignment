package engine;

import edu.um.cps2004.task1.engine.TTTWarEngine;
import edu.um.cps2004.task1.robot.TTTRobot;

/**
 * @author Mark Said Camilleri
 * @version 20161105
 */
public class GameEngine extends TTTWarEngine {


    public GameEngine(TTTRobot robotO, TTTRobot robotX) {
        super(robotO, robotX);
    }

    @Override
    public void play() {
        while(!(this.board.isWinningPosition() || this.board.isFull())){

        }
    }
}
