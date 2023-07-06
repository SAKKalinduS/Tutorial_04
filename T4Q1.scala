import scala.io.StdIn

object T4Q1 {
  def main(args: Array[String]): Unit = {
    println("Enter the deposit amount: ")
    var deposit = StdIn.readDouble()
    var interest = findinterest(deposit)
    println("Interest = "+interest)
  }

  def findinterest(deposit: Double): Double = {
    var Intrest = deposit match {
      case x if x <= 20000 => x * 0.02
      case x if x <= 200000 => x * 0.04
      case x if x <= 2000000 => x * 0.035
      case _ => deposit * 0.065

    }
    Intrest
  }

}
