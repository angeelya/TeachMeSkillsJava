package work19.home;

import java.util.Arrays;

public class InsertSort implements Runnable{
    private Integer[] numbers;

    public InsertSort(Integer[] numbers) {
        this.numbers = numbers;
    }

    public String getNumbers() {
        return Arrays.toString(numbers);
    }

    @Override
    public void run() {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = key;
        }

    }
}
