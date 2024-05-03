package ru.fqw.model;

import lombok.*;
import javax.persistence.*;

/**
 * Основная сущность Товар
 */

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id_product")
    private long id;

    /**
     * Наименование товара
     */
    @Column(name = "name_product")
    private String name;

    /**
     * Цена товара
     */
    @Column(name = "price")
    private int price;

    /**
     * Есть ли в наличии данный товар
     */
    @Column(name = "exist")
    private boolean exist;
}
