package com.stackoverflow.angela;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class BusyAt {

    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("events")
    @Expose
    private List<Event> events = new ArrayList<Event>();

    /**
     * No args constructor for use in serialization
     *
     */
    public BusyAt() {
    }

    /**
     *
     * @param to
     * @param events
     * @param from
     */
    public BusyAt(String from, String to, List<Event> events) {
        super();
        this.from = from;
        this.to = to;
        this.events = events;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
