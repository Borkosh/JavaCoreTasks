import java.util.Scanner;

/**
 * Created by Ilgiz on 19.06.2018.
 */
public class Calc {
    private float a,b;
    private char oper;
    Scanner scan=new Scanner(System.in);

    public Calc(){
        a=scan.nextFloat();
        oper=scan.next().charAt(0);
        b=scan.nextFloat();
        calculate();
    }
    private void calculate(){
        switch (oper){
            case '+':
                System.out.println(sum());
                break;
            case '-':
                System.out.println(minuse());
                break;
            case '/':
                if (b==0){
                    System.out.println("You can not divide by 0");
                }else{
                    System.out.println(div());
                }
                break;
            case '*':
                System.out.println(multipl());
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
    private float sum(){
        return a+b;
    }
    private float minuse(){
        return a-b;
    }
    private float div(){
        return a/b;
    }
    private float multipl(){
        return a*b;
    }

}
