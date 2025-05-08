package HW_4;

class Square {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public int area() {
        return side * side;
    }

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.printf("Площадь квадрата со стороной %d: %d\n", square.side, square.area());
    }
}