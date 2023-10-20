object Ceasar extends App{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
    val inputText = scala.io.StdIn.readLine("Secret Message: ")

    val outputText = inputText.map( (c: Char) => {
    //We find the c char in our allowed alphabet
    val x = alphabet.indexOf(c.toUpper)
    //If the c char is in our alphabet then we encrypt it
    //If it is not then we leave it be.
    if (x == -1){
        c
    }
    else{
        alphabet((x + shift) % alphabet.size)
    }
});
  println(outputText);

}