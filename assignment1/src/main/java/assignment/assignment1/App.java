package assignment.assignment1;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        TreeMap<String,String> result=new TreeMap<String,String>();
        
        result.put("machine learning","aaa");
        result.put("data science","bbb");
        result.put("c++","ccc");
        
        for(String key:result.keySet())
        {
        	System.out.println(key+"="+result.get(key));
        }
    }
}
