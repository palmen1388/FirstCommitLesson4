package Task1;

public class FahrenheitConverter implements Converter {
    private float fahrenheitTemperature;

    @Override
    public float convert(TemperatureConverter temperatureConverter) {
        fahrenheitTemperature = temperatureConverter.getUserTemperatureValue() * 9 / 5 + 32;
        return fahrenheitTemperature;
    }
}



