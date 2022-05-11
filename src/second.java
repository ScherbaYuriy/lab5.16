
import java.util.Scanner;

public class second {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перший катет:");
        int a = sc.nextInt();

        System.out.println("Введіть другий катет: ");
        int b = sc.nextInt();

        System.out.println("Введіть гіпотенузу:");
        int c = sc.nextInt();

        if(a == 3 & b == 4) {
            System.out.println("Периметр:" + (a + b + c));
            System.out.println("Площа:" + (a * b) / 2);
        } else {
            System.out.println("перший катет має бути 3");
            System.out.println("другий катет має бути 4");
        }
    }
}