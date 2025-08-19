import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

class Conv_Moeda {
    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/";
    private static final String PATH_COT = "/latest/USD";
    public Resp_API obte_Cot(String api_key) throws IOException {
        String urlString = URL_BASE + api_key + PATH_COT;
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        System.out.println("Verificação.Tentando se conectar a: " + urlString);
        System.out.println("Status da conexão da API: " + conn.getResponseCode() + " " + conn.getResponseMessage());

        int rpsCod = conn.getResponseCode();
        if (rpsCod == 200) {
            InputStreamReader rdrEntr = new InputStreamReader(conn.getInputStream());
            Gson gson = new Gson();
            Resp_API rpsAPI = gson.fromJson(rdrEntr, Resp_API.class);
            rdrEntr.close();
            return rpsAPI;
        } else {
            throw new IOException("Erro!! não foi feita conexão com a API. Resposta = " + rpsCod);
        }
    }
    public double conver_Moedas(double valor, double taxa) {
        return valor * taxa;
    }
}