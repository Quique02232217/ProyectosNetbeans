/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Lavadora;
import modelo.PrendaVestir;

/**
 *
 * @author User
 */
@ManagedBean
@RequestScoped
public class PrendaController {

    Stack<PrendaVestir> prendasPreLavadas= new Stack<>();
    List<PrendaVestir> prendasALavar = new ArrayList<>();
    Stack<PrendaVestir> prendasSucias= new Stack<>();
    List<PrendaVestir> prendasLimpias = new ArrayList<>();
    public PrendaController() {
    }

    public void lavarPrenda(Lavadora lavadora) {
    PrendaVestir prenda = prendasALavar.get(0);

    int cantidadManchaRestante = prenda.getCantidadMancha() - lavadora.getCantidadQuitaMancha();
    int cantidadSucioRestante = prenda.getCantidadSucio() - lavadora.getCantidadQuitaSucio();

    if (cantidadManchaRestante < 0) {
        lavadora.setCantidadQuitaMancha(lavadora.getCantidadQuitaMancha() + cantidadManchaRestante);
        cantidadManchaRestante = 0;
    } else {
        lavadora.setCantidadQuitaMancha(0);
    }

    if (cantidadSucioRestante < 0) {
        lavadora.setCantidadQuitaSucio(lavadora.getCantidadQuitaSucio() + cantidadSucioRestante);
        cantidadSucioRestante = 0;
    } else {
        lavadora.setCantidadQuitaSucio(0);
    }

    prenda.setCantidadMancha(cantidadManchaRestante);
    prenda.setCantidadSucio(cantidadSucioRestante);
    prendasALavar.remove(prenda);
    prendasPreLavadas.push(prenda);
}
   public void prendasLimpias() {
        if (!prendasPreLavadas.isEmpty()) {
            PrendaVestir prenda = prendasPreLavadas.pop();

            if (prenda.getCantidadMancha() > 0 || prenda.getCantidadSucio() > 0) {

                prendasSucias.push(prenda);
            } else {

                prendasLimpias.add(prenda);
            }
        }
    }

    
}
