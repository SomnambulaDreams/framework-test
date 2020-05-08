package logic;

import io.github.cdimascio.dotenv.Dotenv;


public class Writer {

    public void write() {
        String message = Dotenv.load().get("MESSAGE");
        System.out.println(message);
    }
}