package com.eable.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lssn3 {
    public static void main(String[] args) {
        work1();
    }
    //  Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    //   При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    //   После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    static void work1(){
        Scanner sc = new Scanner(System.in);
        Random rndm = new Random();
        int step = 1;
        byte isStillPlay = 1;

        while (isStillPlay == 1){
            int secret = rndm.nextInt(10);
            System.out.println("secret is - " + secret);
            while (step <= 3) {
                System.out.println("step is - " + step);
                int input = sc.nextInt();
                if (input == secret) {
                    System.out.println("U WIN");
                    break;
                }
                if (step != 3)
                    System.out.println("secret " + ((input > secret) ? "< ur num" : "> ur num"));
                step++;
            }
            System.out.println("restart 1 / 0 ?");
            if (sc.nextInt() == 0) {
                isStillPlay = 0;
            } else {
                step = 1;
            }
        }
    }

// * Создать массив из слов
//     String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
//          "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
//          "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//   При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//   apple – загаданное
//   apricot - ответ игрока
//   ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//   Для сравнения двух слов посимвольно можно пользоваться:
//   String str = "apple";
//   char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
//   Играем до тех пор, пока игрок не отгадает слово.
//   Используем только маленькие буквы.
}

