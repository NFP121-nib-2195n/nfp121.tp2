package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        int fahrenheit = 0;
        float celsius = 0;
        int i = 0;

        try{
            while(i<args.length){
                fahrenheit = Integer.parseInt(args[i]);
                celsius = fahrenheitEnCelsius(fahrenheit);
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                i++;
            }
        }
        catch(NumberFormatException e){
            System.out.println("error"+e.getMessage());
        }
        
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float div = 5.0F/9.0F;
        float res = (float)(f-32)*div;
        res = (int)(res*10)/10.0F;
        return res; // � compl�ter en rempla�ant ce return 0.F par la fonction
                    // de conversion
    }

}
