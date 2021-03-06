package Almacen;

// Generated 24-feb-2015 16:55:43 by Hibernate Tools 3.4.0.CR1

/**
 * ProductosPedidosId generated by hbm2java
 */
public class ProductosPedidosId implements java.io.Serializable {

	private int ean;
	private int idPedido;

	public ProductosPedidosId() {
	}

	public ProductosPedidosId(int ean, int idPedido) {
		this.ean = ean;
		this.idPedido = idPedido;
	}

	public int getEan() {
		return this.ean;
	}

	public void setEan(int ean) {
		this.ean = ean;
	}

	public int getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProductosPedidosId))
			return false;
		ProductosPedidosId castOther = (ProductosPedidosId) other;

		return (this.getEan() == castOther.getEan())
				&& (this.getIdPedido() == castOther.getIdPedido());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEan();
		result = 37 * result + this.getIdPedido();
		return result;
	}

}
