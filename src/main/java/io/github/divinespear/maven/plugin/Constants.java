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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Constants {

  private Constants() {
  }

  /* jpa common */
  public static final String JAKARTA_SCHEMA_GENERATION_NONE_ACTION = "none";
  public static final String JAKARTA_SCHEMA_GENERATION_DATABASE_ACTION = "jakarta.persistence.schema-generation.database.action";
  public static final String JAKARTA_SCHEMA_GENERATION_SCRIPTS_ACTION = "jakarta.persistence.schema-generation.scripts.action";
  public static final String JAKARTA_SCHEMA_GENERATION_SCRIPTS_CREATE_TARGET = "jakarta.persistence.schema-generation.scripts.create-target";
  public static final String JAKARTA_SCHEMA_GENERATION_SCRIPTS_DROP_TARGET = "jakarta.persistence.schema-generation.scripts.drop-target";
  public static final String JAKARTA_SCHEMA_DATABASE_PRODUCT_NAME = "jakarta.persistence.database-product-name";
  public static final String JAKARTA_SCHEMA_DATABASE_MAJOR_VERSION = "jakarta.persistence.database-major-version";
  public static final String JAKARTA_SCHEMA_DATABASE_MINOR_VERSION = "jakarta.persistence.database-minor-version";
  public static final String JAKARTA_JDBC_DRIVER = "jakarta.persistence.jdbc.driver";
  public static final String JAKARTA_JDBC_URL = "jakarta.persistence.jdbc.url";
  public static final String JAKARTA_JDBC_USER = "jakarta.persistence.jdbc.user";
  public static final String JAKARTA_JDBC_PASSWORD = "jakarta.persistence.jdbc.password";
  public static final String JAKARTA_SCHEMA_GENERATION_METADATA_SOURCE = "metadata";
  public static final String JAKARTA_SCHEMA_GENERATION_CREATE_SOURCE = "jakarta.persistence.schema-generation.create-source";
  public static final String JAKARTA_SCHEMA_GENERATION_DROP_SOURCE = "jakarta.persistence.schema-generation.drop-source";
  public static final String JAKARTA_SCHEMA_GENERATION_CREATE_SCRIPT_SOURCE = "jakarta.persistence.schema-generation.create-script-source";
  public static final String JAKARTA_SCHEMA_GENERATION_DROP_SCRIPT_SOURCE = "jakarta.persistence.schema-generation.drop-script-source";
  public static final String JAKARTA_SCHEMA_GEN_CONNECTION = "jakarta.persistence.schema-generation-connection";
  public static final String JAKARTA_VALIDATION_MODE = "jakarta.persistence.validation.mode";
  public static final String JAKARTA_TRANSACTION_TYPE = "jakarta.persistence.transactionType";
  public static final String JAKARTA_JTA_DATASOURCE = "jakarta.persistence.jtaDataSource";
  public static final String JAKARTA_NON_JTA_DATASOURCE = "jakarta.persistence.nonJtaDataSource";

  /* eclipse specific */
  public static final String ECLIPSELINK_PERSISTENCE_XML = "eclipselink.persistencexml";
  public static final String ECLIPSELINK_WEAVING = "eclipselink.weaving";

  /* hibernate specific */
  public static final String HIBERNATE_AUTODETECTION = "hibernate.archive.autodetection";
  public static final String HIBERNATE_DIALECT = "hibernate.dialect";

  /* values */
  public static final String DEFAULT_PERSISTENCE_UNIT_NAME = "default";
  public static final String JAKARTA_TRANSACTION_TYPE_RESOURCE_LOCAL = "RESOURCE_LOCAL";

  /* predefined providers */
  public static final Map<String, String> PERSISTENCE_PROVIDER_MAP;

  /* line separator */
  public static final Map<String, String> LINE_SEPARATOR_MAP;

  static {
    final Map<String, String> providers = new HashMap<>();
    providers.put("eclipselink", "org.eclipse.persistence.jpa.PersistenceProvider");
    providers.put("hibernate", "org.hibernate.jpa.HibernatePersistenceProvider");
    providers.put("hibernate+spring", "org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider");
    PERSISTENCE_PROVIDER_MAP = Collections.unmodifiableMap(providers);

    final Map<String, String> separators = new HashMap<>();
    separators.put("CRLF", "\\r\\n");
    separators.put("LF", "\\n");
    separators.put("CR", "\\r");
    LINE_SEPARATOR_MAP = Collections.unmodifiableMap(separators);
  }
}

