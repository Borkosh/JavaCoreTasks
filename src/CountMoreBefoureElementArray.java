import java.util.Scanner;

/**
 * Created by Ilgiz on 19.06.2018.
 * #66
 */
public class CountMoreBefoureElementArray {
    private int arrayLength;
    int[] intArray;
    int answer;
    Scanner scan=new Scanner(System.in);

    public CountMoreBefoureElementArray(){
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

    private int searchEqualElement(){

        answer=0;

        if (intArray.length>0) {
            int beforeElement = intArray[0];

            for (int i = 1; i < intArray.length; i++) {
                if (intArray[i] > beforeElement) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
