import kotlin.random.Random

object Util {

    fun chooseRandom(range: IntRange): Float {

        return Random.nextDouble(range.first.toDouble(), range.last.toDouble()).toFloat()
    }
    fun chooseRandom(start: Float, end: Float): Float {
        return Random.nextDouble(start.toDouble(), end.toDouble()).toFloat()
    }
}