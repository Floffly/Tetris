import java.util.ArrayList;
import java.util.List;

import fr.esiea.auffret_coffin_royledoux.affichage.Affiche;
import fr.esiea.auffret_coffin_royledoux.affichage.Printer;
import fr.esiea.auffret_coffin_royledoux.core.Jeu;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.generationPiece.PieceFactory;
import fr.esiea.auffret_coffin_royledoux.mouvement.Deplacement;
import fr.esiea.auffret_coffin_royledoux.mouvement.Rotation;
import fr.esiea.auffret_coffin_royledoux.terrain.Plateau;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Jeu();
		
		/*Piece p = new Barre(0, 20);
		//Piece c = new Cube(0, 20);
		PieceFactory pf = new PieceFactory();
		Piece a = pf.Barre();
		List<Piece> liste = new ArrayList<Piece>();
		liste.add(a);
		//p.setPositionX(0);
		//p.setPositionY(20);
		//p.creerBarre();
		
		new Printer(liste.get(2).getForme());
		Rotation r = new Rotation();
		r.horaire(p);
		new Printer(p.getForme());
		r.horaire(p);
		new Printer(p.getForme());
		r.antiHoraire(p);
		new Printer(p.getForme());
		Deplacement d = new Deplacement();
		d.descendre(c);
		new Printer(Plateau.tableau);
		*/

	}

}
