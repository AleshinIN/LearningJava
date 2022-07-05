package JavaCore.Lang;

public class MyThread extends Thread {
    private static int id;
    private int thisId;

    public void run(){ // переопределяем метод и прописываем в нем поток
        thisId = ++id;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Закончил работу поток №" + thisId);
    }
}

