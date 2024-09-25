import javax.persistence.Persistence;
import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.*;

@Entity
class Bank{
	@Id
	private int id;
	private String name;
	private double branch;
	@OneToOne
	private Account accounts;
	public Bank(){

	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getBranch(){
		return branch;
	}
	public void setBranch(double branch){
		this.branch=branch;
	}
	public Account getAccount(){
		return accounts;
	}
	public void setAccounts(Account accounts){
		this.accounts=accounts;
	}

}

@Entity
class Account{
	@Id
	private int id;
	private String name;
	private double bal;
}
class InsertDriver{}
class fetchDriver{}
class Updatedriver{}
class DeleteDriver{}