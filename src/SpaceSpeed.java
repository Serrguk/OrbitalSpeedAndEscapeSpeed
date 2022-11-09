import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.MathContext;

public class SpaceSpeed {
    public static final BigDecimal G = BigDecimal.valueOf(6.6743E-11);// m^3 / kg * s^2 - гравитационная постоянная
    public static final BigDecimal SPEED_OF_LIGHT = BigDecimal.valueOf(299_792_458);// m/c - скорость света

    private static BigDecimal getEscapeSpeed(@NotNull BigDecimal mass, BigDecimal radius) {
        BigDecimal escapeSpeed = (BigDecimal.valueOf(2)
                .sqrt(MathContext.DECIMAL32))
                .multiply((G.multiply(mass.divide(radius, MathContext.DECIMAL32)))
                        .sqrt(MathContext.DECIMAL32));
        if (escapeSpeed.compareTo(SPEED_OF_LIGHT) >= 0) {
            return BigDecimal.ZERO;
        }
        return escapeSpeed;
    }

    private static BigDecimal getOrbitalSpeed(@NotNull BigDecimal mass, BigDecimal radius) {
        BigDecimal orbitalSpeed = (G.multiply(mass.divide(radius, MathContext.DECIMAL32))).sqrt(MathContext.DECIMAL32);
        if (orbitalSpeed.compareTo(SPEED_OF_LIGHT) >= 0) {
            return BigDecimal.ZERO;
        }
        return orbitalSpeed;
    }

    public static String isEscape(BigDecimal mass, BigDecimal radius) {
        BigDecimal result = getEscapeSpeed(mass, radius);
        return result.equals(BigDecimal.ZERO) ?
                "Невозможно покинуть объект, вторая космическая скорость больше или равна скорости света" :
                "Вторая космическая скорость равна " + result + " метров в секунду";
    }

    public static String isOrbital(BigDecimal mass, BigDecimal radius) {
        BigDecimal result = getOrbitalSpeed(mass, radius);
        return result.equals(BigDecimal.ZERO) ?
                "Невозможно выйти на орбиту, первая космическая скорость больше или равна скорости света" :
                "Первая космическая скорость равна " + result + " метров в секунду";
    }

}

