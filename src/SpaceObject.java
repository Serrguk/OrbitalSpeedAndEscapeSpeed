import java.math.BigDecimal;

public enum SpaceObject {
    EARTH(BigDecimal.valueOf(5.9726E24), BigDecimal.valueOf(6371000.0)),
    SUN( BigDecimal.valueOf(1.9885E30), BigDecimal.valueOf(1.392E9 / 2.0));


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
