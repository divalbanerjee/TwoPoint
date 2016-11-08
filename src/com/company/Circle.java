package com.company;

/**
 * Created by div on 10/31/2016.
 */
public class Circle {
    private LineSegment myRadius;

    public Circle(LineSegment myRadius) {
        this.myRadius = myRadius;
    }

    public LineSegment getMyRadius() {
        return myRadius;
    }

    public void setMyRadius(LineSegment myRadius) {
        this.myRadius = myRadius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "myRadius=" + myRadius +
                '}';
    }
}
