import afficheur.Ecran;
import afficheur.AfficheurSVG;
import java.awt.Color;



/** Construire le schéma proposé dans le sujet de TP avec des points,
  * et des segments.
  *
  * @author	Xavier Crégut
  * @version	$Revision: 1.7 $
  */
public class ExempleSchema1 {

	/** Construire le schéma et le manipuler.
	  * Le schéma est affiché.
	  * @param args les arguments de la ligne de commande
	  */
	public static void main(String[] args)
	{
		// Créer les trois segments
		Point p1 = new Point(3, 2);
		Point p2 = new Point(6, 9);
		Point p3 = new Point(11, 4);
		Segment s12 = new Segment(p1, p2);
		Segment s23 = new Segment(p2, p3);
		Segment s31 = new Segment(p3, p1);

		// Créer le barycentre
		double sx = p1.getX() + p2.getX() + p3.getX();
		double sy = p1.getY() + p2.getY() + p3.getY();
		Point barycentre = new Point(sx / 3, sy / 3);

		// Afficher le schéma
		System.out.println("Le schéma est composé de : ");
		s12.afficher();		System.out.println();
		s23.afficher();		System.out.println();
		s31.afficher();		System.out.println();
		barycentre.afficher();	System.out.println();

		// Ecran

		Ecran ecran = new Ecran("ExempleSchema1", 600, 400, 20);
		ecran.dessinerAxes();
		p1.dessiner(ecran);
		p2.dessiner(ecran);
		p3.dessiner(ecran);
		s12.dessiner(ecran);
		s23.dessiner(ecran);
		s31.dessiner(ecran);
		barycentre.dessiner(ecran);

		// Exercice 3
		s12.translater(4, -3);
		s23.translater(4, -3);
		s31.translater(4, -3);


		// Redéfinition du barycentre
		sx = p1.getX() + p2.getX() + p3.getX();
		sy = p1.getY() + p2.getY() + p3.getY();
		barycentre = new Point(sx / 3, sy / 3);


		// Afficher le schéma
		System.out.println("\nLe schéma est composé de : ");
		s12.afficher();		System.out.println();
		s23.afficher();		System.out.println();
		s31.afficher();		System.out.println();
		barycentre.afficher();	System.out.println();

		ecran.dessinerAxes();
		p1.dessiner(ecran);
		p2.dessiner(ecran);
		p3.dessiner(ecran);
		s12.dessiner(ecran);
		s23.dessiner(ecran);
		s31.dessiner(ecran);
		barycentre.dessiner(ecran);

		/** explication du 2. de l'exercice 3 : La translation d'un segment fait translater les deux points qui le constitue.
		 Ainsi, exécuter s12.translater fait translater les points p1 et p2.
		 Parallèlement, s23.translater fera translater les points p2 et p3.
		 De là, on remarque que le point p2 sera translaté plus d'une fois. 
		 Par conséquent, dans cet état , notre code fait translater les points constituant notre triangle plus d'une fois chacun.
		 D'où l'erreur.
		 * 
		 */

		 // Exercice 4

		 AfficheurSVG afficheurSVG = new AfficheurSVG("ExempleSchema1", "Exemple de description", 600, 400);

		afficheurSVG.dessinerPoint(p1.getX(), p1.getY(), p1.getCouleur());
		afficheurSVG.dessinerPoint(p2.getX(), p2.getY(), p2.getCouleur());
		afficheurSVG.dessinerPoint(p3.getX(), p3.getY(), p3.getCouleur());

		afficheurSVG.dessinerLigne(p1.getX(), p1.getY(), p2.getX(), p2.getY(), s12.getCouleur());
		afficheurSVG.dessinerLigne(p3.getX(), p3.getY(), p2.getX(), p2.getY(), s23.getCouleur());
		afficheurSVG.dessinerLigne(p3.getX(), p3.getY(), p1.getX(), p1.getY(), s31.getCouleur());

		afficheurSVG.ecrire("Schema.svg");

		// Exercice 5
		AfficheurText afficheurText = new AfficheurText();
		afficheurText.dessinerPoint(p1.getX(), p1.getY(), p1.getCouleur());
		afficheurText.dessinerLigne(p1.getX(), p1.getY(), p2.getX(), p2.getY(), s12.getCouleur());
		afficheurText.dessinerCercle(4, 4, 2.5, Color.YELLOW);
		afficheurText.dessinerTexte(1, -2, "Premier dessin", Color.WHITE);
	
	}

}
