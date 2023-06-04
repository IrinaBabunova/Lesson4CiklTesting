package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Простой цикл");
        /** Напечатать все цифры в диапазоне от 0 до 100.*/

        for (int i=0; i<=100; i++) {
            System.out.print(i + " ");
        } System.out.print("\n");

        System.out.println("Простая сумма");

        /** Посчитать сумму геометрической прогрессии для чисел от 0 до 100 */
        int sum=0;
        for (int n=0; n<=100; n++) {
            sum=sum+n;
        }
        System.out.println("Сумма= " + sum);

        System.out.println("Странная сумма");
        /** Для чисел от 1 до 100 посчитать сколько получится, если писать 1 - 2 + 3 - 4 и так далее.*/
        int summa=0;
        for (int a=1; a<=100; a++) {
            if (a%2!=0) {
                summa=summa+a;
            } else {
                summa=summa-a;
            }
        } System.out.println("Сумма " + summa);

        System.out.println("Знаменитый fizz buzz");
        /** Написать программу, которая для каждой цифры в диапазоне от 0 до 100 печатает следующии
         Если цифра делится нацело на три - печатает fizz
         Если цифра делится нацело не пять - печатает buzz
         Если цифра делится и на три и на пять - печатает FizzBuzz */

        for (int number=0; number<=100; number++) {
            if ((number%3==0) && (number%5==0)) {
                System.out.println(number + ": FizzBuzz");
                continue;
            } else if (number%3==0) {
                System.out.println(number + ": fizz");
                continue;
            } else if (number%5==0) {
                System.out.println(number + ": buzz");
                continue;
            } System.out.println(number + ":");
        }

        System.out.println("Простые числа");
        /** Простое число это такое число, которое не делится ни на какое другое число нацело.
         Написать программу, которая будет определять простое число в переменной или нет. */

        int simpleNumber=67;
        for (int index=2; index<simpleNumber; index++){
            if (simpleNumber%index==0) {
                System.out.println(simpleNumber + " Число сложное");
                break;
            } else System.out.println(simpleNumber + " Число простое");
                   break;
        }

        System.out.println("Запасы гречки");
        /** Программист Василий очень любит гречку. Поэтому он заготовил запас гречки на годы вперёд
         который хранится на складе.
         В его запасе 100 килограммов гречки. Хранение одного килограмма в месяц стоит 100 рублей.
         Плата вносится за месяц вперёд. За месяц Василий съедает примерно 6 килограммов гречки.
         Каждый месяц Василий платит за хранение остатка. То есть в первый месяц от заплатит за 100
         килограммов, второй месяц за 94 и так далее, пока гречка не закончится.
         Написать программу, которая посчитает сколько денег нужно будет Василию, чтобы оплатить
         хранение гречки, до того момента, как он её съест.
         Со звёздочкой. В начале задавать в переменной не сколько килограммов запас Василий, а в
         течение какого срока он хочет питаться гречкой и рассчитывать остальное исходя из этого. */

         int buckwheatStock=100;
         int costOneKilogram=100;
         int costAllKilogram;
         int foodEaten=8;

         /**while (buckwheatStock>=foodEaten) {
             costAllKilogram=buckwheatStock*costOneKilogram;
             System.out.println(costAllKilogram);
             buckwheatStock=buckwheatStock-foodEaten;
         }*/
         do { costAllKilogram=buckwheatStock*costOneKilogram;
             System.out.println(costAllKilogram);
             buckwheatStock=buckwheatStock-foodEaten;
         } while (buckwheatStock>=foodEaten);

    }
}