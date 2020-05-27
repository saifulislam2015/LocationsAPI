package com.api.model;
import javax.persistence.*;

@Entity
@Table(name = "NES_LOCATIONS")

public class location {
    private String id;
    private Double lat;
    private Double lon;
    private boolean status;

    @Id
    @Column(name = "DeviceId",nullable = false, unique = true)
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "Lat", nullable = false)
    public Double getLat() {
        return lat;
    }
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Column(name = "Long", nullable = false)
    public Double getLon() {
        return lon;
    }
    public void setLon(Double lon) {
        this.lon = lon;
    }

    @Column(name = "Status", nullable = false)
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public location(){
        
    }

}