public class Main {
    public static void main(String[] args){
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задание 1");
        int[] salaryArray = generateRandomArray();

        int salarysum = 0;
        for (int salary: salaryArray) {
            salarysum += salary;
        }
        System.out.println("Сумма трат за месяц составила  " + salarysum+ " рублей");


        System.out.println("Задание 2");

        int salarymax = 99000;
        int salarymin = 200001;

        for (int salary: salaryArray) {
            if (salary > salarymax) {
                salarymax = salary;
            }
            if (salary < salarymin) {
                salarymin = salary;
            }
        }

        System.out.println("Минимальная сумма трат за месяц составила  " + salarymin+ " рублей" + " максимальная сумма трат за месяц составила " +salarymax+ " рублей");


        System.out.println("Задание 3");

        int daysCount = 30;
        double salaryAverage = (double) salarysum/daysCount;

        System.out.println("Средняя сумма трат за месяц " +salaryAverage+ " рублей");


        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        }
}