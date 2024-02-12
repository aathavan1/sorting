import java.util.*;
public class sorting{
	static int choice,size,n;	
	static int a[]=new int[30];
	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		//sortt obj=new sortt();
		long start=0,end=0;
		array();
		do{
			
			System.out.print("\n\n1.Selection sort\n\n2.Bubble sort\n\n3.insertion sort");
			System.out.print("\n\nEnter your choice:");
			choice=s.nextInt();
			start=System.nanoTime();
			switch(choice){
				case 1:
					selection_sort();
					break;
				case 2:
					bubble_sort();
					break;
				case 3:
					insertion_sort();
					break;
			}
			
		end=System.nanoTime();
		long execution_time=end-start;
		System.out.println("\n Execution time for this sorting is = "+execution_time);
		}while(choice<4);
		System.out.print("\n\n\t\t!!!!!!!!!!Thanks for your contribution with us!!!!!!!!");
	}
	static void array(){
		Scanner s=new Scanner(System.in);
			
		System.out.print("\nEnter the size of the array:");
		size=s.nextInt();
		n=size;
		System.out.print("\n\nEnter the elements of the array:");
		for(int i=0;i<size;i++){
			a[i]=s.nextInt();
		}
		System.out.print("\n\nThe array elements are: ");
		for(int i=0;i<size;i++){
			System.out.print(a[i]+" ");
		}
	}
	static void selection_sort(){
		int i,j;
		for(i=0;i<=n-1;i++){
		int min=i;
			for(j=i;j<=n-1;j++){
				if(a[min]>a[j]){
					min=j;
				}	
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		display();
	}
	static void bubble_sort(){
		int i,j;
		for(i=n-2;i>0;i--){
			for(j=0;j<i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		display();
		
	}
	static void insertion_sort(){
		int i,j;
		for(i=0;i<n;i++){
			j=i;
			while(j>0 && a[j-1]>a[j]){
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				j--;
			}
		}
		display();
	}
	/*static void swap(int m,int n){
		int temp=m;
		m=n;
		n=temp;
	}*/
	static void display(){
		System.out.print("The array elements are:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
		
			
	
}
/*public class sortt{
	void selection_sort(int a[],int n){
		int i,j;
		for(i=0;i<n;i++){
		min=i;
			for(j=0;j<i;j++){
				if(a[min]>a[j]){
					min=j;
				}	
			}
			swap(a[i],a[min]);
		}
		display(a[],n);
	}
	void bubble_sort(int a[],int n){
		int i,j;
		for(i=n-1;i>0;i++){
			for(j=0;j<i;j++){
				if(a[j]>a[j+1]){
					swap(a[j],a[j+1]);
				}
			}
		}
		display(a[],n);
		
	}
	void insertion_sort(int a[],int n){
		int i,j;
		for(i=0;i<n;i++){
			j=i;
			while(j>0 && a[j-1]>a[j]){
				swap(a[j],a[j-1]);
				j--;
			}
		}
		display(a[],n);
	}
	void swap(int m,int n){
		int temp=m;
		m=n;
		n=temp;
	}
	void display(int a[],int n){
		System.out.print("The array elements are:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}*/