package JavaCore.Lang.MethodsObject;

import java.util.ArrayList;
import java.util.Objects;

public class Ancestor {
    private static final double PI = 3.14;
    private int id;
    private static int idCount;
    private int count;
    private String name = "";
    private ArrayList<String> arrPerson = new ArrayList<>();

    public Ancestor(String name) {
        idCount++;
        id = idCount;
        this.name = name;
    }

    public void print() {
        System.out.println("Мой ID: " + id + "\n" + "Имя: " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ancestor that = (Ancestor) o;
        return count == that.count && Objects.equals(name, that.name) && Objects.equals(arrPerson, that.arrPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, name, arrPerson);
    }
}
