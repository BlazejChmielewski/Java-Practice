public class NumberUtils {

    public static boolean isNarcissistic(int number) {

        int sum = 0, multiply = 1;

        String str = String.valueOf(number);
        String[] strArr = str.split("");

        for(int i = 0; i < strArr.length; i++){
            for(int j = 0; j < strArr.length; j++){
                multiply *= Integer.parseInt(strArr[i]);
            }
            sum += multiply ;
            multiply = 1;
        }
        if (number == sum)  return true ; else return false;
    }
}