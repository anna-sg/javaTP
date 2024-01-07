public class ExempleSchema1 {
  public static void main (String[] args){

    Point p1 = new Point(3,2);
    Point p2 = new Point(6,9);
    Point p3 = new Point(11,4);

    Segment s1 = new Segment(p1, p2);
    Segment s2 = new Segment(p2, p3);
    Segment s3 = new Segment(p3, p1);

    double bar_x = (p1.getX() + p2.getX() + p3.getX()) / 3;
    double bar_y = (p1.getY() + p2.getY() + p3.getY()) / 3;

    Point barycentre = new Point(bar_x, bar_y);

  }
}
