public class Cilindro extends Volume {
        private double raggio;
        private double altezza;

        public Cilindro(double raggio, double altezza) {
            this.raggio = raggio;
            this.altezza = altezza;
        }
        public double calcVolume() {
            return Math.PI * Math.pow(raggio, 2) * altezza;
        }
        public void printVolume() {
            System.out.println("olume del cilindro: " + calcVolume());
        }

    }