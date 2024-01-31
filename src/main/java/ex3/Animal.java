package ex3;

/**
 * Classe représentant un animal du zoo
 * @author Marjory PRIN
 */
public class Animal {
	
	/** nom : nom de l'animal */
	private String nom;
	
	/** type : type de l'animal */
	private TypeAnimal type;
	
	/** comportement : comportement alimentaire de l'animal */
	private ComportementAlimentaire comportement;

	/** Constructeur
	 * @param nom : nom de l'animal
	 * @param type : type de l'animal
	 * @param comportement : comportement alimentaire de l'animal
	 */
	public Animal(String nom, TypeAnimal type, ComportementAlimentaire comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	/** Getter
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

	/** Getter
	 * @return the type
	 */
	public TypeAnimal getType() {
		return type;
	}

	/** Setter
	 * @param type the type to set
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
	}

	/** Getter
	 * @return the comportement
	 */
	public ComportementAlimentaire getComportement() {
		return comportement;
	}

	/** Setter
	 * @param comportement the comportement to set
	 */
	public void setComportement(ComportementAlimentaire comportement) {
		this.comportement = comportement;
	}

	
}
