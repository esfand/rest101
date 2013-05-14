package com.webwarp.rest101;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.jvnet.hk2.annotations.Service;


@Service
public class TimeOfTheDayService implements TimeOfTheDay {

    private static String PATTERN = "MM.dd.yyyy HH:mm:ss";

    @Override
    public String getTimeOfTheDay(/*@PathParam("name")*/ String name) {
        SimpleDateFormat df = new SimpleDateFormat(PATTERN);
        return name + "-" + df.format(Calendar.getInstance().getTime());
    }

    @Override
    public Time getTimeOfTheDayInXML(/*@PathParam("name")*/ String name) {
        SimpleDateFormat df = new SimpleDateFormat(PATTERN);
        Time t = new Time();
        t.setName(name);
        t.setTime(df.format(Calendar.getInstance().getTime()));
        return t;
    }

    @Override
    public Time getTimeOfTheDayInJSON(/*@PathParam("name")*/ String name) {
        SimpleDateFormat df = new SimpleDateFormat(PATTERN);
        Time t = new Time();
        t.setName(name);
        t.setTime(df.format(Calendar.getInstance().getTime()));
        return t;
    }
}