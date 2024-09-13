package ex2;

/**
 * Représente un compte courant qui peut avoir un découvert autorisé.
 */
public class CompteCourant extends CompteBancaire {

    /**
     * Montant du découvert autorisé.
     */
    private double decouvertAutorise;

    /**
     * Constructeur pour initialiser un compte courant avec un découvert autorisé.
     *
     * @param solde             solde initial du compte
     * @param decouvertAutorise montant du découvert autorisé
     */
    public CompteCourant(double solde, double decouvertAutorise) {
        super(solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    /**
     * Débite un montant du compte courant. Le découvert est pris en compte.
     *
     * @param montant montant à débiter
     * @throws Exception si le montant dépasse le découvert autorisé
     */
    @Override
    public void debiterMontant(double montant) throws Exception {
        if (this.solde - montant < -decouvertAutorise) {
            throw new Exception("Montant dépasse le découvert autorisé");
        }
        this.solde -= montant;
    }
}
