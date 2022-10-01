/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LerArquivo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LerArquivo {

    public static void printArray(int v[], int inicio, int fim){
        if(fim != v.length)
            fim += 1;
        
        System.out.printf("Tamanho: %d\n", fim - inicio);
        
        if(v.length > 0)
            System.out.printf("[%d", v[inicio]);
        else
            System.out.printf("[");
        
        for(int i = inicio + 1; i < fim; i++)
            System.out.printf(", %d",v[i]);
        System.out.printf("]\n");
    }
    
    public static void read(String path){
        List<Integer> numeros = new ArrayList<>();
        int array[];
        try{
            String this_path = System.getProperty("user.dir") + path;
            
            Scanner leitor_arquivo = new Scanner(new FileReader(this_path));

            while(leitor_arquivo.hasNextLine()) {
                String linha_arquivo = leitor_arquivo.nextLine();
                numeros.add(Integer.valueOf(linha_arquivo));
            }
            array = numeros.stream().mapToInt(i -> i).toArray();
            LerArquivo.printArray(array, 0, array.length);
        }catch(FileNotFoundException e){
            System.out.println("Exceção: " + e);
        }
    }
    
}
