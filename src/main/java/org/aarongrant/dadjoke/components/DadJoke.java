package org.aarongrant.dadjoke;

import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.lang3.StringEscapeUtils;

@Component
public class DadJoke implements CommandLineRunner {

  public void run(String... strings) throws Exception {
        readJsonFromUrl("https://aarongrant.org/api/dadjokes.php");       
  }

  public static void readJsonFromUrl(String url) throws IOException {
    InputStream is = new URL(url).openStream();
    try {
      String thisLine = new String();
      BufferedReader br = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      while ((thisLine = br.readLine()) != null) {
           System.out.println(StringEscapeUtils.unescapeXml(thisLine));
      }    
    } finally {
      is.close();
    }
  }

}
