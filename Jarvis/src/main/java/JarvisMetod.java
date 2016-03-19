public class JarvisMetod {
    public Points[] findContur(Points[] points) {
        Points[] result = new Points[100];
        int minY = points[0].getY();
        Points firstPoint = null;
        Points t;
        for (int i = 0; i < 100; i++) {
            result[i] = null;
        }
        for (int i = 1; i < points.length; i++) {
            if (minY > points[i].getY()) {
                minY = points[i].getY();
                firstPoint = new Points(points[i].getX(), points[i].getY());
                t = points[0];
                points[0] = firstPoint;
                points[i] = t;
            }
        }
        for (int i = 0; i < points.length; i++) {
            if (points[i].getY() == firstPoint.getY())
                if (points[i].getX() < firstPoint.getX()) {
                    firstPoint = new Points(points[i].getX(), points[i].getY());
                    t = points[0];
                    points[0] = firstPoint;
                    points[i] = t;
                }
        }
        double minAngle = 0.00;
        Points secondPoint = null;
        minAngle = (points[1].getX() - points[0].getX()) / (Math.sqrt((points[1].getX() - points[0].getX()) * (points[1].getX() - points[0].getX()) + (points[1].getY() - points[0].getY()) * points[1].getY() - points[0].getY()));
        for (int i = 0; i < points.length; i++) {
//            if (points[i].getX() != firstPoint.getX() && points[i].getY() != firstPoint.getY())
                if (minAngle < (points[i].getX() - points[0].getX()) / (Math.sqrt((points[i].getX() - points[0].getX()) * (points[i].getX() - points[0].getX()) + (points[i].getY() - points[0].getY()) * points[i].getY() - points[0].getY()))) {
                    minAngle = (points[i].getX() - points[0].getX()) / (Math.sqrt((points[i].getX() - points[0].getX()) * (points[i].getX() - points[0].getX()) + (points[i].getY() - points[0].getY()) * points[i].getY() - points[0].getY()));
                    secondPoint = new Points(points[i].getX(), points[i].getY());
                    t = points[1];
                    points[1] = secondPoint;
                    points[i] = t;
                }
        }
        Points otherPoint = null;
        otherPoint = new Points(points[3].getX(), points[3].getY());
        Vectors vector1, vector2;
        double maxAngle = 0.00;
        vector1 = new Vectors(firstPoint.getX() - secondPoint.getX(), firstPoint.getY() - secondPoint.getY());
        vector2 = new Vectors(points[2].getX() - secondPoint.getX(), points[2].getY() - secondPoint.getY());
        maxAngle = vectorsAngle(vector1, vector2);
        result[0] = firstPoint;
        result[1] = secondPoint;
        int index = 2;
        while (otherPoint.getX() != points[0].getX() && otherPoint.getY() != points[0].getY()) {
            vector1 = new Vectors(firstPoint.getX() - secondPoint.getX(), firstPoint.getY() - secondPoint.getY());
            for (int i = 0; i < points.length; i++) {
                if (points[i].getX() != firstPoint.getX() && points[i].getY() != firstPoint.getY()) {
                    vector2 = new Vectors(points[i].getX() - secondPoint.getX(), points[i].getY() - secondPoint.getY());
                    if (maxAngle > vectorsAngle(vector1, vector2)) {
                        maxAngle = vectorsAngle(vector1, vector2);
                        otherPoint = new Points(points[i].getX(), points[i].getY());
                    }
                }
            }
            maxAngle = 2.00;
            result[index] = new Points(otherPoint.getX(), otherPoint.getY());
            firstPoint = secondPoint;
            secondPoint = otherPoint;
            index++;
        }
        result[index-1]=null;
        return result;
    }

    public double vectorsAngle(Vectors vector1, Vectors vector2) {
        double vectorAngle = 0.00;
        int scalar = 0;
        double moduleOP = 0.00;
        scalar = vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY();
        moduleOP = Math.sqrt(vector1.getX() * vector1.getX() + vector1.getY() * vector1.getY()) * Math.sqrt(vector2.getX() * vector2.getX() + vector2.getY() * vector2.getY());
        vectorAngle = scalar / moduleOP;
        return vectorAngle;
    }
}