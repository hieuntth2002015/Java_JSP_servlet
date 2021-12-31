package i.phone.java_jsp_servlet.repository;
import i.phone.java_jsp_servlet.entity.Phone;

public class ProductRepository extends JpaRepositoryExecutorImpl<Phone>{

	public ProductRepository() {
		super(Phone.class);
	}
	
}
