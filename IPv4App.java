

/**
 * @author Székely Balázs Csaba
 * 2022-12-15
 * 
 * Készítsünk egy programot, ami bekér egy IPv4 címet és elemzi azt, majd bizonyos megállapításokra jut
 */

import java.util.Scanner;

public class IPv4App {

    public static void main(String[] args) {
        String[] reszek;
        int[] ipv4 = new int[4];
        boolean megVan = false;

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

        System.out.print("Adjon meg egy IPv4 címet: ");

        do{
            String ipv4Str = bill.nextLine();
            reszek = ipv4Str.split("\\.");// ha a szeparátorunk . => kénytelenek vagyunk \\. ként leírni a splitben
            if(reszek.length == 4){
                for (int i = 0; i < reszek.length; i++) {
                    try {
                        ipv4[i] = Integer.parseInt(reszek[i]);
                    }
                    catch (Exception e) {
                        System.out.print("\nA megadott IPv4 cím csak számot és '.' karaktert tartalmazhat. Add meg újra: ");
                        break;
                    }
                    if(i==3){
                        if((ipv4[0] > 0 && ipv4[0] < 256) && (ipv4[1] >= 0 && ipv4[1] < 256) && (ipv4[2] >= 0 && ipv4[2] < 256) && (ipv4[3] >= 0 && ipv4[3] < 256))
                        megVan = true;
                        else
                        System.out.print("\nA megadott IPv4 cím hibás, add meg újra: ");
                    }         
                }
                
            }
            else
                System.out.print("\nA megadott IPv4 cím hibás, add meg újra: ");
        }while(!megVan); //amíg nincs meg, addig bekérünk
        
        bill.close(); // scanner objektum zárása, ha már nem kell

        //Elemezzük a megadott IP címet
        if (ipv4[0] < 128)
            System.out.print("A megadott IPv4 cím A osztályú");
        else if (ipv4[0] >= 128 && ipv4[0] < 192)
            System.out.print("A megadott IPv4 cím B osztályú");
        else if (ipv4[0] >= 192 && ipv4[0] < 224)
            System.out.print("A megadott IPv4 cím C osztályú");
        else if (ipv4[0] >= 224 && ipv4[0] < 240)
            System.out.print("A megadott IPv4 cím D osztályú");
        else if (ipv4[0] >= 240 && ipv4[0] < 248)
            System.out.print("A megadott IPv4 cím E osztályú");
        else
            System.out.print("A megadott IPv4 cím F osztályú");
    }
    
}
