abstract public class Animal {


    abstract public void bark();    
}
interface Vet{
    abstract public void bark();  
    public void beFriendly();
    public static void main(String argv[]){
        Vet v = new Dog();

        v.beFriendly();
    }
}
class Dog extends Animal implements Vet{
    // String text = "i am dog";
    public void bark(){
        System.out.println("i am dog");
    }
    public void beFriendly(){
        System.out.println("i am your best friends");
    }

}

class Hippo extends Animal{
    // String text = "i am dog";
    public void bark(){
        System.out.println("i am hippo");
    }
}