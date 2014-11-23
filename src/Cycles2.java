import java.util.Random;
import java.util.Scanner;

/**
 * Created by Yuliya on 21.11.2014.
 */
/*
Реализовать игру "Угадай число". Компьютер загадывает случайное число, а человек пытается его отгадать.
Для каждой попытки компьютер выдает, больше или меньше введенное число, чем загаданное.
Если человек угадал, игра завершается.
Используйте следующий код:
int number = new Random().nextInt(100) + 1; // случайное число от 1 до 100
Scanner in = new Scanner(System.in);
int guess = in.nextInt(); // число, прочитанное с клавиатуры*/

public class Cycles2 {
public static void main(String[] args) {
int number = new Random().nextInt(100) + 1;
    System.out.println("Программа загадала число, попробуйте, пожалуйста, его отгадать.\n Введите число:");

    Scanner in = new Scanner(System.in);
    int guess;

    while (true) {
        guess = in.nextInt();

        if (guess > number) {
            System.out.println("Загаданное число меньше "+guess);
        }
        else if (guess < number) {
            System.out.println("Загаданное число больше "+guess);
        }
        else {
            System.out.println("Поздравляем! Вы угадали, это было число "+number);
            in.close();
            break;
        }
    }
}
}