package DefaultMethod;

public interface Shape {
    default void rotate() {
        System.out.println("Shape is rotating...");
    }
}