package M03_JavaAdvanced.L04_StreamsFilesAndDirectories.Exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class T09CopyPicture {
    public static void main(String[] args)throws IOException {
        String pictureLocation = "C:\\Users\\REALG4L1FE\\Desktop\\Original Location\\example.jpg";
        String destLocation = "C:\\Users\\REALG4L1FE\\Desktop\\Destination\\picture-copy.jpg";

        FileInputStream fileInputStream = new FileInputStream(pictureLocation);

        byte[] bytes = fileInputStream.readAllBytes();

        FileOutputStream fileOutputStream = new FileOutputStream(destLocation);

        fileOutputStream.write(bytes);
    }
}
