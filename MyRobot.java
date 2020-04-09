
/**
 * 로봇이 교통신호가 있는 횡단보도에 도착했을 때, 교통신호의 상태에 따라서, 
 * 아래와 같이 로봇의 보행속도를 조절하는 모듈이다.
 *
 * 2017605038 스피겔 크릴, 2018243144 노무라타카미치
 * 2020/04/06
 */
public class MyRobot
{
    public static void main(String[] args){
        double speed = 100;
        String[] TestCases = {"green", "red", "yellow", "123"}; //실험용 테스트 데이터 
        for (String temp : TestCases){      
            speed = RobotWalk(speed, temp);
            System.out.println("Robot speed = " + String.valueOf(speed));
            speed = 100;
        }
    }
    public static double RobotWalk(double speed, String signal){
        if(signal.equals("green")){ 
        }else{
            if(signal.equals("red")){
                speed = 0;
            }else{
                if(signal.equals("yellow")){
                    speed = speed * (1.2);
                }
            }
        }
        return speed;
    }
}   
    

