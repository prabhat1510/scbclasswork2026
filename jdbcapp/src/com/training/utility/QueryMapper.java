package jdbcapp.utility;

public interface QueryMapper {
	
	public static final String GET_CUSTOMER_BY_ID="SELECT * FROM CUSTOMER WHERE CUSTOMERID = ";
	public static final String ADD_CUSTOMER ="INSERT INTO CUSTOMER VALUES(?,?,?,?,?)";
	public static final String DELETE_CUSTOMER_BY_ID="DELETE FROM CUSTOMER WHERE CUSTOMERID= ?";

}
