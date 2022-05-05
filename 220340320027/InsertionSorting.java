class InsertionSorting{
	void insertionsort(int arr[]){
		int n=arr.length;
		for(int i=1; i<n; i++){
			int k=arr[i];
			int j=i-1;
			while(j>=0&& arr[j]>k){
				arr[j+1]=arr[j];
				j=j-1;
				}
						
			arr[j+1]=k;
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}
	void display(int arr[]){
		int n=arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int arr[]={1,2,4,5,3};
		//int arr[]={2,4,6,8,3};
		
		InsertionSorting IS1=new InsertionSorting();
		IS1.insertionsort(arr);
		IS1.display(arr);
	}
	}
