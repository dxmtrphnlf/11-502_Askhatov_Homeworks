public class Points {
    int x,y;
    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Points(){
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
}
