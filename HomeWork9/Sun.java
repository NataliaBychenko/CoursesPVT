package HomeWork9;

public class Sun  extends Star {
   String[] waveColor = {"Purple","Blue", "Green", "Yellow", "Orange", "Red"  } ;
   int  wavelength;

    public String[] getWaveColor() {
        return waveColor;
    }

    public int getWavelength() {
        return wavelength;
    }

    @Override
    public int getTemperature() {
        return super.getTemperature();
    }
}
