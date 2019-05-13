/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        int Suma;
        int Aux2=0,Aux3=0,Aux4=0,Aux5=0,Aux6=0,Aux7=0,Aux8=0,Aux9=0,Aux10=0,Aux11=0,Aux12=0;
        
        //Instanciacion de los dos objetos 
        Dado D1 = new Dado();
        Dado D2 = new Dado();
        
        for (int i=1; i<=1000; i++){
            
            
            Suma = D1.Lanzamiento() + D2.Lanzamiento();
            
            switch (Suma){
                
                case 2:
                    Aux2++;
                    break;
                case 3:
                    Aux3++;
                    break;
                case 4:
                    Aux4++;
                    break;
                case 5:
                    Aux5++;
                    break;
                case 6:
                    Aux6++;
                    break;
                case 7:
                    Aux7++;
                    break;
                case 8:
                    Aux8++;
                    break;
                case 9:
                    Aux9++;
                    break;
                case 10:
                    Aux10++;
                    break;
                case 11:
                    Aux11++;
                    break;
                case 12:
                    Aux12++;
                    break;
                
            }
                    
        }
        
        for (int i=2; i<=12;i++){
            switch (i){
                    case 2:         
                    System.out.println("Frecuencia de "+ i + " :"+Aux2);  
                    break;
                case 3:
                    System.out.println("Frecuencia de "+ i + " :"+Aux3);
                break;
                case 4:
                    System.out.println("Frecuencia de "+ i + " :"+Aux4);
                    break;
                case 5:
                    System.out.println("Frecuencia de "+ i + " :"+Aux5);
                    break;
                case 6:
                   System.out.println("Frecuencia de "+ i + " :"+Aux6);
                    break;
                case 7:
                    System.out.println("Frecuencia de "+ i + " :"+Aux7);
                    break;
                case 8:
                    System.out.println("Frecuencia de "+ i + " :"+Aux8);
                    break;
                case 9:
                    System.out.println("Frecuencia de "+ i + " :"+Aux9);
                    break;
                case 10:
                    System.out.println("Frecuencia de "+ i + " :"+Aux10);
                    break;
                case 11:
                    System.out.println("Frecuencia de "+ i + " :"+Aux11);
                    break;
                case 12:
                    System.out.println("Frecuencia de "+ i + " :"+Aux12);
                    break;
           
        }
        }        
    }
}
