class GoodDog {

    private int size;
    
    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }
    
    void bark(){
        if (size < 60){
            System.out.println("woof");
        }
        else {
            System.out.println("meow");
        }
    }
}




class GoodDogTest{


    public static void main(String argv[]){

        GoodDog[] pet = new GoodDog[7];
        
        pet[0] = new GoodDog();
        pet[1] = new GoodDog();

        pet[0].setSize(80);
        pet[1].setSize(50);

        pet[0].bark();
        pet[1].bark();
    }
}