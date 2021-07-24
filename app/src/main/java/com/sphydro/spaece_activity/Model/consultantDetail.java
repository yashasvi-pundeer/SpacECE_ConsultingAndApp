package com.sphydro.spaece_activity.Model;

public class consultantDetail {
    String  userName , licenceNo , email , phoneNum ;

    public consultantDetail() {

    }

    public consultantDetail(String userName, String licenceNo, String email, String phoneNum) {
        this.userName = userName;
        this.licenceNo = licenceNo;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
