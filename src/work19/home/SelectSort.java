package work19.home;

import java.util.Arrays;

public class SelectSort implements Runnable{
    private Integer []numbers;

    public SelectSort(Integer[] numbers) {
        this.numbers = numbers;
    }

    public String getNumbers() {
        return Arrays.toString(numbers);
    }



    @Override
    public void run() {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
    }
}
