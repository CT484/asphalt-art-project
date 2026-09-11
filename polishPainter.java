import org.code.neighborhood.*;
public class polishPainter extends PainterPlus{
  public void paintPolish(String color){
    //gets painter in position
    turnRight();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();

    //paints window
    paint("black");
    moveDown();
    paint("black");
    moveDown();
    paint("black");
    paintAmount("black",6);
    turnAround();
    move();
    move();
    move();
    moveUp();
    paint("cyan");
    move();
    paint("cyan");
    move();
    paint("cyan");
    moveUp();
    paint("cyan");

    //colors the car whatever color
    move();
    move();
    paintAmount(color,2);
    move();
    move();
    moveDown();
    turnAround();
    paintAmount(color,5);
    moveDown();
    turnAround();
    move();
    paintAmount(color,5);
    moveDown();
    turnAround();
    paintAmount(color,13);
    moveDown();
    turnAround();
    move();
    paintAmount(color,3);
    move();
    paintAmount(color,6);
    move();
    paintAmount(color,2);

    //adds the bottom details to the wheels
    turnAround();
    move();
    move();
    moveDown();
    moveDown();
    paint("black");
    move();
    moveUp();
    paint("gray");
    moveDown();
    move();
    paint("black");
    move();
    move();
    move();
    move();
    move();
    paint("black");
    move();
    moveUp();
    paint("gray");
    moveDown();
    move();
    paint("black");
    move();
    move();
    
  }
}