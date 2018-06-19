import java.util.Scanner;

/**
 * Created by Ilgiz on 19.06.2018.
 * 255
 */
public class ChessCastleMoveCheck {
    private int x1,y1,x2,y2;
    Scanner scan=new Scanner(System.in);
    public ChessCastleMoveCheck(){
        x1=scan.nextInt();
        y1=scan.nextInt();
        x2=scan.nextInt();
        y2=scan.nextInt();

        checkCastleMove();
    }

    public void checkCastleMove(){
        if((x1==x2) || (y1==y2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
