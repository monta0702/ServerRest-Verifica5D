/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package serverrest;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;




/**
 * Server REST per la calcolatrice
 * 
 * @author delfo
 */
public class ServerRest {

     public static void avviaServer(int porta) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(porta), 0);

            server.createContext("/api/roulette/paridispari/post", new RoulettePostHandler());
            server.createContext("/api/roulette/paridispari/get", new RouletteGetHandler());
            server.createContext("/", ServerRest::gestisciBenvenuto);

            server.setExecutor(null);
            server.start();

            System.out.println("==============================================");
            System.out.println("  Server REST Roulette avviato!");
            System.out.println("==============================================");
            System.out.println("Porta: " + porta);
            System.out.println();
            System.out.println("Endpoint disponibili:");
            System.out.println("  - POST: http://localhost:" + porta + "/api/roulette/paridispari/post");
            System.out.println("  - GET:  http://localhost:" + porta + "/api/roulette/paridispari/get?giocata=PARI&numero=18");
            System.out.println("  - Info: http://localhost:" + porta + "/");
            System.out.println();
            System.out.println("Premi Ctrl+C per fermare il server");
            System.out.println("==============================================");

        } catch (IOException e) {
            System.err.println("Errore nell'avvio del server: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void gestisciBenvenuto(HttpExchange exchange) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Map<String, Object> info = new HashMap<>();
        info.put("messaggio", "Benvenuto nella Roulette REST API");
        info.put("versione", "1.0.0");
        info.put("tecnologia", "Java + GSON");

        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("POST", "/api/roulette/paridispari/post");
        endpoints.put("GET", "/api/roulette/paridispari/get?giocata=PARI&numero=18");
        info.put("endpoints", endpoints);

        Map<String, String> regole = new HashMap<>();
        regole.put("giocata", "Valori ammessi: PARI oppure DISPARI");
        regole.put("numero", "Intero compreso tra 0 e 36");
        regole.put("vittoria", "Il numero 0 vale sempre sconfitta");
        info.put("regole", regole);

        String jsonRisposta = gson.toJson(info);

        exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
        byte[] bytes = jsonRisposta.getBytes(StandardCharsets.UTF_8);
        exchange.sendResponseHeaders(200, bytes.length);
        exchange.getResponseBody().write(bytes);
        exchange.getResponseBody().close();
    }

}