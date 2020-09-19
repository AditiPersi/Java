class NewBean
{
    int bean_value;
    double bean_avg;
    String bean_name;
    
    NewBean()
    {
        this.bean_value = 1;
        this.bean_avg = 1.2;
        this.bean_name = "Cover";
    }
    
    public String toString(){
        System.out.format("This bean called %s is of value %d and average of %f",this.bean_name,this.bean_value,this.bean_avg);
        return "";
    }
}

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        NewBean bean = new NewBean();
        bean.toString();
        for(int x=0;x<5;x++)
        {
            System.out.println(x);
        }
        String palin ="Level";
        byte[] strAsByteArray = palin.getBytes();
        int str_len = strAsByteArray.length;
        byte[] rev = new byte[str_len];
        for(int i=str_len-1;i>=0;i--){
            rev[i] = strAsByteArray[str_len-i-1];
        }
        String result = new String(rev);
        if(result.equalsIgnoreCase(palin)){
            System.out.println("The word "+palin+" is palindrome");
        }
     }
}
