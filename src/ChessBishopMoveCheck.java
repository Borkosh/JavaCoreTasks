import java.util.Scanner;

/**
 * Created by Ilgiz on 19.06.2018.
 * 255
 */
public class ChessBishopMoveCheck {
    private int x1,y1,x2,y2;
    Scanner scan=new Scanner(System.in);
    public ChessBishopMoveCheck(){
        x1=scan.nextInt();
        y1=scan.nextInt();
        x2=scan.nextInt();
        y2=scan.nextInt();

        checkBishopMove();
    }

    public void checkBishopMove(){
        if((x1-y1==x2-y2) || (x1+y1==x2+y2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
