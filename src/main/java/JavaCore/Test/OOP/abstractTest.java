package JavaCore.Test.OOP;

public class abstractTest {
    public static void main(String[] args) {

    }
}

abstract class Pet {
    private String name = "";

    public Pet(String name){
        this.name = name;
    }

    abstract String voice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    String voice() {
        return "";
    }


}
