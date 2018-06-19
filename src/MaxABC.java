import java.util.Scanner;

/**
 * Created by Ilgiz on 19.06.2018.
 */
public class MaxABC {
    private float a,b,c;
    Scanner scan=new Scanner(System.in);

    public MaxABC(){
        a=scan.nextFloat();
        b=scan.nextFloat();
        c=scan.nextFloat();
        getMax();
    }
    private void getMax(){
        if (a>=b){
            if(a>=c){
                System.out.println("Max A = "+a);
            }else{
                System.out.println("Max C = "+c);
            }
        }else{
            if(b>=c){
                System.out.println("Max B = "+b);
            }else{
                System.out.println("Max C = "+c);
            }
        }

    }
}
