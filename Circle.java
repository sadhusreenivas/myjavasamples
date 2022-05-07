public class Circle{
	public double radius; // instance data

    public Circle(){
    	radius=1;
    }
    public Circle(double radius){ // local
    	this.radius=radius;
    }

    public double calcArea(){
    	double area=3.14*radius*radius;
    	return area;
    }
    public double calcCircumference(){
        double circumferenece=2*3.14*radius;
        return circumferenece;
    }

    public String toString(){ // java.lang.Object - toString()
    	String out="Circle: radius="+String.format("%.1f",radius);

        return out; // return a String
    }

    public static void main(String[] args) {
    	
    	Circle c1=new Circle(); // default cons
    	Circle c2=new Circle(5.22); // parameterized 
        Circle c3=new Circle(); // 1
        Circle c4=new Circle(7.33);//

    	System.out.println(c1); //c1.toString()
    	System.out.println(c2); //c2.toString()
    	System.out.println(c3); //c3.toString()
    	System.out.println(c4); //c4.toString()


    	System.out.println("Area: "+ c1.calcArea());
    	System.out.println("Area: "+ c2.calcArea());
    	
    	System.out.println("Cirumferenec: "+ c1.calcCircumference());
    	System.out.println("Cirumferenec: "+ c2.calcCircumference());
    	
    }

}