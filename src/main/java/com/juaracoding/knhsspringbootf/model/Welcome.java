package com.juaracoding.knhsspringbootf.model;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 07/02/2023 21:03
@Last Modified 07/02/2023 21:03
Version 1.0
*/

import java.util.List;

public class Welcome {

    private String nama;
    private String alamat;
    private String jenisKelamin;

    private InnerWelcome welcomeDaleman;

    private List<InnerWelcome> listInnerWelcome;

    private String[] strArr;

    public String[] getStrArr() {
        return strArr;
    }

    public void setStrArr(String[] strArr) {
        this.strArr = strArr;
    }

    public List<InnerWelcome> getListInnerWelcome() {
        return listInnerWelcome;
    }

    public void setListInnerWelcome(List<InnerWelcome> listInnerWelcome) {
        this.listInnerWelcome = listInnerWelcome;
    }

    public InnerWelcome getWelcomeDaleman() {
        return welcomeDaleman;
    }

    public void setWelcomeDaleman(InnerWelcome welcomeDaleman) {
        this.welcomeDaleman = welcomeDaleman;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
