import java.util.Scanner;

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        double result;

        if (x >= 1 && x < 3) {
            result = 9 / (a * x);
        } else if (x == 3) {
            result = (a * x) / (a * x * x + x + b);
        } else {
            System.out.println("Значення x не підпадає під діапазон.");
            return;
        }

        System.out.println("Результат: " + result);
    }

public class SentenceCounterWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        int sentenceCount = 0;
        int i = 0;

        while (i < text.length()) {
            char ch = text.charAt(i);
            {
                sentenceCount++;
            }
            i++;
        }

        System.out.println("Кількість речень у тексті: " + sentenceCount);

        scanner.close();
    }
}
public class SentenceCounterDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        int sentenceCount = 0;
        int i = 0;

        do {
            if (i >= text.length()) break;

            char ch = text.charAt(i);


             {
                sentenceCount++;
            }
            i++;
        } while (i < text.length());

        System.out.println("Кількість речень у тексті: " + sentenceCount);

        scanner.close();
    }
}
    public class PrimeNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть число N: ");
            int N = scanner.nextInt();

            System.out.println("Прості числа від 1 до " + N + ":");

            for (int i = 2; i <= N; i++) {
                boolean isPrime = true;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                }
            }

            scanner.close();
        }
    }