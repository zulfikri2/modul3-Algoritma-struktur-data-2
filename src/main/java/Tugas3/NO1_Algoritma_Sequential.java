
package Tugas3;

 import java.util.Scanner;

public class NO1_Algoritma_Sequential {

   public static void main(String[] args){
        System.out.println("muhammad zulfikri pamungkas(20090083)" + "\n");
        System.out.println(" SEQUENTIAL SEARCH " +"\n");
        String data[] = {"Enstein" , "Galileo" , "Alkhawarizmi", "muhammad zulfikri pamungkas", "Aljabar" , "Archimedes"};
        String search ;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang ingin dicari : ");
        search = scan.nextLine();
        System.out.println();
        
        System.out.print("Isi dari data adalah : ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
            
        }
        
        System.out.println("");
        
        for(int i = 0; i < data.length; i++){
            if(search.equalsIgnoreCase(data[i])){
                System.out.print("Data " + search + " ada pada indeks ke - " + i);
                break;
            }
        }
        
        System.out.println("\n");
        
    }   
        
}