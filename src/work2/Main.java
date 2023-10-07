package work2;

public class Main {
    public static void main(String[] args) {
        String name = " Angelina";
        String lastName = "Naidenova";
        int age = 21;
        System.out.println(name+" " + lastName+" "+age);
        Task1 t1 = new Task1();
        System.out.println("Task 1. Answer: "+t1.calculateA());
        Task2And3 t2 = new Task2And3();
        System.out.println("Task2. Answer: "+t2.add());
        System.out.println("Task3. Answer: " +t2.addFor3());
        Task4 t4 = new Task4();
        System.out.println("task4. Answer: "+t4.rounding());
        Task5 t5 = new Task5();
        System.out.println("task5. Answer: "+t5.divide());
        TaskStar star = new TaskStar();
        System.out.println("taskStar. Answer: "+star.change());
        Calculate calculate = new Calculate();
        calculate.init();
       }

}