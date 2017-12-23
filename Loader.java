public class Loader {
    public static void main(String[] args) {
        //создаем 4 переменных
        int numberOne = 3;
        int numberThree = 2;
        int numberTwo = numberThree;
        int numberFour = numberOne;
        //вывод всех переменных согласно задания JOB4j
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);
        System.out.println(numberFour);
        System.out.println(" ");// отступ между заданиями

        //выполнение задание по формуле: сложить все переменне и от суммы вычесть 10
        int result = numberOne + numberTwo + numberThree + numberFour - 10;
        System.out.println(result);
    }
}
