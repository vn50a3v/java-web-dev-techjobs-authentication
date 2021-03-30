package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.NotNull;

public class registerDTO extends loginDTO{

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

}
