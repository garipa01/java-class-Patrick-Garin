package exercise9;

/**
 * Class Ex9Converter
 * @author garipa01
 * Patrick Garin
 */
public class Ex9Converter {

  public Ex9Converter() {
  }
    
  public Double c2f(Double valueFrom) {
    return (valueFrom) * 1.8 + 32;
  }

  public Double c2k(Double valueFrom) {
    return valueFrom + 273.15;
  }

  public Double f2c(Double valueFrom) {
    return (valueFrom - 32) / 1.8;
  }

  public Double f2k(Double valueFrom) {
    return (valueFrom + 459.67) * (5.0 / 9.0);
  }

  public Double k2c(Double valueFrom) {
    return valueFrom - 273.15;
  }

  public Double k2f(Double valueFrom) {
    return (valueFrom * (9.0 / 5.0)) - 459.67;
  }
}
