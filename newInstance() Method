public class CreateObjectExample4  
{   
void show()    
{    
System.out.println("A new object created.");    
}    
public static void main(String[] args)   
{   
try  
{  
//creating an instance of Class class  
Class cls = Class.forName("CreateObjectExample4");   
//creates an instance of the class using the newInstance() method  
CreateObjectExample4 obj = (CreateObjectExample4) cls.newInstance();   
//invoking the show() method  
obj.show();   
}   
catch (ClassNotFoundException e)   
{   
e.printStackTrace();   
}   
catch (InstantiationException e)   
{   
e.printStackTrace();   
}   
catch (IllegalAccessException e)   
{   
e.printStackTrace();   
}   
}   
}  
