package com.borikov.core.util;

import com.borikov.utils.exception.IncorrectNumberException;
import com.borikov.utils.util.StringUtils;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;

import java.util.Arrays;

@UtilityClass
@Log4j2
public class Utils {
    public boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(s -> {
            try {
                return StringUtils.isPositiveNumber(s);
            } catch (IncorrectNumberException e) {
                log.log(Level.ERROR, e);
                return false;
            }
        });
    }
}
