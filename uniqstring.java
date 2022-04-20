import java.util.*; // import the library for ArrayList and Collections.sort()
//initially tried: alphabet = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"];

class Main {
  public static void main(String[] args) {
    uniqstring("tan't");
  }

  //returns true if is uniq, returns false if not
  public static void uniqstring(String word) {
    String result = word + " has all unique characters.";

    //construct array "contain" that lists the letters of the string; includes duplicates
    //uses an arraylist because I need to be able to each letter to it
    ArrayList<String> contain = new ArrayList<String>();
    for (int i = 0; i < word.length(); i++) {
      String letter= String.valueOf(word.charAt(i)).toLowerCase();
      contain.add(letter);
    }
    
    Collections.sort(contain);

    //find if there are dupes; if so exit()
    for (int i = 1; i < contain.size(); i++){
      //it's sorted, so compare adjacent letters to see if they're the same
      String ahead=contain.get(i);
      String behind=contain.get(i-1);
      if(ahead.equals(behind)){
        result= word + " does not have all unique characters.";
        break;
      }
    }
    System.out.println(result);
  }
}