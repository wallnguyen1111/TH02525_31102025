package org.example;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    public List<SanPham> list = new ArrayList<SanPham>();

    public List<SanPham> getList() {
        return list;
    }

    public SanPham sanPham = new SanPham("SP1", "Ten1", 2025, 10.5f, 50, "DanhMuc1");

    public void addSanPham(SanPham sanPham) {
        if (sanPham.getSoluong() < 1 || sanPham.getSoluong() > 100) {
            throw new IllegalArgumentException("So Luong phai lon hon 1 va be hon 100");
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa() == sanPham.getMa()) {
                throw new IllegalArgumentException("Ma da ton tai");
            }
        }
        list.add(sanPham);
    }
}
