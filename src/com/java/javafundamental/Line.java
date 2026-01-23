package com.java.javafundamental;

public class Line implements Comparable<Line> {

    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    private final Double length;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.length = calculateLength();
    }

    private double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public Double getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;
        Line other = (Line) obj;
        return this.length.equals(other.length);
    }

    @Override
    public int compareTo(Line other) {
        return this.length.compareTo(other.length);
    }
}
