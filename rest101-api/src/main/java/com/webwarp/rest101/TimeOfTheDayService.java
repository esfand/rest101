package com.webwarp.rest101;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
import org.jvnet.hk2.annotations.Service;

//import org.springframework.stereotype.Component;


//@Component
@Service
//@Path("/timeoftheday")
public class TimeOfTheDayService implements TimeOfTheDayContract {

    private static String PATTERN = "MM.dd.yyyy HH:mm:ss";

    //@GET
    //@Produces("text/plain")
    //@Path("/asplaintext/{name}")
    @Override
    public String getTimeOfTheDay(/*@PathParam("name")*/ String name) {
        SimpleDateFormat df = new SimpleDateFormat(PATTERN);
        return name + "-" + df.format(Calendar.getInstance().getTime());
    }

    //@GET
    //@Produces("application/xml")
    //@Path("/asxml/{name}/")
    @Override
    public Time getTimeOfTheDayInXML(/*@PathParam("name")*/ String name) {
        SimpleDateFormat df = new SimpleDateFormat(PATTERN);
        Time t = new Time();
        t.setName(name);
        t.setTime(df.format(Calendar.getInstance().getTime()));
        return t;
    }

    //@GET
    //@Produces("application/json")
    //@Path("/asjson/{name}/")
    @Override
    public Time getTimeOfTheDayInJSON(/*@PathParam("name")*/ String name) {
        SimpleDateFormat df = new SimpleDateFormat(PATTERN);
        Time t = new Time();
        t.setName(name);
        t.setTime(df.format(Calendar.getInstance().getTime()));
        return t;
    }
}