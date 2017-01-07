package edu.um.cps2004.task1.engine;

import edu.um.cps2004.task1.catalog.Mark;
import edu.um.cps2004.task1.robot.Miguel;
import edu.um.cps2004.task1.robot.TTTRobot;
import edu.um.cps2004.task1.robot.ella;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * @author Mark Said Camilleri
 * @version 20161105
 */
public class GameEngineTest {


    //A dummy implementation of TTTRobot
    private class Robot implements TTTRobot{

        @Override
        public String getRobotMasterName() {
            return "Hello";
        }

        @Override
        public int play(GameBoard gameBoard, Mark mark) {
            return 0;
        }
    }

    private TTTWarEngine engine;

    private TTTRobot robotO = new Robot();
    private TTTRobot robotX = new Robot();

    private ByteArrayOutputStream out;
    private PrintStream stdout = new PrintStream(new FileOutputStream(FileDescriptor.out));

    @Before
    public void initialize(){
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    /**
     * This is a test to be run in the test suite. The whole class is
     * a test suite. This method is one specific test.
     */
    @Test
    public void testGameEngineCreated(){
        engine = new GameEngine(robotO, robotX);
        assertNotNull("The Game has not been created", engine);
    }

    /**
     * Tests if the IllegalArgumentException is thrown
     * when the first robot is null
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGameEngineFirstNull(){
        engine = new GameEngine(null, robotX);
    }

    /**
     * Tests if the IllegalArgumentException is thrown
     * when the second robot is null
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGameEngineSecondNull(){
        engine = new GameEngine(robotO, null);
    }

    /**
     * Tests if the IllegalArgumentException is thrown
     * when the both robots are null
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGameEngineBothNull(){
        engine = new GameEngine(null, null);
    }

    /**
     * Checks whether the robots are valid
     */
    @Test
    public void testGameEngineCreatedWithActualRobots(){
        engine = new GameEngine(new ella(), new Miguel());
        assertNotNull("The Game has not been created with actual robots", engine);
    }

    /**
     * Checks whether a winner was output with only 1 robot player
     */
    @Test
    public void testGameEnginePlayWith1Players(){
        engine = new GameEngine(new Miguel(), new Miguel());
        engine.play();
        String output = new String(out.toByteArray(), StandardCharsets.UTF_8);
        String[] outputs = output.split("\n");
//        System.setOut(stdout);
//        System.out.println(output);
        assertTrue(outputs[outputs.length - 1].contains("Miguel"));
    }



    /**
     * Checks whether a winner was output with 2 different players
     */
    @Test
    public void testGameEnginePlayWith2DifferentPlayers(){
        engine = new GameEngine(new ella(), new Miguel());
        engine.play();
        String output = new String(out.toByteArray(), StandardCharsets.UTF_8);
        String[] outputs = output.split("\n");
//        System.setOut(stdout);
//        System.out.println(output);
        assertTrue(outputs[outputs.length - 1].contains("Miguel") || outputs[outputs.length - 1].contains("Ella"));
    }

}
