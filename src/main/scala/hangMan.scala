class hangMan {


  def wordingList(oname : String = "dictionaryWords.txt") : List[String] = {
    val origin = io.Source.fromFile( oname )
    val input : List[String] = origin.getLines.toList
    origin.close()
    input
  }

    def randomWord(diction : List[String]) : String = {
      diction( scala.util.Random.nextInt(diction.length) )
    }


  def wordDivide(diction : String) : List[Char] = {
    diction.toList
  }

  def wordTogether(dictionList : List[Char]) : String = {
    dictionList.mkString(" ")
  }


  def numberSet : Set[Char] = {
    ('A' to 'Z').toSet
  }



    def applyGuess(letter : Char, guesslist : List[Char], hanglist : List[Char]) : List[Char] = {
      guesslist.zip(hanglist).map({case(g,h) => if (letter == h) h else g})
  }

}
