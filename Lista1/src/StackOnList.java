import java.util.ArrayList;


public class StackOnList<T> {
	
	private ArrayList<T> list = new ArrayList<T>();


	public void push(T value) {
		list.add(value);
	}


	public T top() {
		int numberOfItemsOnList = list.size();
		
		return list.get(numberOfItemsOnList-1);
	}

  
	public void pop() {
		int numberOfItemsOnList = list.size();
		
		list.remove(numberOfItemsOnList-1);
	}

	
	public int max() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int liczbaelnastosie() {
		// TODO Auto-generated method stub
		return 0;
	}

}
