package JavaCore.Lang.Thread;

public class MyThread extends Thread {
    private volatile static int id;
    private int thisId;

    // volatile перемещает переменную в общую память, чтобы не было кализиц при взаимодействии потоков
    //     любые данные, которые можно изменить с помощью другого потока должны быть volatile
    private volatile boolean running = true;

    public void run(){ // переопределяем метод и прописываем в нем поток
        thisId = ++id;

        System.out.println("Запустился поток №" + thisId);
        while (running) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Закончил работу поток №" + thisId);
    }

    public void shutdown (){
        this.running = false;
    }
}

