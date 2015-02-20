package Almacen;

// Generated 17-feb-2015 17:27:05 by Hibernate Tools 3.4.0.CR1

/**
 * DescargasProductosId generated by hbm2java
 */
public class DescargasProductosId implements java.io.Serializable {

	private int idDescarga;
	private int ean;

	public DescargasProductosId() {
	}

	public DescargasProductosId(int idDescarga, int ean) {
		this.idDescarga = idDescarga;
		this.ean = ean;
	}

	public int getIdDescarga() {
		return this.idDescarga;
	}

	public void setIdDescarga(int idDescarga) {
		this.idDescarga = idDescarga;
	}

	public int getEan() {
		return this.ean;
	}

	public void setEan(int ean) {
		this.ean = ean;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DescargasProductosId))
			return false;
		DescargasProductosId castOther = (DescargasProductosId) other;

		return (this.getIdDescarga() == castOther.getIdDescarga())
				&& (this.getEan() == castOther.getEan());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdDescarga();
		result = 37 * result + this.getEan();
		return result;
	}

}