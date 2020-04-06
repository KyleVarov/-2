
/**
 * Write a description of class RobotWalk here.
 *
 * 2017605038 스피겔 크릴, 2018243144 노무라타카미치
 * 2020/04/06
 */
public class RobotWalk
{
    public static void main(String[] args){
        double speed = 100;
        String signal = "green";
        
        speed = RobotWalk(signal, speed);
        
        System.out.println("The traffic light: "+ signal + "\n" + "Robot speed = " + String.valueOf(speed)); 
    }
    
    public static double RobotWalk(String signal, double speed){
        
        if(signal == "yellow"){
            speed = speed * (1.2);
        }
        if(signal == "red"){
            speed = 0;
        
        }
        return speed;
    }
}
