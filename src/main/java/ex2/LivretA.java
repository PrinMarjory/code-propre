package ex2;

/** Représente un compte bancaire de type livret A 
 * @author Marjory PRIN
 */
public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération */
	private double tauxRemuneration;

	/** Constructeur
	 * @param type
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	public void appliquerRemuAnnuelle(){
		double solde = this.getSolde();
		this.setSolde(solde + solde*tauxRemuneration/100);
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant){
		if (this.getSolde() - montant > 0){
			this.setSolde(this.getSolde()- montant); 
		}	
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
