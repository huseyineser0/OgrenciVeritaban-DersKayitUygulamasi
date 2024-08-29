import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ogrenci_Veritabani {
    public static void main(String[] args) {
        //  Ogrenci ogr=new Ogrenci();
        // ogr.ogrenciNoBelirle();
        //ogr.dersKaydi();
        // System.out.println(ogr.toString());

        //kaç öğrenci eklemek istediğini sor

      //  System.out.println("Kaç öğrenci eklmek istersiniz.");
        //int ogrenciAdedi = input.nextInt();

            Ogrenci ogr=new Ogrenci();

            ogr.ogrenciNoBelirle();
            ogr.dersKaydi();
            ogr.odemeMiktari();
            System.out.println("-----------------------------------");
            System.out.println("Kaydınız Başarılı bir şekilde tamamlanmıştır \n Derslerinizi sorumlu danışmana iletiniz.");

    }


}
