package com.restService.utils;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.ULocale;

import java.util.Date;

public class DateUtils {

    public static final int[] j_days_in_month = {31, 31, 31, 31, 31, 31, 30, 30, 30, 30, 30, 29};
    public static final int[] g_days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String year_prefix = "13";
    public static final String YEAR_MONTH_DAY = "yyyyMMdd";
    public static final int YEAR = 0;
    public static final int MONTH = 1;
    public static final int DAY = 3;

    public static String format(Date date) {
        return format(date, "yyyy/MM/dd");
    }

    public static String format(Date date, String pattern) {
        ULocale locale = new ULocale("en_US@calendar=persian");
        DateFormat df = new SimpleDateFormat(pattern, locale);
        return df.format(date);
    }

    public static String dateWithSlash(String dateWithoutSlash) {
        if (dateWithoutSlash != null && dateWithoutSlash.length() == 8) {
            String tmpStr = dateWithoutSlash.substring(0, 4)
                    + '/' + dateWithoutSlash.substring(4, 6)
                    + '/' + dateWithoutSlash.substring(6, 8);
            return tmpStr;

        }
        return dateWithoutSlash;
    }

    public static Date convertDateStringToDate(String dateString) {
        int year = Integer.parseInt(dateString.substring(0, 4));
        //int month = Integer.parseInt(dateString.substring(5, 7));
        int month = Integer.parseInt(dateString.substring(4, 6));
        int day = Integer.parseInt(dateString.substring(6, 8));

        Date date = new Date(0);
        date.setYear(year - 1900);
        date.setMonth(month - 1);
        date.setDate(day);

        return date;
    }

    public static Date convertPersianDateStringToDate(String persianDate) {

        String newPersianDate = persianDate.replaceAll("/", "").trim();
        newPersianDate = newPersianDate.length() != 8 ? year_prefix + newPersianDate : newPersianDate;
        String year = newPersianDate.substring(0, 4);
        String month = newPersianDate.substring(4, 6);
        String day = newPersianDate.substring(6, 8);

        String gregorianDate = persianToGregorian(year + month + day, null);
        return convertDateStringToDate(gregorianDate);
    }

    public static String persianToGregorian(String jDate, String format) {
        if(jDate == null || jDate.trim().length() != 8)
            return "invalid date";
        String jy = jDate.substring(0, 4);
        String jm = jDate.substring(4, 6);
        String jd = jDate.substring(6, 8);
        int jYear = Integer.parseInt(jy) - 979;
        int jMonth = Integer.parseInt(jm) - 1;
        int jDay = Integer.parseInt(jd) - 1;
        int j_day_no = 365 * jYear + (jYear / 33) * 8 + ((jYear % 33 + 3) / 4);
        int g_day_no;
        Integer gm = 0, gy = 0;
        boolean leap;

        for (int i = 0; i < jMonth; ++i) {
            j_day_no += j_days_in_month[i];
        }

        j_day_no += jDay;

        g_day_no = j_day_no + 79;
        gy = 1600 + 400 * (g_day_no / 146097);
        g_day_no = g_day_no % 146097;

        leap = true;
        if (g_day_no >= 36525) /* 36525 = 365*100 + 100/4 */ {
            g_day_no--;
            gy += 100 * (g_day_no / 36524);
            /* 36524 = 365*100 + 100/4 - 100/100 */
            g_day_no = g_day_no % 36524;

            if (g_day_no >= 365) {
                g_day_no++;
            } else {
                leap = false;
            }
        }

        gy += 4 * (g_day_no / 1461);
        /* 1461 = 365*4 + 4/4 */
        g_day_no %= 1461;

        if (g_day_no >= 366) {
            leap = false;

            g_day_no--;
            gy += (g_day_no / 365);
            g_day_no = g_day_no % 365;
        }
        int temp = 0;
        for (int i = 0; g_day_no >= g_days_in_month[i] + parsBooleanToInt(i == 1 && leap); i++) {
            g_day_no -= g_days_in_month[i] + parsBooleanToInt(i == 1 && leap);
            temp = i + 1;  //gm = i + 1;
        }
        gm = temp + 1;
        Integer gd = g_day_no + 1;
        if(format == null) {
            return gy.toString() + String.format("%02d", gm) + String.format("%02d", gd);
        } else {
            format = format.toUpperCase();
            return format.replace("YYYY", gy.toString()).replace("MM",String.format("%02d", gm)).replace("DD", String.format("%02d", gd));
        }

    }

    private static int parsBooleanToInt(Boolean sample) {
        if (sample) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(persianToGregorian("14000101", "DD/MM/YYYY"));
    }

}
