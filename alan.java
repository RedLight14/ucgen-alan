import java.util.Scanner;

public class alan {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int a,b,c;
        

        System.out.print("1. kenari giriniz : ");
        a=inp.nextInt();

        System.out.print("2. kenari giriniz : ");
        b=inp.nextInt();

        System.out.print("3. kenari giriniz : ");
        c=inp.nextInt();

        int u=(a+b+c)/2;

        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("alan : "+alan);


    }
}
