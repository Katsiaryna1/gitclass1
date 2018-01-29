package Exercises;

public class Cat {

String breed;
int height;
String color;
String behaviour;
Cat() {
    breed = "persian";
    height = 2;
    color = "white";
    behaviour="friendly";
}
public static void main(String[] args) {
    Cat c = new Cat();
    Cat x = new Cat();
    Cat y = new Cat();

    System.out.println("Cat's color is - " + c.color);
    System.out.println("Cat's breed is - " + c.breed );
    System.out.println("Cat's height is - " + c.height);
    System.out.println("Cat's behavior is - " + c.behaviour);
}
}