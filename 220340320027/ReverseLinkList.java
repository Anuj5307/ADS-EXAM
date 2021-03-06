class ReverseLinkList{
	Node head;
	class Node{
		int data;
		Node next;
	  Node(int data){
		this.data=data;
		next=null;
	  }
	}
	public void addfirst(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void printlist(){
		if(head==null){
			System.out.print("Empty list");
		}
		Node p=null;
		Node currentNode=head;
		
		while(currentNode!=null){
			System.out.print(currentNode.data+"->");
			currentNode=currentNode.next;
		}
		 System.out.println("Reverse");
		while(p!=null){
			System.out.print(p.data+"<-");
			currentNode=p;
		}
	}
		public static void main(String[] args){
			ReverseLinkList RL=new ReverseLinkList();
			RL.addfirst(3);
			RL.addfirst(2);
			RL.addfirst(1);
			RL.printlist();
			
		}
}