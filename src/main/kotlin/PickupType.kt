class PickupType(private val description: String) {
    override fun toString() = description
    companion object {
        val SingleCoil = PickupType("Single Coil")
        val Humbucker = PickupType("Humbucker")
        val P90 = PickupType("P90")
    }
}