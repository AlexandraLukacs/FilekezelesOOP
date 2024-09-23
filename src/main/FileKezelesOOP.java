package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import modell.Ember;

public class FileKezelesOOP {

    public static void main(String[] args) throws IOException {
        InputStream is = FileKezelesOOP.class.getClassLoader().getResourceAsStream("res/emberek.txt");
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        ArrayList<Ember> emberek = new ArrayList<>();
        String sor;
        while((sor = bf.readLine()) !=null){
            System.out.println(sor);
            String[] s = sor.split(";");
            String nev = s[0];
            String cim = s[1];
            Ember ember = new Ember(nev, cim);
            emberek.add(ember);
        }
        
        System.out.println("Ki lakik Bp-en: ");
    }
    
}
