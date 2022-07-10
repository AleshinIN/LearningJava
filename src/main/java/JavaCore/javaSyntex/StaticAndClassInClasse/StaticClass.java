package JavaCore.javaSyntex.StaticAndClassInClasse;

import java.util.ArrayList;

/**
 *  */

public class StaticClass
{
    static ArrayList<Point> points = new ArrayList<Point>();

    public static void main(String[] args)
    {
        Point point = new Point();
        point.x = 100;
        point.y = 200;
        points.add(point);
    }

    static class Point
    {
        int x;
        int y;

        public static void sum(int a, int b) {
            System.out.println(a + " + " + b +  (a + b));
        }
    }
}