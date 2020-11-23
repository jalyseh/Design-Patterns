package behavorial.commandintro;

//Encapsulates requests as an object
//Object-oriented callbacks instead of just another method
//Maintainability is increased because the sender is decoupled from the processor - more flexible system
//Often used for "undo" functionality ex. java.lang.Runnable, javax.swing.Action
//Similar to Strategy pattern, is the "what" vs the "how"
//2nd most used after Singleton

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

