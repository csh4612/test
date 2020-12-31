package test21;

public class ArrayTest3 {
	

	
	public static void main(String[] args) {
		double[] dbs = new double[0];
		dbs = ArrayUtil.add(dbs, 1.1);		
		dbs = ArrayUtil.add(dbs, 2.2);
		dbs = ArrayUtil.add(dbs, 3.3);
		dbs = ArrayUtil.add(dbs, 4.3);
		
		ArrayUtil.printArray(dbs);
		
	}

}
