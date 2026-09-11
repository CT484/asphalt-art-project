import org.code.neighborhood.*;
public class topPainter extends PainterPlus{
  public void paintTop(){

    //paints the spoiler
    move();
    turnRight();
    move();
    turnLeft();
    paintAmount("black",3);

    //paints entire top area
    turnAround();
    move();
    move();
    turnLeft();
    paintAmount("black",3);
    turnLeft();
    paintAmount("black",3);
    turnLeft();
    move();
    turnRight();
    paintAmount("black",4);
    moveDown();
    paintAmount("black",2);
    moveDown();
    paintAmount("black",2);
    moveDown();
    paintAmount("black",1);
    moveDown();
    turnRight();
    paintAmount("black",2);
  }
}