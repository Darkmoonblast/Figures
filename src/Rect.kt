class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Movable, Transforming, Figure(0) {
    var color: Int = -1

    lateinit var name: String

    constructor(rect: Rect) : this(rect.x, rect.y, rect.width, rect.height)

    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun area(): Float {
        return (width * height).toFloat()
    }

    override fun resize(zoom: Int) {
        width *= zoom
        height *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val (ax, ay) = rotatePoint(x, y, centerX, centerY, direction)
        val (bx, by) = rotatePoint(x + width, y + height, centerX, centerY, direction)
        x = minOf(ax, bx)
        y = minOf(ay, by)
        val tmp = width
        width = height
        height = tmp
    }

    override fun toString() = "Rect(x=$x, y=$y, width=$width, height=$height)"
}