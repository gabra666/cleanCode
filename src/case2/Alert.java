package case2;

import java.util.Date;

public class Alert {

    private double average;
    private final int rating;
    private final Date expiry;
    private final Date maturity;
    private final AlertLevel level;

    public Alert(double average, int rating, Date expiry, Date maturity, AlertLevel level) {
        this.average = average;
        this.rating = rating;
        this.expiry = expiry;
        this.maturity = maturity;
        this.level = level;
    }

    public Alert(double average, int rating, Date expiry) {
        this(average, rating, expiry, null, AlertLevel.NORMAL);
    }

    public Alert(double average, int rating, Date expiry, Date maturity) {
        this(average, rating, expiry, maturity, AlertLevel.NORMAL);

    }

    public double getAverage() {
        return average;
    }

    public int getRating() {
        return rating;
    }

    public Date getExpiry() {
        return expiry;
    }

    public Date getMaturity() {
        return maturity;
    }

    public boolean isHighLevel() {
        return level.isHighLevel(this);
    }

    public boolean isNormalLevel() {
        return level.isNormalLevel(this);
    }

    public boolean isLowLevel() {
        return level.isLowLevel(this);
    }
}
