package shape;

public class Point {
    private double TungDo;
	private double HoanhDo;

	public Point( double x, double y) {
		TungDo = x;
		HoanhDo = y;
	}

	public void setX(double x) {
		TungDo = x;
	}

	public double getX() {
		return TungDo;
	}

	public void setY(double y) {
		HoanhDo = y;
	}

	public double getY() {
		return HoanhDo;
	}
	public double getLength(Point a, Point b){
		return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
	}
}