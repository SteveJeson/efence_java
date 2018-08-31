package com.zdzc.entity;

import java.util.Date;

public class EfenceJob {
    private Integer id;

    private String jobCode;

    private String efenceCode;

    private String name;

    private Integer status;

    private Date createTime;

    private String remark;

    private String deviceCodes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode == null ? null : jobCode.trim();
    }

    public String getEfenceCode() {
        return efenceCode;
    }

    public void setEfenceCode(String efenceCode) {
        this.efenceCode = efenceCode == null ? null : efenceCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDeviceCodes() {
        return deviceCodes;
    }

    public void setDeviceCodes(String deviceCodes) {
        this.deviceCodes = deviceCodes == null ? null : deviceCodes.trim();
    }
}