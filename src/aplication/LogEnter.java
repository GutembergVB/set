package aplication;

import java.util.Objects;

public class LogEnter {
	
    
	private int    codigo;
	
	public LogEnter(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEnter other = (LogEnter) obj;
		return codigo == other.codigo;
	}

}
