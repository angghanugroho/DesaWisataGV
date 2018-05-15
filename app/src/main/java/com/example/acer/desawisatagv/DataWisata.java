package com.example.acer.desawisatagv;

/**
 * Created by Acer on 14/05/2018.
 */

public class DataWisata {
    private int dwImage;
    private String dwNama;
    private String dwLokasi;


public DataWisata(int dwImage, String dwNama, String dwLokasi){
    this.dwImage = dwImage;
    this.dwNama = dwNama;
    this.dwLokasi = dwLokasi;
    }

    public DataWisata(){
    }
    public int getDwImage() {return dwImage; }
    public void setDwImage(int dwImage) {this.dwImage = dwImage; }

    public String getDwNama() {return dwNama; }
    public void setDwNama(String dwNama) {this.dwNama = dwNama; }

    public String getDwLokasi() {return dwLokasi; }
    public void setDwLokasi(String dwLokasi) {this.dwLokasi = dwLokasi; }
}
