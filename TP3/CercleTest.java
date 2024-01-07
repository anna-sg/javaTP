import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

public class CercleTest {

	// prÃ©cision pour les comparaisons rÃ©elle
	public final static double EPSILON = 0.001;

private Point C, D, E;

  @Before
  public void setUp() {
    C = new Point(4, 1);
    D = new Point(8, 1);
    E = new Point(8, 4);
  }

  
  /** 
   * @param p1
   * @param p2
   */
  static void memesCoordonnees(Point p1, Point p2) {
		assertEquals(" (x)", p1.getX(), p2.getX(), EPSILON);
		assertEquals(" (y)", p1.getY(), p2.getY(), EPSILON);
	}

  @Test
  public void testerE12(){
    Cercle C2 = new Cercle(C,D);

    memesCoordonnees(C2.getCentre(), new Point(6,1));
  }

  @Test
  public void testerE13(){
    Cercle C2 = new Cercle(C,D, Color.BLUE);

    memesCoordonnees(C2.getCentre(), new Point(6,1));
    assertEquals(Color.BLUE, C2.getCouleur()); 
  }

  @Test
  public void testerE14(){
    Cercle C3 = new Cercle(D,E);
    Cercle C4 = C3.creerCercle(D,E);

    memesCoordonnees(C4.getCentre(), D);
  }

}
