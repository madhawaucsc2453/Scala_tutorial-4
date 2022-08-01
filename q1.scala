
object q1 extends App {
import scala.io.StdIn.readInt
  println("Input Deposit amount:");
var deposit = readInt();
def amount_interest(deposit:Double):Double=
  deposit match{
      case deposit if deposit <20000 => deposit*0.02 +deposit;
      case deposit if deposit <200000 => deposit*0.04 +deposit;
      case deposit if deposit <2000000 => deposit*0.035 +deposit;
      case deposit if deposit>=20000000=> deposit*0.02 +deposit;
    }

  println("Earns in a year:Rs."+amount_interest(deposit));
}