package example.lab;

public class StringProcessor {

    /**
     * Метод 1.
     * Принимает строку s и число n. Возвращает строку, состоящую из n копий s, записанных подряд.
     * Если n == 0, возвращается пустая строка.
     * Если n < 0, выбрасывается IllegalArgumentException.
     */
    public static String repeatString(String s, int N) {
        if (N < 0) {
            throw new IllegalArgumentException("n не может быть отрицательным");
        }
        return s.repeat(N);
    }

    /**
     * Метод 2.
     * Принимает две строки: текст и подстроку.
     * Возвращает количество вхождений подстроки в текст.
     * Если вторая строка (подстрока) пустая или null, выбрасывается IllegalArgumentException.
     */
    public static int countOccurrences(String text, String sub) {
        if (sub == null || sub.isEmpty()) {
            throw new IllegalArgumentException("Подстрока не должна быть пустой или null");
        }
        int count = 0;
        int fromIndex = 0;
        while ((fromIndex = text.indexOf(sub, fromIndex)) != -1) {
            count++;
            fromIndex += sub.length();
        }
        return count;
    }

    /**
     * Метод 3.
     * Принимает строку и возвращает новую строку, в которой заменены:
     * символ '1' на "один", '2' на "два" и '3' на "три".
     */
    public static String replaceDigits(String text) {
        return text.replace("1", "один")
                .replace("2", "два")
                .replace("3", "три");
    }

    /**
     * Метод 4.
     * Принимает объект StringBuilder и удаляет из него каждый второй символ.
     * Важно: модифицируется сам переданный объект, новый не создаётся.
     */
    public static void removeEverySecondCharacter(StringBuilder sb) {
        // Чтобы избежать смещения индексов после удаления, идём с конца.
        for (int i = sb.length() - 1; i >= 0; i--) {
            // Каждый второй символ: если (i+1) четное, удаляем символ
            if ((i + 1) % 2 == 0) {
                sb.deleteCharAt(i);
            }
        }
    }
}
