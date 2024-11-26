/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carillo_airlines;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class CARILLO_AIRLINES {

    public static void main(String[] args) {
        String user1,pw1;
        int i=3;
        final String User1="USER1";
        final String Pw1="0208";
        final String User2="USER2";
        final String Pw2="ABCD";
        final String User3="USER3";
        final String Pw3="0987";
        final String User4="USER4";
        final String Pw4="0112";
        final String User5="USER5";
        final String Pw5="9705";
        Scanner cap = new Scanner(System.in);
        while(i>0){
        System.out.println("Digite usuario:");
        user1=cap.nextLine();
       
        System.out.println("Digite la contraseña:");
        pw1=cap.nextLine();
       
       if(user1.equals(User1)&&pw1.equals(Pw1)){
           
           usuario1("BIENVENIDO USUARIO1!!");
           System.out.println("Comenzemos con la captura:");
           break;
       }
       if(user1.equals(User2)&&pw1.equals(Pw2)){
           System.out.println("BIENVENIDO USUARIO2!!");
           break;
       }
       if(user1.equals(User3)&&pw1.equals(Pw3)){
           System.out.println("BIENVENIDO USUARIO3!!");
           break;
       }
       if(user1.equals(User4)&&pw1.equals(Pw4)){
           usuario4("BIENVENIDO USUARIO4!!");
                
               
           break;
           
       }
       if(user1.equals(User5)&&pw1.equals(Pw5)){
           System.out.println("BIENVENIDO USUARIO5!!");
           System.out.println("Funciones a realiza:");
           System.out.println("User1");
           System.out.println("User2");
           System.out.println("User3");
           System.out.println("User4");
           System.out.println("Verificacion y Correccion de datos");
           System.out.println("¿Que funcion desea realizar?");
           user1=cap.nextLine();
           if(user1.equals(User1)){
           usuario1("BIENVENIDO USUARIO1!!");
           System.out.println("Comenzemos con la captura:");
           break;
               
       }
       if(user1.equals(User2)){
           System.out.println("BIENVENIDO USUARIO2!!");
           
       }
       if(user1.equals(User3)){
           System.out.println("BIENVENIDO USUARIO3!!");
           
       }
       if(user1.equals(User4)){
           usuario4("BIENVENIDO USUARIO4!!");
            break;
       }
       
           
           
       }else{
           i--;
           System.out.println("CONTRASEÑA O USUARIO INCORRECTO!!"+"INTENTE DE NUEVO!!");
       }
    }
    }
    public static String usuario1(String mensaje){
         String nom;
        String apellpat;
        String apellmat;
        String correo;
        String fechanaci;
        String numtel;
        Scanner captu = new Scanner(System.in);
         System.out.println(mensaje);
       
        //PEDIR DATOS HASTA QUE EL USUARIO DIGA QUE ESTAN CORRECTOS
        while (true) {
          
            System.out.println("CAPTURE SUS APELLIDO PATERNO");
            apellpat = captu.nextLine();
            
            System.out.println("CAPTURE SUS APELLIDO MATERNO ");
            apellmat = captu.nextLine();
            
            System.out.println("CAPTURE SUS NOMBRE/S");
            nom = captu.nextLine();
            
            System.out.println("CAPTURE SU FECHA DE NACIMIENTO");
            fechanaci = captu.nextLine();
            
            System.out.println("CAPTURE SU CORREO");
            correo = captu.nextLine();
            
            System.out.println("CAPTURE SU NUMERO TELEFONICO");
            numtel = captu.nextLine();
            
            System.out.println("");
            System.out.println("SUS DATOS SON:");
            System.out.println("");
            System.out.println("SU APELLIDO ES: " + apellpat);
            System.out.println("");
            System.out.println("SU APELLIDO ES: " + apellmat);
            System.out.println("");
            System.out.println("SU NOMBRE ES: " + nom);
            System.out.println("");
            System.out.println("SU FECHA DE NACIMIENTO ES: " + fechanaci);
            System.out.println("");
            System.out.println("SU CORREO ES: " + correo);
            System.out.println("");
            System.out.println("SU NUMERO TELEFONICO ES: " + numtel);
            
            System.out.println("");
            System.out.println("¿SON CORRECTOS SUS DATOS? (SI/NO)");
            String respuesta = captu.nextLine();
            
            if (respuesta.equals("SI")) {
                
                break; // SALE DEL CICLO SI LOS DATOS SON CORRECTOS
            
            } else {
                System.out.println("VOLVAMOS A CAPTURAR SUS DATOS.");
                System.out.println("");
            }
        }
        System.out.println("REGISTRO FINALIZADO");
        return mensaje;
         
    }
    public static String usuario4(String mensaje2){
        Scanner cap = new Scanner(System.in);
        String pas; // Datos del pasajero
        int as, clas;
        System.out.println(mensaje2);
        System.out.print("Cual es tu nombre:");
        pas = cap.nextLine();
        System.out.println("De acuerdo"+ " " + pas  + "," + " " + "en base a tu clase escoge tu asiento:");
        System.out.println("*************************************************");
        System.out.println("*               Menu de clases                  *");
        System.out.println("*Primera clase: Asientos del numero (01 - 15)   *");
        System.out.println("*Segunda clase: Asientos del numero (16 - 40)   *");
        System.out.println("*Tercera clase: Asientos del numero (41 - 80)   *");
        System.out.println("*Cuarta clase: Asientos del numero  (81 - 130)  *");
        System.out.println("*Quinta clase: Asientos del numero  (131 - 190) *");
        System.out.println("*************************************************");
        
        System.out.println("Digite su clase en base de numeros del (1 - 5):");
        clas = cap.nextInt();
        cap.nextLine();
        
        System.out.println("Cual asiento desea:");
            as = cap.nextInt();
            cap.nextLine();
        
        if (clas == 1 && as >= 1 && as <=15){// Primer if (PASAJERO)
            System.out.println("Listo" + " " + pas + "," + " " + "su asiento es el numero" + " " + as + ".");
            System.out.println("Y su puerta de embarque es la A1.");
            System.out.println("Eso seria todo, gracias por su preferencia. Vuelva pronto!!!");
        }
        else if (clas == 2 && as >= 16 && clas <=40){
        System.out.println("Listo" + " " + pas + "," + " " + "su asiento es el numero" + " " + as + ".");
            System.out.println("Y su puerta de embarque es la A1");
            System.out.println("Eso seria todo, gracias por su preferencia. Vuelva pronto!!!");
        }
        else if (clas == 3 && as >= 41 && clas <=80){
        System.out.println("Listo" + " " + pas + "," + " " + "su asiento es el numero" + " " + as + ".");
            System.out.println("Y su puerta de embarque es la A2");
            System.out.println("Eso seria todo, gracias por su preferencia. Vuelva pronto!!!");
        }
        else if (clas == 4 && as >= 81 && clas <=130){
        System.out.println("Listo" + " " + pas + "," + "su asiento es el numero" + " " + as + ".");
            System.out.println("Y su puerta de embarque es la A3");
            System.out.println("Eso seria todo, gracias por su preferencia. Vuelva pronto!!!");
        }
        else if (clas == 5 && as >= 131 && clas <=190){
        System.out.println("Listo" + " " + pas + "," + " " + "su asiento es el numero" + " " + as + ".");
            System.out.println("Y su puerta de embarque es la A4");
            System.out.println("Eso seria todo, gracias por su preferencia. Vuelva pronto!!!");
        } 
        else{
            System.out.println("Elige correctamente su asiento porfavor.");
        }
               
               return mensaje2;  
    }
        
        
    }

