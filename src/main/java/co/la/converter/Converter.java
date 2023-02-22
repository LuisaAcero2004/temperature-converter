package co.la.converter;

import co.la.utils.Message;

import java.util.ArrayList;

import static java.lang.Math.round;

public class Converter {

    private String mode;
    private ArrayList<String> temperatures;

    public Converter(String mode, ArrayList<String> temperatures) {
        this.mode = mode;
        this.temperatures = temperatures;

    }

    public void convertTemperature(){

        if(this.temperatures.size()==1){

            oneValueConverter();

        }else {
            multipleValuesConverter();
        }

    }

    private void multipleValuesConverter(){

        switch (this.mode){
            case "f2c":
                Message.printMultipleValuesConvertionf2cHeader();
                for (String stringTemp:
                        this.temperatures) {

                    try{
                        double inputTemperature = Double.parseDouble(stringTemp);
                        Message.printMultipleValuesConvertionMessage(inputTemperature,farenheitToCelsius(inputTemperature));
                    }catch (Exception e){
                        Message.printMultipleValuesConvertionNaNMessage(stringTemp);
                    }

                }
            break;

            case "c2f":
                Message.printMultipleValuesConvertionc2fHeader();
                for (String stringTemp:
                        this.temperatures) {
                    try{
                        double inputTemperature = Double.parseDouble(stringTemp);
                        Message.printMultipleValuesConvertionMessage(inputTemperature,celsiusToFarenheit(inputTemperature));
                    }catch (Exception e){
                        Message.printMultipleValuesConvertionNaNMessage(stringTemp);
                    }
                }
            break;

            default:
                Message.printUnknownModeErrorMessage(this.mode);
                Message.printUsageErrorMessage();
            break;

        }
    }

    private void oneValueConverter(){

        String stringTemp = this.temperatures.get(0);
        double inputTemperature = Double.parseDouble(stringTemp);
        switch (this.mode){
            case "f2c":

                try{
                    Message.printOneValueConvertionf2cMessage(inputTemperature,farenheitToCelsius(inputTemperature));
                }catch (Exception e){
                    Message.printNotValidNumberErrorMessage(stringTemp);
                    Message.printUsageErrorMessage();
                }
            break;

            case "c2f":

                try{
                    Message.printOneValueConvertionC2FMessage(inputTemperature,celsiusToFarenheit(inputTemperature));
                }catch (Exception e){
                    Message.printNotValidNumberErrorMessage(stringTemp);
                    Message.printUsageErrorMessage();
                }
            break;

            default:
                Message.printUnknownModeErrorMessage(this.mode);
                Message.printUsageErrorMessage();
            break;
        }

    }

    private double celsiusToFarenheit(double temperature){
        return (temperature * (9d/5d)) +32d;
    }

    private double farenheitToCelsius(double temperature){
        return (temperature - 32d) * (5d/9d);
    }
}
