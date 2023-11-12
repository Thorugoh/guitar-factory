class FretSize(private val description: String){
    override fun toString() = description
    companion object {
        val Jumbo = FretSize("Jumbo")
        val Medium = FretSize("Medium")
        val Small = FretSize("Small")
    }
}