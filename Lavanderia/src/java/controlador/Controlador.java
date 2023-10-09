package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Lavadora;
import modelo.PrendaVestir;

@ManagedBean
@SessionScoped
public class Controlador {
    
    private List <Lavadora> listadelavadoras = new ArrayList<>();
  
    private List <PrendaVestir> listaderopalimpia = new ArrayList<>();
    private Stack <PrendaVestir> pilaprendasucias = new Stack<>();
    private List <PrendaVestir> plataformaPrendaLavar = new ArrayList<>();
    private Stack <PrendaVestir> PrendasPrelavadas = new Stack<>();
     
    private PrendaVestir prendadevestir = new PrendaVestir();
    private Lavadora lavadora = new Lavadora();
    private boolean verifica = true;
    
    
    public Controlador() {
    }
   
    
    public void agregarPilaRopaSucia(){
        pilaprendasucias.push(prendadevestir);
        prendadevestir = new PrendaVestir();
    }
    public void crearLavadora(){
        listadelavadoras.add(lavadora);
        lavadora = new Lavadora();
    }

    
    public void agregarPlataforma(){
        if(verifica && !pilaprendasucias.isEmpty()){
            plataformaPrendaLavar.add(pilaprendasucias.pop());
            verifica = false;
            
        }
    }
    
  
    
    public void lavarRopa(Lavadora lav){
      
        if(!listadelavadoras.isEmpty() && !plataformaPrendaLavar.isEmpty()){
            verifica = true;
            int manchas =  getPlataformaPrendaLavar().get(0).getCantidadMancha() - lav.getCantidadQuitaMancha() ;
            int sucio =    getPlataformaPrendaLavar().get(0).getCantidadSucio() - lav.getCantidadQuitaSucio() ;
          
            
            if(manchas < 0){
                getPlataformaPrendaLavar().get(0).setCantidadMancha(0);
            }else{
                getPlataformaPrendaLavar().get(0).setCantidadMancha(manchas);
            }
            
            if(sucio < 0){
                getPlataformaPrendaLavar().get(0).setCantidadSucio(0);
            }else{
                 getPlataformaPrendaLavar().get(0).setCantidadSucio(sucio);
            }
            
            
            getPrendasPrelavadas().push(getPlataformaPrendaLavar().get(0));
            plataformaPrendaLavar = new ArrayList<>();  
        }
        
    }
    
    
    public void dividir(PrendaVestir prendavestir){
        if(prendavestir.getCantidadMancha() == 0 && prendavestir.getCantidadSucio() == 0){
            getListaderopalimpia().add(prendavestir);
        }else{
            getPilaprendasucias().push(prendavestir);
        }
          getPrendasPrelavadas().remove(prendavestir);
        
    }
    

    
    public String color(PrendaVestir prenda){
        String color="";
        
        if(prenda.getCantidadMancha() == 0 && prenda.getCantidadSucio() == 0){
            color = "green";
        } else{
            color = "red";
        }
        
        return color;
    }
    
    
    
    

    public Stack<PrendaVestir> getPrendasPrelavadas() {
        return PrendasPrelavadas;
    }

    public void setPrendasPrelavadas(Stack<PrendaVestir> PrendasPrelavadas) {
        this.PrendasPrelavadas = PrendasPrelavadas;
    }
    

    
    public List<PrendaVestir> getPlataformaPrendaLavar() {
        return plataformaPrendaLavar;
    }

    public void setPlataformaPrendaLavar(List<PrendaVestir> plataformaPrendaLavar) {
        this.plataformaPrendaLavar = plataformaPrendaLavar;
    }
 
    
    
    public void setPlataformaPrendaLavar(Stack<PrendaVestir> plataformaPrendaLavar) {
        this.plataformaPrendaLavar = plataformaPrendaLavar;
    }
    
     

    public List<PrendaVestir> getListaderopalimpia() {
        return listaderopalimpia;
    }

    public void setListaderopalimpia(List<PrendaVestir> listaderopalimpia) {
        this.listaderopalimpia = listaderopalimpia;
    }

     
     
    public Stack<PrendaVestir> getPilaprendasucias() {
        return pilaprendasucias;
    }

    public void setPilaprendasucias(Stack<PrendaVestir> pilaprendasucias) {
        this.pilaprendasucias = pilaprendasucias;
    }

    public PrendaVestir getPrendadevestir() {
        return prendadevestir;
    }

    public void setPrendadevestir(PrendaVestir prendadevestir) {
        this.prendadevestir = prendadevestir;
    }

    
    
    public Lavadora getLavadora() {
        return lavadora;
    }

    public void setLavadora(Lavadora lavadora) {
        this.lavadora = lavadora;
    }
    
    

    public List<Lavadora> getListadelavadoras() {
        return listadelavadoras;
    }

    public void setListadelavadoras(List<Lavadora> listadelavadoras) {
        this.listadelavadoras = listadelavadoras;
    }


    

}
