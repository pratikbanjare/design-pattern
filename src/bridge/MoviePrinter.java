package bridge;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer{

    private final Movie movie;

    public MoviePrinter(Movie movie){
        this.movie = movie;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }

    @Override
    protected List<Details> getDetails() {
        List<Details> details = new ArrayList<>();

        details.add(new Details("titile",movie.getTitle()));
        details.add(new Details("Year",movie.getYear()));
        details.add(new Details("runtime",movie.getRuntime()));
        return details;
    }
}
