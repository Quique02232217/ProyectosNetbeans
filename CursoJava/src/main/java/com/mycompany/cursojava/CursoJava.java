package com.mycompany.cursojava;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CursoJava {

    public static void main(String[] args) throws IOException {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Buscador: ");
        String buscador = keyBoard.nextLine();
        List<String> links = new ArrayList<>();

        links.add("https://colombia.as.com/futbolC/colombia-mostro-el-futbol-al-que-estamos-acostumbrados");
        links.add("https://colombia.as.com/videosD/gamero-no-tengo-desespero-por-renovar-con-millonarios");
        links.add("https://colombia.as.com/videosF/aprende-a-pronunciar-de-manera-correcta-jonas-vingegaard");
        
        links.add("https://colombia.as.com/futbolA/colombia-mostro-el-futbol-al-que-estamos-acostumbrados");
        links.add("https://colombia.as.com/videosA/gamero-no-tengo-desespero-por-renovar-con-millonarios");
        links.add("https://colombia.as.com/videosB/aprende-a-pronunciar-de-manera-correcta-jonas-vingegaard");
        
        
        links.stream().filter(link -> link.contains(buscador)).forEach(link -> getWebContent(link));
        String link = "https://colombia.as.com/";
        String result = getWebContent(link);

    }

    private synchronized static String getWebContent(String link) {
        System.out.println("INIT");
        System.out.println(link);
        try {
            URL url = new URL(link);
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            String encoding = connection.getContentEncoding();
            
            InputStream input = connection.getInputStream();
            
            Stream<String> lines = new BufferedReader(new InputStreamReader(input)).lines();
            
            System.out.println("END");
            
            
            return lines.collect(Collectors.joining());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
    
   
}
