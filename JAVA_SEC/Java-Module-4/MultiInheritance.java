public class MultiInheritance {
    public static void main(String[] args) {
        Puppy p= new Puppy();
        p.eat();
        p.weep();
        p.bark();

    }
}

class Animal{
    void eat(){
        System.out.println("Dog can bark");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
}

class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy can weep");
    }
}
