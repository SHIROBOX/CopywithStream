package th.co.geniustree.training.duplicate;

import java.io.*;

public class CopyData {

     public void readAndCopyFile() {
          try {
               // File 18.5 GB
               FileInputStream readPathFile = new FileInputStream("F:/Hobby/ANME/[Beatrice-Raws] Sayonara no Asa ni Yakusoku no Hana o Kazarou [BDRip 1920x1080 HEVC FLAC]/[Beatrice-Raws] Sayonara no Asa ni Yakusoku no Hana o Kazarou [BDRip 1920x1080 HEVC FLAC].mkv");
               FileOutputStream createPathFile = new FileOutputStream("C:/Users/mbk_i/Desktop/FileTest/[Beatrice-Raws] Sayonara no Asa ni Yakusoku no Hana o Kazarou [BDRip 1920x1080 HEVC FLAC]_copy.mkv");
               // File 200 MB++
               // FileInputStream readPathFile = new FileInputStream("F:/Hobby/ANME/BangDream SS2/BangDream SS2 EP.7.mp4");
               // FileOutputStream createPathFile = new FileOutputStream("C:/Users/mbk_i/Desktop/FileTest/BangDream SS2 EP.7_copy.mp4");
               // File < 1 MB
               //FileInputStream readPathFile = new FileInputStream("C:/Users/mbk_i/Downloads/java_stream.pdf");
               //FileOutputStream createPathFile = new FileOutputStream("C:/Users/mbk_i/Desktop/FileTest/java_stream_copy.pdf");
               byte[] bufferFile = new byte[4096];
               int length;
               while ((length = readPathFile.read(bufferFile)) > 0) {
                    createPathFile.write(bufferFile, 0, length);
               }
          } catch (IOException ex) {
               ex.printStackTrace();
          }
     }

}
