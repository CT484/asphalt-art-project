import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    coverPainter cover = new coverPainter();
    bottomPainter bottom = new bottomPainter();
    topPainter top = new topPainter();
    polishPainter polish = new polishPainter();

    //gives paint to all painters
    cover.setPaint(999);
    bottom.setPaint(999);
    top.setPaint(999);
    polish.setPaint(999);
    
    
    //check subclasses
    cover.mapCover();
    top.paintTop();
    bottom.paintBottom();
    //you can change the color of the car
    polish.paintPolish("orange");


    


    
  }
}