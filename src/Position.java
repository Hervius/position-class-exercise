public class Position {
    private double  x;
    private double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString(){
        return x + "/" + y;
    }

    public boolean equals(Object o){
        Position other = (Position)o;
        if(other == null)
            return false;
        else
                return Double.compare(this.x, other.x) == 0 && Double.compare(this.y, other.y) == 0;

    }

    Position add(Position p){
        return new Position(x + p.x, y + p.y);
    }

    Position sub(Position p){
        return new Position(x - p.x, y - p.y);
    }

    Position add(double f){
        return new Position(x + f, y + f);
    }

    Position sub(double f){
        return new Position(x - f, y - f);
    }

    Position mul(double f){
        return new Position(x * f, y * f);
    }

    Position div(double f){
        return new Position(x / f, y / f);
    }

    double dot(Position p){
        return x * p.x + y * p.y;
    }

    double distance(Position p){
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }




}
