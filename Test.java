public class TestDemo{
public static void main(String[] args) {
		
      Rectangle r1=new Rectangle();
      r1.length=20;
      r1.width=25;
      r1.findArea(); // 

      Rectangle r2=new Rectangle();
      r2.length=10;
      r2.width=15;
      r2.findArea(); //0
    
      Circle c1=new Circle();
      c1.radius=7;
      c1.findArea();


      Circle c2=new Circle();
      c1.radius=10;
      c1.findArea();

	}

}