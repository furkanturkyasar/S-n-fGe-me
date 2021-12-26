import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik;
        double total=0, avarage;


        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        if (mat >=0 && mat <=100){
            total+=mat;
        }else {
            System.out.print("Yanlis girdiniz! ");

        }


        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        if (fizik >=0 && fizik <=100){
            total+=fizik;
        }else {
            System.out.print("Yanlis girdiniz! ");
        }

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = inp.nextInt();
        if (turkce >=0 && turkce<=100){
            total+=turkce;
        }else {
            System.out.print("Yanlis girdiniz! ");
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
        if (kimya >=0 && kimya<=100){
            total+=kimya;
        }else {
            System.out.print("Yanlis girdiniz! ");
        }

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = inp.nextInt();
        if (muzik >=0 && muzik <=100){
            total+=muzik;
        }else {
            System.out.print("Yanlis girdiniz! ");
        }



        avarage = (total)/5;


        if (avarage > 55) {
            System.out.print("Tebrikler sinifi gectiniz! ");
        }else {
            System.out.print("Sinifi gecemediniz! ");
        }

        System.out.print("Ortalamaniz: " + avarage);


    }
}
