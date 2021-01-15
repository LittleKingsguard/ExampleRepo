package first;

public class DemoJar
{ 
    public static void main(String args[]) throws Exception 
    {
	Calculator c=new Calculator();
	int n1=Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[1]);
	System.out.println("Add Result : "+c.add(n1,n2));
}
}