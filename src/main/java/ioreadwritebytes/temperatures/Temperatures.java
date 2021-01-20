package ioreadwritebytes.temperatures;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double sum = 0;
        for (byte dat: data) {
            sum += dat;
        }
        return sum / data.length;
    }

    public double getMonthAverage() {
        double average = 0;
        for (int i = data.length - 1; i > data.length - 31; i--) {
            average += data[i];
        }
        return average / 30;
    }

}
