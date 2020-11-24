package behavorial.commandintro;

public class CommandPatternIntro {
    public static void main(String[] args) {

        Task task1 = new Task(10,12); // 1. Task object encapsulates request
        Task task2 = new Task(11,13);

        Thread thread1 = new Thread(task1);
        thread1.start(); // 2. invoker calls start on our execute method

        Thread thread2 = new Thread(task2);
        thread2.start();
    }
}

