package com.restService.utils;

import org.springframework.util.StringUtils;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtils {

    public static boolean isEmpty(String value) {
        return StringUtils.isEmpty(value);
    }

    public static Long parseLong(String value) {
        if (isEmpty(value)) {
            return null;
        }
        return Long.parseLong(value);
    }

    public static Integer parseInt(String value) {
        if (isEmpty(value)) {
            return null;
        }
        return Integer.parseInt(value);
    }

    public static boolean hasText(String string) {
        return string != null && string.trim().length() != 0;
    }

    private static Map<Character, Character> chars;

    static {
        chars = new HashMap<>();
        chars.put('\u0643', '\u06a9');
        chars.put('\ufef1', '\u06cc');
        chars.put('\u064a', '\u06cc');
    }

    public static String sanitizeNumber2(String number, Locale targetLocale) throws ParseException {
        NumberFormat format = NumberFormat.getNumberInstance(targetLocale);
        format.setGroupingUsed(false);
        String regex = "([\u06600]*)([\u0660-\u06690-9]*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(number);
        String numbers = null;
        String zeros = null;
        if (m.matches()) {
            if (!"".equals(m.group(1))) {
                zeros = m.group(1);
            }

            if (!"".equals(m.group(2))) {
                numbers = m.group(2);
            }

            StringBuilder builder = new StringBuilder();
            MessageFormat messageFormat = new MessageFormat("{0,number,#}", targetLocale);
            int zeroCount = zeros != null ? zeros.length() : 0;
            Number n = format.parse(numbers);
            numbers = messageFormat.format(new Number[]{n});

            if (zeros != null) {
                Number z = format.parse(zeros);
                zeros = messageFormat.format(new Number[]{z});
                for (int i = 0; i < zeroCount; i++) {
                    builder.append(zeros);
                }
            }

            builder.append(numbers);
            number = builder.toString();
        }

        return number;
    }

    public static String sanitizeNumber(String number, Locale targetLocale) throws ParseException {
        String newNumber = number;
        if (targetLocale.equals(new Locale("en"))) {
            newNumber = newNumber.replace("۰", "0");
            newNumber = newNumber.replace("۱", "1");
            newNumber = newNumber.replace("۲", "2");
            newNumber = newNumber.replace("۳", "3");
            newNumber = newNumber.replace("۴", "4");
            newNumber = newNumber.replace("۵", "5");
            newNumber = newNumber.replace("۶", "6");
            newNumber = newNumber.replace("۷", "7");
            newNumber = newNumber.replace("۸", "8");
            newNumber = newNumber.replace("۹", "9");

            newNumber = newNumber.replace("٠", "0");
            newNumber = newNumber.replace("١", "1");
            newNumber = newNumber.replace("٢", "2");
            newNumber = newNumber.replace("٣", "3");
            newNumber = newNumber.replace("٤", "4");
            newNumber = newNumber.replace("٥", "5");
            newNumber = newNumber.replace("٦", "6");
            newNumber = newNumber.replace("٧", "7");
            newNumber = newNumber.replace("٨", "8");
            newNumber = newNumber.replace("٩", "9");
            return newNumber;
        } else if (targetLocale.equals(new Locale("fa"))) {
            newNumber = newNumber.replace("٠", "0");
            newNumber = newNumber.replace("١", "1");
            newNumber = newNumber.replace("٢", "2");
            newNumber = newNumber.replace("٣", "3");
            newNumber = newNumber.replace("٤", "4");
            newNumber = newNumber.replace("٥", "5");
            newNumber = newNumber.replace("٦", "6");
            newNumber = newNumber.replace("٧", "7");
            newNumber = newNumber.replace("٨", "8");
            newNumber = newNumber.replace("٩", "9");

            newNumber = newNumber.replace("0", "۰");
            newNumber = newNumber.replace("1", "۱");
            newNumber = newNumber.replace("2", "۲");
            newNumber = newNumber.replace("3", "۳");
            newNumber = newNumber.replace("4", "۴");
            newNumber = newNumber.replace("5", "۵");
            newNumber = newNumber.replace("6", "۶");
            newNumber = newNumber.replace("7", "۷");
            newNumber = newNumber.replace("8", "۸");
            newNumber = newNumber.replace("9", "۹");
            return newNumber;
        } else {
            throw new ParseException("error", 0);
        }
    }

    public static String sanitizeNumber3(String number) throws ParseException {
        NumberFormat format = NumberFormat.getNumberInstance(Locale.US);
        format.setGroupingUsed(false);
        String regex = "([\u06600]*)([\u0660-\u06690-9]*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(number);
        String numbers;
        if (m.find()) {
            numbers = m.groupCount() == 2 ? m.group(2) : m.group(1);
            Number n = format.parse(numbers);
            number = String.format("%0" + number.length() + "d", n);
        }

        return number;
    }

    public static String sanitizeString(String text) {
        for (char c : chars.keySet()) {
            text = text.replaceAll(String.valueOf(c), String.valueOf(chars.get(c)));
        }

        return text;
    }

    public static String format(String base, int baseLength, String baseChar) {
        if (isEmpty(base)) return base;
        String newStr = base.trim();
        int i = baseLength - newStr.length();
        for (int j = 0; j < i; j++) {
            newStr = baseChar + newStr;
        }
        return newStr;
    }

//    public static void main(String[] args) {
//        System.out.println(format("12", 10, "0"));
//    }


}
