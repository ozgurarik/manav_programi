import java.util.Scanner;

public class odev8 {
    public static void main(String[] args){

        Scanner armut=new Scanner(System.in);
        System.out.print("kaç kg Armut aldınız:");
        double a=armut.nextDouble();

        Scanner elma=new Scanner(System.in);
        System.out.print("kaç kg elma aldınız:");
        double e=elma.nextDouble();

        Scanner domates=new Scanner(System.in);
        System.out.print("kaç kg domates aldınız:");
        double d=domates.nextDouble();

        double totalTutar=a*30+e*40+d*25;
        System.out.print(" toplam tutar :"+totalTutar);

    }
}
