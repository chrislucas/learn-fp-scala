
import java.io._

object EraseFile {
  val files     = new File(".").listFiles()
  val extesions = List(".jpg", ".jpeg", ".gif", ".png")
  
  def erase(filename: String) = extesions.exists (filename.endsWith(_))
  
  files.filter { file => erase(file.getName) }.foreach { _.delete() }
}

