dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.sqlite.JDBC"
    username = ""
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
	hibernate.dialect = 'hibernate.SQLiteDialect'
}

// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:sqlite:database/grails.db"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:sqlite:database/grails.db"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:sqlite:database/grails.db"
        }
    }
}
