package com.mahfoos.quiz;

public class MinWindow {

    public static String MinWindowSubstring(String[] strArr) {
        String N = strArr[0];
        String K = strArr[1];
        int min = Integer.MAX_VALUE;
        String result = "";
        for (int i = 0; i < N.length(); i++) {
            StringBuilder match = new StringBuilder(K);
            for (int j=i; j < N.length(); j++) {
                if (match.toString().contains(String.valueOf(N.charAt(j)))) {
                    int index = match.indexOf(String.valueOf(N.charAt(j)));
                    match.replace(index, index + 1, "");
                }

                if (match.length() == 0) {
                    if (j - i < min) {
                        min = j - i;
                        result = N.substring(i, j+1);
                    }
                    break;
                }
            }
        }

        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(TreeConstructor(s.nextLine()));
        System.out.print(MinWindowSubstring(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));
    }

}

