package edu.um.cps2004.task1.engine;

import edu.um.cps2004.task1.catalog.Mark;
import edu.um.cps2004.task1.robot.TTTRobot;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * @author Mark Said Camilleri
 * @version 20161105
 */
public class GameEngineTest {


    //A dummy implementation of TTTRobot
    class Robot implements TTTRobot{

        @Override
        public String getRobotMasterName() {
            return "Hello";
        }

        @Override
        public int play(GameBoard gameBoard, Mark mark) {
            return 0;
        }
    }

    TTTWarEngine engine;

    TTTRobot robotO = new Robot();
    TTTRobot robotX = new Robot();

    @Before
    public void initialize() {
        engine = new GameEngine(robotO, robotX);
    }

    /**
     * This is a test to be run in the test suite. The whole class is
     * a test suite. This method is one specific test.
     */
    @Test
    public void testGameBoardIsCreated(){
        assertNotNull("The Game has not been created", engine);
    }
}
