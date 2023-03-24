import java.util.stream.IntStream;

public class Task {

    public int recruitTask1(int[] numbers) {
        int addingSum = IntStream.range(0, numbers.length).filter(x -> x % 3 == 0).map(x -> numbers[x]).sum();

        int[] arrIndexToMultiply1 = IntStream.range(0, numbers.length)
                .filter(x -> (x - 1) % 3 == 0)
                .map(x -> numbers[x])
                .toArray();

        int[] arrIndexToMultiply2 = IntStream.range(0, numbers.length)
                .filter(x -> (x + 1) % 3 == 0)
                .map(x -> numbers[x])
                .toArray();

        return IntStream.range(0, arrIndexToMultiply2.length)
                .map(n -> Math.multiplyExact(arrIndexToMultiply1[n], arrIndexToMultiply2[n]))
                .sum() + addingSum;
    }
}
