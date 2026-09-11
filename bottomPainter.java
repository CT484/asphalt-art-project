import org.code.neighborhood.*;
public class bottomPainter extends PainterPlus{
  public void paintBottom(){
    //gets the painter in position
    turnRight();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    turnRight();

    //paints the bottom back of the car
    paintAmount("black",2);
    turnRight();
    move();
    turnLeft();
    paintAmount("black",2);
    turnLeft();
    paintAmount("black",3);

    //paints first wheel
    moveDown();
    paint("black");
    moveUp();
    moveUp();
    paint("black");
    move();
    moveDown();
    paint("black");
    
    paintAmount("black",6);
    
    //paints second wheel
    moveDown();
    paint("black");
    moveUp();
    moveUp();
    paint("black");
    move();
    moveDown();
    paint("black");
    
    paintAmount("black",3);
  }
}