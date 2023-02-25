import org.junit.jupiter.api.Test;

public class Mashinetest {
    @Test
    void Mashin_dar_hal_harekat_ast() {
        Mashin mustang = new Mashin("mustang");
        mustang.bastandar();
        mustang.roshan();
        mustang.harekat();
    }
        class Mashin {
            boolean ayaroshanast;
            boolean ayadarbazast;
            String mark;
            Mashin(String mark){
                this.mark=mark;
            }
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
                    System.out.println("mashin  dar hal harkat ast");
                } else {
                    System.out.println("mashin park shode");
                }
            }
        }

    }