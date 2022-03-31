package sbp.branching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sbp.common.Utils;

import static org.mockito.ArgumentMatchers.anyString;

public class MyBranchingTest {

    /**
     * На этот метод необходимо написать unit-тест!!!
     * --------------------------------------------
     * Тест должен содержать mock на объект {@link Utils} (реализация неизвестна)
     * Необходимо проверить результат выполнения метода в зависимости от возможных
     * реализаций {@link Utils}
     * public int maxInt(int i1, int i2)
     * @param i1 - первое значение
     * @param i2 - второе значение
     * @return - большее из значений или 0, если Utils#utilFunc2 вернёт true;
     */

    @Test
    public void maxInt_Test1() {

        System.out.println("Тестирование maxInt_Test1():");

        Utils utilsVar = Mockito.mock(Utils.class);

        MyBranching myBranching_Obj = new MyBranching(utilsVar);

        int resultMaxInt;

        Mockito.when(utilsVar.utilFunc2()).thenReturn(true);

        resultMaxInt = myBranching_Obj.maxInt(1, 2);

        if (utilsVar.utilFunc2() == true) {

            System.out.println("При Utils#utilFunc2=true maxInt(1, 2)=" + resultMaxInt);

            Assertions.assertTrue(resultMaxInt == 0);

        } // if

        System.out.println("");

    } // public void maxInt_Test1()

    @Test
    public void maxInt_Test2() {

        System.out.println("Тестирование maxInt_Test2():");

        Utils utilsVar = Mockito.mock(Utils.class);

        MyBranching myBranching_Obj = new MyBranching(utilsVar);

        int resultMaxInt;

        Mockito.when(utilsVar.utilFunc2()).thenReturn(false);

        resultMaxInt = myBranching_Obj.maxInt(1, 2);

        if (utilsVar.utilFunc2()==false) {

            System.out.println("При Utils#utilFunc2=false maxInt(1, 2)=" + resultMaxInt);

            Assertions.assertTrue(resultMaxInt == 2);

        } // if

        System.out.println("");

    } // public void maxInt_Test2()


    /**
     * На этот метод необходимо написать unit-тест
     * Тест должен содержать mock на объект {@link Utils} (реализация неизвестна)
     * Необходимо проверить результат выполнения метода в зависимости
     * от возможных реализаций {@link Utils}
     * @return - true, если Utils#utilFunc2() возвращает true
     */
    @Test
    public void ifElseExample_Test1() {

        System.out.println("Тестирование ifElseExample_Test1():");

        Utils utilsVar = Mockito.mock(Utils.class);

        MyBranching myBranching_Obj = new MyBranching(utilsVar);

        boolean resultIfElseExample;

        Mockito.when(utilsVar.utilFunc2()).thenReturn(true);

        resultIfElseExample = myBranching_Obj.ifElseExample();

        if (utilsVar.utilFunc2() == true) {

            System.out.println("При Utils#utilFunc2=true ifElseExample=" + resultIfElseExample);

            Assertions.assertTrue(resultIfElseExample == true);

        } // if

        System.out.println("");

    } // public void ifElseExample_Test1()

    @Test
    public void ifElseExample_Test2() {

        System.out.println("Тестирование ifElseExample_Test2():");

        Utils utilsVar = Mockito.mock(Utils.class);

        MyBranching myBranching_Obj = new MyBranching(utilsVar);

        boolean resultIfElseExample;

        Mockito.when(utilsVar.utilFunc2()).thenReturn(false);

        resultIfElseExample = myBranching_Obj.ifElseExample();

        if (utilsVar.utilFunc2() == false) {

            System.out.println("При Utils#utilFunc2=false ifElseExample=" + resultIfElseExample);

            Assertions.assertFalse(resultIfElseExample == true);

        } // if

        System.out.println("");

    } // public void ifElseExample_Test2()


    /**
     * На этот метод необходимо написать unit-тест
     * Тест должен содержать mock на объект {@link Utils} (реализация неизвестна)
     * Необходимо проверить выполнение Utils#utilFunc1 и Utils#utilFunc2 при входящем i = 0
     * Необходимо проверить выполнение Utils#utilFunc1 и Utils#utilFunc2 при входящем i = 1
     * Необходимо проверить выполнение Utils#utilFunc1 и Utils#utilFunc2 при входящем i = 2
     * Можно сделать все проверки одним тестом, но лучше под каждую проверку завести отдельно
     * тест
     * @param i - входящее значение (может быть любым)
     * public void switchExample(int i)
     */
    @Test
    public void switchExample_Test1() {

        System.out.println("Тестирование switchExample_Test1():");

        Utils utilsVar = Mockito.mock(Utils.class);

        MyBranching myBranching_Obj = new MyBranching(utilsVar);

        myBranching_Obj.switchExample(0);

    } // public void switchExample_Test1()

    @Test
    public void switchExample_Test2() {

        System.out.println("Тестирование switchExample_Test2():");

        Utils utilsVar = Mockito.mock(Utils.class);

        MyBranching myBranching_Obj = new MyBranching(utilsVar);

        myBranching_Obj.switchExample(1);

    } // public void switchExample_Test2()

    @Test
    public void switchExample_Test3() {

        System.out.println("Тестирование switchExample_Test3():");

        Utils utilsVar = Mockito.mock(Utils.class);

        MyBranching myBranching_Obj = new MyBranching(utilsVar);

        myBranching_Obj.switchExample(2);

    } // public void switchExample_Test3()


} // public class MyBranchingTest
