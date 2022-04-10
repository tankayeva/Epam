package Task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class StrOperations {

    //task1
    public String splitEvenOdd(String s) {

        String odd = "";
        String even = "";

        for (int c = 0; c < s.length(); c++) {
            if (c % 2 == 0) odd += s.charAt(c);
            else even += s.charAt(c);
        }

        return "Odd is: " + odd + "Even is " + even;

    }

    //task2
    public int sumOfDigits(String s) {

        char[] c = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }

        return sum;

    }

    // task3
    public String extractDigits(String src) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (Character.isDigit(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }


    //task4
    public String removeRepeated(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty()) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            sb.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != chars[i - 1]) {
                    sb.append(chars[i]);
                }
            }
        }
        return sb.toString();
    }


    //task5
    public void freqChar(String str) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char ch : str.toCharArray())
            frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
    }


    //task6
    public String reversedString(String str) {
        String nstr = "";
        char ch;


        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }

    //task7
    public static int countFreq(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        int res = 0;


        for (int i = 0; i <= N - M; i++) {

            int j;
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }


            if (j == M) {
                res++;
                j = 0;
            }
        }
        return res;
    }

    //task8
    public static String reverseWords(String str) {

        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(str);
        String result = "";

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }


    //task9
    public static String orderedGuests(String[] hotel) {
        Arrays.sort(hotel);
        return Arrays.toString(hotel);
    }

    //task10

    static int minMaxLengthWords(String input) {

        String minWord = "";
        String maxWord = "";

        input = input.trim();

        int len = input.length();
        int si = 0, ei = 0;
        int min_length = len, min_start_index = 0,
                max_length = 0, max_start_index = 0;

        while (ei <= len) {
            if (ei < len && input.charAt(ei) != ' ') {
                ei++;
            } else {

                int curr_length = ei - si;

                if (curr_length < min_length) {
                    min_length = curr_length;
                    min_start_index = si;
                }

                if (curr_length > max_length) {
                    max_length = curr_length;
                    max_start_index = si;
                }
                ei++;
                si = ei;
            }
        }

        minWord = input.substring(min_start_index, min_start_index + min_length);
        maxWord = input.substring(max_start_index, max_start_index + max_length);

        return minWord.length();
    }


    //task11
    public static int countWords(String str) {
        if (str == null || str.isEmpty())
            return 0;

        int count = 0;
        for (int e = 0; e < str.length(); e++) {
            if (str.charAt(e) != ' ') {
                count++;
                while (str.charAt(e) != ' ' && e < str.length() - 1) {
                    e++;
                }
            }
        }
        return count;
    }


    //task12
    public static String addSpace(String str) {

        String padded = String.format("%-20s", str);

        return padded;
    }


    //task13
    static boolean isPalindrome(String str) {

        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    //task14
    static String isPalindrome(String str, String old_str, String new_str) {

        String replacedStr = str.replaceAll(old_str, new_str);

        return replacedStr;
    }


    //task15
    static int distance(String s, String w1, String w2) {

        if (w1.equals(w2))
            return 0;

        String words[] = s.split(" ");

        int min_dist = (words.length) + 1;

        for (int index = 0;
             index < words.length; index++) {

            if (words[index].equals(w1)) {
                for (int search = 0;
                     search < words.length; search++) {
                    if (words[search].equals(w2)) {

                        int curr = Math.abs(index - search) - 1;

                        if (curr < min_dist) {
                            min_dist = curr;
                        }
                    }
                }
            }
        }

        return min_dist;
    }

    public static void main(String[] args) {

        StrOperations str = new StrOperations();


        System.out.println(str.splitEvenOdd("alfabet"));
        System.out.println(str.sumOfDigits("dhj34dfhf9fs"));
        System.out.println(str.extractDigits("a12334tyz78x"));


    }

}
