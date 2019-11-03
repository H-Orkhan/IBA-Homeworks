package MyClassWork.October28.Task1;


public class Implementation {
    private static Character Character;

    static int sum(String str) {
        int sum = 0;
        if (str == null) return 0;
        String[] split = str.split(" ");
        for (int i = 0; i < str.length(); i++) {
            try {
                sum += Integer.parseInt(split[i]);
            } catch (Exception ex) {
                continue;
            }
        }
        return sum;
    }

}
