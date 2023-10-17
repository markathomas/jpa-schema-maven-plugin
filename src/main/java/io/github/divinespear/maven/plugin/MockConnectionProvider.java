package io.github.divinespear.maven.plugin;

import org.hibernate.engine.jdbc.connections.internal.UserSuppliedConnectionProviderImpl;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.UnknownUnwrapTypeException;

import java.sql.Connection;
import java.sql.SQLException;

public class MockConnectionProvider implements ConnectionProvider {

    @Override
    public Connection getConnection() throws SQLException {
        final JpaSchemaGeneratorMojo mojo = JpaSchemaGeneratorMojo.CURRENT.get();
        return new ConnectionMock(mojo.getDatabaseProductName(), mojo.getDatabaseMajorVersion(), mojo.getDatabaseMinorVersion());
    }

    @Override
    public void closeConnection(Connection conn) throws SQLException {

    }

    @Override
    public boolean supportsAggressiveRelease() {
        return false;
    }

    @Override
    public boolean isUnwrappableAs(Class<?> unwrapType) {
        return ConnectionProvider.class.equals( unwrapType ) ||
          MockConnectionProvider.class.isAssignableFrom( unwrapType );
    }

    @Override
    public <T> T unwrap(Class<T> unwrapType) {
        if ( ConnectionProvider.class.equals( unwrapType ) ||
          MockConnectionProvider.class.isAssignableFrom( unwrapType ) ) {
            return (T) this;
        }
        else {
            throw new UnknownUnwrapTypeException( unwrapType );
        }
    }
}
