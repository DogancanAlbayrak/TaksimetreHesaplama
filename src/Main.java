import java.util.Scanner;
public class Main {
public static void main(String[] args) {

    int km;
    double perKM = 2.20, total, startingPrice = 10;

    Scanner input= new Scanner(System.in);
    System.out.print("Gitmek istediğiniz mesafeyi KM cinsinden giriniz : ");
    km = input.nextInt();

    total = (km * perKM);
    total += startingPrice;

    total = (total < 20) ? 20 : total;
    System.out.println("Toplam tutar : " + total);

}
}