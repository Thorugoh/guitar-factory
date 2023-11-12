class InventoryManager {
    private val guitarInventory = mutableMapOf<GuitarModel, Int>()

    fun checkInventoryForModel(model: GuitarModel): Boolean {
        return guitarInventory[model] ?: 0 > 0;
    }

    fun updateInventoryForModel(model: GuitarModel, quantity: Int) {
        guitarInventory[model] = guitarInventory.getOrDefault(model, 0) + quantity;
    }
}