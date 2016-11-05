package engine;

import edu.um.cps2004.task1.robot.TTTRobot;
import org.junit.Test;
import org.mockito.Mock;

import static junit.framework.TestCase.assertNotNull;

/**
 * @author Mark Said Camilleri
 * @version 20161105
 */
public class GameEngineTest {

    /**
     * This robot is being mocked. As a result, we do not need to
     * instantiate it. Mocked objects are useful if we do not care
     * about them for the purpose of testing another class.
     *
     * To mock an object, use the @Mock annotation.
     */
    @Mock
    TTTRobot RobotO;

    /**
     * This robot is being mocked. As a result, we do not need to
     * instantiate it. Mocked objects are useful if we do not care
     * about them for the purpose of testing another class.
     *
     * To mock an object, use the @Mock annotation.
     */
    @Mock
    TTTRobot RobotX;


    /**
     * This is a test to be run in the test suite. The whole class is
     * a test suite. This method is one specific test.
     */
    @Test
    public void testGameBoardIsCreated(){
        assertNotNull("The Game has not been created", new GameEngine(RobotO, RobotX));
    }
}
