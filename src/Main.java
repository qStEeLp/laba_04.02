import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int cycle;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Выберите задачу [1-15]: ");
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
            } // !r
            if (numb == 2) {
                System.out.println("Введите время начала разговора (от 0 до 23 часов)");
                double t = in.nextDouble();
                System.out.println("Введите минуту часа начала разговора (от 0 до 59)");
                double mt = in.nextDouble();
                System.out.println("Введите продолжительность разговора в минутах");
                double dt = in.nextDouble();
                System.out.println("Введите стоимость минуты разговора");
                double s = in.nextDouble();
                System.out.println("Введите день недели (от 1 до 7)");
                int d = in.nextInt();
                double sum = 0.0;
                double minutes = t * 60 + mt;
                for (int i = 0; i < dt; i++) {
                    System.out.println(sum);
                    minutes++;
                    if (minutes == 24 * 60) {
                        d++;
                        minutes = 0;
                        if (d > 7) {
                            d = 1;
                        }
                    }
                    if ((d == 6) | (d == 7)) {
                        if ((minutes >= 21 * 60) | (minutes <= 8 * 60)) {
                        sum = sum+s*0.9*0.8;
                        } else {
                            sum = sum + s*0.9;
                        }
                    } else {
                        if ((minutes >= 21 * 60) | (minutes <= 8 * 60)) {
                            sum = sum + s*0.8;
                        } else {
                            sum = sum + s;
                        }
                    }
                }
                System.out.printf("Стоимость разговора = %f", sum);
            }// !r
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

            } // !r
            if (numb == 4) {
                System.out.println("Введите эру. [1] - до нашей эры " +
                        "[2] - наша эра ");
                int era = in.nextInt();
                if (era == 1) {
                    int c = 0;
                    System.out.println("Введите год: [2000-0]");
                    int[] goda = new int[12];
                    int god = in.nextInt();
                    if (god > 45) {
                        System.out.println("На тот момент не было весокосных годов");
                    }
                    if (god <= 45) {
                        int b = 45;
                        for (int i = 0; i < goda.length; i++) {
                            goda[i] = b;
                            b = b-4;
                        }
                        for (int year:goda) {                      // 45,41,37,33,29,25,21,17,13,9,5,1
                            if (year == god) {
                                c = 1;
                                break;
                            }
                            System.out.println(c);
                        }
                        if ( c == 1 ) {
                            System.out.printf("%d год до нашей эры – високосный", god);
                        }
                        else {
                            System.out.printf("%d год до нашей эры – не високосный", god);
                        }
                    }
                }
                if (era == 2) {
                    System.out.println("Введите год: [0-2000]");
                    int god = in.nextInt();
                    if (god % 4 == 0 & god != 0) {
                        System.out.printf("%d год нашей эры - весокосный", god);
                    } else {
                        System.out.printf("%d год нашей эры - невесокосный", god);
                    }
                }
            } // !r
            if (numb == 5) {
                String ka = "йка";
                String ki = "Йки";
                String ek = "ек";
                System.out.println("Введите число от 1 до 99: ");
                int a = in.nextInt();
                if (a < 20) {
                    if (a == 1) {
                        System.out.printf("%d " + "копе%s", a, ka);
                    } else if (a < 5) {
                        System.out.printf("%d " + "копе%s", a, ki);
                    } else {
                        System.out.printf("%d " + "копе%s", a, ek);

                    }

                } else {
                    int del = a % 10;
                    if (del == 1) {
                        System.out.printf("%d " + "копе%s", a, ka);
                    } else if ( del < 5 & del != 0) {
                        System.out.printf("%d " + "копе%s", a, ki);
                    } else {
                        System.out.printf("%d " + "копе%s", a, ek);
                    }
                }

            } // !r
            if (numb == 6) {
                System.out.println("Введите день года [1-365]: ");
                int god = in.nextInt();
                int ned = god%7;
                System.out.println(ned);
                switch (ned) {
                    case 1 -> System.out.println("Понедельник");
                    case 2 -> System.out.println("Вторник");
                    case 3 -> System.out.println("Среда");
                    case 4 -> System.out.println("Четверг");
                    case 5 -> System.out.println("Пятница");
                    case 6 -> System.out.println("Суббота");
                    case 0 -> System.out.println("Воскресенье");
                }
            } // !r
            if (numb == 7) {
                System.out.println("Введите месяц вашего рождения: ");
                int month = in.nextInt();
                System.out.println("Введите день вашего рождения:");
                int day = in.nextInt();
                switch (month) {
                    case 1:
                        if (day <= 20 ) {
                            System.out.println("Вы - Козерог");
                        } else {
                            System.out.println("Вы - Водолей");
                        }
                        break;
                    case 2:
                        if (day <= 18) {
                            System.out.println("Водолей");
                        } else {
                            System.out.println("Вы - Рыбы");
                        }
                        break;
                    case 3:
                        if (day <= 20) {
                            System.out.println("Вы - Рыбы");
                        } else {
                            System.out.println("Вы - Овен");
                        }
                        break;
                    case 4: if (day <= 20) {
                        System.out.println("Вы - Овен");
                    } else {
                        System.out.println("Вы - Телец");
                    }
                        break;
                    case 5: if (day <= 20) {
                        System.out.println("Вы - Телец");
                    } else {
                        System.out.println("Вы - Близнецы");
                    }
                        break;
                    case 6: if (day <= 21) {
                        System.out.println("Вы - Близнецы");
                    } else {
                        System.out.println("Вы - Рак");
                    }
                        break;
                    case 7: if (day <= 21) {
                        System.out.println("Вы - Рак");
                    } else {
                        System.out.println("Вы - Лев!!");
                    }
                        break;
                    case 8: if (day <= 23) {
                        System.out.println("Вы - Лев!!");
                    } else {
                        System.out.println("Вы - Дева");
                    }
                        break;
                    case 9: if (day <= 23) {
                        System.out.println("Вы - Дева");
                    } else {
                        System.out.println("Вы - Весы");
                    }
                        break;
                    case 10: if (day <= 23) {
                        System.out.println("Вы - Весы");
                    } else {
                        System.out.println("Вы - Скорпион");
                    }
                        break;
                    case 11: if (day <= 22) {
                        System.out.println("Вы = Скорпион");
                    } else {
                        System.out.println("Вы - Стрелец");
                    }
                        break;
                    case 12: if (day <= 21) {
                        System.out.println("Вы - Стрелец");
                    } else {
                        System.out.println("Вы - Козерог");
                    }
                }
            } // !r
            if (numb == 8) {
                double m = 2;
                double n = 1;
                for (double a, b = 0, c; b < 1000;) {
                    a = Math.pow(m,2)-Math.pow(n,2);
                    b = 2*m*n;
                    c = Math.pow(m,2)+Math.pow(n,2);
                    m++;
                    n++;
                    System.out.println(a + " , " + b + " , " + c);
                }
            } // !r
            if (numb == 9) {
                int[] mass;
                mass = new int[10];
                Random rand = new Random();
                for (int i = 0; i < mass.length; i++) {
                    mass[i] = rand.nextInt(50);
                }
                System.out.println("Неотсортированный массив:" + Arrays.toString(mass));
                for (int i = 0; i < mass.length - 1; i++) {
                    for (int j = 0; j < mass.length - i - 1; j++) {
                        if (mass[j] > mass[j+1]) {
                            int a = mass[j];
                            mass [j] = mass[j+1];
                            mass[j+1] = a;
                        }
                    }
                }
                System.out.println("Отсортированный массив:" + Arrays.toString(mass));
            } // !r
            if (numb == 10) {
                System.out.println("Введите x: ");
                double x = in.nextDouble();
                System.out.println("Введите y: ");
                double y = in.nextDouble();
                double F = Math.sqrt(2+Math.pow(y,2)+(Math.pow(Math.sin(y+5),1.0/7)))/(Math.log(x+1)-Math.pow(y,3));
                System.out.println(F);
            } // !r
            if (numb == 11) {
                System.out.println("Введите a(!= 0): ");
                int a = in.nextInt();
                if ( a == 0) {
                    System.out.println("Противоречит условиям задачи");
                    break;
                }
                System.out.println("Введите b: ");
                int b = in.nextInt();
                System.out.println("Введите c: ");
                int c = in.nextInt();
                double D = Math.pow(b,2)-4*a*c;
                if (D < 0) {
                    System.out.println("Вещественных корней нет");

                } else if (D == 0) {
                    double x = (b/(2.0*a))*(-1);
                    System.out.printf("Корень уравнения = %f", x);
                } else {
                    double x1 = ((b*(-1))+Math.sqrt(D))/(2*a);
                    double x2 = ((b*(-1))-Math.sqrt(D))/(2*a);
                    System.out.printf("x1 = %f , x2 = %f", x1, x2);
                }
            } // !r
            if (numb == 12) {
                String ka = "ок";
                String ki = "ка";
                String ek = "ков";
                System.out.println("Введите 2 числа a,b (a>b)");
                int a = in.nextInt();
                int b = in.nextInt();
                int k = a/b;
                if (k < 20) {
                    if (k == 1) {
                        System.out.printf("На отрезке а - %d " + "отрез%s b", k, ka);
                    } else if (k < 5 & k != 0) {
                        System.out.printf("На отрезке а - %d " + "отрез%s b", k, ki);
                    } else {
                        System.out.printf("На отрезке а - %d " + "отрез%s b", k, ek);

                    }

                } else {
                    int del = k % 10;
                    if (del == 1) {
                        System.out.printf("На отрезке а - %d " + "отрез%s b", k, ka);
                    } else if ( del < 5 & del != 0) {
                        System.out.printf("На отрезке а - %d " + "отрез%s b", k, ki);
                    } else {
                        System.out.printf("На отрезке а - %d " + "отрез%s b", k, ek);
                    }
                }
            } // !r
            if (numb == 13) {
                System.out.println("Введите непустую последовательность ненулевых целых чисел. Программа заканчивается при вводе нуля.");
                int a = in.nextInt();
                int predA = a;
                int smena = 0;
                while (a != 0) {
                    a = in.nextInt();
                    if (predA*a < 0) {
                        smena++;
                    }
                    predA = a;
                }
                System.out.printf("Знак поменялся: %d раз", smena);
            } // !r
            if (numb == 14) {
                System.out.println("Введите произвольное количество вещественных чисел,за которыми следует –1000");
                double a = in.nextDouble();
                double srP;
                double srM;
                double sumP = 0;
                double sumM = 0;
                double countP = 0;
                double countM = 0;
                while (a != -1000) {
                    if (a < 0) {
                        sumM = sumM+a;
                        countM++;
                    }
                    if (a > 0) {
                        sumP = sumP+a;
                        countP++;
                    }
                    a = in.nextDouble();
                }
                srP = sumP/countP;
                srM = sumM/countM;
                System.out.printf("Ср. Арифметическое отрицательных чисел = %f", srM);
                System.out.printf(" Ср. Арифметическое положительных чисел = %f", srP);
            } // !r
            if (numb == 15) {
                int[] mass;
                mass = new int[10];
                Random rand = new Random();
                for (int i = 0; i < mass.length; i++) {
                    mass[i] = rand.nextInt(10);
                }
                System.out.println("Массив: " + Arrays.toString(mass));
                for (int i = 0; i < mass.length; i++) {
                    for (int j = i + 1; j < mass.length; j++) {
                        if (mass[i] == mass[j] ) {
                            System.out.println("Числа не уникальны");
                            return;
                        }
                    }
                }
                System.out.println("Все числа уникальны");
            } // !r
            System.out.print(" Вы хотите выйти? [1] - Да, [2] - Нет \n");
            cycle = in.nextInt();
        } while (cycle == 2) ;
    }
}