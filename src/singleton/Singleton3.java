package singleton;

// This singleton is thread safe, but it doesn't serialize the fields variables.

public enum Singleton3 {
    SUMMER, AUTUMN;
    double temperature;
    String weather;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
