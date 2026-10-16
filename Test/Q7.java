
class Shape{
    public void area(){
        return ;

    }
}
class Circle extends Shape{
    int r;
    public Circle(int r){
        this.r=r;

    }
    public void area(){
        System.out.println("Circle area"+" "+ (22/7)*r*r);
    }

}
class Rectangle extends Shape{
    int a;
    int b;
    public Rectangle(int a,int b){
        this.a=a;
        this.b=b;

    }
    public void area(){
        System.out.println("Rectangle area"+" "+ a*b);
    }

}
class Triangle extends Shape{
    int a;
    int b;
    public Triangle(int a,int b){
        this.a=a;
        this.b=b;
        

    }
    public void area(){
        System.out.println("Triangle area"+" "+0.5*a*b); 
    }

}

public class Q7 {
    public static void main(String[] args) {
        Shape s1= new Circle(7);
        s1.area();
        
        Shape s2=new Rectangle(5,4);
        s2.area();
        Shape s3=new Triangle(6,8);
        s3.area();
        


        
    
        
    }
    
}
