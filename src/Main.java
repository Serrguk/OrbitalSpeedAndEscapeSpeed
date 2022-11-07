import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Гравитационная постоянная примерно равна " + SpaceSpeed.G + " м^3/кг*с^2");
        System.out.println("Средний радиус Земли равен " + SpaceObject.EARTH.getRadius() + " метров");
        System.out.println("Масса Земли равна " + SpaceObject.EARTH.getMass() + " килограммов\n");
        String sampleForV1 = "Первая космическая скорость для объекта %s равна %f метров в секунду\n";
        String sampleForV2 = "Вторая космическая скорость для объекта %s равна %f метров в секунду\n";

        System.out.printf(sampleForV1, SpaceObject.EARTH, SpaceSpeed.getOrbitalSpeed(SpaceObject.EARTH.getMass(), SpaceObject.EARTH.getRadius()));
        System.out.printf(sampleForV2, SpaceObject.EARTH, SpaceSpeed.getEscapeSpeed(SpaceObject.EARTH.getMass(), SpaceObject.EARTH.getRadius()));
        System.out.printf(sampleForV1, SpaceObject.SUN, SpaceSpeed.getOrbitalSpeed(SpaceObject.SUN.getMass(), SpaceObject.SUN.getRadius()));
        System.out.printf(sampleForV2, SpaceObject.SUN, SpaceSpeed.getEscapeSpeed(SpaceObject.SUN.getMass(), SpaceObject.SUN.getRadius()));

        System.out.println(SpaceSpeed.getEscapeSpeed(BigDecimal.valueOf(30.0E100), BigDecimal.valueOf(50000)));
        System.out.println(SpaceSpeed.getOrbitalSpeed(BigDecimal.valueOf(30.0E100), BigDecimal.valueOf(50000)));
    }
}
