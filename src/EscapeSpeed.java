import java.math.BigDecimal;
import java.math.MathContext;

/*
Вторая космическая скорость равна квадратному корню из 2G, помноженной на массу объекта, делённую на её радиус
 */
public class EscapeSpeed {
    public static final BigDecimal G = BigDecimal.valueOf(6.6743E-11);// m^3 / kg * s^2 - гравитационная постоянная

    public static String getG() {
        return "Гравитационная постоянная примерно равна " + G + " м^3/кг * с^2";
    }

    public static BigDecimal getSpaceSpeed(BigDecimal mass, BigDecimal radius) {
        return (BigDecimal.valueOf(2).sqrt(MathContext.DECIMAL32)).multiply(getOrbitalSpeed(mass, radius));
    }

    public static BigDecimal getOrbitalSpeed(BigDecimal mass, BigDecimal radius) {
        return (G.multiply(mass.divide(radius, MathContext.DECIMAL32))).sqrt(MathContext.DECIMAL32);
    }

}

