package JavaCore.Lang.System;

public class CurrentTimeMillis {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis(); // время в миллисекундах от какого-то далекого года

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long timeStop = System.currentTimeMillis();
        System.out.println("Время выполения программы " + (timeStop - timeStart) + " ms");
    }
}
