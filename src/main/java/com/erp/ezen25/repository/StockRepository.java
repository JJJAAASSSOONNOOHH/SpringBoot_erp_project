package com.erp.ezen25.repository;

import com.erp.ezen25.entity.Product_Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StockRepository extends JpaRepository<Product_Stock, Long> {
    @Query("select ps, i.importDate from Product_Stock ps left join Import i on i.product = ps.product")
    List<Object[]> getImportDateWithImport();
}