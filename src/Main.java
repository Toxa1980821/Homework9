//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Задача № 1
        System.out.println(" === Задача № 1 === ");
        int firstFriday = 5;
        for (int day = 1; day <= 31; day++)
            if ((day - firstFriday) % 7 == 0 && day >= firstFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }

        // Задача № 2
        System.out.println(" === Задача № 2 === ");
        int marathomDistance = 42195;
        final int step = 500;

        //  Вариант 1 do-while
        System.out.println(" Вариант 1 цикл do-while ");
        int distanceCoveredDoWhile = 0;

        do {
            distanceCoveredDoWhile += step;
            int remaining = marathomDistance - distanceCoveredDoWhile;
            if (remaining < 0) {
                remaining = 0;
            }
            System.out.println("Держитесь! Осталось " + remaining + " метров");
        } while (distanceCoveredDoWhile < marathomDistance);

        //  Вариант 2 for
        System.out.println(" Вариант 2 цикл for ");
        for (int distanceCoveredFor = step; distanceCoveredFor <= marathomDistance + step; distanceCoveredFor += step) {
            int remaining = marathomDistance - distanceCoveredFor;
            if (remaining < 0) {
                remaining = 0;
            }
            System.out.println("Держитесь! Осталось " + remaining + " метров");
        }
        // Задача № 3
        System.out.println(" === Задача № 3 === ");
        int budget = 1500;

        // Вариант 1 while
        System.out.println(" Вариант 1 цикл while ");
        int dayWhile = 0;
        int currentBudgetWhile = budget;
        while (currentBudgetWhile > 0) {
            dayWhile++;
            if (dayWhile % 5 == 0) {
                continue;
            }
            if (currentBudgetWhile >= 100) {
                currentBudgetWhile -= 100;
            } else {
                dayWhile--;
                break;
            }
        }
        System.out.println(" Бюджета хватит на " + dayWhile + " дней");

        // Вариант 2 for
        System.out.println(" Вариант 2 цикл for ");
        int dayFor = 0;
        int currentBudgetFor = budget;
        for (; ; ) {
            dayFor++;
            if (dayFor % 5 == 0) {
                continue;
            }
            if (currentBudgetFor >= 100) {
                currentBudgetFor -= 100;
            } else {
                dayFor--;
                break;
            }
        }
        System.out.println(" Бюджета хватит на " + dayFor + " дней");

        // Задача № 4
        System.out.println(" === Задача № 4 === ");
        int month = 0;
        double total = 0;
        int monthlyDeposit = 15000;
        double interestRate = 0.07;
        long target = 12_000_000;

        while (true) {
            month++;
            total += monthlyDeposit;
            if (month % 6 == 0) {
                total += total * interestRate;
            }
            System.out.println(" Месяц " + month + ", сумма накоплений = " + (long) total + " рублей ");

            if (total >= target) {
                break;
            }
        }
        // Задача № 5
        System.out.println(" === Задача № 5 === ");
        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев!");
                if (overheats > 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                minute++;
                continue;
            }
            charge += 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут.");

    }
}
