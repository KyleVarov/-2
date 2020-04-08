
/**
 * Write a description of class MyRobot here.
 *
 * 2017605038 스피겔 크릴, 2018243144 노무라타카미치
 * 2020/04/06
 */
public class MyRobot
{
    public static void main(String[] args){
        double speed = 100;
        //String signal = "red";
        String[] TestSignal = {"yellow","green", "red", "yellow", "123"}; //실험용 테스트 데이터 
        for (String temp : TestSignal){      
            speed = RobotWalk(speed, temp);
            System.out.println("Robot speed = " + String.valueOf(speed));
            speed = 100;
        }
    }
    public static double RobotWalk(double speed, String signal){
        if(signal.equals("green")){ 
        }else{
            if(signal.equals("yellow")){
            speed = speed * (1.2);
            }else{
                if(signal.equals("red")){
                    speed = 0;
                }else{
                    System.out.println("잘 못된 입력!");
        }
        }
        }
        return speed;
    }
}   
    

