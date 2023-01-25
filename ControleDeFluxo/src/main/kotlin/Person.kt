
internal class Person {
    fun age(): Int = 22

    fun checkLetter(name : String, prefix : String) : Boolean{
        return name.startsWith(prefix)
    }
    fun boolTest(name: String) : Boolean{
        return if(name == "amanda") true else false
    }

    fun tryException() : Boolean{
        val success = try{
            kotlin.io.path.createTempFile("sd")
            true
        }catch (e : Exception){
            false
        }
        return success
    }

}