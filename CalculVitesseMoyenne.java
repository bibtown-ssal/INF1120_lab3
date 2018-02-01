
/**
 * Write a description of class CalculVitesseMoyenne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculVitesseMoyenne
{

    public static void main(String [] args)
    {
        final String MESS_PRESENTATION = "Ce programme calcule la vitesse moyenne sur un trajet effectue en plusieurs troncons";
        final String MESS_SOLI_VITESSE = "Veuillez entrer la vitesse moyenne (km/h) du troncon #";
        final String MESS_SOLI_DISTANCE = "Veuillez entrer le nombre de kilometre parcouru lors du troncon #";
        final String MESS_ERR_DISTANCE_NEGATIVE = "ERREUR. La distance parcourue doit être supérieure ou égale à zero";
        final String MESS_ERR_VITESSE_ZERO_NEGATIVE = "ERREUR. La vitesse moyenne doit être supérieure à zero";
        final String MESS_AJOUT_TRONCON = "Voulez-vous ajouter un nouveau troncon? (o/n)";
        final String MESS_ERR_O_N = "Veuillez répondre par 'o' ou par 'n'.";
        final String MESS_VITESSE_MOYENNE = "La vitesse moyenne est " ;
        final String MESS_VITESSE_UNITE = " km/h.";
        final String MESS_FIN = "Fin normale du programme";
        
        int nbTroncon;
        double heureTotal;
        double distanceTotal;
        double nbKm;
        double vitesseMoy;
        char ajoutTroncon;
        double vitesseMoyenneTotal;
        
        System.out.println(MESS_PRESENTATION);
        nbTroncon = 0;
        heureTotal = 0;
        distanceTotal = 0;
        do{
            nbTroncon++;
            System.out.print(MESS_SOLI_DISTANCE + nbTroncon);
            nbKm = Clavier.lireDoubleLn();
            while(nbKm < 0){
                System.out.println(MESS_ERR_DISTANCE_NEGATIVE);
                System.out.print(MESS_SOLI_DISTANCE + nbTroncon);
                nbKm = Clavier.lireDoubleLn();
            }
            System.out.print(MESS_SOLI_VITESSE + nbTroncon);
            vitesseMoy = Clavier.lireDoubleLn();
            while(vitesseMoy <= 0){
                System.out.println(MESS_ERR_VITESSE_ZERO_NEGATIVE);
                System.out.print(MESS_SOLI_VITESSE + nbTroncon);
                vitesseMoy = Clavier.lireDoubleLn();
            }
            heureTotal = heureTotal + (nbKm/vitesseMoy);
            distanceTotal = distanceTotal + nbKm;
            do{
                System.out.print(MESS_AJOUT_TRONCON);
                ajoutTroncon = Clavier.lireCharLn();
                if(ajoutTroncon != 'o' && ajoutTroncon != 'n'){
                    System.out.println(MESS_ERR_O_N);
                }
            }while(ajoutTroncon != 'o' && ajoutTroncon != 'n');
        }while(ajoutTroncon == 'o');
        vitesseMoyenneTotal = distanceTotal / heureTotal;
        System.out.println(MESS_VITESSE_MOYENNE + vitesseMoyenneTotal + MESS_VITESSE_UNITE);
        System.out.println(MESS_FIN);
    }
}
