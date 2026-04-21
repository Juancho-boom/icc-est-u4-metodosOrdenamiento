public class MetodoBurbuja {

    int[] arreglo;

    // constructor vacio
    public MetodoBurbuja(int [] arreglo) {
        System.out.println("Se creo el metodo burbuja");

        // // 1era forma
        // // intaciar con valor creado en constructor
        // arreglo = new int[]{10, 8, 0, 7};

        // // 2da forma
        // // Instanciar con valor desde parametro 
        this.arreglo = arreglo;
    }

    public void ordenarAscendente(){
        for(int i = 0; i <arreglo.length; i++){
            for(int j = i +1 ; j <arreglo.length; j++){
                if (arreglo[i] > arreglo[j]){
                    int  auxi = arreglo[i];
                    arreglo[i]= arreglo[j];
                    arreglo[j] = auxi;
                }
            }
        }
    }

    public void imprimirArreglo(){
        for(int num : arreglo){
            System.out.print(num+", ");
        }
        System.out.println();
    }

    
    public void oredenarDesendente(){
        for(int i = 0; i <arreglo.length; i++){
            for(int j = i +1 ; j <arreglo.length; j++){
                if (arreglo[j] > arreglo[i]){
                    int  auxi = arreglo[i];
                    arreglo[i]= arreglo[j];
                    arreglo[j] = auxi;
                }
            }
        }
    }
}
