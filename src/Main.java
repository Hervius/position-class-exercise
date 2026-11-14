public class Main {

    public static void main(String[] args) {
        Position p1 = new Position(10, 10);
        Position p2 = new Position(12, 18);
        Position p3 = new Position(17, 16);
        Position p4 = new Position(14, 8);
        Position p5 = new Position(12, 7);

        Position [] pArray = {p1,p2,p3,p4,p5};

        double X = 0.0;
        double Y = 0.0;

        double Xpunkt = 0.0;
        double Ypunkt = 0.0;

        for(Position p : pArray){
            X += p.getX();
            Y += p.getY();
        }

        Xpunkt = X / pArray.length;
        Ypunkt = Y / pArray.length;

        System.out.println("Schwerpunktsberechnung -> X: " + Xpunkt + " Y: " + Ypunkt);
        

        double umfang = 0.0;
        for(int i = 0; i < pArray.length - 1; i++){
            umfang +=  pArray[i].distance(pArray[i+1]);
        }

        // Um den Umfang eines geschlossenen Polygons zu erhalten,
        // musst du die Lücke zwischen dem letzten und dem ersten Punkt schließen: p5 -> p1
        umfang += pArray[pArray.length - 1].distance(pArray[0]);
        // pArray.length - 1 ist der Index des letzten Elements, pArray[0] ist der erste Punkt

        System.out.println("Umfang: " + umfang);

    }

}