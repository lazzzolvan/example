public class BikeTimeCalculator {
    private double speed ; // средняя скорость в км/ч
    private String courierName;
    private double speedInMS;

    public BikeTimeCalculator(String name) {
        courierName = name;
        speed = 10;
        speedInMS = new SpeedConverter(speed).getSpeedInMs();
    }

    public long getDeliveryTime(int distanceInMeters) {
        if (distanceInMeters <= 0) {
            return 1;
        }
        return (int)Math.ceil(distanceInMeters / speedInMS);

    }

    public String getCourierName() {
        return courierName;
    }

}