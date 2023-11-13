package work19.home;


import lombok.Getter;

@Getter
public class Min implements Runnable {
    private Integer[] numbers;
    private int min;

    public Min(Integer[] numbers) {
        this.numbers = numbers;
        this.min = Integer.MAX_VALUE;
    }

    @Override
    public void run() {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
    }
}
