package com.restService.utils;

/**
 * Created by EDW on 3/14/2021.
 */
public class ValidatorUtils {

    public static String getValidId(String value) {
        if(value == null || value.trim().length() == 0) return "NV";
        if(value.trim().length() != 10 && value.trim().length() != 11 && value.trim().length() != 13)  return "NV";
        value = value.trim();
        return value;

    }

    public static boolean isNationalCodeValid(String value) {
        if(value == null || value.trim().length() == 0) return false;
        if(value.trim().length() != 10 && value.trim().length() != 11 && value.trim().length() != 13) return false;
        return true;
    }


    public static boolean isNationalCodeValidMain(String value) {
        if (value == null)
            return false;

        if (value.length() != 10)
            return false;

        if (value.equals("0000000000"))
            return false;
        if (value.equals("1111111111"))
            return false;
        if (value.equals("2222222222"))
            return false;
        if (value.equals("3333333333"))
            return false;
        if (value.equals("4444444444"))
            return false;
        if (value.equals("5555555555"))
            return false;
        if (value.equals("6666666666"))
            return false;
        if (value.equals("7777777777"))
            return false;
        if (value.equals("8888888888"))
            return false;
        if (value.equals("9999999999"))
            return false;
        if (value.equals("٠٠٠٠٠٠٠٠٠٠")) {
            return false;
        }
        if (value.equals("١١١١١١١١١١")) {
            return false;
        }
        if (value.equals("٢٢٢٢٢٢٢٢٢٢")) {
            return false;
        }
        if (value.equals("٣٣٣٣٣٣٣٣٣٣")) {
            return false;
        }
        if (value.equals("٤٤٤٤٤٤٤٤٤٤")) {
            return false;
        }
        if (value.equals("٥٥٥٥٥٥٥٥٥٥")) {
            return false;
        }
        if (value.equals("٦٦٦٦٦٦٦٦٦٦")) {
            return false;
        }
        if (value.equals("٧٧٧٧٧٧٧٧٧٧")) {
            return false;
        }
        if (value.equals("٨٨٨٨٨٨٨٨٨٨")) {
            return false;
        }
        if (value.equals("٩٩٩٩٩٩٩٩٩٩")) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < 9; i++) {
            sum += Integer.valueOf(String.valueOf(value.charAt(i))) * (10 - i);
        }

        int a = sum - (sum / 11) * 11;

        int c = Integer.valueOf(String.valueOf(value.charAt(9)));

        if ((a == 0 && a == c) || (a == 1 && c == 1) || (a > 1 && c == 11 - a))
            return true;
        else
            return false;

    }

    public static boolean isNumber(String value) {
        return value.matches("\\d+");
    }

//    public static void main(String[] args) {
//        System.out.println(isNumber("125845142b121"));
//    }

}
