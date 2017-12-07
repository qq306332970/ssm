package com.lym.ssm.domain;


import com.lym.ssm.groups.LoginValidatorGroup;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by dllo on 17/12/2.
 */
public class Admin {

    private int adminId;
    @NotBlank(message = "{user.username.NotBlank}",groups = {LoginValidatorGroup.class})
    private String adminCode;//登录账号
    @NotBlank(message = "{user.password.NotBlank}",groups = {LoginValidatorGroup.class})

    private String password;
    private String name;
    private String telephone;
    private String email;
    private String enrollDate;//登记日期

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminCode='" + adminCode + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", enrollDate='" + enrollDate + '\'' +
                '}';
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = enrollDate;
    }
}
