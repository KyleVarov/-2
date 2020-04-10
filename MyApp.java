
/**
 * MyRobot에서 있는 RobotWalk() 메소드를 여러가지 TestCase로 
 * 실행하는 main() 메소드를 가지고 있는 클래스이다.
 *
 * 2017605038 스피겔 크릴, 2018243144 노무라타카미치
 * 2020/04/06
 */
public class MyApp
{
    public static void main(String[] args){
        double speed = 100;
        String[] TestCases = {"green", "red", "yellow", "다른 입력"}; //실험용 테스트 데이터 
        for (String signal : TestCases){      
            speed = MyRobot.RobotWalk(speed, signal);
            System.out.println("Traffic light: " + signal + " --> "+"Robot speed = " + String.valueOf(speed));
            speed = 100; //속도를 다시 100으로 초기화한다
        }
    }
}
