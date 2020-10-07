package be.isims.ihm.tp2.ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * FormatMail est la classe qui vérifie si la chaine est une adresse mail
 *
 * @see Format
 * @author Marchand Valentin
 * @version 1.0
 */
public class FormatMail implements Format
{
    /**
     * Regex d'une adresse mail
     */
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    /**
     * Teste si le format est une adresse mail
     *
     * @param value Valeur testé
     * @return true si c'est une adresse mail
     */
    @Override
    public boolean isValid(String value)
    {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(value);
        return matcher.find();
    }
}
