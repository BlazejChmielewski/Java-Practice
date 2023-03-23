import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int n = 46288;
        int p = 3;

        int[] elements = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        int sum = IntStream.range(0, elements.length).map(x -> (int) Math.pow(elements[x], x+p)).sum();

        if(sum%n == 0) System.out.println(sum/n); else System.out.println(-1);

    }
}
