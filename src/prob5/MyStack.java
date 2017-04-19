package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	public MyStack( int size ) {
		buffer = new String[size];
		top = -1;
	}

	public void push( String s ) {
		if(top==buffer.length-1){
			buffer = resize();
		}
		buffer[top+1] = s;
		top++;

	}

	public String pop() throws MyStackException {
		if(isEmpty()) { 
			throw new MyStackException("stack is empty");
		}else{
			String s = buffer[top];
			top--;
			return s;
		}

	}

	public boolean isEmpty() {
		return top==-1;
	}

	private String[] resize() {
		String[] myStack = new String[buffer.length+1];

		for(int i=0;i<buffer.length;i++){
			myStack[i] = buffer[i];
		}
		buffer = null;

		return myStack;

	}
}
