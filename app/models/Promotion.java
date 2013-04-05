package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Promotion extends Model {

	@Id
	public Long id;
	public Long businessInfoId;
	public Date startDate;
	public Date endDate;
	public String description;
	public Double value;
	public List<Product> participatingProducts;
	
	public static Finder<Long, Promotion> find =new Finder<>(Long.class, Promotion.class);
	
	
	
}
