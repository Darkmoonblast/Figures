interface Transforming {
    fun resize(zoom: Int)
    fun rotate(direction: RotateDirection, centerX: Int, centerY: Int)
}

enum class RotateDirection {
    Clockwise, CounterClockwise
}

fun rotatePoint(px: Int, py: Int, cx: Int, cy: Int, direction: RotateDirection): Pair<Int, Int> =
    when (direction) {
        RotateDirection.Clockwise -> Pair(cx + (py - cy), cy - (px - cx))
        RotateDirection.CounterClockwise -> Pair(cx - (py - cy), cy + (px - cx))
    }
