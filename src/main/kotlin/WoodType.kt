class WoodType(private val description: String){
    override fun toString() = description

    companion object {
        val Maple = WoodType("Maple")
        val Mahogany = WoodType("Mahogany")
        val RoseWood = WoodType("Rosewood")
    }
}
