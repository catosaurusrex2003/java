import scala.io.StdIn.readLine

class Circle{
  var radius:Double = 0
  var area:Double = 0
  
  def acceptRadius():Unit = {
    print("Enter the Radius of the circle : ")
    radius = scala.io.StdIn.readDouble()
  }
  
  def CalculateArea():Unit = {
    area = math.Pi * radius * radius
    print(area)
  }
  
}


val circle = new Circle()

circle.acceptRadius()

circle.CalculateArea()