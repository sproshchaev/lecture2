package sbp.branching;

import sbp.common.Utils;

public class MyCycles
{
    private final Utils utils;

    public static void main(String[] args) {

    } // public static void main(String[] args)

    public MyCycles(Utils utils)
    {
        this.utils = utils;
    }

    /**
     * Необходимо написать реализацию метода с использованием for()
     * ------------------------------------------------------------
     +      * Метод должен вызвать Utils#utilFunc1() на каждой итерации
     +      * Реализация Utils#utilFunc1() неизвестна
     +      * Должна присутствовать проверка возврщаемого значения от Utils#utilFunc1()
     * Результат проверяется через unit-test (все тесты должны выполниться успешно)
     * @param iterations - количество итераций
     * @param str - строка для вывода через утилиту {@link Utils}
     */
    public void cycleForExample(int iterations, String str)
    {
        boolean resultCycleForExample;

        for (int i = 1; i <= iterations; i++) {

            resultCycleForExample = this.utils.utilFunc1(str);

            if (resultCycleForExample == true) {

                System.out.println("Результат cycleForExample=true");

            }
            else {

                System.out.println("Результат cycleForExample=false");

            } // if

        } // for

    } // public void cycleForExample(int iterations, String str)

    /**
     * Необходимо написать реализацию метода с использованием while()
     +     * Метод должен вызвать Utils#utilFunc1() на каждой итерации
     +     * Реализация Utils#utilFunc1() неизвестна
     +     * Должна присутствовать проверка возврщаемого значения от Utils#utilFunc1()
     * Результат проверяется через unit-test (все тесты должны выполниться успешно)
     * @param iterations - количество итераций
     * @param str - строка для вывода через утилиту {@link Utils}
     */
    public void cycleWhileExample(int iterations, String str)
    {
        boolean resultCycleWhileExample;

        int countCycleWhile = 0;

        boolean stopWhile = false;

        while ((countCycleWhile < iterations) && (stopWhile == false)) {

            resultCycleWhileExample = this.utils.utilFunc1(str);

            if (resultCycleWhileExample == true) {

                System.out.println("Результат cycleWhileExample=true");

            }
            else {

                stopWhile = true;

                System.out.println("Результат cycleWhileExample=false");

            } // if

            countCycleWhile++;

        } // while

    } // public void cycleWhileExample

    /**
     * Необходимо написать реализацию метода с использованием while()
     -     * Метод должен вызвать Utils#utilFunc1() на каждой итерации
     -     * Реализация Utils#utilFunc1() неизвестна
     +     * Метод должен вызвать Utils#utilFunc1() на каждой итерации
     +     * Реализация Utils#utilFunc1() неизвестна
     * Должна присутствовать проверка возврщаемого значения
     * Результат проверяется через unit-test (все тесты должны выполниться успешно)
     * @param from - начальное значение итератора
     * @param to - конечное значение итератора
     * @param str - строка для вывода через утилиту {@link Utils}
     */
    public void cycleDoWhileExample(int from, int to, String str) {

        boolean resultCycleDoWhileExample;

        int expectedCycleDoWhile = Math.abs(from - to);

        int countCycleDoWhile = 0;

        do {

            // Вызов
            resultCycleDoWhileExample = this.utils.utilFunc1(str);

            if (resultCycleDoWhileExample == true) {

                System.out.println("Результат cycleDoWhileExample=true");

            }
            else {

                System.out.println("Результат cycleDoWhileExample=false");

            } // if


            countCycleDoWhile++;

        } while (countCycleDoWhile < expectedCycleDoWhile);

    } // public void cycleDoWhileExample(int from, int to, String str)
}
