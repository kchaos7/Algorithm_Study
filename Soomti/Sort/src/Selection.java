import java.util.Arrays;

public class Selection 
{
	public static void main(String[] args) 
	{
		
		int[] array = new int[]{2,5,1,4,3};
		// Selection.sort_1(array);
		Selection.sort_2(array);
		
		System.out.println("Result="+Arrays.toString(array));
	}

	
	//2차 Code 인터넷 보고 다시 손으로 그려보면서 해봄 
	//index만 비교후 하는 촋 코드를 보고 손으로 그리고 이해 
	//내일 지우고 다시 코드해보기 2017.01.10
	public static void sort_2(int[] arr)
	{

		int index;		//swap 할 index 
			
		for(int i=0;i<arr.length-1;i++)
		{
			//돌릴때마다 정렬 전 값 초기
			index = i; 
			
			for(int j=i+1; j<arr.length; j++)
			{
				//최소값이 나올 경우, 그 최솟값과 비교해야 되기 때문 인덱스 변경
				if(arr[index]>arr[j]) 
				{
					index = j;				
				}
			}
		
			int tmp = arr[index];	
			arr[index]=arr[i];
			arr[i] = tmp;	
		}
		
	}
	//1차 Test Code
	//느낀점&고치고싶었던점
	//1. 엉엉 난 개발 찌질이
	//2. Boolean ok 사용안하고 코딩하고싶다.
	//3. 더 간단히 하는 방법이 있을텐데 생각이 안남...
	public static void sort_1(int[] array)
	{

		int min = array[0];	//최소 값을 저장하고 있을변수	
		int index = 0;		//swap 할 index 
		boolean ok = false; //swap 할지 말지 flag 변
		
		//n-1번 반
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i; j<array.length-1;j++)
			{
				if(min>array[j+1])
				{
					min = array[j+1];
					index = j+1;
					ok =true;				
				}
			}
			//ok가 아닐시 건너뛴다. 
			if(ok)
			{
				int tmp = array[i];	
				array[i]=array[index];
				array[index] = tmp;	
				
				min= array[i+1]; 
				
				ok = false;
			}
		}
		
	}
}
