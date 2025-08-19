# 💱 Conversor de Moedas em Java

Este projeto é um conversor de moedas simples feito em Java, que utiliza a API [ExchangeRate-API](https://www.exchangerate-api.com/) para obter taxas de câmbio em tempo real. O usuário escolhe a moeda de origem e destino a partir de um menu com 6 opções e insere o valor a ser convertido. O programa retorna o valor convertido e encerra automaticamente.

---

## 🚀 Funcionalidades

- Consulta de taxas de câmbio em tempo real
- Conversão entre 6 moedas:
  - USD (Dólar Americano)
  - BRL (Real Brasileiro)
  - EUR (Euro)
  - GBP (Libra Esterlina)
  - JPY (Iene Japonês)
  - CAD (Dólar Canadense)
- Interface via terminal
- Validação de entrada do usuário

---

## 🧰 Tecnologias utilizadas

- Java 11+
- [Gson](https://github.com/google/gson) para parsing de JSON
- API pública ExchangeRate-API
- IntelliJ IDEA (opcional)

---

## 📦 Como executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/conversor-moeda.git
cd conversor-moeda
Compile e execute o projeto:

bash
javac -cp ".;gson-2.10.1.jar" Main.java CurrencyService.java CurrencyParser.java CurrencyConverter.java
java -cp ".;gson-2.10.1.jar" Main
💡 Certifique-se de ter o arquivo gson-2.10.1.jar na pasta do projeto ou adicione via Maven/Gradle.

📝 Exemplo de uso
Código
--- Conversor de Moedas ---
Escolha a moeda de origem:
1 - USD
2 - BRL
3 - EUR
4 - GBP
5 - JPY
6 - CAD
Converter de (1 a 6): 2

Escolha a moeda de destino:
1 - USD
2 - BRL
3 - EUR
4 - GBP
5 - JPY
6 - CAD
Converter para (1 a 6): 3

Valor: 100
Resultado: 18.23 EUR
📌 Observações
A chave da API está embutida no código (CurrencyService.java). Para segurança, substitua por uma variável de ambiente em produção.

As taxas de câmbio são atualizadas em tempo real com base na moeda base USD.

📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

![conversor de moeda](https://github.com/user-attachments/assets/dd6240f0-6733-4ff4-8d69-2b5055d7f692)
