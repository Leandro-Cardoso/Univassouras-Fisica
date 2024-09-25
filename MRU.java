/*
    v = v0 + a * t
    s = s0 + v * t
    a = v / t
*/

public class MRU {
    double s0;
    double t;
    double v;
    double v0;
    double s;

    public MRU() {
        this.s0 = 0;
        this.t = 0;
        this.v = 0;
        this.v0 = 0;
        this.s = 0;
    }

    public void setS0(double s0) {
        this.s0 = s0;
    }

    public void setT(double t) {
        this.t = t;
    }

    public void setV(double v) {
        this.v = v;
    }

    public void setV0(double v0) {
        this.v0 = v0;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getV() {
        this.v = (this.s - this.s0) / this.t;
        return this.v;
    }

    public double getS() {
        this.s = this.s0 + this.v * this.t;
        return this.s;
    }

    public static void main(String[] args) {
        MRU mru = new MRU();

        mru.setS0(10);
        mru.setV(5);
        mru.setT(2);

        System.out.println("\n S = " + mru.getS());

        mru.setS0(1300);
        mru.setV(-56);
        mru.setT(10);

        System.out.println("\n S = " + mru.getS() + "\n");
    }
}
