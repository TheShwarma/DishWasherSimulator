/**
 * Dirt level explanation: (| to show examples)
 * 1) Only needs simple water splashing | water
 * 2) Needs a bit scrubbing with your hand | some dust | small amount of flour
 * 3) Same as 2, but a bit longer | flour
 * 4) Needs soap slight scrubbing with a sponge | Spaghetti with tomato sauce
 * 5) Same as 4, but longer | Spaghetti with fettuccine sauce
 * 6) Needs actual scrubbing force applied | Dried pasta stuck to the floor of a pot
 * 7) 6, but longer | Burned pasta
 * 8) Force + a lot of soap required | Burned french fries
 * 9) Requires actual oil removers | A pot whose bottom is completely burned
 * 10) 9 but oh dear | A pot whose bottom is completely burned, 2cm deep and oiled as well
 */
interface Dish {

    fun getScrubbingTime(): Float // seconds

    fun getWashingTime(): Float // seconds

    var dirtLevel: Byte

    fun getVolume(): Byte // 1 - 10

    fun canBePutInDishWasher(): Boolean {
        // if the dirt level is bigger than 8, it can't be put in the dishwasher at all.
        return this.dirtLevel < 9
    }

    fun getMaterial(): Material

    fun getDishWasherSlot(): DishWasherSlot
}

