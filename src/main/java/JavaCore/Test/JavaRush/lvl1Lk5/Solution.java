package JavaCore.Test.JavaRush.lvl1Lk5;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
