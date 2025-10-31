import org.example.TongSoLe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTinhTongSoLe {
    private TongSoLe tongSoLe;

    @BeforeEach
    public void setUp() {
        tongSoLe = new TongSoLe();
    }

    @Test
    public void TestTinhTongSoLeHopLe() {
        Integer num = 9;
        assertEquals(16, tongSoLe.TinhTongSoLe(num));
    }

    @Test
    public void TestTinhTongSoLeKhongHopLeTren() {
        Integer num = 1001;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> tongSoLe.TinhTongSoLe(num));
        assertEquals("So Le phai tu 1 den 1000", ex.getMessage());
    }

    @Test
    public void TestTinhTongSoLeKhongHopLeDuoi() {
        Integer num = -1;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> tongSoLe.TinhTongSoLe(num));
        assertEquals("So Le phai tu 1 den 1000", ex.getMessage());
    }


    @Test
    public void TestTinhTongSoLeHopLeTaiBienTren() {
        Integer num = 1000;
        assertEquals(250000, tongSoLe.TinhTongSoLe(num));
    }

    @Test
    public void TestTinhTongSoLeHopLeTaiBienDuoi() {
        Integer num = 1;
        assertEquals(0, tongSoLe.TinhTongSoLe(num));
    }
Các bước CI/CD trên GitHub

B1: khởi tạo git
git init
git add .
git commit -m "Initial commit of project"
git branch -M main
git remote add origin <<link github>>
git push -u origin main

B2: Tạo CI
mkdir -p .github/workflows

B3: tao notepad
notepad .github/workflows/ci.yml

B4 : them cyml
name: Java CI

on:
  push:
    branches: [ "main" ]
  pull_request:
    branches: [ "main" ]
  workflow_dispatch:

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v4
      - name: Set up JDK 17
        uses: actions/setup-java@v4
        with:
          java-version: '17'
          distribution: 'temurin'
      - name: Build with Maven
        run: mvn -B package --file pom.xml
 B5 : commit
git add .
git commit -m"feat: Add Github Actions CI workflow for Java"
git push origin main



}
