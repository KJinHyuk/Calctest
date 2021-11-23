package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class util {
	// 오늘 날짜를 가져 오는 메소드(yyyyMMdd)
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }

}

