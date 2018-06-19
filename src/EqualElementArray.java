import java.util.Scanner;

/**
 * Created by Ilgiz on 19.06.2018.
 * #67
 */
public class EqualElementArray {
    private int arrayLength;
    int[] intArray;
    String answer;
    Scanner scan=new Scanner(System.in);

    public EqualElementArray(){
        arrayLength=scan.nextInt();
        setArrayValues();
        System.out.println(searchEqualElement());
    }

    private void setArrayValues(){

        intArray = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            intArray[i] = scan.nextInt();
        }

    }

    private String searchEqualElement(){

        answer="NO";

        if (intArray.length>0) {
            int beforeElement = intArray[0];

            for (int i = 1; i < intArray.length; i++) {
                if (intArray[i] == beforeElement) {
                    answer="YES";
                }
            }
        }
        return answer;
    }
}
