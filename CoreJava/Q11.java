abstract class CalculateArea {
    public void calculate() {
        System.out.println("this is the default method");
    }
}

class Circle extends CalculateArea {
    float radius = 10f;

    @Override
    public void calculate() {
        float area = 3.14f * radius * radius;
        System.out.println("Area is : " + area);
    }
}

public class Q11 {
    public static void main(String args[]) {
        new Circle().calculate();
    }
}
