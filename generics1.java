//Reverse String using Generic for Characters

public class generics1<T> {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("String before reverse :" + str);
        Character charArray[] = new Character[str.length()];
        for(int i = 0 ; i<str.length(); i++){
            charArray[i] = str.charAt(i);
        }

          revString(charArray);
    } 

    public static <T> void revString(T[] arr){
        int first = 0 ;
        int last = arr.length-1;
        while (first< last){
            T temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp ;
            first++;
            last--;
        }
        
           
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
