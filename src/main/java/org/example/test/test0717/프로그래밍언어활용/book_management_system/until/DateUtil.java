package org.example.test.test0717.프로그래밍언어활용.book_management_system.until;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    private static final String PATTERN = "yyyy-MM-dd HH:mm:ss";

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN);

    public static String now() {
        return LocalDateTime.now().format(FORMATTER);
    }
}
