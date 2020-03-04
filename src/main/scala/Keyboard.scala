
//notes from other sources
//import java.io.IOException
//import java.nio.file.Files
//import java.util
//import scala.collection.JavaConversions.
//
//class BrokenKeyboard {
//
//  object BrokenKeyboard {
//    val filePath = "enable1.txt"
//
//
//
//    var dictArray: Nothing = Null
//    var found = ""
//    var keys: Array[String] = Array[String]("edcf", "bnik", "poil", "vybu")
//    var foundArray = new util.ArrayList[String]
//
//    def main(args: Array[String]): Unit = {
//      val dictFile = new Nothing(filePath)
//      try dictArray = Files.readAllLines(dictFile.toPath)
//      catch {
//        case e: IOException =>
//          e.printStackTrace()
//      }
//      for (key <- keys) {
//
//        for (words <- dictArray) {
//          var temp = words
//          val charArray = key.toCharArray
//          for (chars <- charArray) {
//            temp = temp replace(Character.toString(chars), "")
//          }
//          if (temp ==("")) if (found.length < words.length) found = words
//        }
//        foundArray.add(found)
//        found = ""
//      }
//      System.out.println(foundArray)
//    }
//  }
//}
