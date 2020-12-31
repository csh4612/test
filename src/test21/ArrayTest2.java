package test21;

public class ArrayTest2 {
	
	
	
	public static void main(String[] args) {
		String[] strs = new String[0];
		strs = ArrayUtil.add(strs, "하나");
		strs = ArrayUtil.add(strs, "둘");
		strs = ArrayUtil.add(strs, "셋");
		strs = ArrayUtil.add(strs, "넷 ");
		
				
		ArrayUtil.printArray(strs);
		
	}
}
