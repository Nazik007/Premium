import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть яка зараз у праціника зарплата");
        double salary = scan.nextDouble();
        System.out.println("Введіть яка зараз у праціника вислуга років");
        int num = scan.nextInt();

        if (num < 5 ){
            System.out.println("Премія працівника становить " + salary *  0.1);
        }
        else if (num <= 5 && num < 10){
            System.out.println("Премія працівника становить " + salary *  0.15);
        }
        else if (num <= 10 && num < 15 ){
            System.out.println("Премія працівника становить " + salary *  0.25);
        }
        else if (num <= 15 && num < 20){
            System.out.println("Премія працівника становить " + salary *  0.35);
        }
        else if (num <= 20 && num < 25){
            System.out.println("Премія працівника становить " + salary * 0.45);
        }
        else if (num >= 25 ){
            System.out.println("Премія працівника становить " + salary *  0.50);
        }
    }
}
