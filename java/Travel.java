//A traveling salesman has to visit clients. He got each client's address e.g. "432 Main Long Road St. Louisville OH 43071" as a list.

//The basic zipcode format usually consists of two capital letters followed by a white space and five digits. The list of clients to visit was given as a string of all addresses, each separated from the others by a comma, e.g. :

//"123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432".

//To ease his travel he wants to group the list by zipcode.

//Task

//The function travel will take two parameters r (list of all clients' addresses) and zipcode and returns a string in the following format:

//zipcode:street and town,street and town,.../house number,house number,...

//The street numbers must be in the same order as the streets where they belong.

//If a given zipcode doesn't exist in the list of clients' addresses return "zipcode:/"

//Examples

//r = "123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432"

//travel(r, "OH 43071") --> "OH 43071:Main Street St. Louisville,Main Long Road St. Louisville/123,432"

//travel(r, "NY 56432") --> "NY 56432:High Street Pollocksville/786"

//travel(r, "NY 5643") --> "NY 5643:/" 

Solution:


import java.util.*;

public class Travel {
  
  private static ArrayList<String[]> splitInput;
  private static String zip;
  
    public static String travel(String r, String zipcode) 
    {
      if (zipcode == "") return ":/"; 
      else zip = zipcode;
      
      splitInput = new ArrayList<>();
      findZipCodes(r, zipcode);
      return stringify();      
    }
    
    public static void findZipCodes(String addresses, String zip)
    {
      for (String addr : addresses.split(",")) {
        if (addr.endsWith(zip)) {
          addToArray(addr);
        }
      }
    }
    
    public static void addToArray(String addr) 
    {
      String[] splitAddr = addr.substring(0, addr.length()-9).split(" ", 2);
      String[] splitAddr2 = {splitAddr[1], splitAddr[0]};
      splitInput.add( splitAddr2 );      
    }
        
    public static String stringify()
    {
      String tmpAddr = "";
      String tmpNum = "";
      
      for (String[] entry : splitInput) {
        if (tmpAddr != "" && tmpNum != ""){
          tmpAddr += ",";
          tmpNum += ",";
        }
        tmpAddr += entry[0];
        tmpNum += entry[1];
      }
      return zip + ":" + tmpAddr + "/" + tmpNum;
    }
}
