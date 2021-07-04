package com.TMS;

/* Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив. */

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[12];
        int max = 0;
        int b = 0;
        Random rnd = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(15);
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                b = i;
            }
        }
        System.out.println ("max number - "+max);
        System.out.println("max index - "+b);
    }
}
