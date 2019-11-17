package MyClassWork.November4;

public class FactorialApp {
    public static void main(String[] args) {
        FactorialApp app = new FactorialApp();
        long factorial = app.factorial(10);
        System.out.println(factorial);
    }

    private long  factorial(int i) {
        if (i == 1) return 1;
        else  return i* factorial(i-1);
    }
}
