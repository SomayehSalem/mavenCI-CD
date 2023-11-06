package com.restService.service.jdbc;

import org.springframework.boot.autoconfigure.web.ServerProperties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by EDW on 4/3/2021.
 */
public class StoredProcedure {

    @PersistenceContext
    private EntityManager entityManager;

    private Map<Integer, Object> inParams;
    private Map<Integer, Integer> outParams;
    private String query;
    private CallableStatement statement;
    private Connection connection;
    private boolean executed = false;

    public StoredProcedure() {
        inParams = new HashMap<>();
        outParams = new HashMap<>();
    }

    @PostConstruct
    public void init() {
    }

    public void clear() {
        inParams.clear();
        outParams.clear();
    }

    public StoredProcedure query(String queryString) {
        this.query = queryString;
        clear();
        executed = false;
        return this;
    }

    public StoredProcedure setInParameter(int index, Object o) {
        inParams.put(index, o);
        return this;
    }

    public StoredProcedure setOutParameter(int index, int sqlType) {
        outParams.put(index, sqlType);
        return this;
    }

    public Object getOutParameter(int index) throws SQLException {
        if (!executed) {
            execute();
        }
        return statement.getObject(index);
    }

    public void execute() throws SQLException {
        connection = getConnection();
        statement = connection.prepareCall(query);
//        logger.info("Executing query " + query);
//        logger.info("Seeting IN parameters...");
        for (Integer index : inParams.keySet()) {
            //  logger.info("Setting " + inParams.get(index) + " at index " + index);
            statement.setObject(index, inParams.get(index));
        }

        for (Integer index : outParams.keySet()) {
            //    logger.info("Setting " + outParams.get(index) + " at index " + index);
            statement.registerOutParameter(index, outParams.get(index));
        }

        statement.execute();
        executed = true;
    }

    @PreDestroy
    public void destroy() throws SQLException {
        if (statement != null) {
            statement.close();
        }

        if (connection != null) {
            connection.close();
        }
    }

    public Connection getConnection() throws SQLException {
        if (connection == null || !connection.isValid(10)) {
            ServerProperties.Session session = (ServerProperties.Session) entityManager.getDelegate();
//            connection = session.
        }
        return connection;
    }

}
