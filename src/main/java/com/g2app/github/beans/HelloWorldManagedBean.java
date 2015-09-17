package com.g2app.github.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class HelloWorldManagedBean {

    private String value ="";

    public String getValue() {
        System.out.println("HelloWorldManagedBean :: getValue: " + value);

        return value;
    }

    public void setValue(String value) {
        System.out.println("HelloWorldManagedBean :: setValue: " + value);
        this.value = value;
    }
}
