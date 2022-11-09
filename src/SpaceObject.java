import java.math.BigDecimal;

public enum SpaceObject {
    EARTH(BigDecimal.valueOf(5.9726E24), BigDecimal.valueOf(6_371_000.0)),
    SUN( BigDecimal.valueOf(1.9885E30), BigDecimal.valueOf(1.392E9 / 2.0)),
    MOON(BigDecimal.valueOf(7.3477E22), BigDecimal.valueOf(1_737_100.0)),
    SAGITTARIUS_A_WITH_STAR(BigDecimal.valueOf(4.297).multiply(SUN.mass.multiply(BigDecimal.valueOf(1_000_000))),
            BigDecimal.valueOf(6_732_000_000.0));



    private final BigDecimal mass;//кг
    private final BigDecimal radius;//м

    SpaceObject(BigDecimal mass, BigDecimal radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public BigDecimal getRadius() {
        return radius;
    }

    public BigDecimal getMass() {
        return mass;
    }

}
