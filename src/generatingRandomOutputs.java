//import java.io.FileNotFoundException;
import java.util.Random;
public class generatingRandomOutputs {
    public static void main (String[] args){
        Random rand = new Random(); //for rnd class
        int upperbound = 25; //numbers upto 24
        int r = rand.nextInt(upperbound);

        System.out.println("" + r);
    if (r % 2 == 0)
        System.out.println("Right");
    else
        System.out.println("Left");
    }
}




