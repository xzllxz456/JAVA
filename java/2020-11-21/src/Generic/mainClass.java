package Generic;

class mainClass {
	public static void main(String[] args) {
		/*
		 	Generic == template(형태)
		 			 : 자료형의 변수
		 			 : 같은 클래스에서 다양한 자료형을 사용하고 싶은 경우에 사용
		 			 : 어떤 오브젝트가 올지 모르기 때문에 사용, 나중에 자료형을 정함
		 */
		
		Box<Integer> box = new Box<Integer>(123);	// 일반 자료형 안됨 Wrapper Class만 가능
		System.out.println(box.getTemp() + 1);
		
		Box<String> str = new Box<String>("my world");
		System.out.println(str.getTemp());
		
		System.out.println(new Box<Integer>(321).getTemp());
		
//		Box<MyClass> box = new Box<MyClass>(123);
		
		BoxMap<Integer, String> bmap = new BoxMap<Integer, String>(1001, "hello");
		System.out.println(bmap.getKey());
		System.out.println(bmap.getValue());
		
		System.out.println("--------------------------------------");
//		BoxMap<String, Object> boxm = new BoxMap<String, Object>(1002, new myClass());
		BoxMap<String, Object> boxM = new BoxMap<String, Object>(new String("World"), new Integer(323));
		
		
		
		System.out.println(boxM.getKey());
		System.out.println(boxM.getValue());
	}
}

class Box<T>{
	
	
	T temp;

	public Box(T temp) {
		this.temp = temp;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
	
	
}

class BoxMap<Key, Value>{	// HashMap
	Key key;
	Value value;
	
	public BoxMap(Key key, Value value) {
		this.key = key;
		this.value = value;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {	// 중복사용 가능
		this.value = value;
	}
	
	public void mathod() {
//		int result;
		Key result;
//		result = key+ value;	//안됨
//		if(key instanceof Integer) {
//			
//		}
	}
	
}