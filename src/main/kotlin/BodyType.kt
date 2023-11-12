class BodyType(private val description: String){
    override fun toString() = description
    companion object {
        val SolidBody = BodyType("Solid")
        val SemiHollow  = BodyType("Semi-Hollow")
        val HollowBody = BodyType("Hollow")
    }
}

