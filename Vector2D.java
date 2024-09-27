public class Vector2D {
    double x;
    double y;

    public Vector2D(){
        this.x = 0;
        this.y = 0;
    }

    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getModule() {
        double hypotenuse = Math.hypot(this.getX(), this.getY());
        return Math.abs(hypotenuse);
    }

    public double getAngle() {
        double radians = Math.atan2(this.y, this.x);
        return radians * (180 / Math.PI);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String str() {
        return "\n Vetor: \n\tX: " + this.getX() + "\n\tY: " + this.getY() + "\n";
    }

    public void sum(Vector2D vector) {
        this.x += vector.getX();
        this.y += vector.getY();
    }

    public static void main(String[] args) {
        Vector2D vetor = new Vector2D(3, 4);
        System.out.println(vetor.str());
        System.out.println(" Modulo: " + vetor.getModule());
        System.out.println(" Ângulo: " + vetor.getAngle() + "\n");

        Vector2D vetor2 = new Vector2D(-3, -4);
        System.out.println(vetor2.str());
        System.out.println(" Modulo: " + vetor2.getModule());
        System.out.println(" Ângulo: " + vetor2.getAngle() + "\n");

        vetor.sum(vetor2);
        System.out.println(vetor.str());
        System.out.println(" Modulo: " + vetor.getModule());
        System.out.println(" Ângulo: " + vetor.getAngle() + "\n");
    }
}
