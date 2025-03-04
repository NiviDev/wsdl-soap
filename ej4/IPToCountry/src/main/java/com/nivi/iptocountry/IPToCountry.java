/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nivi.iptocountry;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nicov
 */
public class IPToCountry {

    public static void main(String[] args) {
        System.out.println("Servicio de Localización de IP");
        //El servicio utilizado otorga los resultados en XML, lo ideal seria
        //usar xPath o algo similar para extraer la información.
        //En este ejercicio la extracción de información esta 'hardcodeada'
        try { // Call Web Service Operation
            com.lavasoft.GeoIPService service = new com.lavasoft.GeoIPService();
            com.lavasoft.GeoIPServiceSoap port = service.getGeoIPServiceSoap12();
            // TODO initialize WS operation arguments here
            System.out.print("Ingresar Direccion IP >> ");
            Scanner sc = new Scanner(System.in);
            String ip = sc.nextLine();
            java.lang.String sIp = ip;//100.1.200.1   ---- MI IP: 190.124.146.32
            // TODO process result here
            //java.lang.String result = port.getCountryNameByISO2(port.getIpLocation20(sIp).substring(15, 18));
            java.lang.String isocode = port.getIpLocation20(sIp).substring(16, 18);
            java.lang.String xmlString = port.getCountryNameByISO2(isocode);
            String countryPattern = "<GeoIP><Country>(.*?)</Country></GeoIP>";
            Pattern pattern = Pattern.compile(countryPattern);
            Matcher matcher = pattern.matcher(xmlString);
            if (matcher.find()) {
                String country = matcher.group(1);
                System.out.println("Resultado: " + country);
            } else {
                System.out.println("Country tag not found.");
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
