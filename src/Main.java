public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задача 1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        long elephant = 110l;
        double sugarWeight = 4.5;
        char bar = 35;
        float saltWeight = 1.5F;
        boolean dogIsAdult = dog > 10;
        System.out.println (dogIsAdult);
        // Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println ("общий вес боксёров " + weightOfAllBoxers);
        System.out.println("разница в весе боксёров " + weightDifference);
        //Задача 3
        int bananas = 5;
        int banana1Grams = 80;
        int wholeGramBananas = bananas * banana1Grams;
        System.out.println("бананов всего грамм " + wholeGramBananas);
        int milk = 200;
        int milliliters100OfMilk = 105;
        int millilitersIn105GramsOfMilk = 100;
        int gramsOfMilk = milliliters100OfMilk * milk / millilitersIn105GramsOfMilk;
        System.out.println("всего грамм молока " + gramsOfMilk);
        int iceCreamPlombirBriquettes = 2;
        int weightBriquette = 100;
        int totalWeightOfBriquettes = weightBriquette * iceCreamPlombirBriquettes;
        System.out.println("общий вес брикетов " + totalWeightOfBriquettes);
        int rawУggs = 4;
        int egg = 70;
        int allEggsWeighAGram = rawУggs * egg;
        System.out.println("общий вес яиц " + allEggsWeighAGram);
        int sportsBreakfastWeight = wholeGramBananas + gramsOfMilk + totalWeightOfBriquettes + allEggsWeighAGram;
        System.out.println("вес спорт-завтрака " + sportsBreakfastWeight);
        int grPerKg = 1000;
        float weightKg = sportsBreakfastWeight / grPerKg;
        System.out.println("вес спорт-завтрака в килограммах " + weightKg);
        //Задача 4
        int needToReset = 7;
        int diet1 = 250;
        int diet2 = 500;
        int numberOfDiets = 2;
        int gramsToKilogram = 1000;
        int weightInGrams = gramsToKilogram * needToReset;
        System.out.println("вес в граммах " + weightInGrams);
        int willLeaveDaysWithADietOf1 = weightInGrams / diet1;
        System.out.println("уйдёт дней с рационом 1 " + willLeaveDaysWithADietOf1);
        int willLeaveDaysWithADietOf2 = weightInGrams / diet2;
        System.out.println("уйдёт дней с рационом 2 " + willLeaveDaysWithADietOf2);
        int theSumOfTheDaysOfBothDiets = willLeaveDaysWithADietOf1 + willLeaveDaysWithADietOf2;
        System.out.println("сумма дней обеих диет " + theSumOfTheDaysOfBothDiets);
        int mayTakeDaysOnAverage = theSumOfTheDaysOfBothDiets / numberOfDiets;
        System.out.println("может потребоваться дней в среднем " + mayTakeDaysOnAverage);
        //Задача 5
        int MashaGets = 67760;
        int DenisReceives = 83690;
        int ChristinaGets = 76230;
        int MashasSalaryWithAnIncrease = MashaGets / 100 * 10 + MashaGets;
        int DenisSalaryWithAnIncrease = DenisReceives / 100 * 10 + DenisReceives;
        int ChristinaSalaryWithAnIncrease = ChristinaGets / 100 * 10 + ChristinaGets;
        System.out.println("годовой доход у Маши " + (MashasSalaryWithAnIncrease - MashaGets) * 12);
        System.out.println("годовой доход у Дениса " + (DenisSalaryWithAnIncrease - DenisReceives) * 12);
        System.out.println("годовой доход у Кристины " + (ChristinaSalaryWithAnIncrease - ChristinaGets) * 12);


    }
}