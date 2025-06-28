public class checkTwoElement <T>{
    public static void main(String args[]){
        Integer[] arr = {12 , 23 , 34 , 45 , 66};
        Integer target1 = 34 ;
        Integer target2 = 66;
        checkTwoElement(arr , target1 , target2);

        
    }

    public static <T> void checkTwoElement(T[] arr , T target1 , T target2){
        for(int i =0 ; i<arr.length ; i++){
            if(arr[i] == target1 || arr[i] == target2){
                System.out.println(arr[i] +" " + "found at index" + " " + i );
            }
        }
    }
}
