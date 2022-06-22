import java.util.Scanner;
import java.util.ArrayList;

public class DaftarPengunjung {
    static ArrayList<String> daftarPengunjung = new ArrayList<String>();
    static boolean isStatus = true;
    static Scanner keyInt = new Scanner(System.in);
    static Scanner keyTxt = new Scanner(System.in);
    
    public static void main(String[] args){
        while(isStatus){
            mainMenu();
        }
    }
        
    static void tampilPengunjung(){
        if(daftarPengunjung.size()<=0){
            System.out.println("Maaf, belum ada data pengunjung\n");
        } else {
            System.out.println("##### Daftar Pengunjung Perpustakaan #####");
            for(int i = 0; i < daftarPengunjung.size(); i++){
                System.out.println((i+1) + ". " + daftarPengunjung.get(i));
            }
            System.out.println("=========================");
            System.out.println("Masukan angka 0 untuk kembali ke menu utama:");
            
            int input = keyInt.nextInt();            
            if(input == 0) mainMenu();
        }
    }
    
    static void tambahPengunjung(){
        System.out.println("Masukan nama pengunjung:");
        String nama = keyTxt.nextLine();
        daftarPengunjung.add(nama);
        System.out.println("Apakah ingin memasukan nama lain: 1.Ya \t2.Tidak");
        System.out.println("Masukan angka pilihan:");
        int jawab = keyInt.nextInt();
        if(jawab == 1){
            System.out.println("");                
            tambahPengunjung();
        } else System.out.println("");
    }
    
    static void mainMenu(){
        System.out.println("##### Perpustakaan Game Lab Indonesia #####");
        System.out.println("1. Input Data Pengunjung");
        System.out.println("2. Tampilkan Pengunjung");
        System.out.println("3. Keluar");
        System.out.println("=========================");
        System.out.println("Pilih menu:");
        
        int pilihan = keyInt.nextInt();
        
        switch(pilihan){
            case 1:
                tambahPengunjung();
                break;
            case 2:
                tampilPengunjung();
                break;
            case 3:
                isStatus = false;
                System.exit(0);
                break;
            default:
                System.out.println("Maaf, nomor tidak ada dalam menu\n");                
        }
    }
}