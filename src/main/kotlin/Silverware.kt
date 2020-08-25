import Util.chooseRandom

interface Silverware : Dish {
    override fun getVolume(): Byte {
        // Silverware take 1 volume by default
        return 1
    }

    override fun canBePutInDishWasher(): Boolean {
        // Silverware can always be washed in the dish washer
        return true
    }

    override fun getScrubbingTime(): Float {
        return when (this.dirtLevel) {
            in 0..3 -> 1.5f
            in 4..7 -> 2.5f
            in 8..10 -> 3.5f
            else -> 3.5f
        }
    }

    override fun getWashingTime(): Float {
        return chooseRandom(1..2)
    }

    override fun getMaterial(): Material {
        return Material.METAL
    }

    override fun getDishWasherSlot(): DishWasherSlot {
        return DishWasherSlot.SILVERWARE
    }
}

// Silverwares
data class Tablespoon(override var dirtLevel: Byte) : Silverware
data class Teaspoon(override var dirtLevel: Byte) : Silverware
data class Knife(override var dirtLevel: Byte) : Silverware
data class Fork(override var dirtLevel: Byte) : Silverware {
    override fun getScrubbingTime(): Float {
        // food tends to get stuck in the fork
        return super.getScrubbingTime() + 0.3f
    }
}
data class ServingSpoon(override var dirtLevel: Byte) : Silverware {
    // bigger than the usual spoon
    override fun getVolume(): Byte {
        return (super.getVolume() + 1).toByte()
    }
}