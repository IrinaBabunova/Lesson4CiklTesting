package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Простой цикл");
        /** Напечатать все цифры в диапазоне от 0 до 100.*/

        for (int i=0; i<=100; i++) {
            System.out.print(i + " ");
        } System.out.print("\n");

        System.out.println("Простая сумма");

        /** Посчитать сумму геометрической прогрессии для чисел от 0 до 100 ? как можно считать сумму геометрической прогрессии
         * если начинается с 0? Это меня и смутило */

        int sumGeomPr=0;
        int q=2;
        int n=5;
        sumGeomPr=sumGeomPr+n;
        while (n<=100) {
            n=n*q;
            sumGeomPr=sumGeomPr+n;
        } System.out.println("Сумма геометрической прогрессии = " + sumGeomPr);


        System.out.println("Странная сумма");
        /** Для чисел от 1 до 100 посчитать сколько получится, если писать 1 - 2 + 3 - 4 и так далее.*/
        int sum=0; /* переменная так названа, потому что есть уже задача с такой переменной.*/
        for (int a=1; a<=100; a++) {
            if (a%2!=0) {
                sum=sum+a;
            } else {
                sum=sum-a;
            }
        } System.out.println("Сумма " + sum);

        System.out.println("Знаменитый fizz buzz");
        /** Написать программу, которая для каждой цифры в диапазоне от 0 до 100 печатает следующии
         Если цифра делится нацело на три - печатает fizz
         Если цифра делится нацело не пять - печатает buzz
         Если цифра делится и на три и на пять - печатает FizzBuzz */

        for (int number=0; number<=100; number++) {
            if ((number% 3 == 0) && (number % 5 == 0)) {
                System.out.println(number + ": FizzBuzz");
                continue;
            } if (number % 3 == 0) {
                System.out.println(number + ": fizz");
                continue;
            } if (number % 5 == 0) {
                System.out.println(number + ": buzz");
            }// System.out.println(number + ":");
        }

        System.out.println("Простые числа");
        /** Простое число это такое число, которое не делится ни на какое другое число нацело.
         Написать программу, которая будет определять простое число в переменной или нет. */

        /**   int simpleNumber=27;
        int ind=2;
        boolean simple=false;
        while (ind<simpleNumber) {
            if (simpleNumber % ind == 0) {
                simple = true;
                break;
            } ind++; }
        if (!simple) {
            System.out.println(simpleNumber + " - Простое число");
        } else System.out.println(simpleNumber + " - Составное число");*/

        int simpleNumber=5;
        int ind=2;
        boolean simple=false;
        while (ind<simpleNumber) {
            if (simpleNumber % ind == 0) {
                simple = true;
                break;
            } ind++;
        }
        if (simple) {
            System.out.println(simpleNumber + " - Составное число");
        } else System.out.println(simpleNumber + " - Простое число");


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
         int costAllKilogramOneMonth;
         int foodEaten=6;
         int sumCostForAllMonths=0;

         while (buckwheatStock>=0) {
             costAllKilogramOneMonth=buckwheatStock*costOneKilogram;
             sumCostForAllMonths=sumCostForAllMonths+costAllKilogramOneMonth;
             buckwheatStock=buckwheatStock-foodEaten;
         }
        System.out.println("Всего Василию нужно заплатить " + sumCostForAllMonths);

        System.out.println("Запасы гречки *");
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

        int periodYear=2;
        int costOneKilogram2=100;
        int costAllKilogramOneMonth2;
        int foodEaten2=6;
        int sumCostForAllMonths2=0;

        int countMonths=periodYear*12;
        int totalBuckwheat=countMonths*foodEaten2;
        for (int month=1; month<=countMonths; month++){
            costAllKilogramOneMonth2=totalBuckwheat*costOneKilogram2;
            sumCostForAllMonths2=sumCostForAllMonths2+costAllKilogramOneMonth2;
            totalBuckwheat=totalBuckwheat-foodEaten2;
        } System.out.println("Всего Василию нужно заплатить " + sumCostForAllMonths2);

    }
}