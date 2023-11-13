package work19.home;

import java.util.Arrays;

public class BubbleSort implements Runnable {
    private Integer[] numbers;
    private int t;

    public BubbleSort(Integer[] numbers) {
        this.numbers = numbers;
    }

    public String getNumbers() {
        return Arrays.toString(numbers);
    }

    @Override
    public void run() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i]>numbers[j]) {
                    t = numbers[i];
                    numbers[j] = numbers[i];
                    numbers[i] = t;
                }
            }
        }
    }
}
