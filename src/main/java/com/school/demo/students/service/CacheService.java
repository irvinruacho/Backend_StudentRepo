package com.school.demo.students.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Autowired
    private SessionFactory sessionFactory;

    @Value("${hibernate.cache.clear}")
    private boolean clearCache;

    // Método para limpiar el caché de Hibernate
    public void manageHibernateCache() {
        if (clearCache) {
            sessionFactory.getCache().evictAllRegions();
        }
    }
}