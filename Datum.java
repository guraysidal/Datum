import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tag: ");
        int tag=sc.nextInt();
        System.out.println("Monat: ");
        int monat=sc.nextInt();
        System.out.println("Jahr: ");
        int jahr=sc.nextInt();
        String[]monaten={"Januar","Februar","Marz","April","Mai","Juni","Juli","August","September","Oktober,","November","Dezember"};
        System.out.println(tag+"."+monaten[monat-1]+"."+jahr);
    }
}