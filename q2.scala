
object q2 extends App {
  import scala.io.StdIn.readInt

  def patternmat(inp: Int): String = {
    inp match {
      case inp if inp<=0 =>"Zero/Negative";
      case inp if inp%2==0 =>"Even number";
      case inp if inp%2!=0 =>"Odd number";
    }


  }
  println("Enter the Number: ");
  var input=readInt();
  println(patternmat(input));

}
