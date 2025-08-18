import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyService service = new CurrencyService();
        CurrencyParser parser = new CurrencyParser();
        CurrencyConverter converter = new CurrencyConverter();

        try {
            String base = "USD"; // moeda base fixa para consulta
            String json = service.getRates(base);
            Map<String, Double> rates = parser.parseRates(json);

            // Mapa de opções
            String[] moedas = {"USD", "BRL", "EUR", "GBP", "JPY", "CAD"};

            System.out.println("--- Conversor de Moedas ---");
            System.out.println("Escolha a moeda de origem:");
            for (int i = 0; i < moedas.length; i++) {
                System.out.printf("%d - %s\n", i + 1, moedas[i]);
            }
            System.out.print("Converter de (1 a 6): ");
            int deOpcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            System.out.println("Escolha a moeda de destino:");
            for (int i = 0; i < moedas.length; i++) {
                System.out.printf("%d - %s\n", i + 1, moedas[i]);
            }
            System.out.print("Converter para (1 a 6): ");
            int paraOpcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            // Validar opções
            if (deOpcao < 1 || deOpcao > 6 || paraOpcao < 1 || paraOpcao > 6) {
                System.out.println("Opção inválida.");
                return;
            }

            String fromCurrency = moedas[deOpcao - 1];
            String toCurrency = moedas[paraOpcao - 1];

            System.out.print("Valor: ");
            double amount = scanner.nextDouble();

            if (!rates.containsKey(fromCurrency) || !rates.containsKey(toCurrency)) {
                System.out.println("Moeda não disponível.");
                return;
            }

            double result = converter.convert(fromCurrency, toCurrency, amount, rates);
            System.out.printf("Resultado: %.2f %s\n", result, toCurrency);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
