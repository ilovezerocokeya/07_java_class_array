package step7_01.classArray;

import java.util.HashMap;

/*

	 # HashMap
	 
	- HashMap은 K(Key)에 V(Value)를 할당 방식으로 데이터가 저장하는 데이터 형식이다.
	- HashMap은 순서와 상관없이 key로 데이터를 저장 및 관리한다.
	- HashMap 생성방법
	
		HashMap<키, 값> 변수명 = new HashMap<키, 값>();
		HashMap<키, 값> 변수명 = new HashMap<>();						// new 뒤쪽의 generic은 생략 가능하다.
		
		Ex)
		 HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		 HashMap<String, Integer> hmap = new HashMap<>();				 
		 
		 설명)
		 HashMap<String,Integer> : key의 데이터타입은 String이고 저장될 값의 데이터 타입은 Integer이다.
		 HashMap<String,String>  : key의 데이터타입은 String이고 저장될 값의 데이터 타입은 String이다.
		 HashMap<String,Object>  : key의 데이터타입은 String이고 저장될 값의 데이터 타입은 Object이다.
		 HashMap<String,Product> : key의 데이터타입은 String이고 저장될 값의 데이터 타입은 Product이다.
		 HashMap<String,Member>  : key의 데이터타입은 String이고 저장될 값의 데이터 타입은 Member이다.


*/

public class ClassArrayEx15 {

	public static void main(String[] args) {

		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		//HashMap<String, Integer> hMap2 = new HashMap<>(); // new 뒤쪽의 generic은 생략가능
		
		// put(key, value) : HashMap의 key에 value를 할당한다. 
		// put()메서드는 존재하지 않는 key에 넣어주면 데이터가 입력되고 존재하는 key에 넣어주면 수정된다. 
		hMap.put("data1", 1000);
		hMap.put("data2", 2000);
		hMap.put("data3", 3000);
		System.out.println(hMap);
		System.out.println("\n======================\n");
		
		hMap.put("data1", 10000); // 데이터 수정
		hMap.put("data4", 4000);  // 데이터 추가 
		hMap.put("data5", 5000);  // 데이터 추가
		System.out.println(hMap);
		System.out.println("\n======================\n");
		
		// size() : HashMap의 데이터개수를 반환한다.
		System.out.println(hMap.size());
		System.out.println("\n======================\n");
		
		// get(key) : HashMap의 key에 할당된 value를 얻어온다.
		System.out.println(hMap.get("data1"));
		System.out.println(hMap.get("data2"));
		System.out.println(hMap.get("data3"));
		System.out.println(hMap.get("data4"));
		System.out.println(hMap.get("data5"));
		System.out.println("\n======================\n");
		
		// keySet() : HashMap의 key만 얻어온다.	
		System.out.println(hMap.keySet());
		
		for (String key : hMap.keySet()) {
			System.out.println(hMap.get(key));
		}
		System.out.println("\n======================\n");
		
		// remove(key) : HashMap의 key에 해당하는 값을 제거한다.
		hMap.remove("data2");
		hMap.remove("data3");
		System.out.println(hMap);
		
		hMap.clear(); // HashMap의 모든 데이터만 삭제
		hMap = null;  // HashMap자체를 삭제
		System.out.println("\n======================\n");
		
		// 웹에서 자주 사용하는 예시
		HashMap<String, Product> hMap2 = new HashMap<String, Product>();
		
		// 단순히 실습 데이터 생성
		for (int i = 1; i < 4; i++) {
			
			Product temp = new Product();
			temp.name = "상품" + i;
			temp.price = 10000 * i;
			
			hMap2.put(temp.name, temp);
			
		}
		
		System.out.println(hMap2.get("상품1"));
		System.out.println(hMap2.get("상품2"));
		System.out.println(hMap2.get("상품3"));
		System.out.println();
		
		System.out.println(hMap2.get("상품1").name + " / " + hMap2.get("상품1").price);
		System.out.println(hMap2.get("상품2").name + " / " + hMap2.get("상품2").price);
		System.out.println(hMap2.get("상품3").name + " / " + hMap2.get("상품3").price);
		System.out.println();
		
		// 하나의 Map에 다른 데이터의 타입을 저장하는 예시
		HashMap<String, Object> hMap3 = new HashMap<String, Object>();
		
		hMap3.put("키1", "문자열데이터");
		hMap3.put("키2", 1000);
		hMap3.put("키3", new Product());
		hMap3.put("키4", 3.141592);
		hMap3.put("키5", true);
		System.out.println(hMap3);
		
	}

}
