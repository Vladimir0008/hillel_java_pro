package com.hillel.homeWork.lesson15.practicum;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberConverter {
    private Map<Character, Integer> romanDigits = new HashMap<>();

    public RomanNumberConverter() {
        romanDigits.put('I', 1);
        romanDigits.put('V', 5);
        romanDigits.put('X', 10);
        romanDigits.put('L', 50);
        romanDigits.put('C', 100);
        romanDigits.put('D', 500);
        romanDigits.put('M', 1000);
    }


    public int convert(String romanNumber) {
        int result = 0;
        int localNum = 0;
        for (int i = romanNumber.length() - 1 ; i >= 0; i--) {
            if (i > 0 && (romanNumber.charAt(i) != 'I')) {
                localNum = romanDigits.get(romanNumber.charAt(i));
                if ((romanNumber.charAt(i - 1) == 'I' || romanNumber.charAt(i - 1) == 'X' || romanNumber.charAt(i - 1) == 'C')
                        && (romanDigits.get(romanNumber.charAt(i - 1)) < romanDigits.get(romanNumber.charAt(i)))) {
                    localNum -= romanDigits.get(romanNumber.charAt(i - 1));
                    i--;
                }
                result += localNum;
                localNum = 0;
            } else {
                result += romanDigits.get(romanNumber.charAt(i));
            }
        }
        return result;
    }
}
