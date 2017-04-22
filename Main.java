package klasy;

public class Main {


	    public static void main(String []args) {
	    	
	    	PunktMaterialny punktmaterialny1 = new PunktMaterialny();
	      
	    	punktmaterialny1.setMasa(10);
	    	
	    	System.out.println(punktmaterialny1.getMasa());
	    	
	    	PunktMaterialny punktmaterialny2 = new PunktMaterialny();
	    	
	    	double tmppm2 = punktmaterialny2.getMasa();
	    	
	    	System.out.println(tmppm2);
	    	
	    	System.out.println(punktmaterialny2.toString());
	    	
	    	PunktMaterialny[] tablica = new PunktMaterialny[5];
	    	for(int i=0; i<5; i++){
	    		tablica[i] = new PunktMaterialny(i*20);
	    		System.out.println(tablica[i].toString());
	    	}
	    
	    }
	    
	    
}