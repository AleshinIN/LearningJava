package JavaCore.javaSyntex.StaticAndClassInClasse;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Когда класс в классе: Статические классы еще называют вложенными (static nested class),
 *     нестатические просто называют внутренними классами (inner class).
 *     На них распространяется модификатор доступа родителя.
 * Методы вложенного статического класса имеют доступ ко всем
 *     статическим переменным и методам своего класса родителя, даже если те объявлены private.
 * Ко внутренним классам сложно обращаться(см. package JavaCore.Test.JavaRush.lvl1Lk5;):
 *         Outer outer = new Outer(); // Outer - Внешний класс
 *         Outer.Inner inner = outer.new Inner();  // Inner - внутренний класс
 *
 *  */

public class staticNestedClass {
    private static ArrayList<Point> points;
    java.util.ArrayList<Point> points2;

    static class Point
    {
        int x;
        int y;

        public static void main(String[] args)
        {
            Point point = new Point();
            point.x = 100;
            point.y = 200;

            // будет работать
            points = new ArrayList<Point>();
            points.add(point);

        }
    }
}