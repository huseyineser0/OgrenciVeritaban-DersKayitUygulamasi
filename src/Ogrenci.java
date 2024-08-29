import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ogrenci {
    // veriabller
    private String ilkIsim;
    private String soyIsim;
    private int yil;
    private int ogrenciNo;
    private String dersler = "";
    private double toplamBorc;
    private double dersUcret = 600.0;
    private static int id = 1000;
    int sayac = 1;

    // Constructor: isim soyisim ve yıl bilgisini al


    public Ogrenci() {
        System.out.println("-----------------DERS KAYIT EKRANINA HOŞGELDİNİZ");
        Scanner input = new Scanner(System.in);
        System.out.print("Adınızı Giriniz: ");
        this.ilkIsim = input.nextLine();

        System.out.print("Soyisminizi Giriniz: ");
        this.soyIsim = input.nextLine();

        System.out.print("Kaçıncı Sınıfsınız: ");
        int sene = input.nextInt();
        while (sene > 4 || sene < 1) {
            System.out.println("Hatalı giriş yaptınız 1,2,3,4 değerlerinden birini giriniz.");
            sene = input.nextInt();
        }
        this.yil = sene;

    }

    // ogrenci no oluştur
    public void ogrenciNoBelirle() {
        id++;
        this.ogrenciNo = id + yil;

        System.out.print("öğrenci Numaranız: " + ogrenciNo);
        System.out.println();
    }

    // Derse Kayit Ol

    public void dersKaydi() {
        boolean flag = true;
        System.out.println("--------------------------------");
        System.out.println("\nDers Seçim Ekranına Hoşgeldiniz.");
        Scanner input = new Scanner(System.in);
        System.out.println("Ders Listesi:" +
                "\n\t 101 Tarih" +
                "\n\t 103 Matematik" +
                "\n\t 105 Ingilizce" +
                "\n\t 107 Kimya" +
                "\n\t 109 Bilgisayar Bilimleri");
        System.out.println("--------------------------------");
        List<String> secilenDersler = new ArrayList<>();
        do {
            System.out.println("Seçmek istediğiniz dersin kodunu giriniz veya çıkış için x'e basınız");
            String ders = input.next().toUpperCase();
            if (!secilenDersler.contains(ders)) {
                secilenDersler.add(ders);
                switch (ders) {
                    case "101":
                        dersler = dersler + sayac + ") 101-Tarih \n\t";
                        System.out.println("Seçilen Dersler: \n\t" + dersler);
                        borcuGoster();
                        sayac++;
                        break;
                    case "103":
                        dersler = dersler + sayac + ") 103-Matematik \n\t";
                        System.out.println("Seçilen Dersler: \n\t" + dersler);
                        borcuGoster();
                        sayac++;
                        break;
                    case "105":
                        dersler = dersler + sayac + ") 105-Ingilizce \n\t";
                        System.out.println("Seçilen Dersler: \n\t" + dersler);
                        borcuGoster();
                        sayac++;
                        break;
                    case "107":
                        dersler = dersler + sayac + ") 107-Kimya \n\t";
                        System.out.println("Seçilen Dersler: \n\t" + dersler);
                        borcuGoster();
                        sayac++;
                        break;
                    case "109":
                        dersler = dersler + sayac + ") 109-Bilgisayar Bilimleri \n\t";
                        System.out.println("Seçilen Dersler: \n\t" + dersler);
                        borcuGoster();
                        sayac++;
                        break;
                    case "X":
                        flag = false;
                        break;
                    default:
                        System.out.println("Geçersiz İşlem Yaptiniz");
                        dersKaydi();

                }

            } else {
                System.out.println("bu dersi zaten seçtiniz.");
            }

        }

        while (flag);
        System.out.println("--------------------------------");
        System.out.println("Seçilen Dersler: \n\t" + dersler);
        System.out.println("Toplam Borç: " + toplamBorc + "TL'dir");
        System.out.println("--------------------------------");

    }

    public void borcuGoster() {
        toplamBorc = toplamBorc + dersUcret;
        System.out.println("Toplam Borcunuz: " + toplamBorc + "TL'dir");
    }

    // ogrenciye ne kadar ödeme yapacağını sor ve hesapla
    public void odemeMiktari() {

        Scanner input = new Scanner(System.in);
        System.out.println("Ödemek İstediğiniz Miktarı Giriniz: ");
        double odeme = input.nextDouble();
        if (odeme <= toplamBorc && odeme >= 0) {
            toplamBorc = toplamBorc - odeme;
            System.out.println("Ödeme Yaptığınız Miktar: " + odeme + "TL'dir");
            System.out.println("Kalan borcunuz: " + toplamBorc);
            System.out.println();
        }
        else {
            System.out.println("--------------------------------");
            System.out.println("Hatalı tutar girdiniz.\n Mevcut borcunuz " + toplamBorc + "TL");
            System.out.println("--------------------------------");
            odemeMiktari();

        }
    }
    //kayıttan sonra ekrana son durumu göster

    @Override
    public String toString() {
        return "Ogrenci{" +
                "İsim Soyisim: " + ilkIsim + soyIsim + "\n" +
                "yil:" + yil + "\n" +
                "Öğrenci No: " + ogrenciNo + "\n" +
                "Kayıt Olunan Dersler: " + dersler + "\n" +
                "toplamBorc=" + toplamBorc;

    }
}
