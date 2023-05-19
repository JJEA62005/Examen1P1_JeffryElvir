/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_jeffryelvir;
import java.util.Scanner;
/**
 *
 * @author jjea6
 */
public class Examen1P1_JeffryElvir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer=new Scanner(System.in);//Scanner de Int
        Scanner sc=new Scanner(System.in);// Sacenner de strings
        boolean seguir=true;
        while (seguir){
            System.out.println("Menu:");
            System.out.println("1.Ejercio ");
            System.out.println("2.Ejercicio");
            System.out.println("3.Salir");
            int opcion=leer.nextInt();
            switch (opcion){
                case 1:
                   boolean tamano=false;
                   boolean binarioreal1=true;
                   boolean binarioreal2=true;
                   String acum1 = "";
                   String acum2 = "";
                    String binario1,binario2;
                    System.out.println("Escriba su primer numero binario");
                    binario1=sc.next();
                    System.out.println("Escriba el segundo numero binario");
                    binario2=sc.next();
                    //Inicio de validacion de tamaño
                    if(binario1.length()==binario2.length()){
                    tamano=true;
                        
                    }
                    else{System.out.println("Los números deben de tener el mismo número de bits.");}
                    //Fin de validacion de tamaño
                    //Incio validacion del pimer binario si solo contiene 0 y 1
                    for (int i = 0; i < binario1.length(); i++) {
                        int codigol = binario1.charAt(i);
                        acum1 += codigol;
                        
                        if (codigol == 49 || codigol == 48 ){
                            binarioreal1=true;
                            
                                
                        }else{binarioreal1=false;}
                        
                    } 
                    if(binarioreal1==false){
                        System.out.println("El primer número contiene caracteres distintos de '0' y '1'.");
                    }
                    // Fin de la primera validacion del primer binario 
                    //Incio validacion del segundo binario si solo contiene 0 y 1
                    for (int i = 0; i < binario2.length(); i++) {
                        int codigo2 = binario2.charAt(i);
                        acum2 += codigo2;
                        
                        if (codigo2 == 49 || codigo2 == 48 ){
                            binarioreal2=true;
                        
                                
                        } else{binarioreal2=false;}
                        
                    } 
                    if(binarioreal2==false){
                        System.out.println("El primer número contiene caracteres distintos de '0' y '1'.");
                    }
                    // Fin de la primera validacion del primer binario 
                    int contador=1;
                    boolean dos=false;
                    String respuesta="";
                    boolean trabajar=true;
                    while(trabajar){
                        
                    String acum3="";
                    String uno="1";
                    String cero="0";
                    String acum4="";
                    int posicion=binario1.length()-contador;
                    char letra= binario1.charAt(posicion );
                    char letra2= binario2.charAt(posicion);
                    acum3+=letra;
                    acum4+=letra2;
                    if(binarioreal1==true && binarioreal2==true && tamano==true){
                        
                       if(acum3.equals(uno) && acum4.equals(cero) || acum4.equals(uno) && acum3.equals(cero) ){
                           if(dos){respuesta+=cero;
                           dos=false;
                           }else{
                           respuesta+=uno;}
                       } else if(acum3.equals(cero) && acum4.equals(cero) ){
                                        if(dos){respuesta+=1;
                                        dos=false;}
                                        else{respuesta+=0;}
                                    }else{respuesta+=0;
                                            dos=true;            }
                    
                        
                    }
                    if(respuesta.length()>=binario1.length()){
                    trabajar=false;
                    }
                    contador++;
                        System.out.println("primer "+acum3);
                        System.out.println("segundo "+acum4);
                        System.out.println("pos "+posicion);
                    }// fin while trbajar
                    System.out.println("La suma es:"+respuesta);
                    
                    break;
                case 2:
                    boolean hacer=true;
                    System.out.println("Escriba el tamaño de la estrella ");
                    int cantidad=leer.nextInt();
                    if(cantidad%2==0 || cantidad<9){
                    hacer=false;
                        System.out.println("¡ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9");
                    }
                    int largo=cantidad/2+1;
                    if(hacer==true){
                        for (int i = largo; i >= 1; i--){
                            for (int j = 1; j <= largo - i; j++) {
                                    System.out.print(" ");
                 
                            }
                            for (int k = 1; k <= 2 * i - 1; k++) {
                                if (k == 1 || k == 2 * i - 1 || i == largo){
                                    System.out.print("*");}
                                    else {System.out.print(" ");}
                            }
                            System.out.println();
                            }
                        for (int i = 0; i<= largo; i++){
                            for (int j = 1; j <= largo - i; j++) {
                                    System.out.print(" ");
                 
                            }
                            for (int k = 1; k <= 2 * i - 1; k++) {
                                if (k == 1 || k == 2 * i - 1 || i == largo){
                                    System.out.print("+");}
                                    else {System.out.print(" ");}
                            }
                            System.out.println();
                            }
                    
                        }
                    
                    break;
                case 3:
                    seguir=false;
                        break;
            }// switch principal
        }//while principal
    }
    
}
