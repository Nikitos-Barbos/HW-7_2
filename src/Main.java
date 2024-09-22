public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");

        int wholeAmount = 2_459_000;
        int totalSavings = 0;
        int money = 15000;
        int month = 0;
        double percent = 1D / 100;
        while (totalSavings < wholeAmount) {
            totalSavings += money;
            totalSavings = (int) (totalSavings * (1 + percent));
            month++;
            System.out.println(("Месяц " + month + " ,сумма накоплений равна " + totalSavings + " рублей"));
        }

        System.out.println();
        System.out.println("Задание 2");

        int b = 0;
        while (b < 10) {
            b++;
            System.out.print(b + " ");
        }
        System.out.println();
        for (int c = 10; c > 0; c--) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Задание 3");

        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * birthRate / 1000 - population * mortalityRate / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println();
        System.out.println("Задание 4");

        int depositAmount = 15_000;
        int targetAmount = 12_000_000;
        double monthlyInterestRate = 7D / 100;
        int months = 0;
        int currentAmount = depositAmount;

        while (currentAmount < targetAmount) {
            months++;
            currentAmount += currentAmount * monthlyInterestRate;
            System.out.println("Месяц " + months + ", текущая сумма: " + currentAmount + " рублей");
        }

        System.out.println();
        System.out.println("Задание 5");

        currentAmount = depositAmount;
        months = 0;
        while (currentAmount < targetAmount) {
            months++;
            currentAmount += currentAmount * monthlyInterestRate;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + " ,сумма накоплений равна " + currentAmount + " рублей");
            }
        }

        System.out.println();
        System.out.println("Задание 6");

        currentAmount = depositAmount;
        months = 0;
        int monthss = 9 * 12;
        while (months < monthss) {
            months++;
            currentAmount += currentAmount * monthlyInterestRate;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + " ,сумма накоплений равна " + currentAmount + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задание 7");

        int friday = 5;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет ");
        }

        System.out.println();
        System.out.println("Задание 8");

        int period = 79;
        int years = 2024;
        int startYear = years - 200;
        int endYear = years + 100;

        for (int year = 0; year < endYear; year += period) {
            if (year > startYear) {
                System.out.println(year);
            }
        }


    }

}