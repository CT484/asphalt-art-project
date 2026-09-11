import org.code.neighborhood.*;
public class PainterPlus extends Painter{

  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }

  public void takeAllPaint(){
    while(isOnBucket()){
      takePaint();
    }
  }

  public void moveFast(){
    while(canMove()){
      move();
    }
  }

  public void paintToEmpty(String color){
    while(hasPaint()){
      paint(color);
      move();
    }  
  }

  public void paintDonut(String color){
    while(hasPaint()){
      move();
      turnRight();
      paint(color);
      move();
      paint(color);

    }
  }

  public void turnAround(){
    turnLeft();
    turnLeft();
  }
  
  public void paintFast(String color){
    while(canMove()){
      paint(color);
      move();
    }
  }

  //paints and moves 
  //something to note is it ends with a move meaning it doesn't paint on the last square
  public void paintAmount(String color, int num){
    for(int i = num; i > 0; i--){
      paint(color);
      move();
    }
  }

  //moves directly down
  //still facing the same direction
  public void moveDown(){
    String direction = getDirection();
    while(!isFacingSouth()){
      turnLeft();
    }
    move();
    while(direction != getDirection()){
      turnLeft();
    }
  }

  //moves up
  //still facing same direction
  public void moveUp(){
    String direction = getDirection();
    while(!isFacingNorth()){
      turnLeft();
    }
    move();
    while(direction != getDirection()){
      turnLeft();
    }
  }

}