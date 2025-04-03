package org.example;

public class StringProcessor {
    public static String repeatString(String s, int N) {
        if (N==0) return " ";
        if (N < 0) throw new IllegalArgumentException("Index out of range");
        StringBuilder result = new StringBuilder();
        for (int i=0; i<N; i++) {
           result.append(s);
        }
    }

    public static String countEntry(String text, String sub) {
        int count = 0;
        if (sub.isEmpty()) throw new IllegalArgumentException("String is empty");
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if(text.startsWith(sub, i)){
            return count;
        }
    }
    public static String replaceNumbers(String s) {
        String sOut;
        sOut = s.replace("1", "один")
                .replace("2", "два")
                .replace("3", "три");
        return s;
    }

    public static StringBuilder stringDel(StringBuilder sb) {
        for (int i = 1; i< sb.length(); i++) {
                sb.deleteCharAt(i);
        }
        return sb;
    }
}