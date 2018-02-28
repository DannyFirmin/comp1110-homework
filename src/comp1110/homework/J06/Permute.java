package comp1110.homework.J06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Permute {
    public static boolean isPermute(String origin, String target) {

        if (origin.length() != target.length()) {
            System.out.println("No");
            return false;
        }

        //Every letters in target string should contain in origin string
        int length = origin.length();
        Map<Character, Integer> targetCount = new HashMap<Character, Integer>();
        for (int i = 0; i < length; i++) {
            char c = target.charAt(i);
            //any letter in target string but not in origin string, print no
            int indexOfOrigin = origin.indexOf(c);
            //indexOf 方法返回一个整数值，指出 String 对象内子字符串的开始位置。如果没有找到子字符串，则返回-1
            if (indexOfOrigin == -1) {
                System.out.println("No");
                return false;
            }

            //统计该串在本串中的个数
            if (targetCount.get(c) == null) {
                targetCount.put(c, 1);
            } else {
                Integer count = targetCount.get(c);
                targetCount.put(c, 1 + count);
            }
        }

        //统计原串中各个字符的个数
        Map<Character, Integer> originCount = new HashMap<Character, Integer>();
        for (int i = 0; i < length; i++) {
            char c = origin.charAt(i);
            if (originCount.get(c) == null) {
                originCount.put(c, 1);
            } else {
                Integer count = originCount.get(c);
                originCount.put(c, 1 + count);
            }
        }

        //目标串中每个字符个数跟原串中对应字符的个数一样
        for (Map.Entry<Character, Integer> entry : targetCount.entrySet()) {
            Character key = entry.getKey();
            if (entry.getValue() != originCount.get(key)) {
                System.out.println("No");
                return false;
            }
        }

        //all letter match (number and content)
        System.out.println("Yes");
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        boolean result = isPermute(a, b);
    }
}

/* the code above is not written by me. I google it. I just did the editing work.

my code is here. but it doesn't work (incomplete)
package comp1110.homework.J06;



import java.util.Scanner;

public class Permute2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String origin = in.nextLine();
        String permute = in.nextLine();
        int o = origin.length();
        int p = permute.length();
            if ((o != p) || (origin == permute)) {
                System.out.println("No");
                return;
            }

            for (int i = 0; i <= o; i++)
            if ((origin.charAt(i) == permute.charAt(i))) {
                System.out.println("Yes");
                break;
            }

    }
}
 */