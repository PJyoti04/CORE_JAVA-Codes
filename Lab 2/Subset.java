class Subset{
	void printSubsets(int set[]){
		int n=set.length;
		//print current subset
		for(int i=0;i<(1<<n);i++)
		{
			System.out.print("{");
			for(int j=0;j<n;j++)
			{
				if((i & (1<<j))>0)
					System.out.print(set[j] + " ");
			}
			System.out.println("}");
		}
	}
}
class Driver{
	public static void main(String args[]){
	int set[]={2,3,4,-6};
		Subset ob=new Subset();
		ob.printSubsets(set);
	}
}