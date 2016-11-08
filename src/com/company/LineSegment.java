package com.company;

/**
 * Created by div on 11/1/2016.
 */
public class LineSegment {
    private Point myStartPoint;
    private Point myEndPoint;

    public LineSegment(Point myStartPoint, Point myEndPoint) {
        this.myStartPoint = myStartPoint;
        this.myEndPoint = myEndPoint;
    }

    public Point getMyStartPoint() {
        return myStartPoint;
    }

    public void setMyStartPoint(Point myStartPoint) {
        this.myStartPoint = myStartPoint;
    }

    public Point getMyEndPoint() {
        return myEndPoint;
    }

    public void setMyEndPoint(Point myEndPoint) {
        this.myEndPoint = myEndPoint;
    }

    public double findLength(){
        double Length = 0;
        Length = Math.sqrt(((myEndPoint.getMyX() - myStartPoint.getMyX())*(myEndPoint.getMyX() - myStartPoint.getMyX())) + ((myEndPoint.getMyY() - myStartPoint.getMyY())*(myEndPoint.getMyY() - myStartPoint.getMyY())));
        return Length;
    }

    @Override
    public String toString() {
        return "LineSegment{" +
                "myStartPoint=" + myStartPoint +
                ", myEndPoint=" + myEndPoint +
                '}';
    }
}
