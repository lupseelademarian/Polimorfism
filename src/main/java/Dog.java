public class Dog extends Animal {
    public void makeSound(){
        System.out.println("WOOF");
    }
    public void makeSound(boolean injured) {
        if (injured) {
            System.out.println("Wimper");
        }
    }
}
