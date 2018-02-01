
/**
 * Convert seconds in day:hour:minute:second
 *
 * @Charles
 * @30Jan2018
 */
public class ConversionSecondes{
    /**
     * Converts seconds in day:hour:minute:seconds     *
     */
    public static void main(String [] args)    {
        final int SECONDE_EN_JOUR = 86400;
        final int SECONDE_EN_HEURE = 3600;
        final int SECONDE_EN_MINUTE = 60;
        final String MESS_SOLLICITATION = "Veuillez entrer le nombre de"
                    + "secondes que vous voulez convertir (>= 0)\n(Entrez 0 secondes pour quitter) :";
        final String MESS_PRESENTATION_PROGRAM = "Ce programme transforme un nombre de secondes "
                    + "en jours/heures/minutes.";
        final String MESS_ERR_SEC_INVALIDE = "ERREUR. Vous n'avez pas entré un nombre plus grand ou égal à zéro";
        final String MESS_FIN = "Fin normale du programme";
        
        int nbSecondesSaisie;
        int nbSecondes;
        int nbJour;
        int nbHeure;
        int nbMinute;
        
        System.out.println(MESS_PRESENTATION_PROGRAM);
        System.out.print(MESS_SOLLICITATION);
        nbSecondesSaisie = Clavier.lireIntLn();
        while(nbSecondesSaisie != 0){
            while(nbSecondesSaisie < 0){
                System.out.println(MESS_ERR_SEC_INVALIDE);
                System.out.print(MESS_SOLLICITATION);
                nbSecondesSaisie = Clavier.lireIntLn();
            }
            nbJour = nbSecondesSaisie / SECONDE_EN_JOUR;
            nbSecondes = nbSecondesSaisie % SECONDE_EN_JOUR;
            nbHeure = nbSecondes / SECONDE_EN_HEURE;
            nbSecondes = nbSecondes % SECONDE_EN_HEURE;
            nbMinute = nbSecondes / SECONDE_EN_MINUTE;
            nbSecondes = nbSecondes % SECONDE_EN_MINUTE;
            System.out.println(nbSecondesSaisie + " seccondes est équivalent à :" 
                    + nbJour + " jours, " + nbHeure + " heures, " + nbMinute
                    +" minutes et " + nbSecondes + " secondes.");
        System.out.print(MESS_SOLLICITATION);
        nbSecondesSaisie = Clavier.lireIntLn();
        }
        System.out.println(MESS_FIN);
    }
}
