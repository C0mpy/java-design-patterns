package com.compi.bridge;

import com.compi.bridge.formatter.Formatter;
import com.compi.bridge.formatter.HtmlFormatter;
import com.compi.bridge.formatter.PrintFormatter;
import com.compi.bridge.model.Movie;
import com.compi.bridge.printer.MoviePrinter;
import com.compi.bridge.printer.Printer;

public class BridgeDemo {

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printedMaterial);

        Formatter htmlFormatter = new HtmlFormatter();

        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);
    }
}

