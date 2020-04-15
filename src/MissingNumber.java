import java.util.Arrays;

public class MissingNumber {

    public static int findMissing(int[] array)
    {
        int current=1;
    for(int i=0;i<array.length;i++)
    {
        if(array[i]==current)current++;else return current;
    }
        return 0;
    }

    public static int findMissing2(int[] array)
    {
        int expectedSum=(array[array.length-1])*(array[array.length-1]+1)/2;
        System.out.println("expectedd sum:"+expectedSum);
        int actualSum= Arrays.stream(array).sum();
        System.out.println("actual sum:"+actualSum);
        int result=expectedSum-actualSum;
        System.out.println("missing number="+result);
        return result;
    }

    public static void main(String[] args)
    {
    int[] ex={1,2,3,5,6,7,8,9,10,11};
    System.out.println(findMissing2(ex));
    }

}
