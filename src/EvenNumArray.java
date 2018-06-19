import java.util.Scanner;

/**
 * Created by Ilgiz on 19.06.2018.
 * #64
 */
public class EvenNumArray {
    private int arrayLength;
    Scanner scan=new Scanner(System.in);

    public EvenNumArray(){
        arrayLength=scan.nextInt();
        getEvenNumbers();
    }

    public void getEvenNumbers(){

        int[] intArray = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            intArray[i] = scan.nextInt();
        }


        for (int i=0; i<intArray.length; i++){
            if (intArray[i]%2==0){
                System.out.print(intArray[i]+" ");
            }
        }
    }
}
