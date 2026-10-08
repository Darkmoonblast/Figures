class Circle(var x: Int, var y: Int, var radius: Int) : Movable, Transforming, Figure(2) {

    override fun area(): Float = (Math.PI * radius * radius).toFloat()

    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun resize(zoom: Int) {
        radius *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val (nx, ny) = rotatePoint(x, y, centerX, centerY, direction)
        x = nx
        y = ny
    }

    override fun toString() = "Circle(x=$x, y=$y, radius=$radius)"
}