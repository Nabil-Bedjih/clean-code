package ex5;

/**
 * Interface qui définit la méthode pour accepter ou non un item.
 */
public interface CaisseAccepteur {

    /**
     * Détermine si la caisse accepte un certain item.
     *
     * @param item l'item à vérifier
     * @return true si l'item est accepté, false sinon
     */
    boolean accepteItem(Item item);
}
