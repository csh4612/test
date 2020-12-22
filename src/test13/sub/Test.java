package test13.sub;
// public protected default private

public class Test {
	// 제일 밖의 접근제어자는 public, default만 가능!!
	// public은 어디서든 접근 가능, default는 같은 패키지 안에서만 접근가능
	
	void printSomething() {
		System.out.println("왜이리 시끄러운것이냐~!");
	}

}
