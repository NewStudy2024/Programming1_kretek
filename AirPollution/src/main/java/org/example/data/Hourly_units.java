package org.example.data;

public class Hourly_units {
    private String time;
    private String pm10;
    private String pm2_5;
    private String european_aqi_pm2_5;


    // Getter Methods 

    public String getTime() {
        return time;
    }

    public String getPm10() {
        return pm10;
    }

    public String getPm2_5() {
        return pm2_5;
    }

    public String getEuropean_aqi_pm2_5() {
        return european_aqi_pm2_5;
    }

    // Setter Methods 

    public void setTime( String time ) {
        this.time = time;
    }

    public void setPm10( String pm10 ) {
        this.pm10 = pm10;
    }

    public void setPm2_5( String pm2_5 ) {
        this.pm2_5 = pm2_5;
    }

    public void setEuropean_aqi_pm2_5( String european_aqi_pm2_5 ) {
        this.european_aqi_pm2_5 = european_aqi_pm2_5;
    }
}
