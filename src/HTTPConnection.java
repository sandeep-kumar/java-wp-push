/**
 * Created with IntelliJ IDEA.
 * User: sandeepkumar
 * Date: 6/13/13
 * Time: 9:36 PM
 * To change this template use File | Settings | File Templates.
 */
import java.net.*;
import java.io.*;

public class HTTPConnection {
    public static void main(String[] args) throws Exception {
        URL google = new URL("http://www.google.com/");
        URLConnection yc = google.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
