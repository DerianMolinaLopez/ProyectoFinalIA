package pruebas;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
public class consultapi {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://127.0.0.1:5000");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            System.out.println("prueba de conexion");
        }catch(Exception err){
            System.out.println("Error: "+err.getMessage());
        }

    }
}

