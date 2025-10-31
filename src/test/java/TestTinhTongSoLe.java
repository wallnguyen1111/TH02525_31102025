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
}
