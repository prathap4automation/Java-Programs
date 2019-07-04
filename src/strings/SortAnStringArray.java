package strings;

public class SortAnStringArray {

	public static void main(String[] args) {
		String[] strArr= {"prathap","kishore","pradeep","kumar","sai"};
		String temp="";
		//before sorting
		System.out.println("Before sorting:");
		System.out.println(String.join(", ", strArr));
		//after sorting
		System.out.println("After sorting:");
		for(int i=1;i<strArr.length;i++) {
			for(int j=i;j>0;j--) {
				if(strArr[j].compareTo(strArr[j-1])<0) {
					temp=strArr[j];
					strArr[j]=strArr[j-1];
					strArr[j-1]=temp;
				}
			}
		}
		System.out.println(String.join(", ", strArr));
		
	}

}
