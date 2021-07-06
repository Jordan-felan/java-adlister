import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album album1 = new Album(1, "Michael Jackson", "Thiller", 1982, 47.3, "Pop/Rock/R&B");
        Album album2 = new Album(2, "AC/DC", "Back in Black", 1980, 26.1, "Hard Rock");
        Album album3 = new Album(3, "Pink Floyd", "The Dark Side f the Moon", 1973, 24.2, "Progressive Rock");

        Author AnneRice = new Author();
        AnneRice.setId(1);
        AnneRice.setFirstName("Anne");
        AnneRice.setLastName("Rice");

        Author StephenKing = new Author();
        StephenKing.setId(2);
        StephenKing.setFirstName("Stephen");
        StephenKing.setLastName("King");

        ArrayList<Quote> quotes = new ArrayList<>();

        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setContent("Either get busy living or get busy dying");
        quote1.setAuthor(StephenKing);

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setContent("Books are a uniquely portable magic");
        quote2.setAuthor(StephenKing);

        Quote quote3 = new Quote();
        quote3.setId(3);
        quote3.setContent("The only power that exists is inside ourselves");
        quote3.setAuthor(AnneRice);

        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for(Quote quote : quotes){
            if(quote.getAuthor().getFirstName().equalsIgnoreCase("Stephen"))
                System.out.println(quote.getContent() + " By " + quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName());
        }
        System.out.println(album1.getName());


    }
}
