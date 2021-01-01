package com.borikov.utils.util;

import com.borikov.utils.exception.IncorrectNumberException;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.math.NumberUtils;

@UtilityClass
public class StringUtils {
    public boolean isPositiveNumber(String str) throws IncorrectNumberException {
        if (NumberUtils.isCreatable(str)) {
            double number = NumberUtils.createDouble(str);
            return number > 0;
        } else {
            throw new IncorrectNumberException("String doesn't contain a number: " + str);
        }
    }
}
