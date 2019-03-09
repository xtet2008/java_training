public class Message
{
	public static void main(String[] args)
	{	
		if (args.length>0){
			if(args[0].equals("-h"))System.out.print("Hello£¬");
			else if(args[0].equals("-g"))System.out.print("Goodbye, ");
			for (String i:args)System.out.print(" " + i);
			System.out.println("!");
		}else
		{System.out.println("No argument found.");}
	}
}