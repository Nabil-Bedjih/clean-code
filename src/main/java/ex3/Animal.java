package ex3;

/**
 * Représente un animal avec un nom, un type et un comportement alimentaire.
 */
public class Animal {

    private String nom;
    private String type;
    private String comportement;

    /**
     * Constructeur pour initialiser un animal.
     *
     * @param nom le nom de l'animal
     * @param type le type de l'animal (MAMMIFERE, POISSON, SERPENT, etc.)
     * @param comportement le comportement alimentaire (HERBIVORE, CARNIVORE, etc.)
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Getter pour le nom de l'animal.
     *
     * @return le nom de l'animal
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter pour le type de l'animal.
     *
     * @return le type de l'animal
     */
    public String getType() {
        return type;
    }

    /**
     * Getter pour le comportement alimentaire de l'animal.
     *
     * @return le comportement de l'animal
     */
    public String getComportement() {
        return comportement;
    }

    @Override
    public String toString() {
        return nom + " (" + type + ", " + comportement + ")";
    }
}
