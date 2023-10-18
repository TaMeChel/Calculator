import java.util.Scanner;

public class main {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print ("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.printf ("Результат сложения: ");
        int rez1 = x + y;
        System.out.println (rez1);
        System.out.printf ("Результат вычитания: ");
        int rez2 = x - y;
        System.out.println (rez2);
        System.out.printf ("Результат умножения: ");
        int rez3 = x * y;
        System.out.println (rez3);
        System.out.printf ("Результат деления: ");
        int rez4 = x / y;
        System.out.println (rez4);
        scanner.close();
    }
}
