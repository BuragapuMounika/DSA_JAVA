
public class StringCompression {
    public static void main(String args[]){
        
        StringBuilder compressed = new StringBuilder();
        String str="ssssnnbba";
        int count =1;

     for(int i=0;i<str.length()-1;i++){
        if( str.charAt(i)==str.charAt(i+1)){
            count++;

        }else{
            compressed.append(str.charAt(i));
            compressed.append(count);
            count=1;

        }

     }
    
    System.out.println(compressed.toString());
    
}

}