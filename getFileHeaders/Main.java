import java.util.List;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;

public class Main {

    public static void main(String[] args) {

        List<FileHeader> fileHeaders;
        try {
            // UTF-8 のみ
            ZipFile zipFile = new ZipFile("C:\\Users\\sworc\\Downloads\\subject-main.zip");
            fileHeaders = zipFile.getFileHeaders();
            fileHeaders
                .stream()
                .forEach( fileHeader -> {
                    // String fileName = fileHeader.getFileName();
                    System.out.println(fileHeader.getFileName());
                });
            zipFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
