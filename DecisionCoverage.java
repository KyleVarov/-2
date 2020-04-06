import java.util.*;
/**
 * DecisionCoverage
 * 
 * 2017605038 스피겔 크릴, 2018243144 노무라타카미치
 * 2020/04/06
 */
public class DecisionCoverage
{
    public static void main(String[] args){
        double speed = 100;
        speed = RobotWalk(speed);
        
        System.out.println("Robot speed = " + String.valueOf(speed));
    }  
    
    public static double RobotWalk(double speed){
        Scanner s = new Scanner(System.in);
        boolean roop = true;
        while(roop){
            System.out.print("The traffic light: ");
            String signal = s.next();
            switch(signal){
                case "green":
                    speed = speed;
                    roop = false;
                    break;
                case "yellow":
                    speed *= 1.2;
                    roop = false;
                    break;
                case "red":
                    speed = 0;
                    roop = false;
                    break;
                default:
                    System.out.println("다시 한번 입력해주세요.");
            }
        }
        return speed;
    }
}
