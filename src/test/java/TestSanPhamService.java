import org.example.SanPham;
import org.example.SanPhamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSanPhamService {
    private SanPhamService sanPhamService;

    @BeforeEach
    public void setUp() {
        sanPhamService = new SanPhamService();
    }

    @Test
    public void testThemSanPhamHopLe() {
        SanPham sanPham = new SanPham("SP1", "Ten1", 2025, 10.5f, 50, "DanhMuc1");
        sanPhamService.addSanPham(sanPham);
        assertEquals(1, sanPhamService.getList().size());
    }

    @Test
    public void testThemSanPhamKoHopLeTren() {
        SanPham sanPham = new SanPham("SP1", "Ten1", 2025, 10.5f, 101, "DanhMuc1");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> sanPhamService.addSanPham(sanPham));
        assertEquals("So Luong phai lon hon 1 va be hon 100", ex.getMessage());
    }

    @Test
    public void testThemSanPhamKoHopLeDuoi() {
        SanPham sanPham = new SanPham("SP1", "Ten1", 2025, 10.5f, -1, "DanhMuc1");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> sanPhamService.addSanPham(sanPham));
        assertEquals("So Luong phai lon hon 1 va be hon 100", ex.getMessage());
    }

    @Test
    public void testThemSanPhamHopLeTaiBienDuoi() {
        SanPham sanPham = new SanPham("SP1", "Ten1", 2025, 10.5f, 1, "DanhMuc1");
        sanPhamService.addSanPham(sanPham);
        assertEquals(1, sanPhamService.getList().size());
    }

    @Test
    public void testThemSanPhamHopLeTaiBienTren() {
        SanPham sanPham = new SanPham("SP1", "Ten1", 2025, 10.5f, 100, "DanhMuc1");
        sanPhamService.addSanPham(sanPham);
        assertEquals(1, sanPhamService.getList().size());
    }


    @Test
    public void testThemSanPhamKoHopLeMaTonTai() {
        SanPham sanPham = new SanPham("SP1", "Ten1", 2025, 10.5f, 100, "DanhMuc1");
        sanPhamService.addSanPham(sanPham);
        SanPham sanPhamKhac = new SanPham("SP1", "Ten1", 2025, 10.5f, 100, "DanhMuc1");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> sanPhamService.addSanPham(sanPhamKhac));
        assertEquals("Ma da ton tai", ex.getMessage());
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
