import java.util.Scanner
import scala.util.{Failure, Success, Try}

object Main extends App{


  print("-- \t Combination of numbers \t -- \t Anwar Knyane \t - \t alvinaspowa@gmail.com" +
    "\n\nType an array of numbers using ',' after each number :\n")

  val input = Try(new Scanner(System.in).next())

  input match {
    case Success(a) => print(s"The possible combinations of are: \n"); combinationFunction(input)
    case Failure(ex) => print("Incorrect type, please enter a string like '1,2,3,4,5 ...'")
  }

  def combinationFunction(a: Try[String]) {
    val inputToList = ("""\d+""".r findAllIn a.get).toList
    print(inputToList.toSet[String].subsets.map(_.toList).toList)

  }
}