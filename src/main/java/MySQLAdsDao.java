import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ads");
            while (resultSet.next()){
                ads.add(new Ad(
                        resultSet.getInt("id"),
                        resultSet.getInt("user_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description")


                ));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement statement = connection.createStatement();
            String insertAd = "INSERT INTO ads (user_id, title, description) VALUES ("
                    + "'" + ad.getUserId() + "',"
                    + "'" + ad.getTitle() + "',"
                    + "'" + ad.getDescription() + "')";
            statement.executeUpdate(insertAd, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);

        } catch (SQLException error) {
            throw new RuntimeException("Could not insert ad successfully");
        }
    }
}
