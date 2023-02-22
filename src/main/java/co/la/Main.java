package co.la;

import co.la.converter.Converter;
import co.la.utils.Message;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayInput = new ArrayList<>(List.of(args));
        ArrayList<String> temperatures = new ArrayList<>(List.of(args));

        String mode = arrayInput.get(0);
        temperatures.remove(0);
        Converter converter = new Converter(mode,temperatures);

        if(arrayInput.size() < 2){
            Message.printUsageErrorMessage();
        } else {
            converter.convertTemperature();
        }
    }
}
