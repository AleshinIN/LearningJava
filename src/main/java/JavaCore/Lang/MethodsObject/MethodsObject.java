package JavaCore.Lang.MethodsObject;

import javafx.scene.input.KeyCode;

/** Для своих классов нужно переопрелять методы
 * Методы "equals" и "hashCode"  можно сгенерировать автоматически(Alt+Insert)
 *
 * protected Object clone() - создает новый объект, не отличающийся от клонируемого.
 * public boolean equals(Object obj) - проверяет схожесть значений объектов. Объекты(не ссылка на объект!) должны быть одного класса.
 * protected void finalize() - вызывается перед удалением неиспользуемого объекта.
 * public final Class<?> getClass() - получает класс объекта во время выполнения.
 * public int hashCode() - возвращает хэш-код, связанный с вызывающим объектом.
 * public final void notify() - возобновляет исполнение потока, ожидающего вызывающего объекта.
 * public final void notifyAll() - возобновляет исполнение всех потоков, ожидающих вызывающего объекта.
 * public String toString() - возвращает символьную строку, описывающую объект.
 * public final void wait() - ожидает другого потока исполнения.
 *
 *
 * */
public class MethodsObject {


    public static void main(String[] args) {
        Heir h1 = new Heir("Ivan"); // Ancestor - предок; Heir - наследник
        Heir h2 = new Heir("Mak", 10);

        Ancestor AH1 = new Heir("Dark", 12);
        h1.print();


        // getClass - возвращает класс указанного объекта
        System.out.println("getClass  Heir: " + h1.getClass());
        System.out.println("getClass AHeir: " + AH1.getClass());
                // .class возвращает класс указанного класса
        Class<Heir> result = Heir.class; // "Class" - это класс в джава(java.lang.Class)
        System.out.println("Heir.class:     " + result);
        System.out.println();
        // equals - проверяет объекты на схожешь значений полей.
        Heir hI1 = new Heir("Ivan");
        Heir hI2 = new Heir("Ivan");
        System.out.println("equals1 : " + hI1.equals(hI2));
        Ancestor AHI1 = new Heir("Ivan");
        Ancestor AAI2 = new Ancestor("Ivan");
        System.out.println("equals2 : " + AHI1.equals(hI2));
        System.out.println("equals3 : " + AHI1.equals(AAI2)); // ссылки одинакового типа, но объекты от разных классов
        System.out.println("equals4 : " + AAI2.equals(AHI1));
    }
}
