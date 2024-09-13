package ex2;

/**
 * Représente un compte bancaire générique.
 */
public class CompteBancaire {

    /**
     * Solde du compte.
     */
    protected double solde;

    /**
     * Constructeur pour initialiser le solde du compte.
     *
     * @param solde solde initial du compte
     */
    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    /**
     * Ajoute un montant au solde.
     *
     * @param montant montant à ajouter
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant du solde, à implémenter par les sous-classes selon leurs règles spécifiques.
     *
     * @param montant montant à débiter
     * @throws Exception si le débit n'est pas autorisé
     */
    public void debiterMontant(double montant) throws Exception {
        if (this.solde - montant < 0) {
            throw new Exception("Fonds insuffisants");
        }
        this.solde -= montant;
    }

    /**
     * Getter pour le solde du compte.
     *
     * @return le solde du compte
     */
    public double getSolde() {
        return solde;
    }
}
