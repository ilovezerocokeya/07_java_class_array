package step7_01.classArray;

class Client{
	
	String name;
	int score;
	
	void setData (String name, int score) {  
		this.name = name ; 		// 멤버변수에 파라메타로 넘어온 데이터를 대입
		this.score = score;		// 멤버변수에 파라메타로 넘어온 데이터를 대입
	}
	
	void printData() {
		System.out.println(this.name  + " : " + this.score);
	}
	
}


public class ClassArrayEx05_연습 {

	public static void main(String[] args) {
		
		Client[] clientList = new Client[3];
		
		for (int i = 0; i < clientList.length; i++) {
			clientList[i] = new Client();
		}
		
		clientList[0].setData("김철수",100); 
		clientList[1].setData("이만수",20);
		clientList[2].setData("박영희",70);
		
		for (int i = 0 ; i < clientList.length; i++) {
			clientList[i].printData();
		}

	}

}
