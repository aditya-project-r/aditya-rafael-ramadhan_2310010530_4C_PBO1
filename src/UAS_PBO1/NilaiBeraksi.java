package UAS_PBO1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NilaiBeraksi {
    public static void main(String[] args) {
        try ( // 12. IO Sederhana
                Scanner scanner = new Scanner(System.in)) {
                boolean lanjutkan = true;
            
            // 11. perulangan
            do{
                // 14. eror handling (try / catch)
                try{
                    // 13. array
                    NilaiDetail[] Aditya = new NilaiDetail[2];
                    
                    System.out.print("Masukan Nama : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukan Nilai : ");
                    double nilai = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("==============================");
                    
                    // 2. objek
                    Aditya[0] = new NilaiDetail(nama, nilai);
                    
                    System.out.println(Aditya[0].displayInfo());
                    System.out.println("Nilai Huruf : "+ Aditya[0].getNilaiHuruf());
                    System.out.println("Kelulusan : "+ Aditya[0].getKelulusan());
                    System.out.println("========================================");
                    
                    System.out.print("Lanjutkan (y/t) : ");
                    String jawaban = scanner.nextLine();
                    if (!jawaban.equalsIgnoreCase("y")){
                        lanjutkan = false;
                    }
                    
                }catch (InputMismatchException e) {
                    System.out.println("Kesalahan Input Pada Nilai");
                    scanner.nextLine();
                }
            } while (lanjutkan);
        }
        System.out.println("Program Selesai !!");
    }
}
