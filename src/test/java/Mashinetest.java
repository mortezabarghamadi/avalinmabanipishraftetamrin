import org.junit.jupiter.api.Test;

public class Mashinetest {
    @Test
    void Mashin_dar_hal_harekat_ast() {


        class mashin {
            boolean ayaroshanast;
            boolean ayadarbazast;

            void roshan() {
                System.out.println("mashin roshan ast");
                ayaroshanast = true;
            }

            void khamosh() {
                System.out.println("mashin khamosh ast");
                ayaroshanast = false;
            }

            void bazkardan() {
                System.out.println("dar baz ast");
                ayadarbazast = true;
            }

            void bastandar() {
                System.out.println("dar baste ast");
                ayadarbazast = false;
            }

            void harekat() {
                if (!ayadarbazast && ayaroshanast) {
                    System.out.println("mashindar hal harkat ast");
                } else {
                    System.out.println("mashin park shode");
                }
            }
        }

    }
}