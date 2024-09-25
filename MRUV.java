/*
    s = s0 + v0 * t + (a * t ** 2) / 2
    v = v0 + a * t
    V^2 = V0^2 + 2 * a * s
*/

public class MRUV {
    double s0;
    double t;
    double v;
    double v0;
    double a;
    double s;

    public MRUV() {
        this.s0 = 0;
        this.t = 0;
        this.v = 0;
        this.v0 = 0;
        this.a = 0;
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
        this.v = this.v0 + this.a * this.t;
        return this.v;
    }

    // V^2 = V0^2 + 2 * a * s

    public double getA() {
        this.a = this.v / this.t;
        return this.a;
    }

    public double getS() {
        if (this.t >= 0) {
            this.s = this.s0 + this.v0 * this.t + (this.a * this.t * this.t) / 2;
        }
        else {
            this.t = 0;
        }
        return this.s;
    }
    
    public static void main(String[] args) {
        MRUV mruv = new MRUV();

        mruv.setV0(15);
        mruv.setS(40);
        mruv.setT(5);

        System.out.println("\n V = " + mruv.getV() + "\n");
        System.out.println(mruv.t + "   " + mruv.v);
    }
}
