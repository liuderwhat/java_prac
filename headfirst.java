import java.io.*;

public class headfirst {

    int x;
    int y;

    public headfirst(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void moveCircle(headfirst circle, int deltaX, int deltaY) {
        // code to move origin of circle to x+deltaX, y+deltaY
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);
            
        // code to assign a new reference to circle
        circle = new headfirst(0, 0);
    }
    public static void main(String[] ar){

        headfirst c = new headfirst(10, 20);
        c.moveCircle(c, 5, 10);

        System.out.println("x : " + c.x);
        System.out.println("y : "+ c.y);
    }
   
}
