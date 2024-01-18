public class GoogleBillboard {
  public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
  public static void main(final String[] args) {
    for (int i=2;i<e.length()-10;i++){
      double ddNum = Double.parseDouble(e.substring(i,i+10));
      if (isPrime(ddNum)==true){
        System.out.println(ddNum);
        break;
      }
    }
 }
}
  

  //Finish this function
  public boolean isPrime(double dNum){
    if (dNum<2)
      return false;
    for (int i=2; i<=Math.sqrt(dNum); i++){
      if (dNum%i==0)
        return false;
    }
    return true;
  }

