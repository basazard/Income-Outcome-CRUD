/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse.Controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import warehouse.Helper.Helper;
import warehouse.Model.MainModel;
import warehouse.Query.MainQuery;

/**
 *
 * @author basazard
 */
public class MainController extends BaseController{
    Helper helper = new Helper();
    MainQuery query = new MainQuery();
    
    public boolean create(MainModel model) throws ParseException{
        String date = helper.parseDateToString(model.getIncome_date());
        
        Map <Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getCategory());
        map.put(3, date);
        map.put(4, model.getStock());
        map.put(5, model.getPrice());
        map.put(6, model.getOperator());
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
}
