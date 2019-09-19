public class Monome {

    private float coefficient;

    private int exposant;

    public Monome(float coefficient, int exposant)
            throws IllegalArgumentException {
        if (exposant < 0) {
            throw new IllegalArgumentException("exposant n�gatif");
        }
        this.coefficient = coefficient;
        this.exposant = exposant;
    }

    public float getCoefficient() {
        return this.coefficient;
    }
    public Monome diff�rence(Monome m) throws ArithmeticException {
        if (this.getExposant() != m.getExposant()) {
            throw new ArithmeticException(
                    "coefficient des deux mon�mes diff�rents");
        }

    public int getExposant() {
        return this.exposant;
    }

    public Monome somme(Monome m) throws ArithmeticException {
        if (this.getExposant() != m.getExposant()) {
            throw new ArithmeticException(
                    "coefficient des deux mon�mes diff�rents");
        }
        return new Monome(this.getCoefficient() + m.getCoefficient(),
                this.getExposant());
    }

    public Monome produit(Monome m) {
        return new Monome(this.getCoefficient() * m.getCoefficient(),
                this.getExposant() + m.getExposant());
    }

    public Monome d�riv�e() {
        if (this.getExposant() == 0) {
            return new Monome(0.0F, 0);
        } else {
            return new Monome(this.getCoefficient() * this.getExposant(),
                    this.getExposant() - 1);
        }
    }

    @Override
    public String toString() {
        if (this.estNul()) {
            return "0";
        }
        if (this.exposant == 0) {
            return "" + this.getCoefficient();
        }
        return "" + this.getCoefficient() + "xe" + this.getExposant();
    }

    public boolean estNul() {
        return this.getCoefficient() == 0;
    }

}
