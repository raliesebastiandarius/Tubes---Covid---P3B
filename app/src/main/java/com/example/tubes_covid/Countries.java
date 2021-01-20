package com.example.tubes_covid;

public class Countries {
    private String nama;
    private String sembuh;
    private String meninggal;
    private String jumlahPos;

    public Countries(String nama, String jumlahPos, String sembuh, String meninggal) {
        this.nama = nama;
        this.sembuh = sembuh;
        this.meninggal = meninggal;
        this.jumlahPos = jumlahPos;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSembuh() {
        return sembuh;
    }

    public void setSembuh(String sembuh) {
        this.sembuh = sembuh;
    }

    public String getMeninggal() {
        return meninggal;
    }

    public void setMeninggal(String meninggal) {
        this.meninggal = meninggal;
    }

    public String getJumlahPos() {
        return jumlahPos;
    }

    public void setJumlahPos(String jumlahPos) {
        this.jumlahPos = jumlahPos;
    }
}

