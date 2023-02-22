package co.la.utils;

import java.text.DecimalFormat;

public final class Message {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void printUsageErrorMessage(){
        System.out.println("Usage: <f2c|c2f> number [number... ]\n        " +
                "example: f2c 32 212.0");
    }

    public static void printUnknownModeErrorMessage(String unknownMode){
        System.out.println("Unknown mode '" + unknownMode + "'");
    }

    public static void printNotValidNumberErrorMessage(String invalidNumber){
        System.out.println("'"+invalidNumber+"' in not a valid number");
    }

    public static void printOneValueConvertionf2cMessage(double inputTemperature, double convertedTemperature){
        System.out.println(df.format(inputTemperature) + "°F is equivalent to " + df.format(convertedTemperature) +"°C");
    }

    public static void printOneValueConvertionC2FMessage(double inputTemperature, double convertedTemperature){
        System.out.println(df.format(inputTemperature) + "°C is equivalent to " + df.format(convertedTemperature) +"°F");
    }

    public static void printMultipleValuesConvertionf2cHeader(){
        System.out.println("°F          °C");
    }

    public static void printMultipleValuesConvertionc2fHeader(){
        System.out.println("°C          °F");
    }

    public static void printMultipleValuesConvertionMessage(double inputTemperature, double convertedTemperature){
        System.out.println(df.format(inputTemperature) + "        " + df.format(convertedTemperature));
    }

    public static void printMultipleValuesConvertionNaNMessage(String stringTemp){
        System.out.println(stringTemp + "        " + Double.NaN);
    }





}
