package work19.home;

import lombok.Getter;

@Getter
public class Max implements Runnable{
    private Integer[] numbers;
    private int max;

    public Max(Integer[] numbers) {
        this.numbers = numbers;
        this.max = Integer.MIN_VALUE;
    }

    @Override
    public void run() {
        for(int i=0; i< numbers.length;i++)
        {
         if(numbers[i]>max)
         {
             max=numbers[i];
         }
        }
    }
}
