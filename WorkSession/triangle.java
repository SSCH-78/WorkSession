public class triangle extends Shape1{

    @Override
    public void area() {
        System.out.println("Area of triangle");
    }

    @Override
    public void perimeter() {
        System.out.println("perimeter of triangle");
    }

    public void nickName(){
        System.out.println("I have some nickname as well");
    }

    public static void main(String [] args){
        triangle t=new triangle();
        t.area();
        t.nickName();
        t.perimeter();

    }
}
