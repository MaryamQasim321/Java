package BookPractice;

public class Rectangle {
    private double length;
    private  double width;
    public double calculatePerimeter(){
        return 2*(length+width);

    }
    public double calculateArea(){
        return length*width;

    }

    public void setLength(double length) {
        if(length>0.0&&length<20.0) {
            this.length = length;
        }
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if(width>0.0&&width<20.0){
        this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.setLength( 15 );
        rectangle.setWidth( 15 );

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
    }
}
