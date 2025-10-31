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
        assertEquals("Ma da ton tai roi", ex.getMessage());
    }






}
