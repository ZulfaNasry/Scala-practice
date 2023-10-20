object CeasarCipher extends App{

    println("\n\n\tchoice one! \n 1.Encryption\n 2.Decryption");
    var choice = scala.io.StdIn.readLine("choice: ").toInt
    
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + 26) % 26

    //encryption
    if(choice == 1)
    {
        val plainText = scala.io.StdIn.readLine("Secret Message: ")
        val secretText = plainText.map( (c: Char) => {

        val x = alphabet.indexOf(c)

        if (x == -1){
            c
        }
        else{
            alphabet((x + shift) % 26)
        }
        })
        println(secretText);
    }
    else{
    //decryption
    val secretText = scala.io.StdIn.readLine("Secret Message: ")
    val plainText = secretText.map( (c: Char) => {
    val x = alphabet.indexOf(c)
    if (x == -1){
        c
    }
    else{
        alphabet((x-shift) % 26)
    }
    })
    println(plainText);
    }
}