/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UPX_II.DAO;

import java.util.ArrayList;
/**
 *
 * @author lucas
 */
public interface Idao {
    
    public ArrayList<Cliente> consultar();
    public Cliente consultar(int id);
    public Cliente cadastrar(Cliente cliente);
    public boolean  excluir(int id);
    public boolean alterar(Cliente cliente , int id);
    
    
}
