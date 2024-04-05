package fr.fms;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

@SpringBootApplication
public class SpringShopJpa2Application implements CommandLineRunner {
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ArticleRepository articleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringShopJpa2Application.class, args);
	}

	@Override
	public void run (String...args) throws Exception {
		//categoryRepository.save(new Category ("Smartphone"));
		
		/*for (Article article : articleRepository.findByBrand("samsung")) {
			System.out.println(article);*/
			
			
	/*	for (Article article : articleRepository.findByBrandAndPrice ("Samsung", 250)){
			System.out.println(article);
			*/
			//articleRepository.save(new Article ("Samsung", "galaxy", 400));
			//articleRepository.save(new Article ("Apple", "14", 400));
			
			/*for (Article article : articleRepository.findByBrandAndPriceGreaterThan("Samsung",300)) {
				System.out.println(article);*/
		
		
			/*for (Article article : articleRepository.searchArticle ("sung", 200)) {
			System.out.println(article);*/
		
			/*
			 * Category smartphone = categoryRepository.save(new Category ("Smartphone"));
			 * Category tablet = categoryRepository.save (new Category ("Tablet")); Category
			 * pc = categoryRepository.save(new Category ("PC"));
			 * 
			 * articleRepository.save(new Article ("Samsung","S10", 500, smartphone));
			 * articleRepository.save(new Article ("Samsung","S9", 350, smartphone));
			 * articleRepository.save(new Article ("Xiaomi", "MI10", 100, smartphone));
			 * 
			 * articleRepository.save(new Article ("Samsung", "GalaxyTab", 450, tablet));
			 * articleRepository.save(new Article ("Apple", "Ipad", 350, tablet));
			 * 
			 * articleRepository.save(new Article ("Asus", "R510", 600, pc));
			 */
		/*for (Article article : articleRepository.findByCategoryId(13L)) {
			System.out.println(article);*/
		
		//ex 1.2
		/*for (Article article : articleRepository.findAll()) {
			System.out.println(article);*/
		
		/*for (Article article : articleRepository.searchAll()) {
			System.out.println(article);*/
			
		//ex 1.3
		/*for (Article article : articleRepository.findByBrandAndDescription("Apple","Ipad")) {
			System.out.println(article);*/
			
			
		//ex 1.4 
		 //articleRepository.deleteById(9L);
		
		//ex 1.5
		//articleRepository.updateArticle("s9", "Samsung", 3000, 23L);
		
		//ex 1.6
		/*for (String categoryName : categoryRepository.findAllCategoryNamesAsc()) {
		System.out.println(categoryName);*/
		
		/*
		 * for (String categoryName : categoryRepository.findAllCategoryNamesDesc()) {
		 * System.out.println(categoryName); }
		 */
		
		//mot clé :
		/*List<Article> articles = articleRepository.findByKeyword("smartphone");
		if (!articles.isEmpty()) {
		    for (Article article : articles) {
		        System.out.println(article);
		    }
		} else {
		    System.out.println("Aucun article correspondant trouvé.");
		}*/
		
		
		// ex 1.7
		
		for (Article article : articleRepository.findByBrandAndPriceLessThan ("Samsung",400)) {
		System.out.println(article);

		}
	}
}
		

			
	

		
	

	
		


