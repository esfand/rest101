package com.webwarp.rest101;

import org.jvnet.hk2.annotations.Contract;

@Contract
public interface TimeOfTheDayContract {

    public abstract String getTimeOfTheDay(String name);

    public abstract Time   getTimeOfTheDayInXML(String name);

    public abstract Time   getTimeOfTheDayInJSON(String name);
}