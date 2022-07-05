package JavaCore.Lang.Thread;
/**
 * Thread - создание дополнительного потока(main тоже поток)
 * все созданные потоки не синхронизированы
 * */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start(); // запускает новый поток и выполняет run

        MyThread thread2 = new MyThread();
        thread2.start();
    }
}
