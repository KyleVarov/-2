import java.util.*;
/**
 * StatementCoverage
 *
 * 2017605038 스피겔 크릴, 2018243144 노무라타카미치
 * 2020/04/06
 */
public class StatementCoverage
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
            if(signal.equals("green")){
                speed = speed;
                roop = false;
            }
            if(signal.equals("yellow")){
                speed = speed * (1.2);
                roop = false;
            }
            if(signal.equals("red")){
                speed = 0;
                roop = false;
            }else{
                System.out.println("다시 한번 입력해주세요.");
            }
        }
        return speed;
    }
}
