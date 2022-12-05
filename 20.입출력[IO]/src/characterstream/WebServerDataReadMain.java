package characterstream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class WebServerDataReadMain {

	public static void main(String[] args) throws Exception{
		/****************************html(text)*********************/
		URL urlStr = new URL("https://thumb.cjonstyle.net/unsafe/550x550/itemimage.cjonstyle.net/goods_images/20/198/2005169198L.jpg?timestamp=20220915142104");
		InputStream in = urlStr.openStream();
		FileOutputStream fout = new FileOutputStream("image.jpg");
		while(true) {
			int readByte =in.read();
			if(readByte==-1)break;
			fout.write(readByte);
			//System.out.print((char)readByte);
		}
			in.close();
			fout.close();

	}

}
