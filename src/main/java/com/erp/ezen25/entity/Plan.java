package com.erp.ezen25.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.Length;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@DynamicUpdate
@DynamicInsert
@Table(name = "plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "planId")
    private Long planId;

    @Column(nullable = false)
    private Long brandId;

    @Column(nullable = false)
    private Long productId;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Long planNumber;

    @Column(nullable = false)
    private LocalDateTime completeDate;

    @Column(length = 1000, nullable = false)
    @ColumnDefault("'미정'")
    private String planStatus;
}
