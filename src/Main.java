public class Main {
    public static void main(String[] args) {
        System.out.println("Гравитационная постоянная примерно равна " + SpaceSpeed.G + " м^3/кг*с^2");
        System.out.println("Средний радиус Земли равен " + SpaceObject.EARTH.getRadius() + " метров");
        System.out.println("Масса Земли равна " + SpaceObject.EARTH.getMass() + " килограммов\n");


        System.out.println("Объект " + SpaceObject.SUN + ": " + SpaceSpeed.isOrbital(SpaceObject.SUN.getMass(),
                SpaceObject.SUN.getRadius()) + "" +
                ",\n" + SpaceSpeed.isEscape(SpaceObject.SUN.getMass(), SpaceObject.SUN.getRadius()) + "\n");

        System.out.println("Объект " + SpaceObject.EARTH + ": " +
                SpaceSpeed.isOrbital(SpaceObject.EARTH.getMass(), SpaceObject.EARTH.getRadius()) + "" +
                ",\n" + SpaceSpeed.isEscape(SpaceObject.EARTH.getMass(), SpaceObject.EARTH.getRadius()) + "\n");

        System.out.println("Объект " + SpaceObject.SAGITTARIUS_A_WITH_STAR + ": " +
                SpaceSpeed.isOrbital(SpaceObject.SAGITTARIUS_A_WITH_STAR.getMass(),
                        SpaceObject.SAGITTARIUS_A_WITH_STAR.getRadius()) + "," +
                "\n" + SpaceSpeed.isEscape(SpaceObject.SAGITTARIUS_A_WITH_STAR.getMass(),
                SpaceObject.SAGITTARIUS_A_WITH_STAR.getRadius()) + "\n");

        System.out.println("Объект " + SpaceObject.MOON + ": " +
                SpaceSpeed.isOrbital(SpaceObject.MOON.getMass(), SpaceObject.MOON.getRadius()) + "" +
                ",\n" + SpaceSpeed.isEscape(SpaceObject.MOON.getMass(), SpaceObject.MOON.getRadius()) + "\n");

    }
}
