class Darts {
    double x;
    double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        return circle(x, y, 1) ? 10 : circle(x, y, 5) ? 5 : circle(x, y, 10) ? 1 : 0;
    }

    boolean circle(double x, double y, double radius) {
        return Math.pow((Math.abs(x) - 0), 2) + Math.pow((Math.abs(y) - 0), 2) <= Math.pow(radius, 2);
    }
}

