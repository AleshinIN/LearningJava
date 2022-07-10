package JavaCore.Test.OOP;

public class testOOP {
    public static void main(String[] args) {
        PetNoAbstract petNoAbstract = new PetNoAbstract("pet");

        Dog dog = new Dog("dogg");
        System.out.println(dog.name);
        System.out.println(dog.getName());
    }
}

class PetNoAbstract {
    String name;
    PetNoAbstract(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Dog extends PetNoAbstract {

    Dog(String name) {
        super(name);
    }
}
