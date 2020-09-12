/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Transacciones.Transacciones;
import java.sql.SQLException;

/**
 *
 * @author BrunoDev
 */
public class App {
    
    private static void iniciar() throws SQLException {
        new Transacciones().Transaccion();
    }
    
    public static void main(String[] args) throws SQLException {
        iniciar();        
    }
    
}
