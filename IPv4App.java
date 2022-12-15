

/**
 * @author Székely Balázs Csaba
 * 2022-12-15
 * 
 * Készítsünk egy programot, ami bekér egy IPv4 címet és elemzi azt, majd bizonyos megállapításokra jut
 */

import java.util.Scanner;

public class IPv4App {

    public static void main(String[] args) {
        System.out.print("Adjon meg egy IPv4 címet: ");

        /*try {
            int ip = System.in.read();// a read egy int eredményt ad vissza
            System.out.println(ip);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }*/
        /*A try...catch szolgál a helyi kivételkezelésre, ami azt jelenti, hogy a try-hoz kapcsolódó blokkban bármely utasításnál valamilyen rendellenesség esetén a probléma elhárítása érdekében
        a folytatólagos feladatvégrehajtás a catch utáni programblokkra tevődik át.*/

        Scanner bill = new Scanner(System.in);
        String ipv4Str = bill.nextLine();
        bill.close(); // scanner objektum zárása, ha már nem kell

        String[] reszek = ipv4Str.split("\\.");// ha a szeparátorunk . => kénytelenek vagyunk \\. ként leírni a splitben

        //teszt
        for (String resz : reszek) {
            System.out.println(resz);
        }
        System.out.println(ipv4Str);
    }
    
}
