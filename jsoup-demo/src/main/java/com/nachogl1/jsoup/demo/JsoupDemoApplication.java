package com.nachogl1.jsoup.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class JsoupDemoApplication {


    public static void main(String[] args) throws IOException {


        String html = """
                <html>
                    <body>
                       <p>Coders favourite music genre:</p>
                       <ol>
                          <li>House</li>
                          <li>Ballad</li>
                          <li>Dance</li>
                       </ol>
                       <p>Coders favourite beverage: </p>
                       <ol>
                          <li>Coffee</li>
                          ................................................................................\s
                          <li>Tea</li>
                          <li>Coke</li>
                       </ol>
                       <p>Coders favourite phrase:</p>
                       <ol>
                          <li>Pfff</li>
                          <li>Damn</li>
                          <li>It works</li>
                       </ol>
                    </body>
                 </html>
                """;


        Document doc = Jsoup.parse(html);

        Elements elements = doc.select("p");
        Element element = elements.stream().filter((Element e) -> "Coders favourite beverage:".equals(e.text())).findFirst().get();

        List<String> beve = element.nextElementSibling().select("ol > li").eachText().stream().toList();

        beve.forEach(System.out::println);

    }

}
