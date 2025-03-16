class Animal{
    String name;
    int age;

    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    void makeSound(){
        System.out.println("Animal sounds");
    }
}
class Dog extends Animal{

    Dog(String name, int age) {
        super(name, age); //calls parent constructor so that to not redefine name age again nd again
        System.out.println("calling dog constructor");
    }

    @Override //implementation of this class is executed not animal
    void makeSound(){
        System.out.println(name+" bark");
    }

}
class Cat extends Animal{

    Cat(String name, int age) {
        super(name, age);
        System.out.println("calling cat constructor");
    }

    @Override
    void makeSound(){
        System.out.println(name+" meow");
    }
}
class Bird extends Animal{

    Bird(String name, int age){
        super(name,age);
        System.out.println("calling bird constructor");
    }

    @Override
    void makeSound(){
        System.out.println(name+" chirp");
    }

}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Bird sparrow=new Bird("sparrow",2);
        sparrow.makeSound();

        Cat tuffy=new Cat("tuffy",8);
        tuffy.makeSound();

        Dog cruise=new Dog("cruise",5);
        cruise.makeSound();
    }
}
