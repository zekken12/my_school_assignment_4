package project2;
public final class Vector implements Comparable<Vector> {
	private double a,b;
	
	Vector(double a, double b) {
     this.a =a;
     this.b = b;
 }
	// getter methods
	public double getA() {
     return a;
     
	}
	public double getB() {
     return b;
     }
	
	public String toString() {
     return this.getA()+"i"+" + "+this.getB()+"j";
     
	}
	
	@Override
	public boolean equals(Object ob) {
		if (ob == null) {
			return true;
		}
		
		
		if (!(ob instanceof Vector)) {
			return false;
		}
		
		Vector vector = (Vector) ob;
		if(this.getA() == vector.getB()) {
            return true;
    }
    else {
            return false;
         }
     }
	
	@Override
	public int hashCode() {
		return super.hashCode();
     
	}
	
	@Override
	public int compareTo(Vector v) {
     if(this.getA() == v.getA()) {
         if(this.getB() > v.getB() ){
             return 1;
         }
         else {
             return -1;
         }
     }
     
     else {
         return 0;
     }
 }
 public static void main(String[] args) {

     Vector vect1 = new Vector(2,1);
     Vector vect2 = new Vector(2,3);

     System.out.println(vect1);
     System.out.println(vect2);
     System.out.println(vect1.compareTo(vect2));
 }

}

 

