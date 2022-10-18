/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusok;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Stringmetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String szoveg = "Ez egy tetszőleges szöveg.";
        
        //szöveg hossza
        System.out.println(szoveg.length());
        
        //adott pozíción levő karakter
        System.out.println(szoveg.charAt(5));
        
        //minden kisbetűs
        System.out.println(szoveg.toLowerCase());
        
        //minden nagybetűs
        System.out.println(szoveg.toUpperCase());
        
        //sor eleji és sorvégi szóköz levágása
        System.out.println(szoveg.trim());
        
        //összehasonlítás
        System.out.println(szoveg.compareTo("Ez egy tetszőleges szöveg."));
        System.out.println(szoveg.compareToIgnoreCase("Ez egy tetszőleges szöveg."));
        System.out.println(szoveg.equals("Ez egy..."));
        System.out.println(szoveg.equalsIgnoreCase("Ez egy tetszőleges szöveg."));
        
        //összefűzés
        System.out.println(szoveg.concat("Ez pedig egy hozzáfűzött"));
        
        //tartalmazza-e
        System.out.println(szoveg.contains("tetszőleges"));
        
        //végződik-e valamivel
        System.out.println(szoveg.endsWith(""));
        
        //kezdődik valamivel
        System.out.println(szoveg.startsWith(""));
        
        //keresett karakter(ek) első pozíciója
        System.out.println(szoveg.indexOf("t"));
        System.out.println(szoveg.indexOf("egy"));
        
        //keresett karakter(ek) utolsó pozíciója
        System.out.println(szoveg.lastIndexOf("t"));
        
        //string üres-e (boolean)
        System.out.println(szoveg.isEmpty());
        String szoveg2 = "";
        System.out.println(szoveg2.isEmpty());
        
        //lecseréli a szövegben az összes! megadott karakter(ek)et más karakter(ek)re
        System.out.println(szoveg.replace("teszőleges", "akármilyen"));
        System.out.println(szoveg.replace("e", "b"));
        
        //lecseréli a szövegben az első! megadott karakter(ek)et más karakter(ek)re
        System.out.println(szoveg.replaceFirst("e", "b"));
        
        //string szétszedése tömbbe megadott karakterek mentén
        System.out.println(szoveg.split(" "));
        
        //nem string típusú adat stringé alakítása
        //Integer szam = 512;
        //System.out.println(szam.toString());
        
        //stringből substring kivétele
        System.out.println(szoveg.substring(3));
        System.out.println(szoveg.substring(3,6));
        
 

        
        
        //nem enyém
        String fullName, firstName, lastName;
        int szokozhely;
        Scanner bill = new Scanner(System.in);
        System.out.println("Add meg a teljes nevedet: ");
        fullName = bill.nextLine();
            System.out.println(szoveg.split(" "));
          
        //2. dik feladat
            String classId;
            System.out.println("Add meg a diák osztályát: ");
            classId = bill.nextLine();
            if (classId.charAt(4)=='e')
                classId = classId.replaceFirst("e", "E");
            System.out.println(classId);
        
        //3. dik feladat
        int evfolyam = Ineteger.parseInt(classId.substring(0,4));
        if (evfolyam < 2022) class
        }
    
    }
