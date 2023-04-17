public class Parallelepipedo {

        private double base;
        private double altezza;
        private double profondita;

        public Parallelepipedo(double base, double altezza, double profondita) {
            this.base = base;
            this.altezza = altezza;
            this.profondita = profondita;
        }

        public double calcVolume() {
            return base * altezza * profondita;
        }

        public void printVolume() {
            System.out.println("Volume del parallelepipedo: " + calcVolume());
        }
    }