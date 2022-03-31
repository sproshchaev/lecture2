package sbp.branching;

import sbp.common.Utils;

public class MyBranching
{
    private final Utils utils;

    public MyBranching(Utils utils)
    {
        this.utils = utils;
    }

    /**
     * На этот метод необходимо написать unit-тест! *
     * --------------------------------------------
     * Тест должен содержать mock на объект {@link Utils} (реализация неизвестна)
     * Необходимо проверить результат выполнения метода в зависимости от возможных
     * реализаций {@link Utils}
     *
     * @param i1 - первое значение
     * @param i2 - второе значение
     * @return - большее из значений или 0, если Utils#utilFunc2 вернёт true;
     */
    public int maxInt(int i1, int i2)
    {
        if (this.utils.utilFunc2())
        {
            for (int iter = 0; iter < i1; iter++)
            {
                do
                {
                    if (this.utils.utilFunc1("Hello"))
                    {
                        return 0;
                    }
                    iter ++;
                } while (iter < i2);
            }
            return 0;
        }

        int result = i1 >= i2 ? i1 : i2;
        return result;
    }

    /**
     * На этот метод необходимо написать unit-тест
     * Тест должен содержать mock на объект {@link Utils} (реализация неизвестна)
     * Необходимо проверить результат выполнения метода в зависимости от возможных реализаций {@link Utils}
     * @return - true, если Utils#utilFunc2() возвращает true
     */
    public boolean ifElseExample()
    {
        if (this.utils.utilFunc2())
        {
            System.out.println("True!");
            return true;
        }
        else
        {
            System.out.println("False!");
            return false;
        }
    }

    /**
     * На этот метод необходимо написать unit-тест
     * Тест должен содержать mock на объект {@link Utils} (реализация неизвестна)
     * Необходимо проверить выполнение Utils#utilFunc1 и Utils#utilFunc2 при входящем i = 0
     * Необходимо проверить выполнение Utils#utilFunc1 и Utils#utilFunc2 при входящем i = 1
     * Необходимо проверить выполнение Utils#utilFunc1 и Utils#utilFunc2 при входящем i = 2
     * Можно сделать все проверки одним тестом, но лучше под каждую проверку завести отдельно тест
     * @param i - входящее значение (может быть любым)
     */
    public void switchExample(int i)
    {
        switch (i)
        {
            case 1:
                this.utils.utilFunc1("abc");

            case 2:
                this.utils.utilFunc2();
                break;

            default:
                if (this.utils.utilFunc2())
                {
                    this.utils.utilFunc1("abc2");
                }
        }
    }
}
