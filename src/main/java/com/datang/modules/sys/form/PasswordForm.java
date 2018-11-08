package com.datang.modules.sys.form;

/**
 * 密码表单
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
public class PasswordForm {
    /**
     * 原密码
     */
    private String password;
    /**
     * 新密码
     */
    private String newPassword;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
