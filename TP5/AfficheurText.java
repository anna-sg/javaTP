import java.awt.Color;

import afficheur.Afficheur;

public class AfficheurText implements Afficheur  {

  @Override
  public void dessinerCercle(double x, double y, double rayon, Color c) {
    System.out.println("Cercle { \n\tcentre_x = " + x +"\n\tcentre_y = " + y +"\n\trayon = " + rayon +"\n\tcouleur = " + c.toString() + "\n}");
  }

  @Override
  public void dessinerLigne(double x1, double y1, double x2, double y2, Color c) {
   System.out.println("Ligne{ \n\tx1 = " + x1 +"\n\ty1 = " + y1 +"\n\tx2 = " + x2 +"\n\ty2 = " + y2 + "\n\tcouleur = " + c.toString() + "\n}");
  }

  @Override
  public void dessinerPoint(double x, double y, Color c) {
    System.out.println("Point{ \n\tx = " + x +"\n\ty = " + y + "\n\tcouleur = " + c.toString() + "\n}");
  }

  @Override
  public void dessinerTexte(double x, double y, String texte, Color c) {
  System.out.println("Texte{ \n\tx = " + x +"\n\ty = " + y + "\n\tValeur = \"" + texte + "\"\n\tcouleur = " + c.toString() + "\n}");
  }

  
  
}
