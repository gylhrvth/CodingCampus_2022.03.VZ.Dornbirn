package aron.week07.zoosim;

public enum ClimateZone {
    POLAR_ZONE(-30, -410, -60),
    SUBPOLAR_ZONE(-10,5,-40),
    GEMAESSIGTE_ZONE(15,30,-15),
    SUBTROPISCHE_ZONE(30,50,0),
    TROPISCHE_ZONE(25,40,0);

    private float avgTemp;
    private float maxTemp;
    private float minTemp;

    ClimateZone(float avgTemp, float maxTemp, float minTemp) {
        this.avgTemp = avgTemp;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public float getAvgTemp() {
        return avgTemp;
    }

    public float getMaxTemp() {
        return maxTemp;
    }

    public float getMinTemp() {
        return minTemp;
    }


}
