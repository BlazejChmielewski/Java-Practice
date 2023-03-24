import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // {3, 5, 9, 11, 3, 12};  {2, 4, 0, 100, 5, 11, 2602, 36}
        int[] array = new int[]{2, 4, 0, 100, 5, 12, 2602, 36};

        int[] array2 = Arrays.stream(array).filter(n -> n%2 == 0).toArray();
        if(array2.length == 1){
            System.out.println(array2[0]);
        }
        else{
            System.out.println(Arrays.stream(array).filter(n -> n%2 != 0).findAny().getAsInt());
        }
    }
}