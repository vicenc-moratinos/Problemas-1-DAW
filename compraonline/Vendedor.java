package compraonline;
import java.util.Arrays;

public class Vendedor{

	//Atributos
	
	static final int NUMDEPRODUC=5;
	private String nombre;
	private int idvendedor=0;
	private Producto[] productos;
	private static int contadorIdVendedro=0;
	private int contadorproductact=0;
	
	
	//Constructor
	
	public Vendedor(String nombre){
		
		
		
		this.nombre=nombre;
		
			this.idvendedor=contadorIdVendedro;
			contadorIdVendedro++;
		
		
		Productos= new Producto[NUMDEPRODUC];
		
	}
	

	//gets y sets
	
	
	public String getNombre(){
		return this.nombre;

	}

	public void setNombre(String nombre){
		
		this.nombre=nombre;
			
	}

	public int getIdvendedor(){
		return this.idvendedor;

	}

	public void setIdvendedor(int idvendedor){
		
		this.idvendedor=idvendedor;
			
	}

	
	
	//AñadirProducto
	
	
	public boolean AñadirProducto(Producto objet){
		
		boolean añade=false;
		
				
			if(contadorproductact < 5){
				for (int i = 0; i < 5; i++)  {
				this.Productos[i]=objet;
				añade=true;
				contadorproductact++;
				}
			}else
				añade=false;
			
			
			return añade;
		
	}
	//Eliminarproducto
	
	



	public Producto  buscarProducto(String nombre){
		
		Producto p = new Producto("1","10/10/3000");
			for (int i = 0; i < Productos.length; i++)  {
			if (productos[i].getNombren().equals(nombre)) {
				System.out.println("producto encontrado:");
				p = productos[i];
			}	
				else
					System.out.println("producto no encontrado");
				
			return p;
			}

		
	}

	public String imprimirProductos () {
		String cad= "";
		for (int i = 0;  i < contadorproductact; i++) {
			cad += producto[i].toString();
		}
	}


	public String toString(){
		
		String cad;
		
			cad = "Nombrevendedor :" +nombre +"\n id vendedor: "+ idvendedor + "\n" + this.imprimirProductos(); 
		
			return cad;
		}
	}