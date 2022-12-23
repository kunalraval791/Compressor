/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/**
 *
 * @author DELL
 */
public class decompressor {
    public static void method(File file) throws IOException{
        String filedirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzip = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(filedirectory+ "/Decompressedfileone");
        
        byte[] buffer = new byte[1024];
        int len;
        
        while((len = gzip.read(buffer)) != -1){
            fos.write(buffer, 0, len);
        }
        
        gzip.close();
        fis.close();
        fos.close();
    }
    
    public static void main(String[] args) throws IOException{
        File path = new File("/Users/DELL/Downloads/compressor/Compressedfile.gz");
        method(path);
    }
}
