
public class Reversing_String {

	public static void main(String[] args) 
	{
		// Reversing a String
		String str= "Codoid_Innovations_Private",empty="";
        char ch;
        
      System.out.print("Orinal String to reverse : ");
      System.out.println("Codoid_Innovations_Private");
        
      for (int i=0; i<str.length(); i++)
      {
    	  //extracts each character
        ch= str.charAt(i);
      //adds each character in front of the existing string
        empty= ch+empty; 
      }
      System.out.println("After Reversing the word: "+ empty);
    }
	}


