package sii.sup;

public class Dimension {
    private final int high;
    private final int width;
    private final int trunkCapacity;

    public Dimension(int high, int width, int trunkCapacity) {
        this.high = high;
        this.width = width;
        this.trunkCapacity = trunkCapacity;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "high=" + high +
                ", width=" + width +
                ", trunkCapacity=" + trunkCapacity +
                '}';
    }
}
