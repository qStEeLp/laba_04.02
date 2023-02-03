import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int cycle;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Выберите задачу [1-3]: ");
            int numb = in.nextInt();
            if (numb == 1) {
                System.out.println("Введите x:");
                double x = in.nextDouble();
                System.out.println("Введите y:");
                double y = in.nextDouble();
                if (x < 0) {
                    x = x * (-1);
                }
                if (y < 0) {
                    y = y * (-1);
                }
                double sum = x + y;
                if (sum > 1) {
                    System.out.println("Точка входит в заданную заштрихованную область");
                } else {
                    System.out.println("Точка не входит в заданную заштрихованную область");
                }
            }
            if (numb == 2) {
                System.out.println("Введите время начала разговора (от 0 до 24 часов)");
                double t = in.nextDouble();
                System.out.println("Введите продолжительность разговора в минутах");
                double dt = in.nextDouble();
                System.out.println("Введите стоимость минуты разговора");
                double s = in.nextDouble();
                System.out.println("Введите день недели (от 1 до 7)");
                int d = in.nextInt();
                double pr = s / 100 * 20;
                double pr1 = s / 100 * 10;
                if (t > 8 && t < 22) {
                    s = s * 1;
                } else {
                    s = s - pr;
                }
                if (d == 6 || d == 7) {
                    s = s - pr1;
                }
                double sum = dt * s;
                System.out.printf("Стоимость переговоров = %f", sum);
            }
            if (numb == 3) {
                System.out.println("Введите числа A,B,C");
                int A = in.nextInt();
                int B = in.nextInt();
                int C = in.nextInt();
                if ((A % 2 == 0) ^ (B % 2 == 0)) {
                    System.out.println("а) Истина");
                } else {
                    System.out.println("а) Ложь");
                }
                if ((A % 3 == 0) & (B % 3 == 0) & (C % 3 == 0)) {
                    System.out.println("б) Истина");
                } else {
                    System.out.println("б) Ложь");
                }

            }
            System.out.print(" Вы хотите выйти? [1] - Да, [2] - Нет \n");
            cycle = in.nextInt();
        } while (cycle == 2);
    }
}