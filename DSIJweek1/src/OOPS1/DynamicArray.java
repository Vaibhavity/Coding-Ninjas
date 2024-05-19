package OOPS1;
public class DynamicArray {
	public int data[];
	public int nextindex;
	public DynamicArray(){
		data= new int[5];
		nextindex=0;
	}
	public int size()
	{
		return nextindex;
	}
	public void add(int element)
	{
		if(nextindex==data.length)
		{
			resize();
		}
		data[nextindex]=element;
		nextindex+=1;
	}
	private void resize()
	{
		int temp[]=data;
		data= new int[data.length*2];
		for(int i=0;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
	}
	public void addtoindex(int index, int element)
	{
		data[index]=element;
	}
}
