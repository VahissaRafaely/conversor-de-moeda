import com.google.gson.Gson;
import java.util.Map;

public class CurrencyParser {
    public Map<String, Double> parseRates(String json) {
        Gson gson = new Gson();
        CurrencyResponse response = gson.fromJson(json, CurrencyResponse.class);
        return response.conversion_rates;
    }

    private class CurrencyResponse {
        Map<String, Double> conversion_rates;
    }
}
