package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import fr.fms.entities.Article;

public interface ArticleRepository extends JpaRepository<Article,Long> {
public List<Article> findByBrand(String brand);
public List <Article> findByBrandContains(String brand);
public List <Article> findByBrandAndPrice (String brand, double price);
public List <Article>findByBrandAndPriceGreaterThan (String brand, double price);

@Query("select A from Article A where A.brand like %:x% and A.price > :y")
public List <Article> searchArticle (@Param("x") String kw, @Param ("y") double price);
public List <Article> findByCategoryId (Long categoryId);
public List <Article> findAll();
@Query ("Select A from Article A")
public List <Article> searchAll();
public List <Article> findByBrandAndDescription (String brand, String description);
public void deleteById (Long articleId);

@Transactional
@Modifying
@Query("update Article set description = :description, brand = :brand, price = :price where id= :id")

void updateArticle (@Param ("description") String description, @Param("brand") String brand, @Param ("price") double price,  @Param ("id") Long id);

@Query ("SELECT a FROM Article a WHERE (a.category LIKE CONCAT('%', :keyword, '%') OR a.description LIKE CONCAT('%', :keyword, '%'))")
public List <Article> findByKeyword(@Param("keyword") String keyword);

public List <Article> findByBrandAndPriceLessThan (String brand, double price);
}
