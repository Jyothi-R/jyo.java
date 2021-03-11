public class CreateObjectExample3 implements Cloneable   
{   
@Override  
protected Object clone() throws CloneNotSupportedException   
{   
//invokes the clone() method of the super class      
return super.clone();   
}   
String str = "New Object Created";   
public static void main(String[] args)   
{  
//creating an object of the class     
CreateObjectExample3 obj1 = new CreateObjectExample3();   
//try catch block to catch the exception thrown by the method  
try  
{  
//creating a new object of the obj1 suing the clone() method  
CreateObjectExample3 obj2 = (CreateObjectExample3) obj1.clone();   
System.out.println(obj2.str);   
}   
catch (CloneNotSupportedException e)   
{   
e.printStackTrace();   
}   
}   
}  
