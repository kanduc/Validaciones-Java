/*
 * 
 * 
 */
package utilitarios_java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kanduc
 */
public class validaciones {

    public static boolean validar_formato_ip(String nu_ip) {
        Pattern patron;
        Matcher combinar;
        String PATRON_DIRECCION_IP =
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        patron = Pattern.compile(PATRON_DIRECCION_IP);
        combinar = patron.matcher(nu_ip);
        return combinar.matches();
    }

    public static char validar_formato_solo_digitos(String p_palabra) {
        final String palabra = p_palabra.trim();
        final String formato_valido = "0123456789";
        final int tam_palabra = palabra.length();
        char c = '0';
        for (int i = 0; i < tam_palabra; i++) {
            c = palabra.charAt(i);
            if (formato_valido.indexOf(c) == -1) {
                return c;
            }
        }
        return '0';
    }
}
