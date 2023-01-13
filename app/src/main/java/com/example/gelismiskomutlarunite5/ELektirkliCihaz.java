package com.example.gelismiskomutlarunite5;

public class ELektirkliCihaz{
    public String cihazAdi;
    public int cihazKW;
    public int gunluksaaatkullanim;
    public int aylikkullanim () {
        int aylikKullanim = cihazKW * gunluksaaatkullanim * 30;
        return aylikKullanim;
    }


}
