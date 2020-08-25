enum class Material(canBePut: Boolean) {

    METAL(true),
    PLASTIC(true),
    GLASS(true),
    CERAMICS(true),

    WEAK_PLASTIC(false),
    WOOD(false),
    BAMBOO(false),


}
enum class DishWasherSlot(defaultSlotAmount: Byte) {

    //TODO get absolute volume

    TOP_MIDDLE(10), //bowls
    TOP_SIDES(10), // cups

    BOTTOM_PLATE(20), // plates
    BOTTOM_WIDER(9), // plates
    SILVERWARE(100), // silverware


}