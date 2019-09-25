package com.example.customcopy;

public class tp {
    private String ten;

    private String so;
    private int hinh;

    public tp(String ten, String so, int hinh) {
        this.ten = ten;
        this.so = so;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }
}
