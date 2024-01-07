import java.math.*;
import java.awt.Color;

public class Cercle implements Mesurable2D {

  private Point centre;
  private double rayon;
  private Color couleur; //E8

  public Cercle(Point _centre, double _rayon) {
    //E11
    Point p = new Point(_centre.getX(), _centre.getY());
    this.centre = p;
    this.rayon=_rayon;
    this.couleur=Color.BLUE; //E11
  }

  //E12
  public Cercle(Point c, Point d) {
    double centre_x=(c.getX() + d.getX())/2;
    double centre_y=(c.getY() + d.getY())/2;

    this.centre=new Point(centre_x, centre_y);

    this.rayon=c.distance(d) /2;
    this.couleur=Color.BLUE;
  }

  //E13
  public Cercle(Point c, Point d, Color couleur) {
    double centre_x=(c.getX() + d.getX())/2;
    double centre_y=(c.getY() + d.getY())/2;

    this.centre=new Point(centre_x, centre_y);

    this.rayon=c.distance(d) /2;
    this.couleur=couleur;
  }


  
  /** 
   * @param x
   * @param y
   */
  //E1
  public void translater(int x, int y) {
    this.centre.translater(x, y);
  }

  
  /** 
   * @return Point
   */
  //E2
  public Point getCentre() {
    Point p = new Point(this.centre.getX(), this.centre.getY());
    return p;
  }

  
  /** 
   * @param centre
   */
  public void setCentre(Point centre) {
    this.centre=centre;
  }

  
  /** 
   * @return double
   */
  //E3
  public double getRayon() {
    return rayon;
  }

  
  /** 
   * @param rayon
   */
  //E16
  public void setRayon(double rayon) {
    this.rayon=rayon;
  }

  
  /** 
   * @return double
   */
  //E4
  public double getDiametre() {
    return this.rayon *2;
  }


  
  /** 
   * @param autre
   * @return boolean
   */
  //E5
  public boolean contient(Point autre) {
    double d=centre.distance(autre);

    if (d <=rayon) {
      return true;
    }

    else {
      return false;
    }
  }

  
  /** 
   * @return double
   */
  //E6
  public double perimetre() {
    return 2*Math.PI*this.rayon;

  }

  
  /** 
   * @return double
   */
  public double aire() {
    return Math.PI*Math.pow(this.rayon, 2);
  }

  
  /** 
   * @return Color
   */
  //E9
  public Color getCouleur() {
    return couleur;
  }

  
  /** 
   * @param couleur
   */
  //E10
  public void setCouleur(Color couleur) {
    this.couleur=couleur;
  }

  
  /** 
   * @param d
   * @param e
   * @return Cercle
   */
  //E14
  public Cercle creerCercle(Point d, Point e) {
    double r=d.distance(e);
    Cercle c3=new Cercle(d, r);

    return c3;
  }

  
  /** 
   * @return String
   */
  //E15
  public String toString() {
    return "C"+ this.rayon + "@("+this.centre.getX() + ", "+ this.centre.getY() + ")";
  }

  
  /** 
   * @param nouveaudiametre
   */
  //E17
  public void setDiametre(double nouveaudiametre){
    this.rayon = nouveaudiametre/2;
  }
}

