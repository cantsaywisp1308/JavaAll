package Model;

import java.util.ArrayList;
import java.util.List;

import Entities.Category;

public class CategoryModel {
	public List<Category> findAll() {
		List<Category> categories = new  ArrayList<Category>();
		categories.add(new Category(1,"Category 1"));
		categories.add(new Category(2,"Category 2"));
		categories.add(new Category(3,"Category 3"));
		categories.add(new Category(4,"Category 4"));
		return categories; 
	}
}
