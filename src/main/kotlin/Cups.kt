import Util.chooseRandom

interface Cups : Dish {
    override fun getVolume(): Byte {
        // Cups have a 3 volume by default
        return 3
    }
    override fun canBePutInDishWasher(): Boolean {
        // Cups can always be washed in the dish washer
        return true
    }

    override fun getDishWasherSlot(): DishWasherSlot {
        return DishWasherSlot.TOP_SIDES
    }
    override fun getScrubbingTime(): Float {
        return when (this.dirtLevel) {
            in 0..2 -> 5f
            in 3..5 -> 8f
            else -> 8f
        }
    }
    override fun getWashingTime(): Float {
        return chooseRandom(3..5)
    }
}
data class GlassCup(override var dirtLevel: Byte) : Cups {
    override fun getMaterial(): Material {
        return Material.GLASS
    }
}
data class WineCup(override var dirtLevel: Byte) : Cups {
    override fun getMaterial(): Material {
        return Material.GLASS
    }
}
data class CeramicCup(override var dirtLevel: Byte) : Cups {
    override fun getMaterial(): Material {
        return Material.CERAMICS
    }
}
data class GiantCeramicCup(override var dirtLevel: Byte) : Cups {
    override fun getMaterial(): Material {
        return Material.CERAMICS
    }
    override fun getScrubbingTime(): Float {
        return when (this.dirtLevel) {
            in 0..2 -> 6f
            in 3..5 -> 9f
            else -> 8f
        }
    }
    override fun getWashingTime(): Float {
        return chooseRandom(4..6)
    }
}

