/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bombom;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Bombom {
private static final int BOYUT = 10;
    private static char[][] harita = new char[BOYUT][BOYUT];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
          // Haritayı dosyadan oku

     //   String path ="C:\\Users\\elale\\OneDrive\\Masaüstü\\AlgoLab.txt";
       // FileInputStream fis = new FileInputStream(path);

        //try {
       //     Scanner scanner = new Scanner(new File(path));
        //    for (int i = 0; i < BOYUT; i++) {
          //      String line = scanner.nextLine();
            //    for (int j = 0; j < BOYUT; j++) {
              //      harita[i][j] = line.charAt(j);
                //}
            //}
            //scanner.close();
        //} catch (FileNotFoundException e) {
        //    System.out.println("Harita dosyası bulunamadı!");
       //     return;
      //  }

        // Oyunu başlat
        Scanner input = new Scanner(System.in);
        while (true) {
            // Haritayı ekrana bas
            System.out.println("Harita:");
            for (char[] satir : harita) {
                for (char sutun : satir) {
                    System.out.print(sutun + " ");
                }
                System.out.println();
            }

            // Kullanıcıdan koordinat al
            System.out.println("Lütfen koordinat giriniz (0 0 çıkış için):");
            int satir = input.nextInt();
            int sutun = input.nextInt();

            // Çıkış kontrolu
            if (satir == 0 && sutun == 0) {
                System.out.println("GÜLE GÜLE!");
                break;
            }

            // Koordinatı kontrol et
            kontrolEt(satir, sutun);
        }

        input.close();
    }
 private static void haritayiDosyadanOku(String AlgoLab) {
        try (BufferedReader br = new BufferedReader(new FileReader(AlgoLab))) {
            harita = new char[10][10];
            String satir;
            int satirIndex = 0;

            while ((satir = br.readLine()) != null) {
                // Her satırdaki karakterleri diziye atar
                char[] satirDizi = satir.toCharArray();
                for (int i = 0; i < satirDizi.length; i++) {
                    harita[satirIndex][i] = satirDizi[i];
                }
                satirIndex++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void kontrolEt(int satir, int sutun) {
        // Seçilen koordinattaki sayıyı al
        char sayi = harita[satir][sutun];

        // Seçilen koordinatın 4 yönünü kontrol et
        kontrolYukari(satir, sutun, sayi);
        kontrolSag(satir, sutun, sayi);
        kontrolAsagi(satir, sutun, sayi);
        kontrolSol(satir, sutun, sayi);

        // Güncellenen haritayı ekrana bas
        System.out.println("Harita:");
        for (char[] satir2 : harita) {
            for (char sutun2 : satir2) {
                System.out.print(sutun2 + " ");
            }
            System.out.println();
        }
    }

    private static void kontrolYukari(int satir, int sutun, char sayi) {
        // Seçilen koordinatın üstündeki hücreyi kontrol et
        if (satir > 0 && harita[satir - 1][sutun] == sayi) {
            // Üstündeki hücre aynıysa X ile değiştir
            harita[satir - 1][sutun] = 'X';

            // Üstündeki hücrenin de 4 yönünü kontrol et
            kontrolYukari(satir - 1, sutun, sayi);
            kontrolSag(satir - 1, sutun, sayi);
            kontrolAsagi(satir - 1, sutun, sayi);
            kontrolSol(satir - 1, sutun, sayi);
        }
    }

    private static void kontrolSag(int satir, int sutun, char sayi) {
        // Seçilen koordinatın sağındaki hücreyi kontrol et
        if (sutun < BOYUT - 1 && harita[satir][sutun + 1] == sayi) {
            // Sağındaki hücre aynıysa X ile değiştir
            harita[satir][sutun + 1] = 'X';

            // Sağındaki hücrenin de 4 yönünü kontrol et
            kontrolYukari(satir, sutun + 1, sayi);
            kontrolSag(satir, sutun + 1, sayi);
            kontrolAsagi(satir, sutun + 1, sayi);
            kontrolSol(satir, sutun + 1, sayi);
        }
    }

    private static void kontrolAsagi(int satir, int sutun, char sayi) {
        // Seçilen koordinatın altındaki hücreyi kontrol et
        if (satir < BOYUT - 1 && harita[satir + 1][sutun] == sayi) {
            // Altındaki hücre aynıysa X ile değiştir
            harita[satir + 1][sutun] = 'X';

            // Altındaki hücrenin de 4 yönünü kontrol et
            kontrolYukari(satir + 1, sutun, sayi);
            kontrolSag(satir + 1, sutun, sayi);
            kontrolAsagi(satir + 1, sutun, sayi);
            kontrolSol(satir + 1, sutun, sayi);
        }
    }

    private static void kontrolSol(int satir, int sutun, char sayi) {
        // Seçilen koordinatın solundaki hücreyi kontrol et
        if (sutun > 0 && harita[satir][sutun - 1] == sayi) {
            // Solundaki hücre aynıysa X ile değiştir
            harita[satir][sutun - 1] = 'X';

            // Solundaki hücrenin de 4 yönünü kontrol et
            kontrolYukari(satir, sutun - 1, sayi);
            kontrolSag(satir, sutun - 1, sayi);
            kontrolAsagi(satir, sutun - 1, sayi);
            kontrolSol(satir, sutun - 1, sayi);
        }
    }
}
    
    

