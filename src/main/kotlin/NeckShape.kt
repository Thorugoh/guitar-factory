class NeckShape(private val description: String) {
    override fun toString() = description
    companion object {
        val CShape = NeckShape("C")
        val VShape = NeckShape("V")
        val DShape = NeckShape("D")
    }
}