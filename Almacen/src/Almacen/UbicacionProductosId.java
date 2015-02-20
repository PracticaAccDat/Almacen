package Almacen;

// Generated 17-feb-2015 17:27:05 by Hibernate Tools 3.4.0.CR1

/**
 * UbicacionProductosId generated by hbm2java
 */
public class UbicacionProductosId implements java.io.Serializable {

	private int idUbicacion;
	private int ean;

	public UbicacionProductosId() {
	}

	public UbicacionProductosId(int idUbicacion, int ean) {
		this.idUbicacion = idUbicacion;
		this.ean = ean;
	}

	public int getIdUbicacion() {
		return this.idUbicacion;
	}

	public void setIdUbicacion(int idUbicacion) {
		this.idUbicacion = idUbicacion;
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
		if (!(other instanceof UbicacionProductosId))
			return false;
		UbicacionProductosId castOther = (UbicacionProductosId) other;

		return (this.getIdUbicacion() == castOther.getIdUbicacion())
				&& (this.getEan() == castOther.getEan());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdUbicacion();
		result = 37 * result + this.getEan();
		return result;
	}

}
