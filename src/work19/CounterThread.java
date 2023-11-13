package work19;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CounterThread implements Runnable {
    Counter counter;

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.print(counter.getCount() + " ");
            counter.increase();
        }
    }
}
