package com.restService.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by EDW on 3/15/2021.
 */
public class PasswordUtils {

    public static String getHashString(String stringToHash) throws NoSuchAlgorithmException {
        String generatedPassword = null;
        // Create MessageDigest instance for MD5
        MessageDigest md = MessageDigest.getInstance("MD5");
        //Add password bytes to digest
//            md.update(salt);
        //Get the hash's bytes
        byte[] bytes = md.digest(stringToHash.getBytes());
        //This bytes[] has bytes in decimal format;
        //Convert it to hexadecimal format
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        //Get complete hashed password in hex format
        generatedPassword = sb.toString();

        return generatedPassword;
    }

    public static String generatePassword() {
        String lowerCase = RandomStringUtils.random(1, true, false);
        lowerCase = lowerCase.toLowerCase();
        String upperCase = RandomStringUtils.random(1, true, false);
        upperCase = upperCase.toUpperCase();
        String num = RandomStringUtils.random(1, false, true);
        String pswd = RandomStringUtils.random(6, true, true);
        return lowerCase + upperCase + num + pswd;
    }

    public static void main(String[] args) {
//        try {
//            String str = generatePassword();
//            System.out.println(str);
//            System.out.println(getSecurePassword(str));
//        } catch (NoSuchAlgorithmException e) {
//            System.out.println("ERROR");
//        }

        try {
//            String str = "diba@1400";
//            String str = "cbi@14004ws";
            String str = "ssaba123";
            System.out.println(str);
            System.out.println(getHashString(str));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("ERROR");
        }
    }

}
