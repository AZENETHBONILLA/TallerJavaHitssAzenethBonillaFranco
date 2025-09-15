package genericos;

import java.util.ArrayList;
import java.util.List;

public class ServicioGenerico<T extends Idendificable<ID>,ID> {
    
    private List<T> datos = new ArrayList<>();

    // public ServicioGenerico() {
    //     this.datos = new ArrayList<>();
    // } 

    //Buscar elemento por ID
    public T buscarPorId(ID id){
        for (T elemento : datos) {
            if(elemento.getId().equals(id)){
                return elemento;
            }
        }
        return null;
    }

    //Guardar elemento sin duplicarse 
    public void guardar(T elemento){
        if (buscarPorId(elemento.getId()) != null) {
            System.out.println("Ya existe elemento ID:"+ elemento.getId()); 
        } else{
            datos.add(elemento); //AGREGAR ELEMENTO LISTA
            System.out.println("Guardado: "+ elemento);
        }
    }

    //Listar todos los elementos
    public List<T> listar(){
        return datos;
        //return new ArrayList<>(datos);
    }

    //Actualizar un elemento de datos de acuerdo al ID
    public boolean actualizar(ID id, T nuevoElemento){
        for(int i = 0; i < datos.size(); i++){
            if (datos.get(i).getId().equals(id)) { //get(i) obtiene el valor del elemento 
                datos.set(i, nuevoElemento); //ACTUALIZAR ELEMENTO LISTA
                System.out.println("Actualizado ID: "+ id + " con: "+ nuevoElemento);
                return true;
            }   
        }
        System.out.println("No se encontró el id para Actualizar");
        return false;
    }


    //Eliminar un elemento con ID
    public boolean eliminar(ID id){
        for(int i = 0; i < datos.size(); i++){
            if (datos.get(i).getId().equals(id)) { //get(i) obtiene el valor del elemento 
                datos.remove(i); //ELIMINAR ELEMENTO
                System.out.println("Eliminado con exito ID: "+ id);
                return true;
            }    
        }
        System.out.println("No se encontró el id para Eliminar");
        return false;
    }

    
}
