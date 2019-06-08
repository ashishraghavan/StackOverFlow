package com.stackoverflow.angela;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("series_id")
    @Expose
    private Object seriesId;
    @SerializedName("recurrence_id")
    @Expose
    private Object recurrenceId;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("space_id")
    @Expose
    private Integer spaceId;
    @SerializedName("start")
    @Expose
    private Start start;
    @SerializedName("end")
    @Expose
    private End end;
    @SerializedName("started_at")
    @Expose
    private String startedAt;
    @SerializedName("ended_at")
    @Expose
    private String endedAt;

    /**
     * No args constructor for use in serialization
     *
     */
    public Event() {
    }

    /**
     *
     * @param uid
     * @param id
     * @param start
     * @param endedAt
     * @param recurrenceId
     * @param startedAt
     * @param spaceId
     * @param seriesId
     * @param end
     */
    public Event(String id, Object seriesId, Object recurrenceId, String uid, Integer spaceId, Start start, End end, String startedAt, String endedAt) {
        super();
        this.id = id;
        this.seriesId = seriesId;
        this.recurrenceId = recurrenceId;
        this.uid = uid;
        this.spaceId = spaceId;
        this.start = start;
        this.end = end;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Object seriesId) {
        this.seriesId = seriesId;
    }

    public Object getRecurrenceId() {
        return recurrenceId;
    }

    public void setRecurrenceId(Object recurrenceId) {
        this.recurrenceId = recurrenceId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    public Start getStart() {
        return start;
    }

    public void setStart(Start start) {
        this.start = start;
    }

    public End getEnd() {
        return end;
    }

    public void setEnd(End end) {
        this.end = end;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(String endedAt) {
        this.endedAt = endedAt;
    }
}
