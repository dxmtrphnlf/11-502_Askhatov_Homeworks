public class Points {
    double x,y;
    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Points(){
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+");";
    }
}
