public class Main {
    public static void main(String[] args) {
        System.out.println(EscapeSpeed.getG());
        System.out.println("Средний радиус Земли равен " + SpaceObject.EARTH.getRadius() + " метров");
        System.out.println("Масса Земли равна " + SpaceObject.EARTH.getMass() + " килограммов\n");
        String sampleForV1 = "Первая космическая скорость для объекта %s равна %f метров в секунду\n";
        String sampleForV2 = "Вторая космическая скорость для объекта %s равна %f метров в секунду\n";

        System.out.printf(sampleForV1, SpaceObject.EARTH, EscapeSpeed.getOrbitalSpeed(SpaceObject.EARTH.getMass(), SpaceObject.EARTH.getRadius()));
        System.out.printf(sampleForV2, SpaceObject.EARTH, EscapeSpeed.getSpaceSpeed(SpaceObject.EARTH.getMass(), SpaceObject.EARTH.getRadius()));
        System.out.printf(sampleForV1, SpaceObject.SUN, EscapeSpeed.getOrbitalSpeed(SpaceObject.SUN.getMass(), SpaceObject.SUN.getRadius()));
        System.out.printf(sampleForV2, SpaceObject.SUN, EscapeSpeed.getSpaceSpeed(SpaceObject.SUN.getMass(), SpaceObject.SUN.getRadius()));
    }
}
