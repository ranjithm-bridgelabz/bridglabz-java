package com.java.oops;

public class Line implements Comparable<Line> {

    private Point startPoint;
    private Point endPoint;
    private double length;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.length = calculateLength();
    }

    private double calculateLength() {
        return Math.sqrt(
                Math.pow(endPoint.getX() - startPoint.getX(), 2) +
                        Math.pow(endPoint.getY() - startPoint.getY(), 2)
        );
    }

    public double getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Line line = (Line) obj;
        return Double.compare(this.length, line.length) == 0;
    }

    @Override
    public int compareTo(Line line) {
        return Double.compare(this.length, line.length);
    }
}

