package org.example.data;

import java.util.ArrayList;

public class AirQualityDTO {
    private float latitude;
    private float longitude;
    private float generationtime_ms;
    private float utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private float elevation;
    Hourly_units Hourly_unitsObject;
    Hourly HourlyObject;


    // Getter Methods

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getGenerationtime_ms() {
        return generationtime_ms;
    }

    public float getUtc_offset_seconds() {
        return utc_offset_seconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getTimezone_abbreviation() {
        return timezone_abbreviation;
    }

    public float getElevation() {
        return elevation;
    }

    public Hourly_units getHourly_units() {
        return Hourly_unitsObject;
    }

    public Hourly getHourly() {
        return HourlyObject;
    }

    // Setter Methods

    public void setLatitude( float latitude ) {
        this.latitude = latitude;
    }

    public void setLongitude( float longitude ) {
        this.longitude = longitude;
    }

    public void setGenerationtime_ms( float generationtime_ms ) {
        this.generationtime_ms = generationtime_ms;
    }

    public void setUtc_offset_seconds( float utc_offset_seconds ) {
        this.utc_offset_seconds = utc_offset_seconds;
    }

    public void setTimezone( String timezone ) {
        this.timezone = timezone;
    }

    public void setTimezone_abbreviation( String timezone_abbreviation ) {
        this.timezone_abbreviation = timezone_abbreviation;
    }

    public void setElevation( float elevation ) {
        this.elevation = elevation;
    }

    public void setHourly_units( Hourly_units hourly_unitsObject ) {
        this.Hourly_unitsObject = hourly_unitsObject;
    }

    public void setHourly( Hourly hourlyObject ) {
        this.HourlyObject = hourlyObject;
    }
}
