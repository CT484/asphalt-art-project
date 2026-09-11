import org.code.neighborhood.*;
public class coverPainter extends PainterPlus{
  public void mapCover(){
    while(canMove()){
      //makes sure the painter doesn't try and go out of bounds
      if(getY() == 15){
        paintFast("white");
        paint("white");
      }
      if(isFacingEast()){
        paintFast("white");
        turnRight();
        paint("white");
        move();
        turnRight();
      }
      if(isFacingWest() && getY() != 15){
        paintFast("white");
        turnLeft();
        paint("white");
        move();
        turnLeft();
      }
    }
  }

  
}
