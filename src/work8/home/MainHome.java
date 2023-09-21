package work8.home;

import work8.home.task1.Patient;
import work8.home.task1.Therapist;
import work8.home.task2.Apple;

import java.lang.reflect.Field;

public class MainHome {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println("Task 1");
        Patient patient = new Patient(2);
        Therapist therapist = new Therapist();
        therapist.prescribeTreatment(patient);
        System.out.println("Task*");
        Apple apple = new Apple("Yellow");
        getColor(apple);
    }

    private static void getColor(Object object) throws NoSuchFieldException, IllegalAccessException {
        Class<?> objectClass = object.getClass(); // неопределенный тип ?
        Field field = objectClass.getDeclaredField("color");//получаем поле с именем color
        field.setAccessible(true);//разрешаем доступ к приватному полю
        field.set(object,"red");//изменяем данные
        System.out.println(field.get(object));//получаем данные
    }
}
