class HardwareType(private val description: String) {
    override fun toString() = description
    companion object {
        val Tuners = HardwareType("Tuners")
        val Bridge = HardwareType("Bridge")
        val Knobs = HardwareType("Knobs")
        val Switch = HardwareType("Switch")
    }
}