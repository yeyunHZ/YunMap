package com.yun.map;

/**
 * 坐标数据
 */
public class Location {
    private double latitude;
    private double longitude;
    private String city;
    private float direction;
    private long time;
    private float speed;
    private String addrStr;
    private float radius;
    private double gaoDeLatitude;
    private double gaoDeLongitude;
    private String district;
    private String cityCode;
    private String areaCode;
    private String province;
    private String country;

    private double googleLatitude;
    private double googleLongitude;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getAddrStr() {
        return addrStr;
    }

    public void setAddrStr(String addrStr) {
        this.addrStr = addrStr;
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public double getLongitude() {
        if (longitude == 0 && gaoDeLongitude != 0) {
            Location gaodeLocation = GPSConverterUtils.gcj02_To_Bd09(gaoDeLatitude, gaoDeLongitude);
            latitude = gaodeLocation.getLatitude();
            longitude = gaodeLocation.getLongitude();
        } else if (longitude == 0 && googleLongitude != 0) {
            Location googleLocation = GPSConverterUtils.gps84_To_bd09(googleLatitude, googleLongitude);
            latitude = googleLocation.getLatitude();
            longitude = googleLocation.getLongitude();
        }
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Location(double latitude, double longitude, String city, float direction, long time) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
        this.direction = direction;
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getLatitude() {
        if (latitude == 0 && gaoDeLatitude != 0) {
            Location gaodeLocation = GPSConverterUtils.gcj02_To_Bd09(gaoDeLatitude, gaoDeLongitude);
            latitude = gaodeLocation.getLatitude();
            longitude = gaodeLocation.getLongitude();
        } else if (latitude == 0 && googleLatitude != 0) {
            Location googleLocation = GPSConverterUtils.gps84_To_bd09(googleLatitude, googleLongitude);
            latitude = googleLocation.getLatitude();
            longitude = googleLocation.getLongitude();
        }
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public float getDirection() {
        return direction;
    }

    public void setDirection(float direction) {
        this.direction = direction;
    }

    public double getGaoDeLatitude() {
        if (gaoDeLatitude == 0 && longitude != 0) {
            Location gaodeLocation = GPSConverterUtils.bd09_To_Gcj02(latitude, longitude);
            gaoDeLatitude = gaodeLocation.getLatitude();
            gaoDeLongitude = gaodeLocation.getLongitude();
        } else if (gaoDeLatitude == 0 && googleLatitude != 0) {
            Location googleLocation = GPSConverterUtils.gps84_To_Gcj02(googleLatitude, googleLongitude);
            gaoDeLatitude = googleLocation.getLatitude();
            gaoDeLongitude = googleLocation.getLongitude();
        }
        return gaoDeLatitude;
    }

    public void setGaoDeLatitude(double gaoDeLatitude) {
        this.gaoDeLatitude = gaoDeLatitude;
    }

    public double getGaoDeLongitude() {
        if (gaoDeLongitude == 0 && longitude != 0) {
            Location gaodeLocation = GPSConverterUtils.bd09_To_Gcj02(latitude, longitude);
            gaoDeLatitude = gaodeLocation.getLatitude();
            gaoDeLongitude = gaodeLocation.getLongitude();
        }else if (gaoDeLongitude == 0 && googleLongitude != 0) {
            Location googleLocation = GPSConverterUtils.gps84_To_Gcj02(googleLatitude, googleLongitude);
            gaoDeLatitude = googleLocation.getLatitude();
            gaoDeLongitude = googleLocation.getLongitude();
        }
        return gaoDeLongitude;
    }

    public double getGoogleLatitude() {
        if (googleLatitude == 0 && latitude != 0) {
            Location bdLocation = GPSConverterUtils.bd09_To_Gps84(latitude, longitude);
            googleLatitude = bdLocation.getLatitude();
            googleLongitude = bdLocation.getLongitude();
        }else if (googleLatitude == 0 && gaoDeLongitude != 0) {
            Location gdLocation = GPSConverterUtils.gcj_To_Gps84(gaoDeLatitude, gaoDeLongitude);
            googleLatitude = gdLocation.getLatitude();
            googleLongitude = gdLocation.getLongitude();
        }
        return googleLatitude;
    }

    public void setGoogleLatitude(double googleLatitude) {
        this.googleLatitude = googleLatitude;
    }

    public double getGoogleLongitude() {
        if (googleLongitude == 0 && longitude != 0) {
            Location bdLocation = GPSConverterUtils.bd09_To_Gps84(latitude, longitude);
            googleLatitude = bdLocation.getLatitude();
            googleLongitude = bdLocation.getLongitude();
        }else if (googleLongitude == 0 && gaoDeLongitude != 0) {
            Location gdLocation = GPSConverterUtils.gcj_To_Gps84(gaoDeLatitude, gaoDeLongitude);
            googleLatitude = gdLocation.getLatitude();
            googleLongitude = gdLocation.getLongitude();
        }
        return googleLongitude;
    }

    public void setGoogleLongitude(double googleLongitude) {
        this.googleLongitude = googleLongitude;
    }

    public void setGaoDeLongitude(double gaoDeLongitude) {
        this.gaoDeLongitude = gaoDeLongitude;
    }


}
