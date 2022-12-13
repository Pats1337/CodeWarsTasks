package bouncingBalls

interface Bouncing {

    fun bouncingBall(): Int

    class Base(
        private val h: Double,
        private val bounce: Double,
        private val window: Double
    ) : Bouncing {
        override fun bouncingBall(): Int {
            if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h || window <= 0) {
                return -1
            }
            var count = 1
            var remainingHeight = h * bounce
            while (remainingHeight > window) {
                count += 2
                remainingHeight *= bounce
            }
            return count
        }
    }
}