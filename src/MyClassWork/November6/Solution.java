package MyClassWork.November6;

public class Solution {
    public static void main(String[] args) {
        String str = "RLRRLLRLRRLL";
        System.out.println(solution(str));
        String str2 = "RLLLRRRLLR";
        System.out.println(solution(str2));
        String str3 = "LLRLRLRLRLRLRR";
        System.out.println(solution(str3));
//        String str4 = "LRL";
//        System.out.println(solution(str4));
//        String str5 = "RLR";
//        System.out.println(solution(str5));
    }

    private static int solution(String str) {
        int max=0;
        int R = 0;
        int L = 0;
        for (int i = 0; i <str.length() ; i++) {
            switch (str.charAt(i)) {
                case 'R': R++;break;
                case 'L': L++;break;
                default: throw new IllegalArgumentException("Error");
            }
            if (R == L) {
                max++;
            }
        }
        if (R!=L) throw new IllegalArgumentException("L != R");
        return max;
    }
}
