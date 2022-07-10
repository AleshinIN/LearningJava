package JavaCore.javaSyntex.StaticAndClassInClasse;

/**
 * У класса(как и у объекта можно вызвать статический метод)
 * В статическом методе все внешние переменные должны быть static
 * */

public class Static {
    public static void main(String args[])
    {
        Static.test();
        test();
    }

    public static void test() // static обязателен, так как вызывается из статичного метода
    {
        int d = 2/0;
    }
}
