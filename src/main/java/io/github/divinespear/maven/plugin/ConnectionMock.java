/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.github.divinespear.maven.plugin;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public final class ConnectionMock
    implements Connection {

  private final String productName;
  private final int majorVersion;
  private final int minorVersion;

  public ConnectionMock(String productName,
                        Integer majorVersion,
                        Integer minorVersion) {
    this.productName = productName;
    this.majorVersion = majorVersion == null ? 0 : majorVersion;
    this.minorVersion = minorVersion == null ? 0 : minorVersion;
  }

  @Override
  public <T> T unwrap(Class<T> iface) {
    return null;
  }

  @Override
  public boolean isWrapperFor(Class<?> iface) {
    return false;
  }

  @Override
  public Statement createStatement() {
    return new StatementMock();
  }

  @Override
  public PreparedStatement prepareStatement(String sql) {
    return null;
  }

  @Override
  public CallableStatement prepareCall(String sql) {
    return null;
  }

  @Override
  public String nativeSQL(String sql) {
    return null;
  }

  @Override
  public void setAutoCommit(boolean autoCommit) {
  }

  @Override
  public boolean getAutoCommit() {
    return true;
  }

  @Override
  public void commit() {
  }

  @Override
  public void rollback() {
  }

  @Override
  public void close() {
  }

  @Override
  public boolean isClosed() {
    return false;
  }

  private final DatabaseMetaData metadataInstance = new DatabaseMetaDataMock(this);

  @Override
  public DatabaseMetaData getMetaData() {
    return metadataInstance;
  }

  @Override
  public void setReadOnly(boolean readOnly) {
  }

  @Override
  public boolean isReadOnly() {
    return false;
  }

  @Override
  public void setCatalog(String catalog) {
  }

  @Override
  public String getCatalog() {
    return null;
  }

  @Override
  public void setTransactionIsolation(int level) {
  }

  @Override
  public int getTransactionIsolation() {
    return Connection.TRANSACTION_NONE;
  }

  @Override
  public SQLWarning getWarnings() {
    return null;
  }

  @Override
  public void clearWarnings() {
  }

  @Override
  public Statement createStatement(int resultSetType,
                                   int resultSetConcurrency) {
    return new StatementMock();
  }

  @Override
  public PreparedStatement prepareStatement(String sql,
                                            int resultSetType,
                                            int resultSetConcurrency) {
    return null;
  }

  @Override
  public CallableStatement prepareCall(String sql,
                                       int resultSetType,
                                       int resultSetConcurrency) {
    return null;
  }

  @Override
  public Map<String, Class<?>> getTypeMap() {
    return null;
  }

  @Override
  public void setTypeMap(Map<String, Class<?>> map) {
  }

  @Override
  public void setHoldability(int holdability) {
  }

  @Override
  public int getHoldability() {
    return 0;
  }

  @Override
  public Savepoint setSavepoint() {
    return null;
  }

  @Override
  public Savepoint setSavepoint(String name) {
    return null;
  }

  @Override
  public void rollback(Savepoint savepoint) {
  }

  @Override
  public void releaseSavepoint(Savepoint savepoint) {
  }

  @Override
  public Statement createStatement(int resultSetType,
                                   int resultSetConcurrency,
                                   int resultSetHoldability) {
    return new StatementMock();
  }

  @Override
  public PreparedStatement prepareStatement(String sql,
                                            int resultSetType,
                                            int resultSetConcurrency,
                                            int resultSetHoldability) {
    return null;
  }

  @Override
  public CallableStatement prepareCall(String sql,
                                       int resultSetType,
                                       int resultSetConcurrency,
                                       int resultSetHoldability) {
    return null;
  }

  @Override
  public PreparedStatement prepareStatement(String sql,
                                            int autoGeneratedKeys) {
    return null;
  }

  @Override
  public PreparedStatement prepareStatement(String sql,
                                            int[] columnIndexes) {
    return null;
  }

  @Override
  public PreparedStatement prepareStatement(String sql,
                                            String[] columnNames) {
    return null;
  }

  @Override
  public Clob createClob() {
    return null;
  }

  @Override
  public Blob createBlob() {
    return null;
  }

  @Override
  public NClob createNClob() {
    return null;
  }

  @Override
  public SQLXML createSQLXML() {
    return null;
  }

  @Override
  public boolean isValid(int timeout) {
    return false;
  }

  @Override
  public void setClientInfo(String name,
                            String value) {
  }

  @Override
  public void setClientInfo(Properties properties) {
  }

  @Override
  public String getClientInfo(String name) {
    return null;
  }

  @Override
  public Properties getClientInfo() {
    return null;
  }

  @Override
  public Array createArrayOf(String typeName,
                             Object[] elements) {
    return null;
  }

  @Override
  public Struct createStruct(String typeName,
                             Object[] attributes) {
    return null;
  }

  @Override
  public void setSchema(String schema) {
  }

  @Override
  public String getSchema() {
    return null;
  }

  @Override
  public void abort(Executor executor) {
  }

  @Override
  public void setNetworkTimeout(Executor executor,
                                int milliseconds) {

  }

  @Override
  public int getNetworkTimeout() {
    return 0;
  }

  final class DatabaseMetaDataMock
      implements DatabaseMetaData {

    private final Connection conn;

    DatabaseMetaDataMock(Connection conn) {
      this.conn = conn;
    }

    @Override
    public <T> T unwrap(Class<T> iface) {
      return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) {
      return false;
    }

    @Override
    public boolean usesLocalFiles() {
      return false;
    }

    @Override
    public boolean usesLocalFilePerTable() {
      return false;
    }

    @Override
    public boolean updatesAreDetected(int type) {
      return false;
    }

    @Override
    public boolean supportsUnionAll() {
      return false;
    }

    @Override
    public boolean supportsUnion() {
      return false;
    }

    @Override
    public boolean supportsTransactions() {
      return false;
    }

    @Override
    public boolean supportsTransactionIsolationLevel(int level) {
      return false;
    }

    @Override
    public boolean supportsTableCorrelationNames() {
      return false;
    }

    @Override
    public boolean supportsSubqueriesInQuantifieds() {
      return false;
    }

    @Override
    public boolean supportsSubqueriesInIns() {
      return false;
    }

    @Override
    public boolean supportsSubqueriesInExists() {
      return false;
    }

    @Override
    public boolean supportsSubqueriesInComparisons() {
      return false;
    }

    @Override
    public boolean supportsStoredProcedures() {
      return false;
    }

    @Override
    public boolean supportsStoredFunctionsUsingCallSyntax() {
      return false;
    }

    @Override
    public boolean supportsStatementPooling() {
      return false;
    }

    @Override
    public boolean supportsSelectForUpdate() {
      return false;
    }

    @Override
    public boolean supportsSchemasInTableDefinitions() {
      return false;
    }

    @Override
    public boolean supportsSchemasInProcedureCalls() {
      return false;
    }

    @Override
    public boolean supportsSchemasInPrivilegeDefinitions() {
      return false;
    }

    @Override
    public boolean supportsSchemasInIndexDefinitions() {
      return false;
    }

    @Override
    public boolean supportsSchemasInDataManipulation() {
      return false;
    }

    @Override
    public boolean supportsSavepoints() {
      return false;
    }

    @Override
    public boolean supportsResultSetType(int type) {
      return false;
    }

    @Override
    public boolean supportsResultSetHoldability(int holdability) {
      return false;
    }

    @Override
    public boolean supportsResultSetConcurrency(int type,
                                                int concurrency) {
      return false;
    }

    @Override
    public boolean supportsPositionedUpdate() {
      return false;
    }

    @Override
    public boolean supportsPositionedDelete() {
      return false;
    }

    @Override
    public boolean supportsOuterJoins() {
      return false;
    }

    @Override
    public boolean supportsOrderByUnrelated() {
      return false;
    }

    @Override
    public boolean supportsOpenStatementsAcrossRollback() {
      return false;
    }

    @Override
    public boolean supportsOpenStatementsAcrossCommit() {
      return false;
    }

    @Override
    public boolean supportsOpenCursorsAcrossRollback() {
      return false;
    }

    @Override
    public boolean supportsOpenCursorsAcrossCommit() {
      return false;
    }

    @Override
    public boolean supportsNonNullableColumns() {
      return false;
    }

    @Override
    public boolean supportsNamedParameters() {
      return false;
    }

    @Override
    public boolean supportsMultipleTransactions() {
      return false;
    }

    @Override
    public boolean supportsMultipleResultSets() {
      return false;
    }

    @Override
    public boolean supportsMultipleOpenResults() {
      return false;
    }

    @Override
    public boolean supportsMixedCaseQuotedIdentifiers() {
      return false;
    }

    @Override
    public boolean supportsMixedCaseIdentifiers() {
      return false;
    }

    @Override
    public boolean supportsMinimumSQLGrammar() {
      return false;
    }

    @Override
    public boolean supportsLimitedOuterJoins() {
      return false;
    }

    @Override
    public boolean supportsLikeEscapeClause() {
      return false;
    }

    @Override
    public boolean supportsIntegrityEnhancementFacility() {
      return false;
    }

    @Override
    public boolean supportsGroupByUnrelated() {
      return false;
    }

    @Override
    public boolean supportsGroupByBeyondSelect() {
      return false;
    }

    @Override
    public boolean supportsGroupBy() {
      return false;
    }

    @Override
    public boolean supportsGetGeneratedKeys() {
      return false;
    }

    @Override
    public boolean supportsFullOuterJoins() {
      return false;
    }

    @Override
    public boolean supportsExtendedSQLGrammar() {
      return false;
    }

    @Override
    public boolean supportsExpressionsInOrderBy() {
      return false;
    }

    @Override
    public boolean supportsDifferentTableCorrelationNames() {
      return false;
    }

    @Override
    public boolean supportsDataManipulationTransactionsOnly() {
      return false;
    }

    @Override
    public boolean supportsDataDefinitionAndDataManipulationTransactions() {
      return false;
    }

    @Override
    public boolean supportsCorrelatedSubqueries() {
      return false;
    }

    @Override
    public boolean supportsCoreSQLGrammar() {
      return false;
    }

    @Override
    public boolean supportsConvert(int fromType,
                                   int toType) {
      return false;
    }

    @Override
    public boolean supportsConvert() {
      return false;
    }

    @Override
    public boolean supportsColumnAliasing() {
      return false;
    }

    @Override
    public boolean supportsCatalogsInTableDefinitions() {
      return false;
    }

    @Override
    public boolean supportsCatalogsInProcedureCalls() {
      return false;
    }

    @Override
    public boolean supportsCatalogsInPrivilegeDefinitions() {
      return false;
    }

    @Override
    public boolean supportsCatalogsInIndexDefinitions() {
      return false;
    }

    @Override
    public boolean supportsCatalogsInDataManipulation() {
      return false;
    }

    @Override
    public boolean supportsBatchUpdates() {
      return false;
    }

    @Override
    public boolean supportsAlterTableWithDropColumn() {
      return false;
    }

    @Override
    public boolean supportsAlterTableWithAddColumn() {
      return false;
    }

    @Override
    public boolean supportsANSI92IntermediateSQL() {
      return false;
    }

    @Override
    public boolean supportsANSI92FullSQL() {
      return false;
    }

    @Override
    public boolean supportsANSI92EntryLevelSQL() {
      return false;
    }

    @Override
    public boolean storesUpperCaseQuotedIdentifiers() {
      return false;
    }

    @Override
    public boolean storesUpperCaseIdentifiers() {
      return false;
    }

    @Override
    public boolean storesMixedCaseQuotedIdentifiers() {
      return false;
    }

    @Override
    public boolean storesMixedCaseIdentifiers() {
      return false;
    }

    @Override
    public boolean storesLowerCaseQuotedIdentifiers() {
      return false;
    }

    @Override
    public boolean storesLowerCaseIdentifiers() {
      return false;
    }

    @Override
    public boolean ownUpdatesAreVisible(int type) {
      return false;
    }

    @Override
    public boolean ownInsertsAreVisible(int type) {
      return false;
    }

    @Override
    public boolean ownDeletesAreVisible(int type) {
      return false;
    }

    @Override
    public boolean othersUpdatesAreVisible(int type) {
      return false;
    }

    @Override
    public boolean othersInsertsAreVisible(int type) {
      return false;
    }

    @Override
    public boolean othersDeletesAreVisible(int type) {
      return false;
    }

    @Override
    public boolean nullsAreSortedLow() {
      return false;
    }

    @Override
    public boolean nullsAreSortedHigh() {
      return false;
    }

    @Override
    public boolean nullsAreSortedAtStart() {
      return false;
    }

    @Override
    public boolean nullsAreSortedAtEnd() {
      return false;
    }

    @Override
    public boolean nullPlusNonNullIsNull() {
      return false;
    }

    @Override
    public boolean locatorsUpdateCopy() {
      return false;
    }

    @Override
    public boolean isReadOnly() {
      return false;
    }

    @Override
    public boolean isCatalogAtStart() {
      return false;
    }

    @Override
    public boolean insertsAreDetected(int type) {
      return false;
    }

    @Override
    public ResultSet getVersionColumns(String catalog,
                                       String schema,
                                       String table) {
      return null;
    }

    @Override
    public String getUserName() {
      return null;
    }

    @Override
    public String getURL() {
      return null;
    }

    @Override
    public ResultSet getUDTs(String catalog,
                             String schemaPattern,
                             String typeNamePattern,
                             int[] types) {
      return null;
    }

    @Override
    public ResultSet getTypeInfo() {
      return null;
    }

    @Override
    public String getTimeDateFunctions() {
      return null;
    }

    @Override
    public ResultSet getTables(String catalog,
                               String schemaPattern,
                               String tableNamePattern,
                               String[] types) {
      return null;
    }

    @Override
    public ResultSet getTableTypes() {
      return null;
    }

    @Override
    public ResultSet getTablePrivileges(String catalog,
                                        String schemaPattern,
                                        String tableNamePattern) {
      return null;
    }

    @Override
    public String getSystemFunctions() {
      return null;
    }

    @Override
    public ResultSet getSuperTypes(String catalog,
                                   String schemaPattern,
                                   String typeNamePattern) {
      return null;
    }

    @Override
    public ResultSet getSuperTables(String catalog,
                                    String schemaPattern,
                                    String tableNamePattern) {
      return null;
    }

    @Override
    public String getStringFunctions() {
      return null;
    }

    @Override
    public String getSearchStringEscape() {
      return null;
    }

    @Override
    public ResultSet getSchemas(String catalog,
                                String schemaPattern) {
      return null;
    }

    @Override
    public ResultSet getSchemas() {
      return null;
    }

    @Override
    public String getSchemaTerm() {
      return null;
    }

    @Override
    public int getSQLStateType() {
      return DatabaseMetaData.sqlStateSQL;
    }

    @Override
    public String getSQLKeywords() {
      return null;
    }

    @Override
    public RowIdLifetime getRowIdLifetime() {
      return null;
    }

    @Override
    public int getResultSetHoldability() {
      return 0;
    }

    @Override
    public ResultSet getProcedures(String catalog,
                                   String schemaPattern,
                                   String procedureNamePattern) {
      return null;
    }

    @Override
    public String getProcedureTerm() {
      return null;
    }

    @Override
    public ResultSet getProcedureColumns(String catalog,
                                         String schemaPattern,
                                         String procedureNamePattern,
                                         String columnNamePattern) {
      return null;
    }

    @Override
    public ResultSet getPrimaryKeys(String catalog,
                                    String schema,
                                    String table) {
      return null;
    }

    @Override
    public String getNumericFunctions() {
      return null;
    }

    @Override
    public int getMaxUserNameLength() {
      return 0;
    }

    @Override
    public int getMaxTablesInSelect() {
      return 0;
    }

    @Override
    public int getMaxTableNameLength() {
      return 0;
    }

    @Override
    public int getMaxStatements() {
      return 0;
    }

    @Override
    public int getMaxStatementLength() {
      return 0;
    }

    @Override
    public int getMaxSchemaNameLength() {
      return 0;
    }

    @Override
    public int getMaxRowSize() {
      return 0;
    }

    @Override
    public int getMaxProcedureNameLength() {
      return 0;
    }

    @Override
    public int getMaxIndexLength() {
      return 0;
    }

    @Override
    public int getMaxCursorNameLength() {
      return 0;
    }

    @Override
    public int getMaxConnections() {
      return 0;
    }

    @Override
    public int getMaxColumnsInTable() {
      return 0;
    }

    @Override
    public int getMaxColumnsInSelect() {
      return 0;
    }

    @Override
    public int getMaxColumnsInOrderBy() {
      return 0;
    }

    @Override
    public int getMaxColumnsInIndex() {
      return 0;
    }

    @Override
    public int getMaxColumnsInGroupBy() {
      return 0;
    }

    @Override
    public int getMaxColumnNameLength() {
      return 0;
    }

    @Override
    public int getMaxCharLiteralLength() {
      return 0;
    }

    @Override
    public int getMaxCatalogNameLength() {
      return 0;
    }

    @Override
    public int getMaxBinaryLiteralLength() {
      return 0;
    }

    @Override
    public int getJDBCMinorVersion() {
      return 0;
    }

    @Override
    public int getJDBCMajorVersion() {
      return 0;
    }

    @Override
    public ResultSet getIndexInfo(String catalog,
                                  String schema,
                                  String table,
                                  boolean unique,
                                  boolean approximate) {
      return null;
    }

    @Override
    public ResultSet getImportedKeys(String catalog,
                                     String schema,
                                     String table) {
      return null;
    }

    @Override
    public String getIdentifierQuoteString() {
      return null;
    }

    @Override
    public ResultSet getFunctions(String catalog,
                                  String schemaPattern,
                                  String functionNamePattern) {
      return null;
    }

    @Override
    public ResultSet getFunctionColumns(String catalog,
                                        String schemaPattern,
                                        String functionNamePattern,
                                        String columnNamePattern) {
      return null;
    }

    @Override
    public String getExtraNameCharacters() {
      return null;
    }

    @Override
    public ResultSet getExportedKeys(String catalog,
                                     String schema,
                                     String table) {
      return null;
    }

    @Override
    public String getDriverVersion() {
      return null;
    }

    @Override
    public String getDriverName() {
      return ConnectionMock.this.productName;
    }

    @Override
    public int getDriverMinorVersion() {
      return 0;
    }

    @Override
    public int getDriverMajorVersion() {
      return 0;
    }

    @Override
    public int getDefaultTransactionIsolation() {
      return 0;
    }

    @Override
    public String getDatabaseProductVersion() {
      return null;
    }

    @Override
    public String getDatabaseProductName() {
      return ConnectionMock.this.productName;
    }

    @Override
    public int getDatabaseMinorVersion() {
      return ConnectionMock.this.minorVersion;
    }

    @Override
    public int getDatabaseMajorVersion() {
      return ConnectionMock.this.majorVersion;
    }

    @Override
    public ResultSet getCrossReference(String parentCatalog,
                                       String parentSchema,
                                       String parentTable,
                                       String foreignCatalog,
                                       String foreignSchema,
                                       String foreignTable) {
      return null;
    }

    @Override
    public Connection getConnection() {
      return this.conn;
    }

    @Override
    public ResultSet getColumns(String catalog,
                                String schemaPattern,
                                String tableNamePattern,
                                String columnNamePattern) {
      return null;
    }

    @Override
    public ResultSet getColumnPrivileges(String catalog,
                                         String schema,
                                         String table,
                                         String columnNamePattern) {
      return null;
    }

    @Override
    public ResultSet getClientInfoProperties() {
      return null;
    }

    @Override
    public ResultSet getCatalogs() {
      return null;
    }

    @Override
    public String getCatalogTerm() {
      return null;
    }

    @Override
    public String getCatalogSeparator() {
      return null;
    }

    @Override
    public ResultSet getBestRowIdentifier(String catalog,
                                          String schema,
                                          String table,
                                          int scope,
                                          boolean nullable) {
      return null;
    }

    @Override
    public ResultSet getAttributes(String catalog,
                                   String schemaPattern,
                                   String typeNamePattern,
                                   String attributeNamePattern) {
      return null;
    }

    @Override
    public boolean doesMaxRowSizeIncludeBlobs() {
      return false;
    }

    @Override
    public boolean deletesAreDetected(int type) {
      return false;
    }

    @Override
    public boolean dataDefinitionIgnoredInTransactions() {
      return false;
    }

    @Override
    public boolean dataDefinitionCausesTransactionCommit() {
      return false;
    }

    @Override
    public boolean autoCommitFailureClosesAllResultSets() {
      return false;
    }

    @Override
    public boolean allTablesAreSelectable() {
      return false;
    }

    @Override
    public boolean allProceduresAreCallable() {
      return false;
    }

    @Override
    public ResultSet getPseudoColumns(String catalog,
                                      String schemaPattern,
                                      String tableNamePattern,
                                      String columnNamePattern) {
      return null;
    }

    @Override
    public boolean generatedKeyAlwaysReturned() {
      return false;
    }
  }
}
