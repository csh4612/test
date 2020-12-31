package test25;

public class pr {
	public static void main(String[] args) {
		int size =0;
		String[] keys = new String [size];
		String[] velues = new String [size];
		
		size++;
		keys = new String[size+1];
		keys[size-1] ="이름";
						
		velues = new String[size+1];
		velues[size-1] = "홍길동";
		
		size++;
		String[] tmp = keys;
		keys = new String[size];
		for(int i=0; i<tmp.length;i++) {
			keys[i] = tmp[i];
		}
		
		keys[size-1] ="나이";
		
		tmp = velues;
		
		velues = new String[size];	
		velues = new String[size+1];
		for(int i=0; i<tmp.length;i++) {
			velues[i] = tmp[i];
		}
		velues[size-1] = "33";	


		System.out.println(keys[0] + " : " + velues[0]);
		System.out.println(keys[1] + " : " + velues[1]);
		
		
	}

}
