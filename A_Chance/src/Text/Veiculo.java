package Text;

import java.util.ArrayList;
import java.util.List;

public interface Veiculo {
	public List<String> rodas = new ArrayList<String>();
	
	public String getRodas();
	public int getQtyRodas();
	public int getQtyPortas();
	public int getTipo();
}
