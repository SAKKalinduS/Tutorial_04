import scala.io.StdIn
object T4Q2 {
  def main(args: Array[String]): Unit = {

    println("Enter the number: ")
    val input = StdIn.readInt()

    val msg = input match {
      case n if n <= 0 => "Negative/Zero is input"
      case n if n%2 == 0 => "Even number is given"
      case n => "Odd number is given"
    }

    println(msg)
  }

}
