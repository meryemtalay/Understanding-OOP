package com.meryemtalay.oopproject;

public class encapsulation {
    private String isim;
    private String soyisim;
    private int yas;


    public encapsulation(String isim,String soyisim, int yas){
        this.isim=isim;
        this.soyisim=soyisim;
        this.yas=yas;

    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
