package org.example;

import org.apache.commons.lang3.math.NumberUtils;

import static org.apache.commons.lang3.compare.ComparableUtils.is;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isParsable(str)) {
            return is(Integer.parseInt(str)).greaterThan(0);
        }
        return false;
    }
}
