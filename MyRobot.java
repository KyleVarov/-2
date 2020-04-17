
/**
 * 로봇이 교통신호가 있는 횡단보도에 도착했을 때, 교통신호의 상태에 따라서, 
 * 아래와 같이 로봇의 보행속도를 조절하는 모듈이다.
 *
 * 2017605038 스피겔 크릴, 2018243144 노무라타카미치
 * 2020/04/06
 */
public class MyRobot
{
    private double speed = 100.0;
    public void RobotWalk(double speed, String signal){
        if(signal.equals("green")){ 
        }else{
            if(signal.equals("red")){
                this.speed = 0;
            }else{
                if(signal.equals("yellow")){
                    this.speed = speed * (1.2);
                }
            }
        }
    }
    public double getSpeed(){
        return this.speed;
    }
}       
    

