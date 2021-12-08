package sample;

import org.json.JSONObject;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Serwer_pol {
    private Socket socket;
    private JSONObject wyslij;
    public Serwer_pol(JSONObject object) throws IOException {
        this.socket = new Socket(InetAddress.getLocalHost(),8080);
        this.wyslij = object;
    }
    public JSONObject wysylanie() throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write(wyslij.toString());
        writer.newLine();
        writer.flush();
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = reader.readLine();
        JSONObject odbierz = new JSONObject(s);
        return odbierz;
    }
}
