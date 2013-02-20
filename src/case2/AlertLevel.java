package case2;

public class AlertLevel {

    public final static AlertLevel HIGH = new AlertLevel();
    public final static AlertLevel NORMAL = new AlertLevel();
    public final static AlertLevel LOW = new AlertLevel();

    public AlertLevel() {
    }

    public boolean isLowLevel(Alert alert) {
        return this == AlertLevel.LOW;
    }

    public boolean isHighLevel(Alert alert) {
        return this == AlertLevel.HIGH;
    }

    public boolean isNormalLevel(Alert alert) {
        return this == AlertLevel.NORMAL;
    }
    
    
    
    
    
}
