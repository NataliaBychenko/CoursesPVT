package HomeWork9;

public class Sirius extends Star {
    int radius;
    String spectralClass;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getSpectralClass() {
        return spectralClass;
    }

    public void setSpectralClass(String spectralClass) {
        this.spectralClass = spectralClass;
    }

    @Override
    public int getBrightness() {
        return super.getBrightness();
    }
}
