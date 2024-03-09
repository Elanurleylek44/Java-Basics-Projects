import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OyunHaritasi {

    private static char[][] harita;

    public static void main(String[] args) {
        // Haritayı dosyadan oku
        haritayiDosyadanOku("harita.txt.txt");

        // Oyunu başlat
        oyunuBaslat();

        System.out.println("GÜLE GÜLE!");
    }

    private static void haritayiDosyadanOku(String dosyaAdi) {
        try (BufferedReader br = new BufferedReader(new FileReader(dosyaAdi))) {
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

    private static void oyunuBaslat() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Haritayı ekrana bas
            haritayiEkranaBas();

            // Kullanıcıdan koordinatları al
            System.out.print("Lütfen koordinat giriniz (örnek: 4 5): ");
            String[] koordinatlar = scanner.nextLine().split(" ");
            int satir = Integer.parseInt(koordinatlar[0]);
            int sutun = Integer.parseInt(koordinatlar[0]);

            // Oyunu kontrol et ve güncelle
            if (satir == 0 && sutun == 0) {
                break; // Oyunu sonlandır
            } else if (gecerliKoordinat(satir, sutun)) {
                oyunuKontrolEtVeGuncelle(satir, sutun);
            } else {
                System.out.println("Geçersiz koordinat. Lütfen tekrar girin.");
            }
        }

        scanner.close();
    }

    private static boolean gecerliKoordinat(int satir, int sutun) {
        return satir >= 0 && satir < 10 && sutun >= 0 && sutun < 10;
    }

    private static void oyunuKontrolEtVeGuncelle(int satir, int sutun) {
        char secilenHucresi = harita[satir][sutun];

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int yeniSatir = satir + i;
                int yeniSutun = sutun + j;

                // Geçerli koordinatları kontrol et
                if (gecerliKoordinat(yeniSatir, yeniSutun)) {
                    char komsuHucresi = harita[yeniSatir][yeniSutun];

                    // Komşu hücredeki sayı ile seçilen hücrenin sayısı aynı ise güncelle
                    if (komsuHucresi == secilenHucresi) {
                        harita[yeniSatir][yeniSutun] = 'X';
                    }
                }
            }
        }
    }

    private static void haritayiEkranaBas() {
        for (int i = 0; i < harita.length; i++) {
            for (int j = 0; j < harita[i].length; j++) {
                System.out.print(harita[i][j] + " ");
            }
            System.out.println();
            }
    }
}


