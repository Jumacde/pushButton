package com.example.pushbutton.impl;

import com.example.pushbutton.ShowMessage;

public class ShowMessage_impl implements ShowMessage {
    private String text;

    public ShowMessage_impl() {
        clear();
    }

    @Override
    public void clear(){
        this.text = "0";
    }

    @Override
    public String getDisplay() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
