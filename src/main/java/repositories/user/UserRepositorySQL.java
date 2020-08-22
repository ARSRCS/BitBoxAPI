package repositories.user;

import models.User;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class UserRepositorySQL implements UserRepository{

    private final Sql2o sql2o;

    public UserRepositorySQL(String connection){
        this.sql2o = sql2o(connection);
    }

    private Sql2o sql2o(String connectionUrl){
        return new Sql2o(connectionUrl,"postgres","admin");
    }

    @Override
    public void add(User user) {
        final String query = "insert into store.users (user_name,user_pass,is_superuser) values (:nombre, :contra, :esadmin);";
        try(Connection connection = sql2o.open()) {
                connection.createQuery(query)
                        .addParameter("nombre",user.getUserName())
                        .addParameter("contra",user.getUserPass())
                        .addParameter("esadmin",user.getIsSuperuser())
                        .executeUpdate();
            }
    }

    @Override
    public void delete(int userId) {
        final String query = "delete from store.users where user_id="+userId+";";
        try (Connection connection = sql2o.open()){
            connection.createQuery(query).executeUpdate();
        }
    }

    @Override
    public void update(int userId, User user) {
        final String query = "update store.users set user_name=:nombre,user_pass=:contra,is_superuser=:esadmin) where user_id="+user.getUserId()+";";
        try(Connection connection = sql2o.open()) {
            connection.createQuery(query)
                    .addParameter("nombre",user.getUserName())
                    .addParameter("contra",user.getUserPass())
                    .addParameter("esadmin",user.getIsSuperuser())
                    .executeUpdate();
        }
    }

    @Override
    public User get(int userId) {
        final String query = "select * from store.users where user_id="+userId+";";
        try (Connection connection = sql2o.open()){
            return connection.createQuery(query).executeAndFetch(User.class).get(0);
        }
    }

    @Override
    public User login(User user) {
        final String query = "select * from store.users where user_name='"+user.getUserName()+"' and user_pass='"+user.getUserPass()+"';";
        try (Connection connection = sql2o.open()){
            return connection.createQuery(query).executeAndFetch(User.class).get(0);
        }
    }
}
