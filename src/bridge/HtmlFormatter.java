package bridge;

import java.util.List;

public class HtmlFormatter implements Formatter{
    @Override
    public String format(String header, List<Details> details) {
        StringBuilder builder = new StringBuilder();

        builder.append("<table>");
        builder.append("<th>");
        builder.append("classification");
        builder.append("<\th>");
        builder.append("<th>");
        builder.append(header);
        builder.append("<\th>");

        for (Details d : details){
            builder.append("<tr><td>");
            builder.append(d.getLabel());
            builder.append("</td><td>");
            builder.append(d.getValue());
            builder.append("</td></tr>");
        }
        builder.append("</table?");
        return builder.toString();
    }
}
