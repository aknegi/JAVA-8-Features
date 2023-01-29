package none;

import java.util.HashMap;
import java.util.Map;

public class StringPatternContainsCheck {
    public static void main(String[] args) {
        String inputString = "zoomlazapzo";
        String pattern = "oza";
//        String inputString ="test string";
//        String pattern = "tist";
        System.out.println(getSubString(inputString, pattern));
    }

    private static String getSubString(String inputString, String pattern) {
        if (inputString.length() < pattern.length() || inputString.length() == 0) {
            return "";
        }
        int start = 0;
        int end = 0;
        int finalEnd = 0;
        int finalStart = 0;
        int minLength = Integer.MAX_VALUE;
        int totalChars = pattern.length();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (charCountMap.containsKey(pattern.charAt(i))) {
                charCountMap.put(pattern.charAt(i), 1 + charCountMap.get(pattern.charAt(i)));
            } else {
                charCountMap.put(pattern.charAt(i), 1);
            }
        }
        for (int i = 0; i < inputString.length(); i++) {
            if (pattern.contains(String.valueOf(inputString.charAt(i)))) {
                if (charCountMap.get(inputString.charAt(i)) > 0) {
                    charCountMap.put(inputString.charAt(i), charCountMap.get(inputString.charAt(i)) - 1);
                    totalChars--;
                    end++;
                } else {
                    if (inputString.charAt(i) == inputString.charAt(start)) {
                        end = i;
                        start = start + 1;
                        while (start < end) {
                            if (!charCountMap.containsKey(inputString.charAt(start))) {
                                start++;
                            } else if (charCountMap.get(inputString.charAt(start)) < 0) {
                                charCountMap.put(inputString.charAt(start), charCountMap.get(inputString.charAt(start)) + 1);
                                start++;
                            } else {
                                break;
                            }
                        }
                        end++;
                    } else {
                        charCountMap.put(inputString.charAt(i), charCountMap.get(inputString.charAt(i)) - 1);
                        end++;
                    }
                }
            } else {
                if (i == start) {
                    start++;
                    end++;
                } else {
                    end++;
                }
            }

            if (totalChars == 0 && minLength > (end - start)) {
                minLength = end - start;
                finalEnd = end;
                finalStart = start;
            }
        }
        return inputString.substring(finalStart, finalEnd);
    }
}

