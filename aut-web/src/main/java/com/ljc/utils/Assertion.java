package com.ljc.utils;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lijc
 * @Description
 * @Date 2019/4/22-15:04
 **/
public class Assertion {
    public static boolean flag = true;
    public static List<Error> errors = new ArrayList<>();

    public static void verifyEquals(Object actual, Object expected) {
        try {
            Assert.assertEquals(actual, expected);
        } catch (Error e) {
            errors.add(e);
            flag = false;

        }
    }

    public static void verifyEquals(Object actual, Object expected, String message) {
        try {
            Assert.assertEquals(actual, expected, message);
        } catch (Error e) {
            errors.add(e);
            flag = false;
        }

    }

    public static void verifyNulls(Object actual, String message) {
        try {
            Assert.assertNull(actual, message);
        } catch (Error e) {
            errors.add(e);
            flag = false;
        }
    }

}
