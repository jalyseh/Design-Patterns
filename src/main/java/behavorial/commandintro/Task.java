package behavorial.commandintro;

class Task implements Runnable { //Runnable is an example of a command pattern

    int num1;
    int num2;

    Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run() { // 3. execute method
        System.out.println(num1 * num2); //receiver is the console because result in put in SOUT
    }
}
