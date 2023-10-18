import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print ("Введите второе число: ");
        int y = scanner.nextInt();
        int rez1 = x + y;
        int rez2 = x - y;
        int rez3 = x * y;
        int rez4 = x / y;
        System.out.print ("Результат сложения: %d, результат вычитания: %d, результат умножения: %d, результат деления: %d", rez1, rez2, rez3, rez4);
        scanner.close();
    }
}
