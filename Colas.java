package colas;

import java.util.Scanner;

public class Colas {
    public static void main(String[] args) {
    Cola cola =new Cola();
      int elemento;
     int opc2=0;
     int opc;
     Scanner LECTOR = new Scanner(System.in);
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. Insertar 10 datos");
        System.out.println("2. eliminar");
        System.out.println("3. mostrar");
        System.out.println("5. Salir del programa");
        System.out.println("¿Que desea realizar?");
        opc=LECTOR.nextInt();
        switch(opc){
            case 1:
            Scanner Lector2 = new Scanner(System.in);
            int cont=10;
            while (cont>0){
            System.out.println("inserte un elemento ");
            elemento=Lector2.nextInt();
            cola.empuja(elemento); 
            cont--;
            
            }
           
    
            break;
            case 2:cola.eliminar();break;
            case 3:cola.mostrar();break;
            case 4: System.exit(0);break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
        
          System.out.println("\n¿Desea realizar otro proceso? presione 2=NO");
       opc2=LECTOR.nextInt();
       }while(opc2!=2);


    }
    
}
