import java.util.Scanner;

public class End_of_file{

    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        while(sc.hasNextLine()){
            System.out.printf("%d %s\n", counter, sc.nextLine());
            counter++;
        }
        sc.close();
    }
}