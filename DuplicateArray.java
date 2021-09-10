package weekone.day2.Assignment;

public class DuplicateArray {

	public static void main(String[] args) {
		//Array declaration
        int arr[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
 
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
 
              //if value is equal 
              if(arr[i] == arr[j]) {
                 //print the duplicate element
                 System.out.println(arr[i]);
              }
          }
       }

	}

}
