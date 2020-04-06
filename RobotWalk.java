import java.util.*;
/**
 * Write a description of class RobotWalk here.
 *
 * 2017605038 스피겔 크릴, 2018243144 노무라타카미치
 * 2020/04/06
 */
public class RobotWalk
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("The traffic light: ");
        String signal = s.next();
        double speed = 100;
        
        speed = RobotWalk(signal, speed);
        
        System.out.println("Robot speed = " + String.valueOf(speed)); 
    }
    
    public static double RobotWalk(String signal, double speed){
        if(signal.equals("green")){
            speed = speed;
        }else if(signal.equals("yellow")){
            speed = speed * (1.2);
        }else if(signal.equals("red")){
            speed = 0;
        }
        return speed;
    }
}
