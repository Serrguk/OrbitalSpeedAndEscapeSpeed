import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Гравитационная постоянная примерно равна " + SpaceSpeed.G + " м^3/кг*с^2");
        System.out.println("Средний радиус Земли равен " + SpaceObject.EARTH.getRadius() + " метров");
        System.out.println("Масса Земли равна " + SpaceObject.EARTH.getMass() + " килограммов\n");

        System.out.println(SpaceSpeed.isEscape(SpaceObject.EARTH.getMass(), SpaceObject.EARTH.getRadius()));

        System.out.println(SpaceSpeed.isEscape(BigDecimal.valueOf(50.0154E100), BigDecimal.valueOf(50000.0)));
        System.out.println(SpaceSpeed.isOrbital(SpaceObject.SUN.getMass(), SpaceObject.SUN.getRadius()));
        System.out.println(SpaceSpeed.isEscape(SpaceObject.SUN.getMass(), SpaceObject.SUN.getRadius()));
    }
}
