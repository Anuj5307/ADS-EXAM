class Stack{
	private int max;
	private long A1[];
	private int top;
	Stack(int max){
		top=-1;
		max=10;
		A1=new long[max];
	}
	public void push(long d){
		if(top>max-1){
			System.out.println("under flow");
		}
		else{
		A1[++top]=d;
		System.out.println(d+"push element");
		}
	}
	public int pop(){
		if(top<0){
			System.out.println("under flow");
		return 0;
		}
		else{
			int x=A1[top--];
		return x;
	     }
	}
	public void display(){
		for(int i=0;i<top;i++){
			System.out.println(A1[i]);
		}
	}
	public static void main(String args[]){
		Stack s1=new Stack();
		s1.push(5);
		
		s1.push(11);
		s1.pop();
	}
}