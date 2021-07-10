import java.util.Scanner;
import java.util.*;

public class Program {

    /**
     * @param args the command line arguments
     */
    

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Banyak nya data : ");
        int data = input.nextInt(); //masukan jumlah data
        int[] array = new int[data]; //data akan di masukan ke array
        int jumlah = 0;
        int kali = 1;

        
        
        for(int i=0;i<data;i++){
            System.out.print("Nilai ke- "+(i+1)+" : ");
            array [i] = input.nextInt();//input nilai yang akan ditampung oleh array
        }
        Arrays.sort(array);//array akan diurutkan dengan method sort
        System.out.println("");
        System.out.println("Nilai Di urutkan :");
        for(int urutan: array){//tampung nilai semua nilai yang berada di array ke int urutan
            System.out.print(urutan+" ");//urutan akan ditampilkan
            jumlah += urutan;//jumlah yang berisi value 0 akan ditambahkan dengan nilai pertama di urutan dan akan ditambahkan lagi hasil dari nilai pertama ditambah nilai kedua, dan seterusnya hasilnya akan ditampung di int jumlah
            kali *= urutan;//kali yang berisi value 1 akan dikalikan dengan nilai pertama di urutan dan akan dikalikan lagi hasil dari nilai pertama dikali nilai ke dua, dan seterusnya hasilnya akan ditampung di int kali
        }        
        
        double rata = jumlah/data;//nilai jumlah dibagi dengan banyak nya data yang diinputkan dan masukan ke float rata
        System.out.println("");
//        System.out.println("hasil : "+jumlah);//tampilkan jumlah
        System.out.println("Rata-rata Nilai : "+rata);//panggil dan tampilkan nilai rata
        System.out.println("perkalian : "+kali);
        
        

    }
    
}