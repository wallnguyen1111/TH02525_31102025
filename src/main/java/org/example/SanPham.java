package org.example;

public class SanPham {
    private String ma;
    private String ten;
    private Integer nambaohanh;
    private Float gia;
    private Integer soluong;
    private String danhmuc;

    public SanPham() {
    }

    public SanPham(String ma, String ten, Integer nambaohanh, Float gia, Integer soluong, String danhmuc) {
        this.ma = ma;
        this.ten = ten;
        this.nambaohanh = nambaohanh;
        this.gia = gia;
        this.soluong = soluong;
        this.danhmuc = danhmuc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getNambaohanh() {
        return nambaohanh;
    }

    public void setNambaohanh(Integer nambaohanh) {
        this.nambaohanh = nambaohanh;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public String getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(String danhmuc) {
        this.danhmuc = danhmuc;
    }
}
