import java.util.ArrayList;

public class FastJarvisMetod {
    public Points[] findContur(Points[] points) {
        Points[] result = new Points[100];
        double minX=points[0].getX();
        double maxX=points[0].getX();
        double s=0.00, underD=0.00, topD=0.00, A=0.00, B=0.00, C=0.00;
        double cc, aa;
        Points firstPoint=null, secondPoint=null, t, d, top=null, under=null;
        ArrayList<Points> upper = new ArrayList<Points>();
        ArrayList<Points> lower = new ArrayList<Points>();
        for (int i = 0; i < points.length; i++) {
            if (points[i].getX() < minX) {
                minX = points[i].getX();
                firstPoint = points[i];
                t = points[0];
                points[0] = firstPoint;
                points[i] = t;
            }
            if (points[i].getX() > maxX) {
                maxX = points[i].getX();
                secondPoint = points[i];
                d = points[1];
                points[1] = secondPoint;
                points[i] = d;
            }
        }
        for (int i = 0; i < points.length; i++) {
            if (points[i].getY() > (points[i].getX() - firstPoint.getX()) * (secondPoint.getY() - firstPoint.getY()) / (secondPoint.getX() - firstPoint.getX()) + firstPoint.getY()) {
                upper.add(points[i]);
            } else if (points[i].getY() < (points[i].getX() - firstPoint.getX()) * (secondPoint.getY() - firstPoint.getY()) / (secondPoint.getX() - firstPoint.getX()) + firstPoint.getY()) {
                lower.add(points[i]);
            }
        }
        A = (secondPoint.getY()-firstPoint.getY())/(secondPoint.getX()-firstPoint.getX());
        B = -1.00;
        C = firstPoint.getY() + (firstPoint.getX() * firstPoint.getY() - firstPoint.getX() * secondPoint.getY()) / (secondPoint.getX() - firstPoint.getX());
        underD=Math.abs(A * lower.get(0).getX() + B * lower.get(0).getY() + C) / Math.sqrt(A * A + B * B);
        for (int i = 0; i < lower.size(); i++) {
            if (underD <= Math.abs(A * lower.get(i).getX() + B * lower.get(i).getY() + C) / Math.sqrt(A * A + B * B)) {
                underD = Math.abs(A * lower.get(i).getX() + B * lower.get(i).getY() + C) / Math.sqrt(A * A + B * B);
                under = lower.get(i);
            }
        }
        topD=Math.abs(A * upper.get(0).getX() + B * upper.get(0).getY() + C) / Math.sqrt(A * A + B * B);
        for (int i = 0;i < upper.size(); i++) {
            if (topD <= Math.abs(A * upper.get(i).getX() + B * upper.get(i).getY() + C) / Math.sqrt(A * A + B * B)) {
                topD = Math.abs(A * upper.get(i).getX() + B * upper.get(i).getY() + C) / Math.sqrt(A * A + B * B);
                top = upper.get(i);
            }
        }
        int index=0;
        result[0] = firstPoint;
        result[1] = secondPoint;
        result[2] = top;
        result[3] = under;
        index=4;
        for (int i = 0; i < upper.size(); i++) {
            if (upper.get(i).getY()>((upper.get(i).getX())-firstPoint.getX())*(top.getY()-firstPoint.getY())/(top.getX()-firstPoint.getX())+firstPoint.getY() || (upper.get(i).getY()>((upper.get(i).getX())-secondPoint.getX())*(top.getY()-secondPoint.getY())/(top.getX()-secondPoint.getX())+secondPoint.getY())){
                result[index] = upper.get(i);
                index++;
            }
        }
        for (int i = 0; i < lower.size(); i++) {
            if (lower.get(i).getY()<((lower.get(i).getX())-firstPoint.getX())*(under.getY()-firstPoint.getY())/(under.getX()-firstPoint.getX())+firstPoint.getY() || (lower.get(i).getY()<((lower.get(i).getX())-secondPoint.getX())*(under.getY()-secondPoint.getY())/(under.getX()-secondPoint.getX())+secondPoint.getY())){
                result[index] = lower.get(i);
                index++;
            }
        }
        return result;
    }
}