package org.example;

public class TongSoLe {
    public Integer TinhTongSoLe(Integer num) {
        if (num < 1 || num > 1000) {
            throw new IllegalArgumentException("So Le phai tu 1 den 1000");
        }
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
