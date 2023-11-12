class GuitarSpecsBuilder {
    private var bodyType: BodyType? = null
    private var woodType: WoodType? = null
    private var pickups: PickupType? = null
    private var neckShape: NeckShape? = null
    private var fretSize: FretSize? = null
    private var hardware: List<HardwareType>? = null
    private var finish: String? = null

    fun withBodyType(bodyType: BodyType) = apply { this.bodyType = bodyType }
    fun withWoodType(woodType: WoodType) = apply { this.woodType = woodType }
    fun withPickups(pickups: PickupType) = apply { this.pickups = pickups }
    fun withNeckShape(neckShape: NeckShape) = apply { this.neckShape = neckShape }
    fun withFretSize(fretSize: FretSize) = apply { this.fretSize = fretSize }
    fun withHardware(hardware: List<HardwareType>) = apply { this.hardware = hardware }
    fun withFinish(finish: String) = apply { this.finish = finish }

    fun build() = GuitarSpecs(
        bodyType ?: throw IllegalStateException("Body type not set"),
        woodType ?: throw IllegalStateException("Wood type not set"),
        pickups ?: throw IllegalStateException("Pickups not set"),
        neckShape ?: throw IllegalStateException("Neck shape not set"),
        fretSize ?: throw IllegalStateException("Fret size not set"),
        hardware ?: throw IllegalStateException("Hardware not set"),
        finish ?: throw  IllegalStateException("Finish not set")
    )
}