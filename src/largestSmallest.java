public class largestSmallest {


    public static void largestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                System.out.println(number+" is bigger than "+largest);
                largest = number;
            } else if (number < smallest) {
                System.out.println(number+" is smaller than "+smallest);
                smallest = number;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] ex={1,5,13,-10,6,21,13};
        largestAndSmallest(ex);

    }
}
