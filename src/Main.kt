fun main() {
    val rect = Rect(0, 0, 4, 2)
    val square = Square(1, 1, 3)
    val circle = Circle(5, 5, 2)

    val figures: List<Transforming> = listOf(rect, square, circle)
    val movables: List<Movable> = listOf(rect, square, circle)

    println("=== Исходное состояние ===")
    println(rect); println(square); println(circle)
    println("Площади: ${rect.area()}, ${square.area()}, ${circle.area()}")

    println("\n=== Перемещение на (2; 3) ===")
    movables.forEach { it.move(2, 3) }
    println(rect); println(square); println(circle)

    println("\n=== Масштабирование x2 ===")
    figures.forEach { it.resize(2) }
    println(rect); println(square); println(circle)
    println("Площади: ${rect.area()}, ${square.area()}, ${circle.area()}")

    println("\n=== Поворот по часовой на 90° вокруг (0; 0) ===")
    figures.forEach { it.rotate(RotateDirection.Clockwise, 0, 0) }
    println(rect); println(square); println(circle)

    println("\n=== Поворот против часовой на 90° вокруг (0; 0) (возврат) ===")
    figures.forEach { it.rotate(RotateDirection.CounterClockwise, 0, 0) }
    println(rect); println(square); println(circle)
}