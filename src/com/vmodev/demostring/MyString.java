package com.vmodev.demostring;

public class MyString {
    public boolean checkPalindrome(String s) {
        //case one
//        int le = s.length();
//        for ( int i = 0; i< le/2; i++){
//            if (s.charAt(i) != s.charAt(s.length()-i-1)){
//                return false;
//            }
//        }
//        return true;

        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public String removeSpace(String s) {
        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }
        return s.trim();
    }

    private String replaceOnlyOnePosition(int index, char c, String s) {
        return s.substring(0, index) + c + s.substring(index + 1);
    }

    public String upperCaseFirstChar(String s) {
        s = removeSpace(s);
        if (s.length() > 1) {
            //upper case first char
            s = replaceOnlyOnePosition(0, Character.toUpperCase(s.charAt(0)),
                    s);
        }
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                c = s.charAt(i + 1);
                c = Character.toUpperCase(c);
                s = replaceOnlyOnePosition(i + 1, c, s);
            }

        }
        return s;
    }

}
