import java.util.ArrayList;
import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {

        HashMap<Character, Integer> romen_map = new HashMap<>();
        ArrayList<Character> strCharList = new ArrayList<>();

        int number = 0;

        romen_map.put('I', 1);
        romen_map.put('V', 5);
        romen_map.put('X', 10);
        romen_map.put('L', 50);
        romen_map.put('C', 100);
        romen_map.put('D', 500);
        romen_map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                number += 4;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                number += 9;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                number += 40;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                number += 90;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                number += 400;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                number += 900;
                i++;
            } else {
                strCharList.add(s.charAt(i));
            }
        }
        
        for (int i = 0; i < strCharList.size(); i++) {
            number += romen_map.get(strCharList.get(i));
        }

        return number;
    }

    public static void main(String[] args) {

        String r_num = "MCDLXXVI";
        System.out.println(romanToInt(r_num));
    }
}
