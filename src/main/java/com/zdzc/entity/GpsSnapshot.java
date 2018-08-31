package com.zdzc.entity;

import java.util.Date;

public class GpsSnapshot {
    private String deviceCode;

    private Integer alarmStatus;

    private Integer vehicleStatus;

    private Double lat;

    private Double lon;

    private Double height;

    private Double speed;

    private Double direction;

    private Long time;

    private Double mile;

    private Double oil;

    private Double speed2;

    private Integer signalStatus;

    private Integer bst;

    private Integer ioStatus;

    private String analog;

    private Integer wifi;

    private Integer satelliteNum;

    private Date createTime;

    private String vendorCode;

    private String heartbeatTime;

    private Long bstTime;

    private Date locationTime;

    private Date alarmTime;

    private String protocolType;

    private String wrtAccStatus;

    private String wrtBastStatus;

    private String wrtTearStatus;

    private String wrtWorkStatus;

    private String wrtManualBast;

    private String wrtAutoBast;

    private Integer wrtAutobastTime;

    private String wrtPowerStatus;

    private String wrtOpowerStatus;

    private String wrtMoveStatus;

    private String wrtAlarmStatus;

    private Integer wrtHeartFrequency;

    private Integer wrtGpsFrequency;

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode == null ? null : deviceCode.trim();
    }

    public Integer getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(Integer alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public Integer getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(Integer vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDirection() {
        return direction;
    }

    public void setDirection(Double direction) {
        this.direction = direction;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Double getMile() {
        return mile;
    }

    public void setMile(Double mile) {
        this.mile = mile;
    }

    public Double getOil() {
        return oil;
    }

    public void setOil(Double oil) {
        this.oil = oil;
    }

    public Double getSpeed2() {
        return speed2;
    }

    public void setSpeed2(Double speed2) {
        this.speed2 = speed2;
    }

    public Integer getSignalStatus() {
        return signalStatus;
    }

    public void setSignalStatus(Integer signalStatus) {
        this.signalStatus = signalStatus;
    }

    public Integer getBst() {
        return bst;
    }

    public void setBst(Integer bst) {
        this.bst = bst;
    }

    public Integer getIoStatus() {
        return ioStatus;
    }

    public void setIoStatus(Integer ioStatus) {
        this.ioStatus = ioStatus;
    }

    public String getAnalog() {
        return analog;
    }

    public void setAnalog(String analog) {
        this.analog = analog == null ? null : analog.trim();
    }

    public Integer getWifi() {
        return wifi;
    }

    public void setWifi(Integer wifi) {
        this.wifi = wifi;
    }

    public Integer getSatelliteNum() {
        return satelliteNum;
    }

    public void setSatelliteNum(Integer satelliteNum) {
        this.satelliteNum = satelliteNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode == null ? null : vendorCode.trim();
    }

    public String getHeartbeatTime() {
        return heartbeatTime;
    }

    public void setHeartbeatTime(String heartbeatTime) {
        this.heartbeatTime = heartbeatTime == null ? null : heartbeatTime.trim();
    }

    public Long getBstTime() {
        return bstTime;
    }

    public void setBstTime(Long bstTime) {
        this.bstTime = bstTime;
    }

    public Date getLocationTime() {
        return locationTime;
    }

    public void setLocationTime(Date locationTime) {
        this.locationTime = locationTime;
    }

    public Date getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType == null ? null : protocolType.trim();
    }

    public String getWrtAccStatus() {
        return wrtAccStatus;
    }

    public void setWrtAccStatus(String wrtAccStatus) {
        this.wrtAccStatus = wrtAccStatus == null ? null : wrtAccStatus.trim();
    }

    public String getWrtBastStatus() {
        return wrtBastStatus;
    }

    public void setWrtBastStatus(String wrtBastStatus) {
        this.wrtBastStatus = wrtBastStatus == null ? null : wrtBastStatus.trim();
    }

    public String getWrtTearStatus() {
        return wrtTearStatus;
    }

    public void setWrtTearStatus(String wrtTearStatus) {
        this.wrtTearStatus = wrtTearStatus == null ? null : wrtTearStatus.trim();
    }

    public String getWrtWorkStatus() {
        return wrtWorkStatus;
    }

    public void setWrtWorkStatus(String wrtWorkStatus) {
        this.wrtWorkStatus = wrtWorkStatus == null ? null : wrtWorkStatus.trim();
    }

    public String getWrtManualBast() {
        return wrtManualBast;
    }

    public void setWrtManualBast(String wrtManualBast) {
        this.wrtManualBast = wrtManualBast == null ? null : wrtManualBast.trim();
    }

    public String getWrtAutoBast() {
        return wrtAutoBast;
    }

    public void setWrtAutoBast(String wrtAutoBast) {
        this.wrtAutoBast = wrtAutoBast == null ? null : wrtAutoBast.trim();
    }

    public Integer getWrtAutobastTime() {
        return wrtAutobastTime;
    }

    public void setWrtAutobastTime(Integer wrtAutobastTime) {
        this.wrtAutobastTime = wrtAutobastTime;
    }

    public String getWrtPowerStatus() {
        return wrtPowerStatus;
    }

    public void setWrtPowerStatus(String wrtPowerStatus) {
        this.wrtPowerStatus = wrtPowerStatus == null ? null : wrtPowerStatus.trim();
    }

    public String getWrtOpowerStatus() {
        return wrtOpowerStatus;
    }

    public void setWrtOpowerStatus(String wrtOpowerStatus) {
        this.wrtOpowerStatus = wrtOpowerStatus == null ? null : wrtOpowerStatus.trim();
    }

    public String getWrtMoveStatus() {
        return wrtMoveStatus;
    }

    public void setWrtMoveStatus(String wrtMoveStatus) {
        this.wrtMoveStatus = wrtMoveStatus == null ? null : wrtMoveStatus.trim();
    }

    public String getWrtAlarmStatus() {
        return wrtAlarmStatus;
    }

    public void setWrtAlarmStatus(String wrtAlarmStatus) {
        this.wrtAlarmStatus = wrtAlarmStatus == null ? null : wrtAlarmStatus.trim();
    }

    public Integer getWrtHeartFrequency() {
        return wrtHeartFrequency;
    }

    public void setWrtHeartFrequency(Integer wrtHeartFrequency) {
        this.wrtHeartFrequency = wrtHeartFrequency;
    }

    public Integer getWrtGpsFrequency() {
        return wrtGpsFrequency;
    }

    public void setWrtGpsFrequency(Integer wrtGpsFrequency) {
        this.wrtGpsFrequency = wrtGpsFrequency;
    }
}