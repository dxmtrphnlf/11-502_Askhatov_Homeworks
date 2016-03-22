public class Main {
    public static void main(String[] args) {
        Points[] pointsArray = new Points[7];
        Points[] contur = new Points[7];
        Points contur0;
        int d = 0;
        contur0=contur[0];
        pointsArray = new Points[13];
        pointsArray[0] = new Points(3, 4);
        pointsArray[1] = new Points(8, 6);
        pointsArray[2] = new Points(6, 2);
        pointsArray[3] = new Points(7, 5);
        pointsArray[4] = new Points(2, 6);
        pointsArray[5] = new Points(5, 2);
        pointsArray[6] = new Points(13, 4);
        pointsArray[7] = new Points(0, 6);
        pointsArray[8] = new Points(4, 2);
        pointsArray[9] = new Points(8, 8);
        pointsArray[10] = new Points(2, 9);
        pointsArray[11] = new Points(10, 1);
        pointsArray[12] = new Points(6, 0);
        FastJarvisMetod s = new FastJarvisMetod();
        contur = s.findContur(pointsArray);
//        while(contur[d]!=contur[0]) {
//            System.out.println(contur[d-1]);
//        }
        while (contur[d]!=null) {
            System.out.println(contur[d]);
            d++;
        }
    }
}