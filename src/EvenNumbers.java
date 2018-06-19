import java.util.Scanner;

/**
 * Created by Ilgiz on 19.06.2018.
 * 333
 */
public class EvenNumbers {
    private int a,b;
    Scanner scan=new Scanner(System.in);
    public EvenNumbers(){
        a=scan.nextInt();
        b=scan.nextInt();
        getEvenNumbers();
    }

    public void getEvenNumbers(){
        for (int i=a; i<=b; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
