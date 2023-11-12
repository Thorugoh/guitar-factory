class GuitarFactory(private val inventoryManager: InventoryManager) {
    fun createCustomGuitar(model: GuitarModel, customSpecsBuilder: GuitarSpecsBuilder): GuitarSpecs? {
        if(inventoryManager.checkInventoryForModel(model)) {
            val finalSpecs = customSpecsBuilder
                .withBodyType(model.baseSpecs.bodyType)
                .withWoodType(model.baseSpecs.woodType)
                .withFretSize(model.baseSpecs.fretSize)
                .withHardware(model.baseSpecs.hardware)
                .withNeckShape(model.baseSpecs.neckShape)
                .withPickups(model.baseSpecs.pickups)
                .withFinish(model.baseSpecs.finish)
                .build()

            inventoryManager.updateInventoryForModel(model, -1);
            return finalSpecs
        }else{
            println("Insufficient inventory to build the guitar")
            return null;
        }
    }
}