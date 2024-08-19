import java.util.*;

public class funcTable {
    public static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        num = sc.nextInt();
        System.out.println("Table is: " + num);

        table(num);
    }
}
