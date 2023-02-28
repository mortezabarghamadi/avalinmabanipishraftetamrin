import Khodro.Mashin;
import org.junit.jupiter.api.Test;

public class Mashinetest {
    @Test
    void Mashin_dar_hal_harekat_ast() {
        Mashin mustang = new Mashin("mustang");
        mustang.bastandar();
        mustang.roshan();
        mustang.harekat();
    }


    }