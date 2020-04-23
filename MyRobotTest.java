

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * MyRobot클래스에 있는 getSpeed메소드를 테스트하는 Test클래스입니다. 
 *
 * 2017605038 스피겔 크릴, 2018243144 노무라타카미치
 * 2020/04/23
 */
public class MyRobotTest
{
    /**
     * テストクラス MyRobotTest のためのデフォルトのコンストラクタ
     */
    public MyRobotTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void getSpeed_test()
    {
        MyRobot myRobot1 = new MyRobot();
        myRobot1.RobotWalk(100.0, "green");
        assertEquals(100.0, myRobot1.getSpeed(), 0.1);
        myRobot1.RobotWalk(100.0, "yellow");
        assertEquals(120.0, myRobot1.getSpeed(), 0.1);
        myRobot1.RobotWalk(100.0, "red");
        assertEquals(0.0, myRobot1.getSpeed(), 0.1);
    }
}

