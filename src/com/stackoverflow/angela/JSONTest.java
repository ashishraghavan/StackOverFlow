package com.stackoverflow.angela;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class JSONTest {

    @SerializedName("mySpaceId")
    @Expose
    private Integer mySpaceId;
    @SerializedName("myBuildingId")
    @Expose
    private Integer myBuildingId;
    @SerializedName("myFloorId")
    @Expose
    private Integer myFloorId;
    @SerializedName("myFloorNumber")
    @Expose
    private String myFloorNumber;
    @SerializedName("myFloorName")
    @Expose
    private String myFloorName;
    @SerializedName("spaceName")
    @Expose
    private String spaceName;
    @SerializedName("capacity")
    @Expose
    private Integer capacity;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("busyAt")
    @Expose
    private List<BusyAt> busyAt = new ArrayList<BusyAt>();
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("timeZone")
    @Expose
    private String timeZone;

    /**
     * No args constructor for use in serialization
     *
     */
    public JSONTest() {
    }

    /**
     *
     * @param mySpaceId
     * @param spaceName
     * @param description
     * @param capacity
     * @param timeZone
     * @param busyAt
     * @param myFloorNumber
     * @param type
     * @param myFloorName
     * @param myFloorId
     * @param myBuildingId
     */
    public JSONTest(Integer mySpaceId, Integer myBuildingId, Integer myFloorId, String myFloorNumber, String myFloorName, String spaceName, Integer capacity, String type, List<BusyAt> busyAt, Object description, String timeZone) {
        super();
        this.mySpaceId = mySpaceId;
        this.myBuildingId = myBuildingId;
        this.myFloorId = myFloorId;
        this.myFloorNumber = myFloorNumber;
        this.myFloorName = myFloorName;
        this.spaceName = spaceName;
        this.capacity = capacity;
        this.type = type;
        this.busyAt = busyAt;
        this.description = description;
        this.timeZone = timeZone;
    }

    public Integer getMySpaceId() {
        return mySpaceId;
    }

    public void setMySpaceId(Integer mySpaceId) {
        this.mySpaceId = mySpaceId;
    }

    public Integer getMyBuildingId() {
        return myBuildingId;
    }

    public void setMyBuildingId(Integer myBuildingId) {
        this.myBuildingId = myBuildingId;
    }

    public Integer getMyFloorId() {
        return myFloorId;
    }

    public void setMyFloorId(Integer myFloorId) {
        this.myFloorId = myFloorId;
    }

    public String getMyFloorNumber() {
        return myFloorNumber;
    }

    public void setMyFloorNumber(String myFloorNumber) {
        this.myFloorNumber = myFloorNumber;
    }

    public String getMyFloorName() {
        return myFloorName;
    }

    public void setMyFloorName(String myFloorName) {
        this.myFloorName = myFloorName;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<BusyAt> getBusyAt() {
        return busyAt;
    }

    public void setBusyAt(List<BusyAt> busyAt) {
        this.busyAt = busyAt;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}