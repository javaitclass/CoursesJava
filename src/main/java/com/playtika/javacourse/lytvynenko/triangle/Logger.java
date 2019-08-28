package com.playtika.javacourse.lytvynenko.triangle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Logger {

    public static void printLog(String message){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        String date = simpleDateFormat.format(new Date());
        System.out.println(date + " / " + message);
    }
}
