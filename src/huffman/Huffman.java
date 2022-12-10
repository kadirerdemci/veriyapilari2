/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package huffman;

import static huffman.HuffmanDecoding.huffmanDecoding;
import static huffman.HuffmanEncoding.characterMapping;
import static huffman.HuffmanEncoding.huffmanEncoding;
import static huffman.HuffmanEncoding.writeCharacterMappingTable;
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class Huffman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
            
        String input = "kodlanacakDosya.txt";
        String output = "kodlanmisolanDosya.txt";
        String characterMappingOutput = "karakterdegerleri.txt";

        int[] characterFrequency = Others.frequencyTable(input);

        String[] characterMappingTable = characterMapping(characterFrequency);
        writeCharacterMappingTable(characterMappingTable, characterFrequency, characterMappingOutput);
        

        String encryptedText = huffmanEncoding(characterMappingTable, input, output, characterMappingTable, characterFrequency);
        
        
        String cipher = "kodlanmisolanDosya.txt";
        String decyptedText = huffmanDecoding(cipher, characterMappingTable, characterFrequency);
        System.out.println("Şifrelenecek değer");
        
        System.out.println(decyptedText);
        
        System.out.println("\nŞifrelenmiş değer");
        System.out.println(encryptedText);
        

    }
    
}
