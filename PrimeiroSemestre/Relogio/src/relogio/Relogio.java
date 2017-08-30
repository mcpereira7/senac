package relogio;

/**
 * Relógio digital
 * @author marcelo.cpereira4
 */
public class Relogio {

    public static void main(String[] args) {
         for(int h=0; h<=23; h++){
             for(int m =0; m<=59; m++){
                 for(int s=0; s<=59; s++){
                     System.out.printf("%d:%d:%s \n", h, m, s);
                     if(h==23 && m==55 && s==50){
                         System.out.println("ALARME!!!");
                         break; 
                     }
                 }
                 if(h==23 && m==55){
                     break;
                 }
             }
             if(h==23){
                 break;
             }
         }
    }
    
}
