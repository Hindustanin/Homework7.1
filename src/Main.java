public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        int celNakopit = 2_459_000;
        int summa = 0;
        int otlogeno = 15_000;
        double procent = 1D / 100;
        int mesyac = 1;

        while (summa < celNakopit) {
            summa += otlogeno;
            summa = (int) (summa * (1 + procent));
            mesyac++;
            System.out.println("Месяц " + mesyac + ", сумма накоплений равна " + summa + " рублей");
        }
        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        int nomer = 0;
        while (nomer < 10) {
            nomer++;
            System.out.print(nomer + " ");
        }
        System.out.println();
        for (; nomer >= 1; nomer--) {
            System.out.print(nomer + " ");
        }
        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        int naselenie = 12_000_000;
        int rogdaemstNa1000 = 17;
        int smertnostNa1000 = 8;
        int god = 2024;
        int letPoschitat = god + 10;
        while (god < letPoschitat) {
            naselenie += naselenie * rogdaemstNa1000 / 1000 - naselenie * smertnostNa1000 / 1000;
            System.out.println("Год " + god + ", численность населения составляет " + naselenie);
            god++;
        }
        // Задача 4
        System.out.println();
        System.out.println("Задача 4");

        int vklad = 15_000;
        procent = 7D / 100;
        celNakopit = 12_000_000;
        mesyac = 1;
        while (vklad <= celNakopit) {
            vklad = (int) (vklad * (1 + procent));
            System.out.println("Месяц " + mesyac + ", сумма наколений равна " + vklad);
            mesyac++;
        }
        // Задача 5
        System.out.println();
        System.out.println("Задача 5");

        vklad = 15_000;
        mesyac = 1;
        while (vklad <= celNakopit) {
            vklad = (int) (vklad * (1 + procent));
            if (mesyac % 6 == 0) {
                System.out.println("Месяц " + mesyac + ", сумма наколений равна " + vklad);
            }
            mesyac++;
        }
        // Задача 6
        System.out.println();
        System.out.println("Задача 6");

        vklad = 15_000;
        mesyac = 1;
        int letNaVklad = 9;
        int mesyacevNaVklad = 12 * letNaVklad;
        while (mesyac <= mesyacevNaVklad) {
            vklad = (int) (vklad * (1 + procent));
            if (mesyac % 6 == 0) {
                System.out.println("Месяц " + mesyac + ", сумма наколений равна " + vklad);
            }
            mesyac++;
        }
        // Задача 7
        System.out.println();
        System.out.println("Задача 7");

        int chislo1Pyatnici = 1;
        for (int den = chislo1Pyatnici; den <= 31; den+=7) {
            System.out.println("Сегодня пятница, " + den + "-е число. Необходимо подготовить отчет");
        }
        // Задача 8
        System.out.println();
        System.out.println("Задача 8");

        god = 2024;
        int period = 79;
        int nachalo = 0;
        int godNachalaOtcheta = god - 200;
        int godOkonchsniaOtcheta = god + 100;
        for (int godKameti = nachalo; godKameti < godOkonchsniaOtcheta; godKameti += period) {
            if (godKameti > godNachalaOtcheta) {
                System.out.println(godKameti);
            }
        }
    }
}