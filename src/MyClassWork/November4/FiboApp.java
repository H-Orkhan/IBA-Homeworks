package MyClassWork.November4;

public class FiboApp {
    public static void main(String[] args) {
        FiboApp app = new FiboApp();
        for (int i = 1; i <=55 ; i++) {
            System.out.println(i + ")" + app.fibonachi(i));
        }
    }

    private long fibonachi(int i) {
        return (i==2||i==1) ? 1: fibonachi(i-1)+fibonachi(i-2);
    }
}
