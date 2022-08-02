package ArryLIstEg;

import java.util.ArrayList;
import java.util.Arrays;

import ArryLIstEg.Interface.Animal;

public class AryList {

	public static void main(String[] args) {
		//Interface is calling
		
		InterfaceImp II = new InterfaceImp();
		II.eat();
		II.travel();
		II.getCallInterface();
		
		//declare ArrayList
		
		ArrayList<String> cityname = new ArrayList<>();
		cityname.add("Vijaywada");
		cityname.add("Banglore");
		cityname.add("Hyderabad");
		cityname.add("Chennai");
		cityname.add("Guntor");	
		
		int count = cityname.size();
		System.out.println(count);
		System.out.println(cityname.get(0));
		
		for(int i=0;i<=count;i++){
		System.out.println("inside loop........");
		String name = cityname.get(i);
		System.out.println(name);
		
		
		//display multiplication table of 5
		for(int j=0;j<=10;j++){
			int rescount = 5*j;
			System.out.println(5  +"x"+j+ "= "+rescount);
		}
		
		//count no.of digits
		int C = 23456;
		String res = Integer.toString(C);
		System.out.println(res.length());
		
		//find length of string
		String str = "Welcome";
		String str1 = "To Java";
		String str2  ="   Yogita    ";
		
		System.out.println(str.length()); //find length of string
		System.out.println(str.concat(str1)); //concat 2 strings
		System.out.println(str2.trim()); //remove spaces
		
		System.out.println(str.charAt(3)); //  return a charactor based on index num
		
		System.out.println(str.contains("Wel")); // string present or not
		
		System.out.println(str.contains("Wel"));
		
		System.out.println(str.replace('e','a'));
		
		System.out.println(str.replace("Welcome","Explain"));
		int sortarrdecending[] = {10,20,30,40,50};
		int lengthsort = sortarrdecending.length;
		for(int k=lengthsort-1;k>=0;k--){
			System.out.print("sorting array in decending order "+sortarrdecending[k] + " ");  
		}
		//calculate sum values from an array
		
		int arr[] = {10,60,70,90,30,10,30,40,50};
		 Arrays.sort(arr);//sorting array in asending
		 Arrays.sort(arr);
		 int length = arr.length;
		 System.out.println("sorting an arry in asending order = "+length);
		 length = removeDupArr(arr,length);
		 System.out.println("remove duplicate array list "+length);
		 
		int sum = arr[1]+arr[3];
		System.out.println("count sum of array value ="+sum);
		
		for(int a:arr){
			if(a == 10){
				System.out.println("number present in an array "+true);
			}
			else{
				System.out.println("number present in an array "+false);
			}
		}

	}

	}
	public static int removeDupArr(int arr[],int n){
		if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
		
	}
}



