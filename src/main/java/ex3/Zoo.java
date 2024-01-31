package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un zoo avec son nom et les animaux qu'il héberge
 * @author Marjory PRIN
 */
public class Zoo {
	
	/** nom : nom du zoo*/
	private String nom;
	
	/** animaux : liste des animaux du zoo */
	private List<Animal> animaux;
	
	
	/** Constructeur
	 * @param nom : nom du zoo
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.animaux = new ArrayList<Animal>();
	}
	
	
	/**
	 * Permet d'ajouter un animal au zoo
	 * @param animal : l'animal à ajouter
	 */
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}
	
	/**
	 * Permet d'afficher la liste des animaux du zoo
	 */
	public void afficherListeAnimaux(){
		for (int i=0; i<animaux.size(); i++) {
			System.out.println(animaux.get(i).getNom()+" "+animaux.get(i).getType()+" "+animaux.get(i).getComportement());
		}
	}
	
	/**
	 * Permet de récupérer le nombre d'animaux du zoo
	 * @return le nombre d'animaux
	 */
	public int getNbAnimaux() {
		return animaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
