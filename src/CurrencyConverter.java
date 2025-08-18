import java.util.Map;

public class CurrencyConverter {
    public double convert(String from, String to, double amount, Map<String, Double> rates) {
        double fromRate = rates.get(from);
        double toRate = rates.get(to);
        return (amount / fromRate) * toRate;
    }
}
