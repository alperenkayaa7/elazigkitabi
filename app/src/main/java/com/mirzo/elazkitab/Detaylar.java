package com.mirzo.elazkitab;

import java.io.Serializable;

public class Detaylar implements Serializable {
    String il ;
    String ilce;
    int image;
        public Detaylar (String il ,String ilce, int image){
        this.il = il;
        this.ilce = ilce;
        this.image = image;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
