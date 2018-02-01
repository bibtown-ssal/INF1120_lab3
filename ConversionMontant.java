
/**
 * Transformer de l'argent Canadian Tire en argent $ (la somme de la valeur de chaque billet)
 *
 * Charles
 * 30jan2018
 */
public class ConversionMontant
{
    public static void main(String [] args)    {
        final String MESS_PRESENTATION = "Ce programme calcul la valeur de vos billets de CanadianTire";
        final String MESS_SOLLI_BILLET1 = "Veuillez entrer le nombre de billet de 1¢:";
        final String MESS_SOLLI_BILLET5 = "Veuillez entrer le nombre de billet de 5¢:";
        final String MESS_SOLLI_BILLET10 = "Veuillez entrer le nombre de billet de 10¢:";
        final String MESS_SOLLI_BILLET25 = "Veuillez entrer le nombre de billet de 25¢:";
        final String MESS_ERR_BILLET_NEG = "ERREUR: vous avez entré un nombre négatif de billets";
        
        int nbBillet1;
        int nbBillet5;
        int nbBillet10;
        int nbBillet25;
        double total;
        
        System.out.println(MESS_PRESENTATION);
        do{
            System.out.print(MESS_SOLLI_BILLET1);
            nbBillet1 = Clavier.lireIntLn();
            if(nbBillet1 < 0){
                System.out.println(MESS_ERR_BILLET_NEG);
            }
        }while(nbBillet1 < 0);
        do{
            System.out.print(MESS_SOLLI_BILLET5);
            nbBillet5 = Clavier.lireIntLn();
            if(nbBillet5 < 0){
                System.out.println(MESS_ERR_BILLET_NEG);
            }
        }while(nbBillet5 < 0);        
        do{
            System.out.print(MESS_SOLLI_BILLET10);
            nbBillet10 = Clavier.lireIntLn();
            if(nbBillet10 < 0){
                System.out.println(MESS_ERR_BILLET_NEG);
            }
        }while(nbBillet10 < 0);        
        do{
            System.out.print(MESS_SOLLI_BILLET25);
            nbBillet25 = Clavier.lireIntLn();
            if(nbBillet25 < 0){
                System.out.println(MESS_ERR_BILLET_NEG);
            }
        }while(nbBillet25 < 0);        
        
        total = 0.01*nbBillet1 + 0.05*nbBillet5 + 0.1*nbBillet10 + 0.25*nbBillet25;
        System.out.println("Vous avez : " + total + "$.");
    }
}
