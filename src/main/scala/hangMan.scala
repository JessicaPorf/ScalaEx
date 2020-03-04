//notes from other sources



//class hangMan {
//
//  package
//
//  object bex {
//    def wordingList(oname: String = "dictionaryWords.txt"): List[String] = {
//      val origin = io.Source.fromFile(oname)
//      val input: List[String] = origin.getLines.toList
//      origin.close()
//      input
//    }
//
//    def randomWord(diction: List[String]): String = {
//      diction(scala.util.Random.nextInt(diction.length))
//    }
//
//
//    def wordDivide(diction: String): List[Char] = {
//      diction.toList
//    }
//
//    def wordTogether(dictionList: List[Char]): String = {
//      dictionList.mkString(" ")
//    }
//
//
//    def numberSet: Set[Char] = {
//      ('A' to 'Z').toSet
//    }
//
//
//    def applyGuess(letter: Char, guesslist: List[Char], hanglist: List[Char]): List[Char] = {
//      guesslist.zip(hanglist).map({ case (g, h) => if (letter == h) h else g })
//    }
//
//    object brexit extends App {
//      println("Your country want's to become a worldwide meme by spending years debating redebates")
//
//      val word = if (args.isEmpty) "meme" else args(0)
//      val newWord = bex.wordingList(word)
//
//      val numberSet : Set[Char] = bex.numberSet
//
//      val sum = "%s Wins : %2d Losses : %2d"
//      val input = "\t%s [Guesses left : %2d ] Letter : "
//
//      var bexit = false
//      var wins = 0
//      var losses = 0
//
//      var bnewgame = false
//      while (!bexit) {
//        println("Type 'Borris' to leave the game, 'Brexit' for a new game. ")
//
//        val brexitWord = bex.randomWord(newWord)
//        newWord = newWord.filterNot(_ == brexitWord)
//      }
//
//
//    }
//
//  }
//
//}