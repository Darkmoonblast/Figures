class Square(var x: Int, var y: Int, var side: Int) : Movable, Transforming, Figure(1) {

    override fun area(): Float = (side * side).toFloat()

    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun resize(zoom: Int) {
        side *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val (ax, ay) = rotatePoint(x, y, centerX, centerY, direction)
        val (bx, by) = rotatePoint(x + side, y + side, centerX, centerY, direction)
        x = minOf(ax, bx)
        y = minOf(ay, by)
    }

    override fun toString() = "Square(x=$x, y=$y, side=$side)"
}