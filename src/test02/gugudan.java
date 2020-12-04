package test02;

public class gugudan {
	public static void main (String[] args) {
	       int i = 9;
	 
	   for(;i<10;i--) {
	    System.out.println("======" + i +"단 =====");
	    
	    if(i<1) {
	    	   break;
	    }
	    else 
	      for(int o = 1; o <10; o++) {
	       System.out.println(i + "X" + o + "=" + i*o);
	    }
 }	 
}
}

