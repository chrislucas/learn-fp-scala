import java.io.PrintWriter


class IO


object IO {
  def main(args: Array[String]) {
    //printf("%d", 10)
    
    val buffer = Console.in
    val n = buffer.readLine()
    
    val out = new PrintWriter(Console.out, false)
    out.printf("%s", n.toString())
    
  }
}