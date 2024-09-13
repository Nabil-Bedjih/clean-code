package ex2;

/**
 * Représente un livret A avec un taux de rémunération.
 */
public class LivretA extends CompteBancaire {

    /**
     * Taux de rémunération annuel.
     */
    private double tauxRemuneration;

    /**
     * Constructeur pour initialiser un livret A.
     *
     * @param solde            solde initial du livret A
     * @param tauxRemuneration taux de rémunération annuel
     */
    public LivretA(double solde, double tauxRemuneration) {
        super(solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Débite un montant du livret A. Le découvert n'est pas autorisé.
     *
     * @param montant montant à débiter
     * @throws Exception si le montant dépasse le solde disponible
     */
    @Override
    public void debiterMontant(double montant) throws Exception {
        if (this.solde - montant < 0) {
            throw new Exception("Découvert non autorisé pour un livret A");
        }
        this.solde -= montant;
    }

    /**
     * Applique la rémunération annuelle au solde du livret A.
     */
    public void appliquerRemunerationAnnuelle() {
        this.solde += this.solde * tauxRemuneration / 100;
    }
}
