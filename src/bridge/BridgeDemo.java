package bridge;

public class BridgeDemo {

    /*
    Bridge patter

    we are needed to print the movie details with various format as needed by client

    PrintFormatter and HtmlFormatter are 2 seperate class which implements Formatter interface to get the movie details as string in various needed format

    The abstract class Printer provides us with common functionality to use for transforming any object to desired format

    MoviePrinter extends the abstract class Printer and allows us to transform Movie object to get header and details in desired format.
     */

    public static void main(String[] args){

        Movie movie = new Movie();
        movie.setTitle("Animal");
        movie.setYear("2023");
        movie.setRuntime("3:00");
        movie.setClassification("Action");

        Formatter formatter = new PrintFormatter();
        Printer printer = new MoviePrinter(movie);

        String print = printer.print(formatter);

        System.out.print(print);

        Formatter htmlFormatter = new HtmlFormatter();

        System.out.print(printer.print(htmlFormatter));

    }
}
