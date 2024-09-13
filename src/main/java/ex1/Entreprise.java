package ex1;

import java.util.Date;

/**
 * La classe {@code Entreprise} représente une entité commerciale avec ses informations de base.
 */
public class Entreprise {

    /**
     * Le capital maximum qu'une entreprise peut avoir.
     */
    public static final int CAPITAL_MAXIMAL = 3000000;

    /**
     * Le numéro SIRET de l'entreprise.
     */
    private int siret;

    /**
     * Le nom de l'entreprise.
     */
    private String nom;

    /**
     * L'adresse de l'entreprise.
     */
    private String adresse;

    /**
     * La date de création de l'entreprise.
     */
    private Date dateDeCreation;

    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
    }


}
