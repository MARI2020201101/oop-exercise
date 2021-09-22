package exercise3;

class MyPoint{
    int x;
    int y;

    MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    double getDistance(MyPoint myPoint2){
        return Math.sqrt(Math.pow((this.x- myPoint2.x),2) + Math.pow((this.y- myPoint2.y),2)) ;
    }

}


public class Exercise6 {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(1,1);
        System.out.println(myPoint.getDistance(new MyPoint(2,2)));
    }

    static double getDistance(int x, int y , int x1, int y1){
       return Math.sqrt(Math.pow((x-x1),2) + Math.pow((y-y1),2)) ;
    }
}
