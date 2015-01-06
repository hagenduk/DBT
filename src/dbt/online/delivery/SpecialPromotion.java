package dbt.online.delivery;

import java.util.HashSet;
import java.util.Set;

public class SpecialPromotion extends Product{

	private int SPEACIAL_ID=0;
	private Boolean valid;
	private Set<Supplement> supplements = new HashSet<Supplement>();
	private Set<Pizza> pizzas = new HashSet<Pizza>();
	
	public SpecialPromotion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the sPEACIAL_ID
	 */
	public int getSPEACIAL_ID() {
		return SPEACIAL_ID;
	}

	/**
	 * @param sPEACIAL_ID the sPEACIAL_ID to set
	 */
	public void setSPEACIAL_ID(int sPEACIAL_ID) {
		SPEACIAL_ID = sPEACIAL_ID;
	}

	/**
	 * @return the valid
	 */
	public Boolean getValid() {
		return valid;
	}

	/**
	 * @param valid the valid to set
	 */
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	/**
	 * @return the supplements
	 */
	public Set<Supplement> getSupplements() {
		return supplements;
	}

	/**
	 * @param supplements the supplements to set
	 */
	public void setSupplements(Set<Supplement> supplements) {
		this.supplements = supplements;
	}

	/**
	 * @return the pizzas
	 */
	public Set<Pizza> getPizzas() {
		return pizzas;
	}

	/**
	 * @param pizzas the pizzas to set
	 */
	public void setPizzas(Set<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

}
