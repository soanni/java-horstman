class Stack{
	int stck[] = new int[10];
	int tos;

	Stack(){
		tos = -1;
	}

	void push(int item){
		if(tos == 9) 
			System.out.println("Stack is full");
		else
			stck[++tos] = item;
	}

	int pop(){
		if(tos == -1){
			System.out.println("Stack is empty");
			return 0;
		}else{
			return stck[tos--];
		}
	}
}

class TestStack{
	public static void main(String args[]){
		Stack myStack1 = new Stack();
		for(int i = 0; i < 10; i++){
			myStack1.push(i);
		}

		System.out.println("Stack contents: ");
		for(int i = 0; i < 10; i++){
			System.out.println(myStack1.pop());		
		}
	}
}