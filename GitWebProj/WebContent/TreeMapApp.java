package collection20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

/*
 * 
 * TreeMap:Map계열 컬렉션
 *         키값이 정렬된 상태로 저장되어 있음 (디폴트는 오름차순 정렬)
 *         HashMap보다는 성능이 떨어지나
 *         정렬된 키값으로 출력하고자 할때 유리..
 */
public class TreeMapApp {

	public static void main(String[] args) {
		/*
		※배열이나 컬렉션(List계열) 정렬하기
		배열 : Arrays.sort(배열)
		컬렉션:Collections.sort(List계열 컬렉션)
		단,배열의 타입 혹은 List계열 컬렉션에 저장된 객체의 타입은
		반드시 Comparable인터페이스를 상속받고 compareTo()를 오버라이딩 해야한다		
		 */
		String[] stringArray= {"홍길동","가길동","도길동","나길동"};
		//배열 정렬하기]
		Arrays.sort(stringArray);//원본 배열이 재배치 된다(in-place방식)
		System.out.println("[배열 정렬후 출력]");
		for(String ele : stringArray) System.out.println(ele);
		//Arrays.toString(): 배열을 문자열로 변경
		//System.out.println(Arrays.toString(stringArray));
		/* Arrays 의 메소드 
		 * public static int binarySearch(인자):
		 * binary search algorithm을 적용해서
		 * 배열의 요소를 찾는 메소드.반환값은 배열의 인덱스다 
		 */
		int searchIndex=Arrays.binarySearch(stringArray, "도길동");
		System.out.println("찾는 인덱스:"+searchIndex);
		searchIndex=Arrays.binarySearch(stringArray, "너길동");
		//가길동 나길동 도길동 홍길동
		//음수값의 의미:-는 찾지 못했다 즉 없다는 의미고 숫자는
		//           만약 삽입이된다면  오름차순 정렬상  위치를 의미한다(번째)
		System.out.println("찾는 인덱스:"+searchIndex);//-3
		
		
		List<Integer> list = Arrays.asList(200,150,35,1004);
		//출력]
		for(Integer e : list) System.out.println(e);
		//컬렉션 정렬하기]
		Collections.sort(list);
		System.out.println("[정렬후 출력]");
		for(Integer e : list) System.out.println(e);
		//컬렉션을 배열로 변환하기]
		Object[] objectArray=list.toArray();
		System.out.println("[컬렉션 정렬루 배열로 변환 한 후 출력]");
		System.out.println(Arrays.toString(objectArray));
		//트립맵 ]
		TreeMap map = new TreeMap();
		//객체 저장]
		map.put('ㄷ', "도길동");
		map.put('ㅎ', "하길동");
		map.put('ㅁ', "민길동");
		map.put('ㅂ', "바길동");
		map.put('ㄱ', "고길동");
		//출력-디폴트로 오름차순으로 정렬되어 있음
		System.out.println("[오름차순으로 출력]");
		Set keys=map.keySet();
		for(Object key:keys) {
			Object value=map.get(key);
			System.out.println(String.format("%s : %s",key,value));
		}
		System.out.println("[내림차순으로 출력]");
		keys=map.descendingKeySet();
		for(Object key:keys) {
			Object value=map.get(key);
			System.out.println(String.format("%s : %s",key,value));
		}
	}//////////main

}//////////////class
