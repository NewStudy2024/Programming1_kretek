package org.example.data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

public class AirQualityFetcher {

    public   fetch() {
        String urlString = "https://air-quality-api.open-meteo.com/v1/air-quality?latitude=47.4984&longitude=19.0404&hourly=pm10,pm2_5,european_aqi_pm2_5&timezone=Europe%2FBerlin&past_days=5&forecast_days=1";

        try {
            // Create a URL object
            URL url = new URL(urlString);

            // Open an HTTP connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Check the response code
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) { // HTTP OK
                // Read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = in.readLine()) != null) {
                    response.append(line);
                }

                // Close the reader
                in.close();

                // Print the JSON response
                System.out.println("Air Quality Data:");
                System.out.println(response.toString());
            } else {
                System.out.println("Error: Received HTTP response code " + responseCode);
            }

            // Disconnect the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
