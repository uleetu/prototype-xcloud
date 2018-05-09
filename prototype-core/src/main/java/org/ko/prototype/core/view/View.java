package org.ko.prototype.core.view;


import org.ko.prototype.core.type.AppCode;

import java.io.Serializable;

public class View<T> implements Serializable {

    private String code;

    private String massage;

    private T model;

    public View() {
        this(AppCode.SUCCESS);
    }

    public View(AppCode appCode) {
        this.code = appCode.getCode();
        this.massage = appCode.getMessage();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}