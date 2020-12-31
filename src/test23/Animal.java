package test23;

public abstract class Animal {
	public abstract void borned();
	public void died() {
		System.out.println("죽음");		
	}
}

class Mamals extends Animal{
	@Override
	public void borned() {
		System.out.println("새끼로 태어남");
	}	
}

class Reptile extends Animal{
	public void borned() {
		System.out.println("알에서 태어남");
	}
} 