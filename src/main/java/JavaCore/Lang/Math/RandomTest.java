package JavaCore.Lang.Math;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class RandomTest {
    private int x,y;

    public static void main(String[] args) {

        class Sert {
            public void uuuu() {

            }
        }

        Sert s = new Sert();
        s.uuuu();

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random()); // [0, 1)
        }

        char l = 97;
        char l2 = 'b';

        double d = 1.1;
        float f = 2.2F;

        f = (float) d * 2;
        System.out.printf("%.1f", f);

        System.out.printf("%c%c", cap(l), cap(l2));


        int max = Math.max(1,2);
        System.out.printf("%d", max);


        System.out.println();

        String s2 = "h";
        s2+="e";
        System.out.println(com("he", s2));

        Integer a = 10000;
        Integer b = 10000;
        int e = 10000;

        System.out.printf("%b %b %b", a==e, a==b, b==e);

        TreeMap<String, Object> arr = new TreeMap();
        arr.put("qqq", new ArrayList<>());
        System.out.println();

/**  ПЕРЕГРУЗКА
 * входные параметры должны различаться, даже если возвращаем разный тип
 * */

        Object ret;

//        ret = retSum("1", "2");
//        System.out.println("0 - " + ret);

        //ret = retSum(1,2);
        //System.out.println("1 - " + ret);

        ret = retSum('1', b);
        System.out.println("2 - " + ret);

        ret = retSum(1,2);
        System.out.println("3 - " + ret);

        ret = retSum("1","2");
        System.out.println("4 - " + ret);

        ret = retSum(1,2);
        System.out.println("5 - " + ret);


    }

    public static char cap(char l){
        switch (l){
            case 'a':
                return 'A';
            case 'b':
                return 'B';
            default:
                return l;
        }
    }

    public static boolean com(String s1, String s2){ return s1.equals(s2);}

//    public static String retSum(String a, String b){ // 0
//        return a+b;
//    }
//    public static int retSum(int a, int b){ // 1
//        return a+b;
//    }
    public static char retSum(char a, int b){ // 2
        return (char) (a+b);
    }
    public static long retSum(int a, int b){ // 3
        return a+b;
    }
    public static int retSum(String a, String b){ // 4
        return (a+b).length();
    }
//    public static String retSum(int a, int b){  // 5
//        return String.valueOf(a+b);
//    }


    public int[] getD(int x1, int y1){
        return new int[]{x1 - x, y1 - y};
    }

}
