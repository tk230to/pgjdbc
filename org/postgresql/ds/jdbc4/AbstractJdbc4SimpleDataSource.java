/*-------------------------------------------------------------------------
*
* Copyright (c) 2004-2008, PostgreSQL Global Development Group
*
* IDENTIFICATION
*   $PostgreSQL: pgjdbc/org/postgresql/ds/jdbc4/AbstractJdbc4SimpleDataSource.java,v 1.3 2008/01/08 06:56:28 jurka Exp $
*
*-------------------------------------------------------------------------
*/
package org.postgresql.ds.jdbc4;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

import org.postgresql.ds.jdbc23.AbstractJdbc23SimpleDataSource;

public abstract class AbstractJdbc4SimpleDataSource extends AbstractJdbc23SimpleDataSource
{
    public boolean isWrapperFor(Class<?> iface) throws SQLException
    {
        throw org.postgresql.Driver.notImplemented(this.getClass(), "isWrapperFor(Class<?>)");
    }

    public <T> T unwrap(Class<T> iface) throws SQLException
    {
        throw org.postgresql.Driver.notImplemented(this.getClass(), "unwrap(Class<T>)");
    }

    public java.util.logging.Logger getParentLogger() throws SQLFeatureNotSupportedException
    {
        throw org.postgresql.Driver.notImplemented(this.getClass(), "getParentLogger()");
    }

}
