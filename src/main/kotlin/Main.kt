

fun main(args: Array<String>) {

    val inventoryManager = InventoryManager()
    val guitarFactory = GuitarFactory(inventoryManager)

    val baseSpecs = GuitarSpecs(
        BodyType.SolidBody,
        WoodType.Maple,
        PickupType.P90,
        NeckShape.CShape,
        FretSize.Medium,
        listOf(HardwareType.Tuners, HardwareType.Bridge),
        "Olympic white",
    )

    val stratModel = GuitarModel("TW61", baseSpecs)

    inventoryManager.updateInventoryForModel(stratModel, 2)

    val customGuitar = guitarFactory.createCustomGuitar(
        stratModel,
        GuitarSpecsBuilder()
            .withPickups(PickupType.SingleCoil)
    )

    customGuitar?.let {
        println("Custom guitar created with specs: \n" +
                "BodyType: ${it.bodyType}\n" +
                "Wood Type: ${it.woodType}\n" +
                "Pickups: ${it.pickups}\n" +
                "Neck Shape: ${it.neckShape}\n" +
                "Fret Size: ${it.fretSize}\n" +
                "Hardware: ${it.hardware.joinToString {  hardware -> hardware.toString() }}\n" +
                "Finish: ${it.finish}")
    }
}