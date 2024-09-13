package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

    /**
     * Formate une date selon le modèle fourni.
     *
     * @param pattern le modèle de formatage (par exemple, "dd/MM/yyyy")
     * @param date    la date à formater
     * @return la date formatée en chaîne de caractères
     */
    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /**
     * Formate une date selon le modèle par défaut "dd/MM/yyyy HH:mm:ss".
     *
     * @param date la date à formater
     * @return la date formatée en chaîne de caractères
     */
    public static String formatDefaut(Date date) {
        return format(DEFAULT_PATTERN, date);
    }
}
