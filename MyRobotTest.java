

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * テストクラス MyRobotTest.
 *
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
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
        myRobot1.RobotWalk(100.0, "yellow");
        assertEquals(120.0, myRobot1.getSpeed(), 0.1);
    }
}

