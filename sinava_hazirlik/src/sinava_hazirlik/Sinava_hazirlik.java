package sinava_hazirlik;
import java.util.Scanner;


public class Sinava_hazirlik {

    public static void main(String[] args) {
        
        Scanner klavye=new Scanner(System.in);
        System.out.println("dizi boyutunu gir:");
        int n=klavye.nextInt();
        
        int [] dizi=new int[n];
        double toplam=0,ort=0;
        System.out.println("------------------------------------");
        for (double i=1;i<=dizi.length;i++){
            System.out.println("dizinin "+i+".ci elemanını giriniz: ");
             dizi[i]=klavye.nextInt();
            toplam=toplam+dizi[i];
        }
        ort=toplam/ dizi.length;
          
        
        
        System.out.println("ortalama: "+ort);
        System.out.println("toplam: "+toplam);
    }
    
}
