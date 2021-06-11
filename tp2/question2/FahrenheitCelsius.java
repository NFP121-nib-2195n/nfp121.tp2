package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
        int fahrenheit = 0;
        float celsius = 0;
        int i = 0;
        String res = "";
        try{
            
           while(i<args.length){
                fahrenheit = Integer.parseInt(args[i]);
                celsius = fahrenheitEnCelsius(fahrenheit);
                res = (fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                i++;
            }
      
            System.out.println(res);
            
        }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
        }
        
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
        float div = 5.0F/9.0F;
        float res = (float)(f-32)*div;
        res = (int)(res*10)/10.0F;
        return res;
     }

}
