/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse.Query;

/**
 *
 * @author basazard
 */
public class MainQuery {
    
    public String create = "INSERT INTO incoming (name, category, incoming_date, stock, price, operator) VALUES (?,?,?,?,?,?)";
}
