package Task1;


public class TemperatureConverter {

    private float userTemperatureValue;
    private String userTemperatureSignature;
    private Converter celsiusConverter = new CelsiusConverter();
    private Converter fahrenheitConverter = new FahrenheitConverter();


    public float getUserTemperatureValue() {
        return userTemperatureValue;
    }

    public void setUserTemperatureValue(float userTemperatureValue) {
        this.userTemperatureValue = userTemperatureValue;
    }

    public String getUserTemperatureSignature() {
        return userTemperatureSignature;
    }

    public void setUserTemperatureSignature(String userTemperatureSignature) {
        this.userTemperatureSignature = userTemperatureSignature;
    }
    public float convertTo(){
        if ("F".equalsIgnoreCase(this.getUserTemperatureSignature())){
            celsiusConverter.convert(this);
            System.out.print("Температура в Цельсиях = ");
            return celsiusConverter.convert(this);
        }
        if ("C".equalsIgnoreCase(this.getUserTemperatureSignature())){
            fahrenheitConverter.convert(this);
            System.out.print("Температура в Фаренгейтах = ");
            return fahrenheitConverter.convert(this);
        }
        return 0;
    }
}
