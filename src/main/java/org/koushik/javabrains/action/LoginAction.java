package org.koushik.javabrains.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

public class LoginAction extends ActionSupport {
    private String userId;
    private String password;

    @Override
    public void validate() {
        if (StringUtils.isEmpty(getUserId())) {
            System.out.println("User ID cannot be blank");
            addFieldError(getUserId(), "User ID cannot be blank");
        }
        if (StringUtils.isEmpty(getPassword())) {
            System.out.println("Password cannot be blank");
            addFieldError(getPassword(), "Password cannot be blank");
        }
    }

    public String execute() {
        if (getUserId().equals("userId") && (getPassword().equals("password"))) {
            return SUCCESS;
        }
        return LOGIN;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
