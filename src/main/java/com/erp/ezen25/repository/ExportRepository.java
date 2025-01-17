package com.erp.ezen25.repository;

import com.erp.ezen25.entity.Export;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ExportRepository extends JpaRepository<Export, Long>, QuerydslPredicateExecutor<Export> {
}
