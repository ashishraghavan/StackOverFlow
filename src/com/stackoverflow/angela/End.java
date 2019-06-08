package com.stackoverflow.angela;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class End {

    @SerializedName("date_time")
    @Expose
    private String dateTime;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;

    /**
     * No args constructor for use in serialization
     *
     */
    public End() {
    }

    /**
     *
     * @param dateTime
     * @param timeZone
     */
    public End(String dateTime, String timeZone) {
        super();
        this.dateTime = dateTime;
        this.timeZone = timeZone;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
