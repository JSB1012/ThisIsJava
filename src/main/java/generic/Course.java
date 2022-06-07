package generic;

/* 제네릭타입<?> : 타입 파라미터를 대치하는 구체적은 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
 * 
 * 제네릭타입<? extends 상위타입> : 타입 파라미터를 대치하는 구체적은 타입으로 상위 타입이나 하위 타입만 올 수 있다.
 * 
 * 제네릭타입<? super 하위타입> : 타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 상위타입이 올 수 있다.
 */
public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		
		//타입 파라미터로 배열을 생성하려면 new T[n]형태로 배열을 생성할 수 없고 (T[]) (new Object[n])으로 생성해야 한다.
		students =(T[]) (new Object[capacity]);
		
	}
	
	public String getName() {
		return name;
	}
	
	public T[] getStudents() {
		return students;
	}
	
	//배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

}
