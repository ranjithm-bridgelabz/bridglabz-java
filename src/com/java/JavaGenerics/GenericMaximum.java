package com.java.JavaGenerics;

public class GenericMaximum<T extends Comparable<T>> {

    T x, y, z;

    // Refactor 2
    public GenericMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T testMaximum() {
        return MaximumFinder.testMaximum(x, y, z);
    }
}
