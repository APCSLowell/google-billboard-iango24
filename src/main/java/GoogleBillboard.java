public class GoogleBillboard {
  public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
  public static void main(final String[] args) {
    System.out.println("Not the right string, tests will fail!");
  }
  

  //Finish this function
  public boolean isPrime(string dNum){
    if (Double.parseDouble(dNum)<2)
      return false;
    for (int i=2; i<=Math.sqrt(Double.parseDouble(dNum)); i++){
      if (Double.parseDouble(dNum)%i==0)
        return false;
    }
    return true;
  }
}
