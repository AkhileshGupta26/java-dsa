package RECURSION.String;

public class PhoneKeypad {
    public static void main(String[] args) {
        pad("","12");
        
        
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        // up.charAt(0)    // need to convert in integer
        int digit=up.charAt(0)-'0';// convert '2'=>2

        // Run the loop
        //  Mapping
        for(int i=(digit-1)*3;i<= (digit*3)-1;i++){

            char ch=(char)('a'+i);
             
            pad(p+ch,up.substring(1));

        }
    }
    
}
