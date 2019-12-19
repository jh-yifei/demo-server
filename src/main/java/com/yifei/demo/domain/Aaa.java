package com.yifei.demo.domain;

public class Aaa {
    private Integer aaaId;

    private String aaName;

    public Integer getAaaId() {
        return aaaId;
    }

    public void setAaaId(Integer aaaId) {
        this.aaaId = aaaId;
    }

    public String getAaName() {
        return aaName;
    }

    public void setAaName(String aaName) {
        this.aaName = aaName == null ? null : aaName.trim();
    }
}